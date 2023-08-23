import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;

import java.io.File;
public class Multiplication {

	WebDriver driver;
	@Given("^Open in browser for Multiplication$")
	public void OpenBrowser() {
		driver=new ChromeDriver();
	       driver.get("https://www.calculator.net/");
	       driver.manage().window().maximize();

	}
	@Given("^Enter First Number For Multiplication$")
	public void EnterFirstNumber() {
	       driver.findElement(By.xpath("//*[@onclick='r(4)']")).click();
	       driver.findElement(By.xpath("//*[@onclick=\"r(2)\"]")).click();
	       driver.findElement(By.xpath("//*[@onclick=\"r(3)\"]")).click();
	}
	@Given("^Click on Multiplication Button$")

	public void PerformMultiplication() {
		
	       driver.findElement(By.xpath("//*[@onclick=\"r('*')\"]")).click();
	}
	
	@Given("^Enter Second Number For Multiplication$")

	public void EnterSecondNumber() {
	       driver.findElement(By.xpath("//*[@onclick=\"r(5)\"]")).click();
	       driver.findElement(By.xpath("//*[@onclick=\"r(2)\"]")).click();
	       driver.findElement(By.xpath("//*[@onclick=\"r(5)\"]")).click();	
	}
	@Given("^Close the Browser for Multiplication$")
	public void Close() {
		driver.close();
	}
	
 
	 
  
}
