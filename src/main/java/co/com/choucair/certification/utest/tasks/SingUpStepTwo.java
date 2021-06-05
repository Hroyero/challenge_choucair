package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.UtestSignUpStepTwoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SingUpStepTwo implements Task {
    private UtestSignUpStepTwoPage utestSignUpStep2Page;

    public static SingUpStepTwo onThePage() {
        return Tasks.instrumented(SingUpStepTwo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(UtestSignUpStepTwoPage.BUTTON_NEXT_DEVICES));
    }
}
