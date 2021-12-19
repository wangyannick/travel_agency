package fr.lernejo.travelsite;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public record DestinationController(UserRepository userRepository,
                                    UserService userService) {

    @GetMapping("/api/travels")
    @ResponseBody
    public List<Destination> getTravels(@RequestParam String userName) {
        User user = userRepository.getUserFromUserName(userName);
        ArrayList<Destination> destination = new ArrayList<Destination>();
        try {
            destination.addAll(userService.getCountries(user.getWeatherExpectation().toString(), user.getMinimumTemperatureDistance(), user.getUserCountry()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destination;
    }
}
