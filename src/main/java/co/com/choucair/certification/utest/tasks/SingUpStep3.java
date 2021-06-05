package co.com.choucair.certification.utest.tasks;


import co.com.choucair.certification.utest.userinterface.UtestSignUpStep2Page;
import co.com.choucair.certification.utest.userinterface.UtestSignUpStep3Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class SingUpStep3 implements Task {
    private UtestSignUpStep3Page utestSignUpStep3Page;

    public static SingUpStep3 onThePage() {
        return Tasks.instrumented(SingUpStep3.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(UtestSignUpStep3Page.BUTTON_NEXT_LAST_STEP));
    }
}
