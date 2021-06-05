package co.com.choucair.certification.utest.interactions;


import co.com.choucair.certification.utest.userinterface.UtestSignUpStepThreePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class SingUpStepThree implements Task {
    private UtestSignUpStepThreePage utestSignUpStep3Page;

    public static SingUpStepThree onThePage() {
        return Tasks.instrumented(SingUpStepThree.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestSignUpStepThreePage.INPUT_LIST_COMPUTER));
        actor.attemptsTo(Click.on(UtestSignUpStepThreePage.SELECT_COMPUTER));
        actor.attemptsTo(Click.on(UtestSignUpStepThreePage.INPUT_LIST_VERSION));
        actor.attemptsTo(Click.on(UtestSignUpStepThreePage.SELECT_VERSION));
        actor.attemptsTo(Click.on(UtestSignUpStepThreePage.INPUT_LIST_LANGUAGE));
        actor.attemptsTo(Click.on(UtestSignUpStepThreePage.SELECT_LANGUAGE));
        actor.attemptsTo(Click.on(UtestSignUpStepThreePage.BUTTON_NEXT_LAST_STEP));

    }
}
