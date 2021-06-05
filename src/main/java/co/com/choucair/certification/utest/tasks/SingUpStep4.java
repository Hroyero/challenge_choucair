package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.UtestSignUpPage;
import co.com.choucair.certification.utest.userinterface.UtestSignUpStep3Page;
import co.com.choucair.certification.utest.userinterface.UtestSignUpStep4Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class SingUpStep4 implements Task {
    private UtestSignUpStep4Page utestSignUpStep4Page;

    public static SingUpStep4 onThePage() {
        return Tasks.instrumented(SingUpStep4.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("0btCnxzxXt&8").into(UtestSignUpStep4Page.INPUT_PASSWORD));
        actor.attemptsTo(Enter.theValue("0btCnxzxXt&8").into(UtestSignUpStep4Page.INPUT_CONFIRM_PASSWORD));
        actor.attemptsTo(Click.on(UtestSignUpStep4Page.CHECK_STAY_INFORME));
        actor.attemptsTo(Click.on(UtestSignUpStep4Page.CHECK_ACCEPT_THE_TERMS_OF_USE));
        actor.attemptsTo(Click.on(UtestSignUpStep4Page.CHECK_ACCEPT_THE_SECURITY_POLICIES));
        actor.attemptsTo(Click.on(UtestSignUpStep4Page.BUTTON_COMPLETE_SETUP));
    }
}
