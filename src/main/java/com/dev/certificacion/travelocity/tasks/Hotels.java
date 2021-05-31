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

public class Hotels implements Performable, Task {

	public Hotels() {

	}

	public static HotelsTry HotelsToSearch() {
		return new HotelsTry();
	}

	@Override
	@Step("the actor tries to choose cruisess going to")
	@Screenshots(forEachAction = true)
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(TravelocityUserInterface.MORE_TRAVEL), Click.on(TravelocityUserInterface.HOTELS),
				Click.on(TravelocityUserInterface.GOING_TO_HOTELES), Click.on(TravelocityUserInterface.DESTINATION),
				Enter.theValue("miami").into(TravelocityUserInterface.DESTINATION), WaitToLoad.theMiliSeconds(2000),
				Hit.the(Keys.ARROW_DOWN).into(TravelocityUserInterface.DESTINATION), WaitToLoad.theMiliSeconds(2000),
				Hit.the(Keys.ENTER).into(TravelocityUserInterface.DESTINATION), WaitToLoad.theMiliSeconds(2000),
				Click.on(TravelocityUserInterface.CHECK_IN), WaitToLoad.theMiliSeconds(1000),
				Click.on(TravelocityUserInterface.CHECK_IN_DATE_PICKER_PAGING), WaitToLoad.theMiliSeconds(1000),
				Click.on(TravelocityUserInterface.CHECK_IN_DATE), WaitToLoad.theMiliSeconds(1000),
				Click.on(TravelocityUserInterface.CHECK_OUT_DATE), WaitToLoad.theMiliSeconds(1000),
				Click.on(TravelocityUserInterface.CHECK_IN_DATE_DONE), WaitToLoad.theMiliSeconds(1000),
				Click.on(TravelocityUserInterface.TRAVELERS), WaitToLoad.theMiliSeconds(1000),
				Click.on(TravelocityUserInterface.ADULTS_MORE), WaitToLoad.theMiliSeconds(1000),
				Click.on(TravelocityUserInterface.TRAVELERS_DONE), WaitToLoad.theMiliSeconds(1000),
				Click.on(TravelocityUserInterface.SEARCH), WaitToLoad.theMiliSeconds(1000),
				Click.on(TravelocityUserInterface.SEARCH_BY_PROPERTY_NAME), WaitToLoad.theMiliSeconds(1000),
				Enter.theValue("Hyatt Regency Coral Gables")
						.into(TravelocityUserInterface.SEARCH_BY_PROPERTY_NAME_INPUT),
				WaitToLoad.theMiliSeconds(1000),
				Hit.the(Keys.ARROW_DOWN).into(TravelocityUserInterface.SEARCH_BY_PROPERTY_NAME_INPUT),
				WaitToLoad.theMiliSeconds(2000),
				Hit.the(Keys.ARROW_DOWN).into(TravelocityUserInterface.SEARCH_BY_PROPERTY_NAME_INPUT),
				WaitToLoad.theMiliSeconds(2000),
				Hit.the(Keys.ENTER).into(TravelocityUserInterface.SEARCH_BY_PROPERTY_NAME_INPUT),
				WaitToLoad.theMiliSeconds(6000), Click.on(TravelocityUserInterface.MODAL_HOTELS),
				WaitToLoad.theMiliSeconds(1000));

		ArrayList<String> pestaña = new ArrayList<String>(Driver.inTheStage().getWindowHandles());
		Driver.inTheStage().switchTo().window(pestaña.get(1));

		actor.attemptsTo(Click.on(TravelocityUserInterface.RESERVE_ROOM), WaitToLoad.theMiliSeconds(1000));

	}

	public static class HotelsTry {
		public HotelsTry() {

		}

		public Performable withTheData() {
			return Instrumented.instanceOf(Hotels.class).withProperties();
		}
	}
}
