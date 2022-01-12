package fr.lernejo.travelsite;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import retrofit2.Call;
import retrofit2.Response;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PredictionEngineClientTest {
    Temperature temp1 = new Temperature("2021-12-04", 6);
    Temperature temp2 = new Temperature("2021-12-05", 8);
    List<Temperature> tempList = new ArrayList<Temperature>();

    @Test
    void getPrediction() {
        tempList.add(temp1);
        tempList.add(temp2);
        Prediction expectedPrediction = new Prediction("France", tempList);

        Response<Prediction> expectedResponse = Response.success(expectedPrediction);
        Call<Prediction> call = Mockito.mock(Call.class);
    }
}
