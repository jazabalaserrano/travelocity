package com.dev.certificacion.travelocity.stepsdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.dev.certificacion.travelocity.drivers.Driver;
import com.dev.certificacion.travelocity.tasks.SuccesfullLogin;
import com.dev.certificacion.travelocity.userinterfaces.travelocityUserInterfaces;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

@SuppressWarnings("unused")
public class StepdefinitionLogueo {

	@Before
	public void setUp() {
		OnStage.setTheStage(Cast.ofStandardActors());
	};

	@Given("^that the user is on the login page$")
	public void thatTheUserIsOnTheLoginPage() {
		// Write code here that turns the phrase above into concrete actions
		Driver.web();
		String name = "the";
		theActorCalled(name).whoCan(BrowseTheWeb.with(Driver.inThePage(travelocityUserInterfaces.URL)));
	}

	@When("^enter with your credentials$")
	public void enterWithYourCredentials() {
		// Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(SuccesfullLogin.withUser());
	}

	@Then("^the user logged in correctly$")
	public void theUserLoggedInCorrectly() {
	}

}
