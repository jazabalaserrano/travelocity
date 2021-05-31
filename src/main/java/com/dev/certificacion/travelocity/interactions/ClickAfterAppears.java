package com.dev.certificacion.travelocity.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class ClickAfterAppears implements Interaction{

	private Target target;
	
	
	
	public ClickAfterAppears(Target target) {
		super();
		this.target = target;
	}


	@Step("{0} clicks on #target")
	@Override
	public <T extends Actor> void performAs(T actor) {
		boolean bandera = false;
		for (int i = 0; i < 15; i++) {
			try {
				target.resolveFor(actor).click();
				bandera = true;
				break;
			} catch (Exception e) {
				actor.attemptsTo(WaitToLoad.theMiliSeconds(1000));
			}
		}
		if(!bandera)
			target.resolveFor(actor).click();
	}

	
	public static ClickAfterAppears on(Target target) {
		return Tasks.instrumented(ClickAfterAppears.class, target);
	}
}
