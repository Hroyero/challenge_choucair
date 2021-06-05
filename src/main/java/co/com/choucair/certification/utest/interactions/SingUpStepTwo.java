package co.com.choucair.certification.utest.interactions;

import co.com.choucair.certification.utest.userinterface.UtestSignUpStepTwoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;

public class SingUpStepTwo implements Task {
    private UtestSignUpStepTwoPage utestSignUpStep2Page;

    public static SingUpStepTwo onThePage() {
        return Tasks.instrumented(SingUpStepTwo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(DoubleClick.on(UtestSignUpStepTwoPage.BUTTON_NEXT_DEVICES));
    }
}
