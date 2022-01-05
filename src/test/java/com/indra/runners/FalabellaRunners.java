package com.indra.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "/Falabella_Buy/src/test/resources/features.Buy/Buy.feature"
        ,glue = "com.indra.steps_definitions"
        ,snippets = SnippetType.CAMELCASE
)
public class FalabellaRunners {

}
