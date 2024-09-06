package com.example.demo;

import io.cucumber.junit.platform.engine.Cucumber;
import io.cucumber.junit.CucumberOptions;

@Cucumber
@CucumberOptions(features = "src/test/resources/video.feature", glue = "com.example.demo")
public class CucumberTest {
}
