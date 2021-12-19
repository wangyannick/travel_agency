package fr.lernejo.prediction;

import org.springframework.lang.NonNull;

public record Temperature(@NonNull String date, @NonNull int temperature) {

    public Temperature(String date, int temperature) {
        this.date = date;
        this.temperature = temperature;
    }
}
