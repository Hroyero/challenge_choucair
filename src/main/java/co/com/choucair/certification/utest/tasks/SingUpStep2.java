package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.UtestSignUpPage;
import co.com.choucair.certification.utest.userinterface.UtestSignUpStep2Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SingUpStep2 implements Task {
    private UtestSignUpStep2Page utestSignUpStep2Page;

    public static SingUpStep2 onThePage() {
        return Tasks.instrumented(SingUpStep2.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(UtestSignUpStep2Page.BUTTON_NEXT_DEVICES));
    }
}
