package stepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericCode.BrowserProvider;
import io.cucumber.java.en.*;

public class HrmTestSteps {
	WebDriver driver=BrowserProvider.getDriver();
	@Given("Open OrangeHrm application")
	public void open_orange_hrm_application() {
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
	}

	@When("User enter username {string} and enter password {string}")
	public void user_enter_username_and_enter_password(String un, String psw) {
		//username
				driver.findElement(By.name("username")).sendKeys(un);
				//password
				driver.findElement(By.name("password")).sendKeys(psw);
	}

	@When("User click on hrm login button")
	public void user_click_on_hrm_login_button() {
		//login
				driver.findElement(By.className("oxd-button")).click();
	}

	@Then("as per valid data user should be able to login")
	public void as_per_valid_data_user_should_be_able_to_login() {
		String exp="dashboard";
		Assert.assertTrue(driver.getCurrentUrl().contains(exp));
		System.out.println("Login completed");
	    
	}

}
