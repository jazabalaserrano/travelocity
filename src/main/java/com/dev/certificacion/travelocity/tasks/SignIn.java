package com.dev.certificacion.travelocity.tasks;

import com.dev.certificacion.travelocity.interactions.WaitToLoad;
import com.dev.certificacion.travelocity.userinterface.TravelocityUserInterface;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.Step;

public class SignIn implements Performable, Task {

	public SignIn() {

	}

	public static SignInOp SignInUser() {
		return new SignInOp();
	}

	@Override
	@Step("the actor tries to choose cruisess going to")
	@Screenshots(forEachAction = true)
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(TravelocityUserInterface.BUTTON_SIGN_IN),
				Click.on(TravelocityUserInterface.BUTTON_SIGN_IN_CONFIRMATION), WaitToLoad.theMiliSeconds(2000),
				Enter.theValue("asd@asd.com").into(TravelocityUserInterface.EMAIL),
				Enter.theValue("asdasd").into(TravelocityUserInterface.PASSWORD),
				Click.on(TravelocityUserInterface.SIGN_IN));

	}

	public static class SignInOp {
		public SignInOp() {

		}

		public Performable withTheData() {
			return Instrumented.instanceOf(SignIn.class).withProperties();
		}
	}
}
