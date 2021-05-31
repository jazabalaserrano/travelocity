package com.dev.certificacion.travelocity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class travelocityUserInterfaces {
	public static final String URL = "https://www.travelocity.com";

	public static final Target BUTTON_SIGNIN_MAINPAGE = Target.the("Button to open the option to sign in the page")
			.locatedBy("//div[contains(text(),'Sign in')]");

	public static final Target BUTTON_SIGNIN_OPTIONSIGNIN = Target.the("Button to go to type the user and password")
			.locatedBy("//a[contains(text(),'Sign in')]");

	public static final Target INPUT_EMAIL = Target.the("Input to type the email")
			.locatedBy("//input[@id='signin-loginid']");

	public static final Target INPUT_PASSWORD = Target.the("Input to type the password")
			.locatedBy("//input[@id='signin-password']");

	public static final Target BUTTON_SUBMIT_SIGNIN = Target.the("Button to sign in the page")
			.locatedBy("// button[@id='submitButton']");

	/******************************* HOTEL *************************************/

	public static final Target BUTTON_LOCATIONHOTEL = Target.the("Button to select the location of hotel")
			.locatedBy("(//button[@class='uitk-faux-input'])[1]");

	public static final Target INPUT_LOCATIONHOTEL = Target.the("input to type the location of hotel")
			.locatedBy("//input[@id='location-field-destination']");

	public static final Target DATE_SELECTDATES = Target.the("Button to select the dates")
			.locatedBy("//button[@id='d1-btn']");

	public static final Target DATE_SELECTDATE = Target.the("Button to select the dates")
			.locatedBy("//button[@aria-label='{0}']");

	public static final Target BUTTON_SELECTTRAVELERS = Target.the("Button to select the travelers")
			.locatedBy("//button[contains(text(),'1 room, 2 travelers')]");

	public static final Target BUTTON_LESSADULT = Target.the("Button to less an adult")
			.locatedBy("(//button[@class='uitk-button uitk-button-small uitk-flex-item uitk-step-input-button'])[1]");

	public static final Target BUTTON_PLUSADULT = Target.the("Button to plus an adult")
			.locatedBy("(//button[@class='uitk-button uitk-button-small uitk-flex-item uitk-step-input-button'])[2]");

	public static final Target BUTTON_LESSCHILDREN = Target.the("Button to less an children")
			.locatedBy("(//button[@class='uitk-button uitk-button-small uitk-flex-item uitk-step-input-button'])[3]");

	public static final Target BUTTON_PLUSCHILDREN = Target.the("Button to plus an children")
			.locatedBy("(//button[@class='uitk-button uitk-button-small uitk-flex-item uitk-step-input-button'])[4]");

	public static final Target CHECK_FLIGHT = Target.the("Button to add a flight")
			.locatedBy("//input[@id='add-flight-switch']");

	public static final Target BUTTON_FLIGHT_HOTEL = Target.the("Input to type the flight")
			.locatedBy("(//button[@class='uitk-faux-input'])[3]");

	public static final Target INPUT_FLIGHT_HOTEL = Target.the("Input to type the flight")
			.locatedBy("//input[@id='location-field-origin']");

	public static final Target CHECK_CAR = Target.the("Button to add a car").locatedBy("//input[@id='add-car-switch']");

	public static final Target BUTTON_SEARCH = Target.the("Button to search hotel")
			.locatedBy("//button[contains(text(),'Search')]");

}
