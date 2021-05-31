package com.dev.certificacion.travelocity.tasks;

import java.util.ArrayList;

import com.dev.certificacion.travelocity.drivers.Driver;
import com.dev.certificacion.travelocity.interactions.WaitToLoad;
import com.dev.certificacion.travelocity.userinterface.TravelocityUserInterface;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.Step;

public class ChooseCruisesGoinTo implements Performable, Task {

	public ChooseCruisesGoinTo() {

	}

	public static ChooseCruise ChooseCruiseTravel() {
		return new ChooseCruise();
	}

	@Override
	@Step("the actor tries to choose cruisess going to")
	@Screenshots(forEachAction = true)
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(TravelocityUserInterface.MORE_TRAVEL), Click.on(TravelocityUserInterface.CRUISES),
				SelectFromOptions.byVisibleText("Caribbean").from(TravelocityUserInterface.GOING_TO),
				WaitToLoad.theMiliSeconds(6000), Click.on(TravelocityUserInterface.SEARCH),
				WaitToLoad.theMiliSeconds(2000), Click.on(TravelocityUserInterface.CRUISES_ITEM),
				WaitToLoad.theMiliSeconds(2000));

		ArrayList<String> pestaña = new ArrayList<String>(Driver.inTheStage().getWindowHandles());
		Driver.inTheStage().switchTo().window(pestaña.get(1));
		actor.attemptsTo(WaitToLoad.theMiliSeconds(2000), Click.on(TravelocityUserInterface.CRUISES_ITEM_CABIN),
				Click.on(TravelocityUserInterface.CRUISES_ITEM_CABIN_TYPE));

	}

	public static class ChooseCruise {
		public ChooseCruise() {

		}

		public Performable withTheData() {
			return Instrumented.instanceOf(ChooseCruisesGoinTo.class).withProperties();
		}
	}
}
