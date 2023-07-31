package stepDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericCode.BrowserProvider;
import io.cucumber.java.en.*;

public class CrmSteps {
WebDriver driver=BrowserProvider.getDriver();
@Given("Open Crm Applicaton")
public void open_crm_applicaton() {
//	BrowserProvider br=new BrowserProvider();
//	 driver=br.setBrowser("chrome");
//  driver=new ChromeDriver();
    driver.get("https://automationplayground.com/crm/login.html");
}

@When("I enter Username And Password")
public void i_enter_username_and_password() {
   driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
   driver.findElement(By.id("password")).sendKeys("test123");
}

@When("I Click on Login button")
public void i_click_on_login_button() {
driver.findElement(By.id("submit-id")).click();

}

@Then("I should able to ligin")
public void i_should_able_to_ligin() {
   String exp="customers.html";
   Assert.assertTrue(driver.getCurrentUrl().contains(exp));
   System.out.println("User Login Successfully!");
}


}
