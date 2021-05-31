package com.dev.certificacion.travelocity.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class TravelocityUserInterface {

	public static final String URL = "https://www.travelocity.com/";

	/*****************************************
	 * Inicio sesion
	 *****************************************/

	public static final Target BUTTON_SIGN_IN = Target.the("buttonSignIn")
			.locatedBy("//header/section[1]/div[1]/nav[1]/div[5]/button[1]");
	public static final Target BUTTON_SIGN_IN_CONFIRMATION = Target.the("buttonSignInConfirmation")
			.locatedBy("//header/section[1]/div[1]/nav[1]/div[5]/div[1]/div[1]/div[1]/div[1]");
	public static final Target EMAIL = Target.the("email").locatedBy("//input[@id='signin-loginid']");
	public static final Target PASSWORD = Target.the("Password").locatedBy("//input[@id='signin-password']");
	public static final Target SIGN_IN = Target.the("SignIn").locatedBy("//button[@id='submitButton']");
	public static final Target TEXT_SIGN_IN_INCORRECT = Target.the("textSignInIncorrect")
			.locatedBy("//body/div[@id='content']/div[1]/div[1]/article[1]/div[2]/form[1]/div[1]/div[1]/h5[1]");

	/*****************************************
	 * Crucero
	 *****************************************/
	public static final Target MORE_TRAVEL = Target.the("More travel")
			.locatedBy("//header/section[1]/div[1]/div[1]/nav[1]/div[1]/button[1]");
	public static final Target CRUISES = Target.the("Cruises")
			.locatedBy("//header/section[1]/div[1]/div[1]/nav[1]/div[1]/div[1]/div[1]/a[5]");
	public static final Target GOING_TO = Target.the("Going to").locatedBy("//select[@id='cruise-destination']");
	public static final Target SEARCH = Target.the("Search").locatedBy("//button[contains(text(),'Search')]");
	public static final Target CRUISES_ITEM = Target.the("Cruises Item")
			.locatedBy("//a[@id='selectSailingButton-AQoCY2ISAm1sGIDI4MudLyAHKgNzeG0yAmFuOgNzeG1CAmFu-ML']");
	public static final Target CRUISES_ITEM_CABIN = Target.the("CruisesItemCabin")
			.locatedBy("//a[@id='supercat-INSIDE']");
	public static final Target CRUISES_ITEM_CABIN_TYPE = Target.the("CruisesItemCabinType").locatedBy(
			"//body/div[@id='bodyContent']/div[@id='main-content']/div[@id='ember269']/div[@id='cabin-category-north-view']/section[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/a[1]");
	public static final Target PRICE_DETAILS = Target.the("PriceDetails").locatedBy(
			"//body/div[@id='bodyContent']/div[@id='main-content']/div[@id='ember269']/div[@id='cabin-category-north-view']/aside[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h2[1]");

	/*****************************************
	 * rental cars
	 *****************************************/

	public static final Target CARS = Target.the("cars")
			.locatedBy("//header/section[1]/div[1]/div[1]/nav[1]/div[1]/div[1]/div[1]/a[3]");
	public static final Target PICK_UP = Target.the("pickUp").locatedBy(
			"//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]");
	public static final Target PICK_UP_INPUT = Target.the("pickUpInput")
			.locatedBy("//input[@id='location-field-locn']");
	public static final Target PICK_UP_LIST = Target.the("pickUpList")
			.locatedBy("//*[@id=\\\"location-field-locn-menu\\\"]/div[2]/ul/li[1]/button");
	public static final Target PICK_UP_DATE = Target.the("pickUpDate").locatedBy("//button[@id='d1-btn']");
	public static final Target PICK_UP_DATE_PICKER_PAGING = Target.the("pickUpDatePickerPaging").locatedBy(
			"//*[@id='Rental-cars-transportation']/div[2]/div[1]/div/div/div[1]/div/div[2]/div/div[2]/div[1]/button[2]");
	public static final Target PICK_UP_DATE_IN = Target.the("pickUpDateIn").locatedBy(
			"//*[@id='Rental-cars-transportation']/div[2]/div[1]/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div[1]/table/tbody/tr[2]/td[1]/button");
	public static final Target PICK_UP_DONE = Target.the("pickUpDone").locatedBy(
			"div.app-layer-base--active div.uitk-grid:nth-child(1) div.uitk-cell.Url-Mapping div.uitk-cell div.CentralizedWizardRegion.comet-homepage-module.all-b-margin-three:nth-child(1) div.uitk-grid.SimpleContainer.uitk-flat-border-top.uitk-flat-border-bottom div.uitk-grid.uitk-flex.uitk-flex-justify-content-center div.uitk-cell.all-cell-1-1.all-x-padding-three.s-y-padding-three.m-y-padding-six.l-y-padding-twelve.xl-y-padding-twelve form.WizardCarPWA div.uitk-tabs-container div.uitk-tabs-content div.uitk-tabs-pane.active:nth-child(1) div.uitk-layout-grid.uitk-layout-grid-gap-three.uitk-layout-grid-columns-small-2.uitk-layout-grid-columns-medium-12.uitk-spacing.uitk-spacing-margin-blockstart-three:nth-child(2) div.uitk-layout-grid-item.uitk-layout-grid-item-columnspan-small-2.uitk-layout-grid-item-columnspan-medium-12.uitk-layout-grid-item-columnspan-large-6:nth-child(1) div.Dates div.uitk-flex.uitk-flex-row.uitk-flex-gap-three.uitk-flex-item.uitk-date-fields.uitk-flex-grow-1:nth-child(3) div.uitk-flex-item.uitk-flex-basis-zero.uitk-flex-grow-1.uitk-date-field-wrapper:nth-child(1) div.uitk-date-picker-menu.uitk-menu.uitk-menu-mounted div.uitk-date-picker-menu-container.uitk-date-picker-menu-container-double.uitk-menu-container.uitk-menu-open.uitk-menu-pos-left.uitk-menu-container-autoposition.uitk-menu-container-text-nowrap div.uitk-date-picker.date-picker-menu div.uitk-flex.uitk-date-picker-menu-footer:nth-child(3) button.uitk-button.uitk-button-small.uitk-button-has-text.uitk-button-primary.uitk-flex-align-self-flex-end.uitk-flex-item.uitk-flex-shrink-0.dialog-done > span:nth-child(1)");
	public static final Target PICK_UP_TIME = Target.the("pickUpTime").locatedBy(
			"//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/select[1]");
	public static final Target DROP_OFF = Target.the("dropOff").locatedBy(
			"//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]");
	public static final Target DROP_OFF_INPUT = Target.the("dropOffInput")
			.locatedBy("//input[@id='location-field-loc2']");
	public static final Target DROP_OFF_LIST = Target.the("dropOffList")
			.locatedBy("//*[@id='location-field-loc2-menu']/div[2]/ul/li[1]/button");
	public static final Target DROP_OFF_DATE_OUT = Target.the("dropOffDateOut").locatedBy(
			"//*[@id='Rental-cars-transportation']/div[2]/div[1]/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div[1]/table/tbody/tr[2]/td[7]/button");
	public static final Target DROP_OFF_TIME = Target.the("dropOffTime").locatedBy(
			"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/select[1]");
	public static final Target RESERVE_CAR_ITEM = Target.the("reserveCarItem").locatedBy(
			"/html[1]/body[1]/div[2]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[4]/div[1]/div[1]/div[3]/a[1]/button[1]");
	public static final Target RESERVE = Target.the("reserve").locatedBy("//button[contains(text(),'Reserve')]");
	public static final Target WHOS_DRIVING = Target.the("whosDriving")
			.locatedBy("//*[@id='preferences']/section/header/h2");

	/*****************************************
	 * Buscar hotel
	 *****************************************/

	public static final Target HOTELS = Target.the("hotels")
			.locatedBy("//header/section[1]/div[1]/div[1]/nav[1]/div[1]/div[1]/div[1]/a[2]");
	public static final Target GOING_TO_HOTELES = Target.the("goinTo").locatedBy(
			"//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]");
	public static final Target DESTINATION = Target.the("destination")
			.locatedBy("//input[@id='location-field-destination']");
	public static final Target CHECK_IN = Target.the("checkIn").locatedBy("//button[@id='d1-btn']");
	public static final Target CHECK_IN_DATE_PICKER_PAGING = Target.the("checkInDatePickerPaging").locatedBy(
			"//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[2]");
	public static final Target CHECK_IN_DATE = Target.the("checkInDate").locatedBy(
			"//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[5]/button[1]");
	public static final Target CHECK_OUT_DATE = Target.the("checkOutDate").locatedBy(
			"//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[7]/button[1]");
	public static final Target CHECK_IN_DATE_DONE = Target.the("checkInDone").locatedBy(
			"body.uitk-no-outline:nth-child(2) div.app-layer-base--active div.uitk-grid:nth-child(1) div.uitk-cell.Url-Mapping div.uitk-cell div.CentralizedWizardRegion.comet-homepage-module.all-b-margin-three:nth-child(1) div.uitk-grid.SimpleContainer.uitk-flat-border-top.uitk-flat-border-bottom div.uitk-grid.uitk-flex.uitk-flex-justify-content-center div.uitk-cell.all-cell-1-1.all-x-padding-three.s-y-padding-three.m-y-padding-six.l-y-padding-twelve.xl-y-padding-twelve form.WizardHotelPWAv2 div.uitk-layout-grid.uitk-layout-grid-gap-three.uitk-layout-grid-columns-small-2.uitk-layout-grid-columns-large-12.all-t-margin-three:nth-child(2) div.uitk-layout-grid-item.uitk-layout-grid-item-columnspan-small-2.uitk-layout-grid-item-columnspan-large-4:nth-child(2) div.Dates div.uitk-flex.uitk-flex-row.uitk-flex-gap-three.uitk-flex-item.uitk-date-fields.uitk-flex-grow-1:nth-child(3) div.uitk-flex-item.uitk-flex-basis-zero.uitk-flex-grow-1.uitk-date-field-wrapper:nth-child(1) div.uitk-date-picker-menu.uitk-menu.uitk-menu-mounted div.uitk-date-picker-menu-container.uitk-date-picker-menu-container-double.uitk-menu-container.uitk-menu-open.uitk-menu-pos-left.uitk-menu-container-autoposition.uitk-menu-container-text-nowrap div.uitk-date-picker.date-picker-menu div.uitk-flex.uitk-date-picker-menu-footer:nth-child(3) button.uitk-button.uitk-button-small.uitk-button-has-text.uitk-button-primary.uitk-flex-align-self-flex-end.uitk-flex-item.uitk-flex-shrink-0.dialog-done > span:nth-child(1)");
	public static final Target TRAVELERS = Target.the("travelers").locatedBy(
			"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/button[1]");
	public static final Target ADULTS_MORE = Target.the("adultsmore").locatedBy(
			"//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[2]/div[1]/button[2]");
	public static final Target TRAVELERS_DONE = Target.the("travelersDone").locatedBy(
			"//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]");
	public static final Target CHOOSE_HOTEL_ITEM = Target.the("ChooseHotelitem").locatedBy(
			"//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[2]/section[2]/ol[1]/li[1]/div[1]/div[1]/a[1]");
	public static final Target RESERVE_ROOM = Target.the("reserveRoom")
			.locatedBy("//button[contains(text(),'Reserve a room')]");
	public static final Target SEARCH_BY_PROPERTY_NAME = Target.the("searchByPropertyName").locatedBy(
			"/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/div[1]/section[1]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]");
	public static final Target SEARCH_BY_PROPERTY_NAME_INPUT = Target.the("searchByPropertyNameInput").locatedBy(
			"/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/div[1]/section[1]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/div[1]/div[2]/header[1]/section[1]/div[1]/input[1]");
	public static final Target SEARCH_BY_PROPERTY_NAME_LIST = Target.the("searchByPropertyNameList").locatedBy(
			"//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/section[1]/form[1]/fieldset[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/button[1]");
	public static final Target RESERVE_ROOM_ITEM = Target.the("reserveRoomItem").locatedBy(
			"//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/main[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[4]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]");
	public static final Target RESERVE_ROOM_ITEM2 = Target.the("reserveRoomItem2").locatedBy(
			"body.uitk-no-outline:nth-child(2) div.app-layer-base--active div.page-container.infosite div.xl-x-margin-six.l-x-margin-six.m-x-margin-six div.uitk-flex.main-region div.uitk-flex-item.main-body.m-t-margin-two.l-t-margin-three.xl-t-margin-three:nth-child(1) main.main-region.infosite__main div.infosite__content.infosite__content--details div.rooms-and-rates.s-t-margin-three.m-t-margin-three.s-x-padding-three.m-x-padding-zero.l-x-padding-zero.xl-x-padding-zero:nth-child(2) section.uitk-spacing.uitk-spacing-margin-blockstart-six div.uitk-layout-grid.uitk-layout-grid-gap-three.uitk-layout-grid-columns-auto_fit-seventy_six.uitk-layout-grid-justify-content-start.uitk-spacing.uitk-spacing-margin-blockend-three div.uitk-flex.uitk-flex-column.uitk-flex-justify-content-space-between.uitk-card-aloha.uitk-card-aloha-roundcorner-all.uitk-card-aloha-has-border.uitk-card-aloha-has-overflow.all-b-margin-three:nth-child(1) div.uitk-card-aloha-content-section.uitk-card-aloha-content-section-padded.uitk-flex-item div:nth-child(1) div.uitk-flex.uitk-flex-align-items-flex-end.uitk-flex-justify-content-space-between div.uitk-flex.uitk-flex-align-items-flex-end.uitk-flex-column.uitk-flex-item > button.uitk-button.uitk-button-small.uitk-button-primary");
	public static final Target PAYNOW = Target.the("payNow").locatedBy("//button[contains(text(),'Pay now')]");
	public static final Target PRICE_DETAILS_HOTELS = Target.the("priceDetails").locatedBy(
			"//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/main[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[4]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]");
	public static final Target MODAL_HOTELS = Target.the("modalHotels").locatedBy(
			"//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/main[1]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/div[2]/section[2]/ol[1]/li[1]/div[1]/section[1]/span[1]/div[1]/div[1]/div[2]/figure[1]/button[1]");

	/*****************************************
	 * Buscar Vuelo
	 *****************************************/

	public static final Target FLIGHTS = Target.the("flights")
			.locatedBy("//header/section[1]/div[1]/div[1]/nav[1]/div[1]/div[1]/div[1]/a[4]");
	public static final Target ROUND_TRIP = Target.the("roundTrip").locatedBy(
			"//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/ul[1]/div[1]/li[1]/a[1]");
	public static final Target ONE_WAY = Target.the("oneWay").locatedBy(
			"//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/ul[1]/div[1]/li[2]/a[1]");
	public static final Target MULTICITY = Target.the("multiCity").locatedBy(
			"//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/ul[1]/div[1]/li[3]/a[1]");
	public static final Target LEAVING_FROM = Target.the("leavingFrom").locatedBy(
			"//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]");
	public static final Target LEAVING_FROM_INPUT = Target.the("leavingFromInput")
			.locatedBy("//input[@id='location-field-leg1-origin']");
	public static final Target LEAVING_FROM_LIST = Target.the("leavingFromList").locatedBy(
			"//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/button[1]");
	public static final Target GOING_TO_FLIGHTS = Target.the("goingTo").locatedBy(
			"//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]");
	public static final Target GOING_TO_INPUT = Target.the("goingToInput")
			.locatedBy("//input[@id='location-field-leg1-destination']");
	public static final Target GOING_TO_LIST = Target.the("goingToList").locatedBy(
			"//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/button[1]");
	public static final Target DEPARTING = Target.the("departing").locatedBy("//button[@id='d1-btn']");
	public static final Target DEPARTING_DATE_PICKER_PAGING = Target.the("departingDatePickerPaging").locatedBy(
			"//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[2]");
	public static final Target DEPARTING_DATE = Target.the("departingDate").locatedBy(
			"//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[5]/button[1]");
	public static final Target RETURNING_DATE = Target.the("returningDate").locatedBy(
			"//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[5]/button[1]");
	public static final Target DATE_DONE = Target.the("dateDone").locatedBy(
			"div.app-layer-base--active div.uitk-grid:nth-child(1) div.uitk-cell.Url-Mapping div.uitk-cell div.CentralizedWizardRegion.comet-homepage-module.all-b-margin-three:nth-child(1) div.uitk-grid.SimpleContainer.uitk-flat-border-top.uitk-flat-border-bottom div.uitk-grid.uitk-flex.uitk-flex-justify-content-center div.uitk-cell.all-cell-1-1.all-x-padding-three.s-y-padding-three.m-y-padding-six.l-y-padding-twelve.xl-y-padding-twelve form.WizardFlightPWA div.uitk-tabs-container:nth-child(4) div.uitk-tabs-content div.uitk-tabs-pane.active:nth-child(1) div.uitk-layout-grid.uitk-layout-grid-gap-three.uitk-layout-grid-columns-small-4.uitk-layout-grid-columns-medium-6.uitk-layout-grid-columns-large-12.uitk-spacing.uitk-spacing-padding-block-three:nth-child(2) div.uitk-layout-grid-item.uitk-layout-grid-item-columnspan-small-4.uitk-layout-grid-item-columnspan-medium-6.uitk-layout-grid-item-columnspan-large-4:nth-child(2) div.Dates div.uitk-flex.uitk-flex-row.uitk-flex-gap-three.uitk-flex-item.uitk-date-fields.uitk-flex-grow-1:nth-child(3) div.uitk-flex-item.uitk-flex-basis-zero.uitk-flex-grow-1.uitk-date-field-wrapper:nth-child(1) div.uitk-date-picker-menu.uitk-menu.uitk-menu-mounted div.uitk-date-picker-menu-container.uitk-date-picker-menu-container-double.uitk-menu-container.uitk-menu-open.uitk-menu-pos-left.uitk-menu-container-autoposition.uitk-menu-container-text-nowrap div.uitk-date-picker.date-picker-menu div.uitk-flex.uitk-date-picker-menu-footer:nth-child(3) > button.uitk-button.uitk-button-small.uitk-button-has-text.uitk-button-primary.uitk-flex-align-self-flex-end.uitk-flex-item.uitk-flex-shrink-0.dialog-done");
	

	public static final Target SELECT_FLIGHT = Target.the("selectFlight")
			.locatedBy("/html/body/div[2]/div[1]/div/div[2]/div[3]/div/section/main/ul/li[1]/div/div/div/button");
	public static final Target SELECT_FLIGHT_2IN = Target.the("selectFlight2in")
			.locatedBy("/html/body/div[2]/div[11]/section/div/div[13]/ul/li[1]/div[1]/div[1]/div[2]/div/div[2]/button");
	public static final Target SELECT_FLIGHT_2OUT = Target.the("selectFlight2out")
			.locatedBy("/html/body/div[2]/div[11]/section/div/div[13]/ul/li[1]/div[1]/div[1]/div[2]/div/div[2]/button");
	public static final Target SELECT_FLIGHT_CONTINUE = Target.the("selectFlightContinue")
			.locatedBy("//button[contains(text(),'Continue')]");
	public static final Target SELECT_FLIGHT_MODAL_NO_THANKS = Target.the("selectFlightModalNoThanks")
			.locatedBy("//a[contains(text(),'No Thanks')]");
	public static final Target SELECT_FLIGHT_MODAL_NO_THANKS2 = Target.the("selectFlightModalNoThanks2")
			.locatedBy("#forcedChoiceNoThanks");
	public static final Target TRIP_SUMMARY = Target.the("Tripsummary")
			.locatedBy("/html/body/main/div/div[2]/section[1]/div/h2");
	public static final Target SELECT_FARE = Target.the("selectThisFare")
			.locatedBy("//html/body/div[2]/div[11]/section/div/div[13]/ul/li[1]/div[2]/div/div/div/div[1]/button");
	public static final Target PRICE_SUMMARY = Target.the("priceSummary")
			.locatedBy("//h2[contains(text(),'Price summary')]");
	public static final Target TRIPS_SUMMARY = Target.the("Tripsummary")
			.locatedBy("/html/body/main/div/div[2]/section[1]/div/h2");
	
}
