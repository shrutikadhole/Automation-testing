package guru99_Project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class paymentGatewayProject {
	
	WebDriver b;
	
  @Test(priority=0)
  public void cart() throws InterruptedException {
	  
	  b.findElement(By.linkText("Cart")).click();
	  Thread.sleep(1000);
	  WebElement q=b.findElement(By.name("quantity"));
		Select quantity=new Select(q);
		quantity.selectByValue("2");
		Thread.sleep(2000);
		b.findElement(By.xpath("//input[@value=\"Buy Now\"]")).click();
		Thread.sleep(2000);
		
		b.findElement(By.xpath("//input[@name=\"card_nmuber\"]")).sendKeys("5678765432123456");
		Thread.sleep(1000);
		WebElement m=b.findElement(By.id("month"));
		Select month=new Select(m);
		month.selectByValue("4");

		WebElement y=b.findElement(By.id("year"));
		Select year=new Select(y);
		year.selectByValue("2021");

		b.findElement(By.id("cvv_code")).sendKeys("45678");
		Thread.sleep(1000);
		b.findElement(By.xpath("//input[@name=\"submit\"]")).click();
		Thread.sleep(1000);

		WebElement s=b.findElement(By.tagName("h2"));
		String successMsg=s.getText();
		System.out.println(successMsg);

		WebElement o=b.findElement(By.tagName("table"));
		String orderID=o.getText();
		System.out.println(orderID);

		//b.findElement(By.linkText("Home")).click();
		Thread.sleep(3000);
		b.findElement(By.xpath("//a[@class=\"button special\"]")).click();
		Thread.sleep(1000);	

	  
  }
  
  @Test(priority=1)
  public void GenerateCardNumber() throws InterruptedException {
	  
	  
	  String parent=b.getWindowHandle();
	 // System.out.println(parent);
	  
	  b.findElement(By.linkText("Generate Card Number")).click();
	  Thread.sleep(2000);
	  
	  b.findElement(By.linkText("Cart")).click();
	  Thread.sleep(1000);
	 
	  
 }
  
  @Test(priority=2)
  public void CheckCreditCardLimit() throws InterruptedException {
	  b.findElement(By.linkText("Check Credit Card Limit")).click();
	  Thread.sleep(2000);
	  b.findElement(By.id("card_nmuber")).sendKeys("8765439076543214");
	  Thread.sleep(1000);
	  b.findElement(By.xpath("//input[@value=\"submit\"]")).click();
	  Thread.sleep(2000);
	  
	  WebElement h=b.findElement(By.xpath("//header[@class=\"align-center\"]"));
	  String header=h.getText();
	  System.out.println(header);
	  
	  WebElement m=b.findElement(By.xpath("//font[@color=\"red\"]"));
	  String message=m.getText();
	  System.out.println(message);
	  
	  b.findElement(By.linkText("Cart")).click();
	  Thread.sleep(2000);
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chrome\\chromedriver-win64\\chromedriver.exe");
		b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("https://demo.guru99.com/payment-gateway/index.php");
  }

  @AfterMethod
  public void afterMethod() {
	 // b.close();
	  b.quit();
  }

}
