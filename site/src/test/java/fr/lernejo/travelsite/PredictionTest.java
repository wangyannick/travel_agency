package fr.lernejo.travelsite;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PredictionTest {
    Temperature temp1 = new Temperature("2021-12-04", 6);
    Temperature temp2 = new Temperature("2021-12-05", 8);
    List<Temperature> tempList = new ArrayList<Temperature>();


    @Test
    void getCountry() {
        tempList.add(temp1);
        tempList.add(temp2);
        Prediction prediction = new Prediction("France", tempList);

        assertEquals(prediction.getCountry(), "France");
    }

    @Test
    void getTemperatures() {
        tempList.add(temp1);
        tempList.add(temp2);
        Prediction prediction = new Prediction("France", tempList);

        assertEquals(prediction.getTemperatures(), tempList);
    }
}
