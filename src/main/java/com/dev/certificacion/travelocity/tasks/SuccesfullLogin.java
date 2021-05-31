package com.dev.certificacion.travelocity.tasks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Properties;

import com.dev.certificacion.travelocity.interactions.WaitToLoad;
import com.dev.certificacion.travelocity.userinterfaces.travelocityUserInterfaces;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SuccesfullLogin implements Task {

	private Properties prop = new Properties();

	public SuccesfullLogin()
			throws FileNotFoundException, IOException, GeneralSecurityException, GeneralSecurityException {
		prop.load(new FileInputStream("src/test/resources/config.properties"));

	}

	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(travelocityUserInterfaces.BUTTON_SIGNIN_MAINPAGE),
				Click.on(travelocityUserInterfaces.BUTTON_SIGNIN_OPTIONSIGNIN),
				Enter.theValue(prop.getProperty("user")).into(travelocityUserInterfaces.INPUT_EMAIL),
				Enter.theValue(prop.getProperty("password")).into(travelocityUserInterfaces.INPUT_PASSWORD),
				Click.on(travelocityUserInterfaces.BUTTON_SUBMIT_SIGNIN), WaitToLoad.theMiliSeconds(10000));

	}

	public static SuccesfullLogin withUser() {
		return Tasks.instrumented(SuccesfullLogin.class);
	}

}
