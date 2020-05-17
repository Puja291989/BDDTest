package stepDef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {

	WebDriver driver =  null;
	String title = "Welcome: Mercury Tours";
	@Given("^I have a url$")
	public void i_have_a_url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.setProperty("webdriver.chrome.driver", "F:\\Cucumber files\\Cucumber Jars\\Selenium\\chromedriver\\chromedriver.exe");
	driver =  new ChromeDriver();
	}

	@Given("^i want to open chrome browser with url$")
	public void i_want_to_open_chrome_browser_with_url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  driver.get("http://newtours.demoaut.com/index.php");
	}

	@When("^I enter username and password$")
	public void i_enter_username_and_password(DataTable dt) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
List<List<String>> dtval  =  dt.raw();
		
driver.findElement(By.name("userName")).sendKeys(dtval.get(0).get(0));
driver.findElement(By.name("password")).sendKeys(dtval.get(0).get(1));

//driver.findElement(By.name("userName")).sendKeys(dtval.get(1).get(1));
//driver.findElement(By.name("password")).sendKeys(dtval.get(1).get(2));
	}

	
	
	@When("^I enter username \"([^\"]*)\"$")
	public void i_enter_username(String user) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("userName")).sendKeys("user");
	}

	
	@When("^I enter username$")
	public void i_enter_username() throws Throwable {
	    driver.findElement(By.name("userName")).sendKeys("tutorial1");
	}

	@When("^i enter password$")
	public void i_enter_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		  driver.findElement(By.name("password")).sendKeys("tutorial1");
	}

	@When("^i click on submit$")
	public void i_click_on_submit() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("login")).click();

	}

	@Then("^I validate the login page$")
	public void i_validate_the_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String pagetit = driver.getTitle();
		
		if(title.equals(pagetit))
			System.out.print("Login successfully and title verified");

	}

	@Then("^close the broswe$")
	public void close_the_broswe() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.close();
	    System.out.print("Browser Closed");

	}


}
