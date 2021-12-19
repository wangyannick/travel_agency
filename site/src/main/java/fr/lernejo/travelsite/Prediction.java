package fr.lernejo.travelsite;

import java.util.List;

public class Prediction {
    private final String country;
    private final List<Temperature> temperatures;

    public Prediction(String country, List<Temperature> temperatures) {
        this.country = country;
        this.temperatures = temperatures;
    }

    public String getCountry() {
        return country;
    }

    public List<Temperature> getTemperatures() {
        return temperatures;
    }
}
