package co.com.screenplay.project.questions;

import io.cucumber.java.en_old.Ac;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.screenplay.project.ui.InteractionsUI.TITLE_PAGE;

@AllArgsConstructor
public class ValidText implements Question<Boolean> {

    private String titlePage;

    @Override
    public Boolean answeredBy(Actor actor) {
        return titlePage.equals(TITLE_PAGE.resolveFor(actor).getText());
    }

    public static ValidText isSuccessful(String  titlePage){
        return new ValidText(titlePage);
    }
}
