package stepDef;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import genericCode.BrowserProvider;
import io.cucumber.java.en.*;

public class GoogleAppSteps {
	WebDriver driver=BrowserProvider.getDriver();
	@Given("Open Google Application")
	public void open_google_application() {
		BrowserProvider br=new BrowserProvider();
//	   driver=new ChromeDriver();
		driver=br.setBrowser("edge");
	   driver.get("https://www.google.com");
	}

	@When("User Capture Title of google")
	public void user_capture_title_of_google() {
		System.out.println("Application title is:"+driver.getTitle());
	
	}

	@Then("Title should be Google")
	public void title_should_be_google() {
		Assert.assertTrue(driver.getTitle().equals("Google"));
		System.out.println("Application title is matched!");
	
	}
	@When("user enter valid keyword in search")
	public void user_enter_valid_keyword_in_search() throws InterruptedException {
	   driver.findElement(By.name("q")).sendKeys("Java");
	   Thread.sleep(2000);
	}

	@Then("User should get valid result")
	public void user_should_get_valid_result() {
	  List<WebElement> list= driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
	   for(WebElement i:list) {
		   System.out.println(i.getText());
	   }
	}

}
