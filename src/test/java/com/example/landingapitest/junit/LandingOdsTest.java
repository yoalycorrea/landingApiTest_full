package com.example.landingapitest.junit;

import com.example.landingapitest.rest.BaseTest;
import jakarta.ws.rs.client.*;
import jakarta.ws.rs.core.Response;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LandingOdsTest extends BaseTest {

    @Test
    public void testLandingOdsResponse() {
        test = extent.createTest("Validar landing de ODS");

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("https://api.openbank.es/landing");

        Response response = target.request().get();

        test.info("Status Code: " + response.getStatus());
        assertEquals(200, response.getStatus());
        test.pass("El endpoint respondió con 200 OK");
    }
}
