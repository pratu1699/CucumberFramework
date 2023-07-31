package stepDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import genericCode.BrowserProvider;
import io.cucumber.java.en.*;

public class AmazonTestSteps {
	WebDriver driver=BrowserProvider.getDriver();
	@Given("open Amazon application")
	public void open_amazon_application() {
	   BrowserProvider br=new BrowserProvider();
	   driver=br.setBrowser("chrome");
	   driver.get("https://www.amazon.in");
	   driver.manage().window().maximize();
	}

	@When("I capture title for home page")
	public void i_capture_title_for_home_page() {
	    System.out.println(driver.getTitle());
	}

	@Then("Home page title should be match")
	public void home_page_title_should_be_match() {
	    Assert.assertTrue(driver.getTitle().contains("India"));
	    System.out.println("Home page title is matched!");
	}

	@When("I open BestSellers page")
	public void i_open_best_sellers_page() {
		  driver.findElement(By.linkText("Best Sellers")).click();
	}

	@When("I capture title for Bestsellers page")
	public void i_capture_title_for_bestsellers_page() {
	    System.out.println(driver.getTitle());

	}

	@Then("Best sellers page title should be match")
	public void best_sellers_page_title_should_be_match() {
		 Assert.assertTrue(driver.getTitle().contains("Bestsellers"));
		    System.out.println("BestSellers page title is matched!");
	}

	@When("I open mMobiles page")
	public void i_open_m_mobiles_page() {
		 driver.findElement(By.linkText("Mobiles")).click();
	}

	@When("I capture title for Mobiles page")
	public void i_capture_title_for_mobiles_page() {
	    System.out.println(driver.getTitle());

	}

	@Then("Mobiles page title should be match")
	public void mobiles_page_title_should_be_match() {
		 Assert.assertTrue(driver.getTitle().contains("Phones"));
		    System.out.println("Mobiles page title is matched!");
	}

	@When("I open Fashion page")
	public void i_open_fashion_page() {
		driver.findElement(By.linkText("Fashion")).click();
	}

	@When("I capture title for Fashion page")
	public void i_capture_title_for_fashion_page() {
		System.out.println(driver.getTitle());
	}

	@Then("Fashion page title should be match")
	public void fashion_page_title_should_be_match() {
		 Assert.assertTrue(driver.getTitle().contains("Fashion"));
		    System.out.println("Fashion page title is matched!");
	}
}
