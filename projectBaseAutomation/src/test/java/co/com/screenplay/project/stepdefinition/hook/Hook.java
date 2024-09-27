package co.com.screenplay.project.stepdefinition.hook;

import co.com.screenplay.project.hook.OpenWeb;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import static co.com.screenplay.project.utils.Constants.WEB_URL;


public class Hook {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{string} is on the website")
    public void theStudentIsOnTheWebsite(String actor) {
        OnStage.theActor(actor).attemptsTo(
                OpenWeb.browserURL(WEB_URL)
        );
    }

}
