package co.com.screenplay.project.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.screenplay.project.ui.InteractionsUI.BTN_FORMS;
import static co.com.screenplay.project.ui.InteractionsUI.BTN_PRACTICE_FORM;

public class SelectItemPractice implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(BTN_FORMS),
                Click.on(BTN_PRACTICE_FORM));

    }

    public static SelectItemPractice select() {
        return Tasks.instrumented(SelectItemPractice.class);
    }
}
