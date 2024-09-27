package co.com.screenplay.project.stepdefinition;

import co.com.screenplay.project.questions.ValidText;
import co.com.screenplay.project.tasks.ChooseIteration;
import co.com.screenplay.project.tasks.SelectItemPractice;
import co.com.screenplay.project.ui.InteractionsUI;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.serenitybdd.rest.Ensure;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.screenplay.project.ui.InteractionsUI.TITLE_PAGE;
import static co.com.screenplay.project.utils.Constants.ACTOR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActor;

public class OpenWebStep {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @And("validate the iterations option")
    public void validateTheIterationsOption() {
        theActor(ACTOR).attemptsTo(
                ChooseIteration.dinamic()
        );
    }

    @When("Click on the form and select the Practice Form option")
    public void clickOnTheFormAndSelectThePracticeFormOption() {
         theActor(ACTOR).attemptsTo(
                 SelectItemPractice.select()
         );
    }

    @Then("will display the valid text {string}")
    public void willDisplayTheValidText( String titlePage) {
         theActor(ACTOR).should(seeThat(ValidText.isSuccessful(titlePage)));
    }

}
