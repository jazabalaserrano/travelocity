package com.dev.certificacion.travelocity.stepsdefinitions;

import static io.vavr.Predicates.is;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.dev.certificacion.travelocity.drivers.Driver;
import com.dev.certificacion.travelocity.interactions.WaitToLoad;
import com.dev.certificacion.travelocity.tasks.ChooseCruisesGoinTo;
import com.dev.certificacion.travelocity.tasks.Flights;
import com.dev.certificacion.travelocity.tasks.Hotels;
import com.dev.certificacion.travelocity.tasks.RentalCars;
import com.dev.certificacion.travelocity.tasks.SignIn;
import com.dev.certificacion.travelocity.userinterface.TravelocityUserInterface;
import com.dev.certificacion.travelocity.utils.DataDrivenExcel;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class StepDefinitionTravelocity {
	public static String environment = "";
	public static String user;
	DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
	Map<String, String> data = new HashMap<>();
	@Steps(shared = true)
	private Actor actor = Actor.named("the");

	@Managed
	private WebDriver browser;

	@Before
	public void setUp() {
		OnStage.setTheStage(Cast.ofStandardActors());
	};

	/*****************************************
	 * Background
	 *****************************************/

	@Given("^ingresa al sitio web de travelocity\\.com$")
	public void ingresaAlSitioWebDeTravelocityCom() {
		// Write code here that turns the phrase above into concrete actions
		Driver.web();
		theActorCalled(actor.getName()).whoCan(BrowseTheWeb.with(Driver.inThePage(TravelocityUserInterface.URL)));
	}

	/*****************************************
	 * Cruise
	 *****************************************/

	@When("^el usuario busca un crucero$")
	public void elUsuarioBuscaUnCrucero() {
		// Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(ChooseCruisesGoinTo.ChooseCruiseTravel().withTheData());
	}

	@Then("^el usuario valida el crucero seleccionado$")
	public void elUsuarioValidaElCruceroSeleccionado() {
		// Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight()
				.should(seeThat(TheTarget.textOf(TravelocityUserInterface.PRICE_DETAILS), is("Price details")));
	}

	/*****************************************
	 * Car
	 *****************************************/

	@When("^el usuario Ingresa a rentar carros y diligencia el formulario (.+),(.+),(.+),(.+)$")
	public void searchCarRentals(String ciudadOrigen, String ciudadDestino, String horaRecogida, String horaEntrega) {
		// Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(
				RentalCars.rentalCarInformation().withTheData(ciudadOrigen, ciudadDestino, horaRecogida, horaEntrega));
	}

	@Then("^el usuario valida el vehiculo seleccionado$")
	public void elUsuarioValidaElVehiculoSeleccionado() {
		// Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight()
				.should(seeThat(TheTarget.textOf(TravelocityUserInterface.WHOS_DRIVING), is("Who's driving?")));
	}

	/*****************************************
	 * Inicio de sesion
	 *****************************************/

	@When("^el usuario Ingresa a Iniciar Sesion y diligencia sus datos$")
	public void elUsuarioIngresaAIniciarSesionYDiligenciaSusDatos() {
		// Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(SignIn.SignInUser().withTheData());
	}

	@Then("^el usuario valida la restriccion al iniciar sesion$")
	public void elUsuarioValidaLaRestriccionAlIniciarSesion() {
		// Write code here that turns the phrase above into concrete actions

//		try {
//			theActorInTheSpotlight().attemptsTo(WaitToLoad.theMiliSeconds(8000));
//			theActorInTheSpotlight().should(seeThat(TheTarget.textOf(TravelocityUserInterface.TEXT_SIGN_IN_INCORRECT),
//					is("You may have entered an unknown email address or an incorrect password. Click here to jump to the first invalid field.")));
//		} catch (Exception e) {
//		}
	}

	/*****************************************
	 * Inicio de sesion
	 *****************************************/

	@When("^el usuario busca un hotel$")
	public void elUsuarioBuscaUnHotel() {
		// Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(Hotels.HotelsToSearch().withTheData());
	}

	@Then("^el usuario valida la informacion de su hotel$")
	public void elUsuarioValidaLaInformacionDeSuHotel() {
		// Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight()
				.should(seeThat(TheTarget.textOf(TravelocityUserInterface.PRICE_DETAILS_HOTELS), is("Price details")));

	}

	/*****************************************
	 * Buscar vuelo
	 *****************************************/
	@When("^el usuario busca un vuelo de (.+) a (.+)$")
	public void stepsFlights(String ciudadOrigen, String ciudadDestino) {
		// Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(Flights.FlithgtsToSearch().withTheData(ciudadOrigen, ciudadDestino));
	}

	@Then("^el usuario valida la informacion de su vuelo$")
	public void elUsuarioValidaLaInformacionDeSuVuelo() {
		// Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(WaitToLoad.theMiliSeconds(5000));
		try {
			ArrayList<String> pestaña = new ArrayList<String>(Driver.inTheStage().getWindowHandles());
			theActorInTheSpotlight().attemptsTo(WaitToLoad.theMiliSeconds(1000));
			Driver.inTheStage().switchTo().window(pestaña.get(1));
			theActorInTheSpotlight()
					.should(seeThat(TheTarget.textOf(TravelocityUserInterface.PRICE_SUMMARY), is("Price summary")));

		} catch (Exception e) {
			theActorInTheSpotlight()
					.should(seeThat(TheTarget.textOf(TravelocityUserInterface.TRIPS_SUMMARY), is("Trip Summary")));

		}
	}

}
