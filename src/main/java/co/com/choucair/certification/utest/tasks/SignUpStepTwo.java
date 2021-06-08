package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.UtestSignUpStepTwoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

public class SignUpStepTwo implements Task {

    private String strCity;
    private String strPostal;

    public SignUpStepTwo(String strCity, String strPostal){
        this.strCity = strCity;
        this.strPostal = strPostal;
    }



    public static SignUpStepTwo onThePage(String strCity, String strPostal ) {
        return Tasks.instrumented(SignUpStepTwo.class, strCity, strPostal);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strCity).into(UtestSignUpStepTwoPage.INPUT_CITY));
        actor.attemptsTo(Hit.the(Keys.ARROW_DOWN).into(UtestSignUpStepTwoPage.INPUT_CITY));
        actor.attemptsTo(Hit.the(Keys.ENTER).into(UtestSignUpStepTwoPage.INPUT_CITY));
        actor.attemptsTo(Enter.theValue(strPostal).into(UtestSignUpStepTwoPage.INPUT_POSTAL));
        actor.attemptsTo(Click.on(UtestSignUpStepTwoPage.INPUT_COUNTRY));
        actor.attemptsTo(Click.on(UtestSignUpStepTwoPage.SELECT_COUNTRY));
        actor.attemptsTo(DoubleClick.on(UtestSignUpStepTwoPage.BUTTON_NEXT_DEVICES));
    }
}
