package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.UtestSignUpStepFourPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class SingUpStepFour implements Task {
    private String strPassword;
    private String strConfirmPassword;

    public SingUpStepFour(String strPassword, String strConfirmPassword){
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;
    }

    public static SingUpStepFour onThePage(String strPassword, String strConfirmPassword) {
        return Tasks.instrumented(SingUpStepFour.class,strPassword,strConfirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strPassword).into(UtestSignUpStepFourPage.INPUT_PASSWORD));
        actor.attemptsTo(Enter.theValue(strConfirmPassword).into(UtestSignUpStepFourPage.INPUT_CONFIRM_PASSWORD));
        actor.attemptsTo(Click.on(UtestSignUpStepFourPage.CHECK_STAY_INFORME));
        actor.attemptsTo(Click.on(UtestSignUpStepFourPage.CHECK_ACCEPT_THE_TERMS_OF_USE));
        actor.attemptsTo(Click.on(UtestSignUpStepFourPage.CHECK_ACCEPT_THE_SECURITY_POLICIES));
        actor.attemptsTo(Click.on(UtestSignUpStepFourPage.BUTTON_COMPLETE_SETUP));
    }
}
