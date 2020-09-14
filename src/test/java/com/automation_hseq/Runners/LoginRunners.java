package com.automation_hseq.Runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/com/automation_hesq/features/Login.feature", glue = "com.automation_hseq.StepsDefinition", tags = {""})

public class LoginRunners {

}