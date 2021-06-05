package co.com.choucair.certification.utest.stepdefinitions;


import co.com.choucair.certification.utest.model.UtestData;
import co.com.choucair.certification.utest.questions.Answer;
import co.com.choucair.certification.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Pedro wants to register in Utest$")
    public void pedroWantsToRegisterInUtest() {
        OnStage.theActorCalled("Pedro").wasAbleTo(OpenUp.thePage(), JoinToday.onThePage());
    }


    @When("^he search for the option to registe and fill the registration form$")
    public void heSearchForTheOptionToRegisteAndFillTheRegistrationForm(List<UtestData> utestData)throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(SignUp.onThePage(), SingUpStep2.onThePage(), SingUpStep3.onThePage(),SingUpStep4.onThePage());
    }

    @Then("^he registers on the page$")
    public void heRegistersOnThePage(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }


}
