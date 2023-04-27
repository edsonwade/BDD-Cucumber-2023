package com.example.demo.airoport;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * Entry point for running the Cucumber tests in JUnit.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
	plugin = {"pretty"},
	features = "classpath:features",
	snippets = CucumberOptions.SnippetType.CAMELCASE)
public class CucumberTest {

}
