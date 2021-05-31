package com.dev.certificacion.travelocity.runners;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import com.dev.certificacion.travelocity.utilities.exceldata.BeforeSuite;
import com.dev.certificacion.travelocity.utilities.exceldata.DataToFeature;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

@RunWith(RunnerPersonalizado.class)
@CucumberOptions(features = "src\\test\\resources\\features\\travelocity.feature", glue = "com.dev.certificacion.travelocity.stepsdefinitions", snippets = SnippetType.CAMELCASE, tags = "@selectHotel")

public class hotelRunner {

	@BeforeSuite
	public static void test() throws InvalidFormatException, IOException {
		DataToFeature.overrideFeatureFiles(".\\src\\test\\resources\\features\\travelocity.feature");
	}
}
