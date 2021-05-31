package com.dev.certificacion.travelocity.stepsdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.util.List;

import com.dev.certificacion.travelocity.drivers.Driver;
import com.dev.certificacion.travelocity.tasks.SelectHotel.selecHotels;
import com.dev.certificacion.travelocity.tasks.SelectHotel;
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
public class StepdefinicionHotel {

	@Before
	public void setUp() {
		OnStage.setTheStage(Cast.ofStandardActors());
	};

	@When("^enter the parameters to select an hotel$")
	public void enterTheParametersToSelectAnHotel(List<String> info) {
		// Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(SelectHotel.dataSelectHotels().addDataToSelectHotels(info.get(2),
				info.get(3), info.get(4), info.get(5), info.get(6), info.get(7), info.get(8)));
	}

	@Then("^the user selected hotel correctely$")
	public void theUserSelectedHotelCorrectely() {
		// Write code here that turns the phrase above into concrete actions

	}

}
