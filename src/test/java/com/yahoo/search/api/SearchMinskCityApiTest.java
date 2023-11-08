package com.yahoo.search.api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchMinskCityApiTest {

    @DisplayName("Request test")
    @Test
    public void testRequest() {
        RestAssured.baseURI = "https://search.yahoo.com";

        Response response = RestAssured.given()
                .param("p", "Минск")
                .accept(ContentType.TEXT)
                .get("/search");
        String bodyResponse = response.getBody().asString();

        assertEquals(200, response.getStatusCode());
        assertTrue(bodyResponse.contains("Минск — Википедия"));
        assertTrue(bodyResponse.contains("https://en.wikipedia.org/wiki/Minsk"));
    }

}
