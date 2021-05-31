package com.dev.certificacion.travelocity.tasks;

import java.util.ArrayList;

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

public class RentalCars implements Performable, Task {
	@SuppressWarnings("unused")
	private String ciudadOrigen, ciudadDestino, horaRecogida, horaEntrega;

	public RentalCars(String ciudadOrigen, String ciudadDestino, String horaRecogida, String horaEntrega) {
		this.ciudadOrigen = ciudadOrigen;
		this.ciudadDestino = ciudadDestino;
		this.horaRecogida = horaRecogida;
		this.horaEntrega = horaEntrega;
	}

	public static rental rentalCarInformation() {
		return new rental();
	}

	@Override
	@Step("the actor tries to rental cars and type the information")
	@Screenshots(forEachAction = true)
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(TravelocityUserInterface.MORE_TRAVEL), Click.on(TravelocityUserInterface.CARS),
				WaitToLoad.theMiliSeconds(3000), Click.on(TravelocityUserInterface.PICK_UP),
				Enter.theValue(ciudadOrigen).into(TravelocityUserInterface.PICK_UP_INPUT),
				WaitToLoad.theMiliSeconds(3000), Hit.the(Keys.ARROW_DOWN).into(TravelocityUserInterface.PICK_UP_INPUT),
				Hit.the(Keys.ENTER).into(TravelocityUserInterface.PICK_UP_INPUT), WaitToLoad.theMiliSeconds(2000),
				Click.on(TravelocityUserInterface.DROP_OFF),
				Enter.theValue(ciudadDestino).into(TravelocityUserInterface.DROP_OFF_INPUT),
				WaitToLoad.theMiliSeconds(2000), Hit.the(Keys.ARROW_DOWN).into(TravelocityUserInterface.DROP_OFF_INPUT),
				Hit.the(Keys.ENTER).into(TravelocityUserInterface.DROP_OFF_INPUT), WaitToLoad.theMiliSeconds(1000),
				Click.on(TravelocityUserInterface.PICK_UP_DATE), WaitToLoad.theMiliSeconds(1000),
				Click.on(TravelocityUserInterface.PICK_UP_DATE_PICKER_PAGING), WaitToLoad.theMiliSeconds(1000),
				Click.on(TravelocityUserInterface.PICK_UP_DATE_IN), WaitToLoad.theMiliSeconds(1000),
				Click.on(TravelocityUserInterface.DROP_OFF_DATE_OUT), WaitToLoad.theMiliSeconds(1000),
				Click.on(TravelocityUserInterface.PICK_UP_DONE), WaitToLoad.theMiliSeconds(2000),
				Click.on(TravelocityUserInterface.PICK_UP_TIME), WaitToLoad.theMiliSeconds(1000),
				Click.on(TravelocityUserInterface.SEARCH), WaitToLoad.theMiliSeconds(8000),
				Click.on(TravelocityUserInterface.RESERVE_CAR_ITEM));
		ArrayList<String> pestaña = new ArrayList<String>(Driver.inTheStage().getWindowHandles());
		Driver.inTheStage().switchTo().window(pestaña.get(1));
		actor.attemptsTo(Click.on(TravelocityUserInterface.RESERVE));
	}

	public static class rental {
		public rental() {

		}

		public Performable withTheData(String ciudadOrigen, String ciudadDestino, String horaRecogida,
				String horaEntrega) {
			return Instrumented.instanceOf(RentalCars.class).withProperties(ciudadOrigen, ciudadDestino, horaRecogida,
					horaEntrega);
		}
	}
}
