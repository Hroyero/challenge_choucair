package co.com.choucair.certification.utest.tasks;


import co.com.choucair.certification.utest.userinterface.UtestJoinTodayPage;
import co.com.choucair.certification.utest.userinterface.UtestSignUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class SignUp implements Task {

    private UtestSignUpPage utestSignUpPage;

    public static SignUp onThePage() {
        return Tasks.instrumented(SignUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Walker").into(UtestSignUpPage.INPUT_FIRST_NAME));
        actor.attemptsTo(Enter.theValue("Price").into(UtestSignUpPage.INPUT_LAST_NAME));
        actor.attemptsTo(Enter.theValue("jilticardi@biyac.com").into(UtestSignUpPage.INPUT_EMAIL));
        actor.attemptsTo(SelectFromOptions.byValue("number:7").from(UtestSignUpPage.DATE_OF_BIRTH_MONTH));
        actor.attemptsTo(SelectFromOptions.byValue("number:22").from(UtestSignUpPage.DATE_OF_BIRTH_DAY));
        actor.attemptsTo(SelectFromOptions.byValue("number:1996").from(UtestSignUpPage.DATE_OF_BIRTH_YEAR));
        actor.attemptsTo(Click.on(UtestSignUpPage.BUTTON_NEXT_LOCATION));
    }
}
