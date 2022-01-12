package fr.lernejo.travelsite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user = new User("yannick@wang.fr", "Yannick", "FR", User.WeatherExpectation.WARMER, 20);

    @Test
    void getUserEmail() {
        assertEquals(user.getUserEmail(), "yannick@wang.fr");
    }

    @Test
    void getUserName() {
        assertEquals(user.getUserName(), "Yannick");
    }

    @Test
    void getUserCountry() {
        assertEquals(user.getUserCountry(), "FR");
    }

    @Test
    void getWeatherExpectation() {
        assertEquals(user.getWeatherExpectation(), User.WeatherExpectation.WARMER);
    }

    @Test
    void getMinimumTemperatureDistance() {
        assertEquals(user.getMinimumTemperatureDistance(), 20);
    }
}
