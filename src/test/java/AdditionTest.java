import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class AdditionTest {
	WebDriver driver;
	@Given("^Open in browser for Addition$")
	public void OpenBrowser() {
		driver=new ChromeDriver();
	       driver.get("https://www.calculator.net/");
	       driver.manage().window().maximize();

	}
	@Given("^Enter First Number For Addition$")
	
	public void EnterFirstNumber2() {
		  driver.findElement(By.xpath("//*[@onclick=\"r('-')\"]")).click();  
		  driver.findElement(By.xpath("//*[@onclick=\"r(2)\"]")).click();
		  driver.findElement(By.xpath("//*[@onclick=\"r(3)\"]")).click();
		  driver.findElement(By.xpath("//*[@onclick='r(4)']")).click();
		  driver.findElement(By.xpath("//*[@onclick=\"r(2)\"]")).click();
		  driver.findElement(By.xpath("//*[@onclick=\"r(3)\"]")).click();
		  driver.findElement(By.xpath("//*[@onclick='r(4)']")).click();	
	}
	
	@Given("^Click on Addition Button$")
	public void PerformAddition() {
		driver.findElement(By.xpath("//*[@onclick=\"r('+')\"]")).click(); 
	}
	
	@Given("^Enter Second Number For Addition$")
	
	public void EnterSecondNumber2() {
		  driver.findElement(By.xpath("//*[@onclick=\"r(3)\"]")).click();
		  driver.findElement(By.xpath("//*[@onclick='r(4)']")).click();
		  driver.findElement(By.xpath("//*[@onclick=\"r(5)\"]")).click();
		  driver.findElement(By.xpath("//*[@onclick=\"r(3)\"]")).click();
		  driver.findElement(By.xpath("//*[@onclick='r(4)']")).click();
		  driver.findElement(By.xpath("//*[@onclick=\"r(5)\"]")).click();
		
	}
	@Given("^Close the Browser for Addition$")
	public void Close() {
		driver.close();
	}
	

}
