package co.com.screenplay.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.screenplay.project.ui.HomeUI.CARD_INTERACTIONS;

public class ChooseIteration implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

            actor.attemptsTo(Scroll.to(CARD_INTERACTIONS),
                    Click.on(CARD_INTERACTIONS));


    }
    public static ChooseIteration dinamic(){return Tasks.instrumented(ChooseIteration.class);}
}
