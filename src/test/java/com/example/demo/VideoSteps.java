package com.example.demo;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class VideoSteps {

    @Autowired
    private VideoService videoService;

    private ResponseEntity<String> responseEntity;

    @Given("istnieją filmy w bazie danych")
    public void istnieja_filmy_w_bazie_danych(){
        videoService.create(new Video("Film 1"));
        videoService.create(new Video("Film 2"));
    }
    @When("wysyłam żądanie GET na {string}")
    public void wysylam_zadanie_GET_na_api_videos(){
        RestTemplate restTemplate = new RestTemplate();
        responseEntity = restTemplate.getForEntity("/api/videos",String.class);
    }

    @Then("otrzymuję listę filmów")
    public void otrzymuje_liste_filmow(){
        assertEquals(200,responseEntity.getStatusCodeValue());
        assertTrue(responseEntity.getBody().contains("Film 1"));
        assertTrue(responseEntity.getBody().contains("Film 2"));
    }

}
