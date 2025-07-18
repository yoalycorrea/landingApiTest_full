package com.example.landingapitest.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static io.restassured.RestAssured.given;

public class LandingNttStepDefs {

    private Response response;

    @Given("I access the NTT landing endpoint")
    public void i_access_the_ntt_landing_endpoint() {
        // Desactiva la verificación SSL
        RestAssured.useRelaxedHTTPSValidation();

        response = given()
                .when()
                .get("https://services.global.ntt/en-us/landing-page/");
    }

    @Then("the response code should be {int}")
    public void the_response_code_should_be(Integer expectedCode) {
        assertEquals(expectedCode.intValue(), response.getStatusCode());
    }
}


