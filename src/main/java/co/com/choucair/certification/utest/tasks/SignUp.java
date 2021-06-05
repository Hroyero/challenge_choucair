package co.com.choucair.certification.utest.tasks;


import co.com.choucair.certification.utest.userinterface.UtestJoinTodayPage;
import co.com.choucair.certification.utest.userinterface.UtestSignUpPage;
import co.com.choucair.certification.utest.userinterface.UtestSignUpStepThreePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class SignUp implements Task {
    private String strFirstName;
    private String strLastName;
    private String strEmailAddress;
    private String strMonth;
    private String strDay;
    private String strYear;

    public SignUp(String strFirstName, String strLastName,String strEmailAddress, String strMonth, String strDay,String strYear ) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmailAddress = strEmailAddress;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
    }



    public static SignUp onThePage(String strFirstName, String strLastName, String strEmailAddress, String strMonth, String strDay, String strYear) {
        return Tasks.instrumented(SignUp.class,strFirstName,strLastName,strEmailAddress,strMonth,strDay,strYear);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strFirstName).into(UtestSignUpPage.INPUT_FIRST_NAME));
        actor.attemptsTo(Enter.theValue(strLastName).into(UtestSignUpPage.INPUT_LAST_NAME));
        actor.attemptsTo(Enter.theValue(strEmailAddress).into(UtestSignUpPage.INPUT_EMAIL));
        actor.attemptsTo(SelectFromOptions.byValue(strMonth).from(UtestSignUpPage.DATE_OF_BIRTH_MONTH));
        actor.attemptsTo(SelectFromOptions.byValue(strDay).from(UtestSignUpPage.DATE_OF_BIRTH_DAY));
        actor.attemptsTo(SelectFromOptions.byValue(strYear).from(UtestSignUpPage.DATE_OF_BIRTH_YEAR));
        actor.attemptsTo(Click.on(UtestSignUpPage.INPUT_LIST_LANGUAGE));
        actor.attemptsTo(Click.on(UtestSignUpPage.SELECT_LANGUAGE));
        actor.attemptsTo(Click.on(UtestSignUpPage.BUTTON_NEXT_LOCATION));
    }
}
