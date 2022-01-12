package fr.lernejo.travelsite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {
    Temperature temperature = new Temperature("2021-12-04", 6);

    @Test
    void getDate() {
        assertEquals(temperature.getDate(), "2021-12-04");
    }

    @Test
    void getTemperature() {
        assertEquals(temperature.getTemperature(), 6);
    }
}
