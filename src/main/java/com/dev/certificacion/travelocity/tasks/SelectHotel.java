package com.dev.certificacion.travelocity.tasks;

import org.openqa.selenium.Keys;

import com.dev.certificacion.travelocity.interactions.WaitToLoad;
import com.dev.certificacion.travelocity.userinterfaces.travelocityUserInterfaces;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.thucydides.core.annotations.Step;

public class SelectHotel implements Task {

	private String destination;
	private String dateInit;
	private String dateEnd;
	private String adults;
	private String children;
	private String addFlight;
	private String addCar;

	public SelectHotel(String destination, String dateInit, String dateEnd, String adults, String children,
			String addFlight, String addCar) {
		this.adults = adults;
		this.children = children;
		this.addFlight = addFlight;
		this.addCar = addCar;
		this.destination = destination;
		this.dateInit = dateInit;
		this.dateEnd = dateEnd;
	}

	@Step("\"{0} Intenta cambiar el itinerario")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(travelocityUserInterfaces.BUTTON_LOCATIONHOTEL), WaitToLoad.theMiliSeconds(4000),
				Enter.theValue(destination).into(travelocityUserInterfaces.INPUT_LOCATIONHOTEL),
				WaitToLoad.theMiliSeconds(2000),
				Hit.the(Keys.ARROW_DOWN).into(travelocityUserInterfaces.INPUT_LOCATIONHOTEL),
				WaitToLoad.theMiliSeconds(2000),
				Hit.the(Keys.ENTER).into(travelocityUserInterfaces.INPUT_LOCATIONHOTEL),
				Click.on(travelocityUserInterfaces.DATE_SELECTDATES),
				Click.on(travelocityUserInterfaces.DATE_SELECTDATE.of(dateInit)),
				Click.on(travelocityUserInterfaces.DATE_SELECTDATE.of(dateEnd)), WaitToLoad.theMiliSeconds(2000),
				Hit.the(Keys.ESCAPE).into("//body"), Click.on(travelocityUserInterfaces.BUTTON_SELECTTRAVELERS));

		if (Integer.parseInt(adults) == 1) {
			actor.attemptsTo(Click.on(travelocityUserInterfaces.BUTTON_LESSADULT));
		} else if (Integer.parseInt(adults) > 2) {
			int contador = Integer.parseInt(adults) - 2;
			for (int i = 0; i < contador; i++) {
				actor.attemptsTo(Click.on(travelocityUserInterfaces.BUTTON_PLUSADULT));
			}
		}
		if (Integer.parseInt(children) > 0) {
			int contador = Integer.parseInt(children);
			for (int i = 0; i < contador; i++) {
				actor.attemptsTo(Click.on(travelocityUserInterfaces.BUTTON_PLUSCHILDREN));
			}
		}
		String[] temp = addFlight.split("/");
		if (temp[0].contains("YES")) {
			actor.attemptsTo(WaitToLoad.theMiliSeconds(2000), Hit.the(Keys.ESCAPE).into("//body"),
					Click.on(travelocityUserInterfaces.CHECK_FLIGHT),
					Click.on(travelocityUserInterfaces.BUTTON_FLIGHT_HOTEL), WaitToLoad.theMiliSeconds(1000),
					Enter.theValue(temp[1]).into(travelocityUserInterfaces.INPUT_FLIGHT_HOTEL),
					WaitToLoad.theMiliSeconds(2000),
					Hit.the(Keys.ARROW_DOWN).into(travelocityUserInterfaces.INPUT_FLIGHT_HOTEL),
					Hit.the(Keys.ENTER).into(travelocityUserInterfaces.INPUT_FLIGHT_HOTEL),
					WaitToLoad.theMiliSeconds(2000));
		}
		if (addCar.contains("YES")) {
			actor.attemptsTo(Click.on(travelocityUserInterfaces.CHECK_CAR));
		}

		actor.attemptsTo(Click.on(travelocityUserInterfaces.BUTTON_SEARCH), WaitToLoad.theMiliSeconds(5000));

	}

	public static selecHotels dataSelectHotels() {
		return new selecHotels();
	}

	public static class selecHotels {
		public Performable addDataToSelectHotels(String destination, String dateInit, String dateEnd, String adults,
				String children, String addFlight, String addCar) {
			return Instrumented.instanceOf(SelectHotel.class).withProperties(destination, dateInit, dateEnd, adults,
					children, addFlight, addCar);
		}
	}
}
