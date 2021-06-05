package co.com.choucair.certification.utest.interactions;

import co.com.choucair.certification.utest.userinterface.UtestJoinTodayPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class JoinToday implements Task {
    private UtestJoinTodayPage utestJoinTodayPage;
    public static JoinToday onThePage() {
        return Tasks.instrumented(JoinToday.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestJoinTodayPage.JOIN_TODAY_BUTTON));
    }
}
