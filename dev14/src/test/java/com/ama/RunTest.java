package com.ama;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( plugin = {"html:output"},features = ".",tags = {"@dev"})
public class RunTest {
}
