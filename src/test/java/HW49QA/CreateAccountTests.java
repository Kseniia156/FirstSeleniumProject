package HW49QA;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test
    public void testRegisterNewUser() {
        click(By.linkText("Register"));

        type(By.id("FirstName"), "Andy");
        type(By.id("LastName"), "Murray");
        type(By.id("Email"), "murray@gmail.com");
        type(By.id("Password"), "Aqwer123");
        type(By.id("ConfirmPassword"), "Aqwer123");

        click(By.id("register-button"));

        }
}
