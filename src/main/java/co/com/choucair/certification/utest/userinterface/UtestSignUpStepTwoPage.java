package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestSignUpStepTwoPage {

    public static final Target BUTTON_NEXT_DEVICES  = Target.the("button for the next devices").located(By.xpath("//span[contains(text(),'Next: Devices')]"));

}
