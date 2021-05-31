package com.dev.certificacion.travelocity.tasks;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import com.dev.certificacion.travelocity.drivers.Driver;
import com.dev.certificacion.travelocity.interactions.WaitToLoad;
import com.dev.certificacion.travelocity.userinterface.TravelocityUserInterface;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.Step;

public class Flights implements Performable, Task {

	private String ciudadOrigen, ciudadDestino;

	public Flights(String ciudadOrigen, String ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
		this.ciudadOrigen = ciudadOrigen;
	}

	public static FlightsTry FlithgtsToSearch() {
		return new FlightsTry();
	}

	@Override
	@Step("the actor tries to choose cruisess going to")
	@Screenshots(forEachAction = true)
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(TravelocityUserInterface.MORE_TRAVEL), Click.on(TravelocityUserInterface.FLIGHTS),
				Click.on(TravelocityUserInterface.ROUND_TRIP), Click.on(TravelocityUserInterface.LEAVING_FROM),
				Enter.theValue(ciudadOrigen).into(TravelocityUserInterface.LEAVING_FROM_INPUT),
				WaitToLoad.theMiliSeconds(2000), WaitToLoad.theMiliSeconds(2000),
				Hit.the(Keys.ARROW_DOWN).into(TravelocityUserInterface.LEAVING_FROM_INPUT),
				Hit.the(Keys.ENTER).into(TravelocityUserInterface.LEAVING_FROM_INPUT), WaitToLoad.theMiliSeconds(2000),
				Click.on(TravelocityUserInterface.GOING_TO_FLIGHTS),
				Enter.theValue(ciudadDestino).into(TravelocityUserInterface.GOING_TO_INPUT),
				WaitToLoad.theMiliSeconds(2000), WaitToLoad.theMiliSeconds(2000),
				Hit.the(Keys.ARROW_DOWN).into(TravelocityUserInterface.GOING_TO_INPUT),
				Hit.the(Keys.ENTER).into(TravelocityUserInterface.GOING_TO_INPUT), WaitToLoad.theMiliSeconds(3000),
				Click.on(TravelocityUserInterface.DEPARTING),
				Click.on(TravelocityUserInterface.DEPARTING_DATE_PICKER_PAGING),
				Click.on(TravelocityUserInterface.DEPARTING_DATE), Click.on(TravelocityUserInterface.RETURNING_DATE),
				WaitToLoad.theMiliSeconds(2000), Click.on(TravelocityUserInterface.DATE_DONE),
				Click.on(TravelocityUserInterface.SEARCH));

		JavascriptExecutor jse = (JavascriptExecutor) Driver.inTheStage();
		;
		jse.executeScript("window.scrollBy(0,500)");
		try {
			actor.attemptsTo(Click.on(TravelocityUserInterface.SELECT_FLIGHT), WaitToLoad.theMiliSeconds(1000),
					Click.on(TravelocityUserInterface.SELECT_FLIGHT_CONTINUE), WaitToLoad.theMiliSeconds(4000));
			try {
				actor.attemptsTo(Click.on(TravelocityUserInterface.SELECT_FLIGHT_MODAL_NO_THANKS));
			} catch (Exception e) {
			}
			jse.executeScript("window.scrollBy(0,250)");
			actor.attemptsTo(Click.on(TravelocityUserInterface.SELECT_FLIGHT), WaitToLoad.theMiliSeconds(1000),
					Click.on(TravelocityUserInterface.SELECT_FLIGHT_CONTINUE), WaitToLoad.theMiliSeconds(4000));
			try {
				actor.attemptsTo(Click.on(TravelocityUserInterface.SELECT_FLIGHT_MODAL_NO_THANKS),
						WaitToLoad.theMiliSeconds(5000));
			} catch (Exception e) {
			}

		} catch (Exception e) {
			actor.attemptsTo(Click.on(TravelocityUserInterface.SELECT_FLIGHT_2IN), WaitToLoad.theMiliSeconds(2000),
					Click.on(TravelocityUserInterface.SELECT_FARE), WaitToLoad.theMiliSeconds(2000));
			jse.executeScript("window.scrollBy(0,250)");

			actor.attemptsTo(Click.on(TravelocityUserInterface.SELECT_FLIGHT_2OUT), WaitToLoad.theMiliSeconds(2000),
					Click.on(TravelocityUserInterface.SELECT_FARE), WaitToLoad.theMiliSeconds(2000));
			try {
				actor.attemptsTo(Click.on(TravelocityUserInterface.SELECT_FLIGHT_MODAL_NO_THANKS2));
			} catch (Exception f) {
			}
			actor.attemptsTo(WaitToLoad.theMiliSeconds(3000));
		}
		
		

	}

	public static class FlightsTry {
		public FlightsTry() {

		}

		public Performable withTheData(String ciudadOrigen, String ciudadDestino) {
			return Instrumented.instanceOf(Flights.class).withProperties(ciudadOrigen, ciudadDestino);
		}
	}
}
