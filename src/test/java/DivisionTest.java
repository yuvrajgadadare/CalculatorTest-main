import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class DivisionTest {
	WebDriver driver;
	@Given("^Open in browser for Division$")
	public void OpenBrowser() {
		driver=new ChromeDriver();
	       driver.get("https://www.calculator.net/");
	       driver.manage().window().maximize();

	}
	
	
	@Given("^Enter First Number For Division$")
	
	public void EnterFirstNumber1() {
		driver.findElement(By.xpath("//*[@onclick='r(4)']")).click();
		  driver.findElement(By.xpath("//*[@onclick=\"r(0)\"]")).click();
		  driver.findElement(By.xpath("//*[@onclick=\"r(0)\"]")).click();
		  driver.findElement(By.xpath("//*[@onclick=\"r(0)\"]")).click();
	}
	
	@Given("^Click on Division Button$")
	public void PerformDivision() {
		driver.findElement(By.xpath("//*[@onclick=\"r('/')\"]")).click();
	}
	
	@Given("^Enter Second Number For Division$")
	public void EnterSecondNumber1() {
		driver.findElement(By.xpath("//*[@onclick=\"r(2)\"]")).click();
		  driver.findElement(By.xpath("//*[@onclick=\"r(0)\"]")).click();
		  driver.findElement(By.xpath("//*[@onclick=\"r(0)\"]")).click();
	}
  
	@Given("^Close the Browser for Division$")
	public void Close() {
		driver.close();
	}
}
