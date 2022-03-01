package com.facebook.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.facebook.common.FacebookBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebookqaf extends FacebookBase {
	
	//WebDriver driver;
	
	@Given("I am on facebook homepage")
	public void i_am_on_facebook_homepage() {
	    
		launchBrowsers();
		
	}

	@When("I enter my {string} and {string}")
	public void i_enter_my_and(String string, String string2) {
	    
		WebElement Obj = driver.findElement(By.id("email"));
		Obj.sendKeys(string);
		WebElement Obj1 = driver.findElement(By.id("pass"));
		Obj1.sendKeys(string2);
		
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
	    
		WebElement Obj2 = driver.findElement(By.name("login"));
		Obj2.click();
	}

	@Then("I can see my facebook profile")
	public void i_can_see_my_facebook_profile() {
		
		driver.close();
		
		System.out.println("Browser Closed");
	    
	}	

}
