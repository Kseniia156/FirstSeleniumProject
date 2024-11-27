package HW49QA;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test
    public void testRegisterNewUser() {
        click(By.linkText("Register"));

        RegistrationData data = new RegistrationData();

        data.setFirstName("Andy");
        data.setLastName("Murray");
        data.setEmail("murray@gmail.com");
        data.setPassword("Aqwer123");
        data.setConfirmPassword("Aqwer123");

        click(By.id("register-button"));

        type(By.id("FirstName"), data.getFirstName());
        type(By.id("LastName"), data.getLastName());
        type(By.id("Email"), data.getEmail());
        type(By.id("Password"), data.getPassword());
        type(By.id("ConfirmPassword"), data.getConfirmPassword());


    }
}
