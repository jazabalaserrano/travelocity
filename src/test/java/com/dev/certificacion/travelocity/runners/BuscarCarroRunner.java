package com.dev.certificacion.travelocity.runners;

import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/travelocity.feature", glue = "com.dev.certificacion.travelocity.stepsdefinitions", snippets = SnippetType.CAMELCASE, tags = "@2buscarCarro")
public class BuscarCarroRunner {

}
