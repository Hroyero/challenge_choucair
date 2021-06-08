package co.com.choucair.certification.utest.stepdefinitions;


import co.com.choucair.certification.utest.interactions.JoinToday;
import co.com.choucair.certification.utest.tasks.SignUpStepThree;
import co.com.choucair.certification.utest.tasks.SignUpStepTwo;
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
        OnStage.theActorInTheSpotlight().attemptsTo(SignUp.onThePage(utestData.get(0).getStrFirstName(),utestData.get(0).getStrLastName(),utestData.get(0).getStrEmailAddress(),utestData.get(0).getStrMonth(),utestData.get(0).getStrDay(),utestData.get(0).getStrYear()), SignUpStepTwo.onThePage(utestData.get(0).getStrCity(),utestData.get(0).getStrPostal()), SignUpStepThree.onThePage(), SignUpStepFour.onThePage(utestData.get(0).getStrPassword(),utestData.get(0).getStrConfirmPassword()));
    }

    @Then("^he registers on the page$")
    public void heRegistersOnThePage(List<UtestData> utestData)throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(utestData.get(0).getStrRegistered())));
    }


}
