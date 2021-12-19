package fr.lernejo.prediction;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

@RestController
public class PredictionController {
    private final TemperatureService temperatureService;

    public PredictionController(TemperatureService temperatureService) {
        this.temperatureService = temperatureService;
    }

    @GetMapping("/api/temperature")
    @ResponseBody
    public Prediction getPrediction(@RequestParam String country) {
        try {
            ArrayList<Temperature> predictedTemperatures = new ArrayList<Temperature>(Arrays.asList(new Temperature(LocalDate.now().minusDays(1).toString(),
                (int) temperatureService.getTemperature(country)), new Temperature(LocalDate.now().minusDays(2).toString(),
                (int) temperatureService.getTemperature(country))));
            return new Prediction(country, predictedTemperatures);
        } catch (UnknownCountryException exception) {
            throw new ResponseStatusException(HttpStatus.EXPECTATION_FAILED, "Unknown country : " + country);
        }
    }
}
