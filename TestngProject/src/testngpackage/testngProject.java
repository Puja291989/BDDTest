package testngpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


public class testngProject {
 
	
	 WebDriver driver;
	   
	 @BeforeTest
	 public void beforetestmethod() {
	        // declaration and instantiation of objects/variables
	     System.setProperty("webdriver.chrome.driver","F:\\Cucumber Practice\\TestngProject\\chromedriver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  System.out.println("Before Class Method");
	 }
	 
	 @Test(priority=0)
	    public void FirstTest() {
	        // declaration and instantiation of objects/variables
	   //  System.setProperty("webdriver.chrome.driver","F:\\Cucumber Practice\\TestngProject\\chromedriver\\chromedriver.exe");
	  //driver = new ChromeDriver();
	 
	     
	        String baseUrl = "https://www.lambdatest.com/";
	        //String expectedTitle = "LambdaTest - Perform all your tests on cloud";
	        String expectedTitle = "Most Powerful Cross Browser Testing Tool Online | LambdaTest";
	        
	        String actualTitle = "";
	// launch Chrome and direct it to the Base URL
	        driver.get(baseUrl);
	// get the actual value of the title
	        actualTitle = driver.getTitle();
	/*
	         * compare the actual title of the page with the expected one and print
	         * the result as "Passed" or "Failed"
	         */
	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	       
	        //close Fire fox   
	        
	       
	    }
	 
	 
	 @Test(priority=1)
	 public void secondmethod()
	 {
		 String baseUrl = "https://www.lambdatest.com/";
		 
		 driver.get(baseUrl);
	 }
	 
	 
	 @AfterTest
	 
	 public void aftertestmethod()
	 {
		 driver.close();
		 System.out.println("Browser Closed");
	 }
	 
		

}
