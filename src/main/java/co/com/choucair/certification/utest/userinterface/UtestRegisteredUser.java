package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegisteredUser {
    public static final Target REGISTERED_USER = Target.the("Extrae de bienvenida a utest").located(By.xpath("//h1[contains(text(),\"Welcome to the world's largest community of freela\")]"));

}
