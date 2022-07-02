package StepDefination;		

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;		

public class Steps {				

	WebDriver driver;
     
    @Given("^Open the Firefox and launch the application$")				
    public void open_the_Firefox_and_launch_the_application() throws Throwable							
    {		
        System.out.println("This Step open the Firefox and launch the application.");	
         WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
         driver.get("https://opensource-demo.orangehrmlive.com");
    }		

    @When("^Enter the Username and Password$")					
    public void enter_the_Username_and_Password() throws Throwable 							
    {	
    
       System.out.println("This step enter the Username and Password on the login page.");	
       driver.findElement(By.xpath("//form[@id='frmLogin']")).sendKeys("Admin");
       driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
    		   }		

    @Then("^Reset the credential$")					
    public void Reset_the_credential() throws Throwable 							
    {    		
        System.out.println("This step click on the Reset button.");		
        driver.findElement(By.xpath("//div[@id='forgotPasswordLink']")).click();
        
      
    }		

}