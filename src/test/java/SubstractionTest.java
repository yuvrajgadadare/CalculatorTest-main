import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class SubstractionTest {

	WebDriver driver;
	@Given("^Open in browser For Substraction$")
	public void OpenBrowser() {
		driver=new ChromeDriver();
	       driver.get("https://www.calculator.net/");
	       driver.manage().window().maximize();
	}
	
	@Given("^Enter First Number For Substraction$")

	public void EnterFirstNumber3() {
		  driver.findElement(By.xpath("//*[@onclick=\"r(2)\"]")).click();
		  driver.findElement(By.xpath("//*[@onclick=\"r(3)\"]")).click();
		  driver.findElement(By.xpath("//*[@onclick='r(4)']")).click();
		  driver.findElement(By.xpath("//*[@onclick=\"r(8)\"]")).click();
		  driver.findElement(By.xpath("//*[@onclick=\"r(2)\"]")).click();
		  driver.findElement(By.xpath("//*[@onclick=\"r(3)\"]")).click();
	}
	
	@Given("^Click on Substraction Button$")
	public void PerformSubtraction() {
		driver.findElement(By.xpath("//*[@onclick=\"r('-')\"]")).click();
	}
	
	@Given("^Enter Second Number For Substraction$")
	public void EnterSecondNumber3() {
		  driver.findElement(By.xpath("//*[@onclick=\"r('-')\"]")).click();
		  driver.findElement(By.xpath("//*[@onclick=\"r(2)\"]")).click();
		  driver.findElement(By.xpath("//*[@onclick=\"r(3)\"]")).click();
		  driver.findElement(By.xpath("//*[@onclick=\"r(0)\"]")).click();
		  driver.findElement(By.xpath("//*[@onclick=\"r(9)\"]")).click();
		  driver.findElement(By.xpath("//*[@onclick='r(4)']")).click();
		  driver.findElement(By.xpath("//*[@onclick=\"r(8)\"]")).click();
		  driver.findElement(By.xpath("//*[@onclick=\"r(2)\"]")).click();
		  driver.findElement(By.xpath("//*[@onclick=\"r(3)\"]")).click();
	}
 
	@Given("^Close the Browser for Substraction$")
	public void Close() {
		driver.close();
	}
}
