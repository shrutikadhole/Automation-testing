package guru99_Project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class insuranceProject {
	
	WebDriver b;
	
  @Test(priority=0, enabled=false)
  public void register() throws InterruptedException {
	  
	  b.get("https://demo.guru99.com/insurance/v1/index.php");
	  b.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	  
	  b.findElement(By.linkText("Register")).click();
	  Thread.sleep(2000);
	  WebElement t=b.findElement(By.name("title"));
	  Select title=new Select(t);
	  title.selectByValue("Miss");
	  Thread.sleep(2000);
	  
	  b.findElement(By.id("user_firstname")).sendKeys("xyz");
	  Thread.sleep(2000);
	  b.findElement(By.id("user_surname")).sendKeys("ddff");
	  Thread.sleep(2000);
	  b.findElement(By.id("user_phone")).sendKeys("8765432682");
	  Thread.sleep(2000);
	  
	  //date of birth
	  WebElement y=b.findElement(By.id("user_dateofbirth_1i"));
	  Select year=new Select(y);
	  year.selectByValue("1995");
	  Thread.sleep(2000);
	  
	  WebElement m=b.findElement(By.id("user_dateofbirth_2i"));
	  Select month=new Select(m);
	  month.selectByValue("4");
	  Thread.sleep(2000);
	 
	  WebElement d=b.findElement(By.id("user_dateofbirth_3i"));
	  Select date=new Select(d);
	  date.selectByValue("20");
	  Thread.sleep(2000);
	  
	  b.findElement(By.id("licencetype_f")).click();
	  Thread.sleep(2000);
	  
	  //licence period
	  WebElement l=b.findElement(By.id("user_licenceperiod"));
	  Select lic=new Select(l);
	  lic.selectByValue("2");
	  Thread.sleep(2000);
	  
	  //occupation
	  WebElement o=b.findElement(By.id("user_occupation_id"));
	  Select occ=new Select(o);
	  occ.selectByVisibleText("Engineer");
	  Thread.sleep(2000);
	  
	  b.findElement(By.id("user_address_attributes_street")).sendKeys("sdfghj");
	  Thread.sleep(2000);
	  
	  b.findElement(By.id("user_address_attributes_city")).sendKeys("hgfcv");
	  Thread.sleep(2000);
	  
	  b.findElement(By.id("user_address_attributes_county")).sendKeys("kjhgsd");
	  Thread.sleep(2000);
	  
	  b.findElement(By.name("post_code")).sendKeys("874566");
	  Thread.sleep(2000);
	  
	  b.findElement(By.name("email")).sendKeys("xyz12@gmail.com");
	  Thread.sleep(2000);
	  
	  b.findElement(By.name("password")).sendKeys("xyz123");
	  Thread.sleep(2000);
	  
	  b.findElement(By.name("c_password")).sendKeys("xyz123");
	  Thread.sleep(2000);
	  
	  b.findElement(By.name("submit")).click();
	  Thread.sleep(5000);
			  
  }
  
 @Test(priority=1, enabled=false)
  public void login() throws InterruptedException {
	 b.get("https://demo.guru99.com/insurance/v1/index.php");
	  
	  b.findElement(By.id("email")).sendKeys("xyz12@gmail.com");
	  Thread.sleep(2000);
	  
	  b.findElement(By.id("password")).sendKeys("xyz123");
	  Thread.sleep(2000);
	  
	  b.findElement(By.name("submit")).click();
	  
	  Thread.sleep(3000);
  }
 
 
 @Test(priority=2, enabled=false)
 public void requestQuotation() throws InterruptedException{
	 b.get("https://demo.guru99.com/insurance/v1/header.php");
	 
	 b.findElement(By.id("ui-id-2")).click();
	 Thread.sleep(2000);
	 
	 //breakdowncover
	 WebElement br=b.findElement(By.name("0"));
	 Select brdwn=new Select(br);
	 brdwn.selectByValue("3");
	 
	 //Windscreenrepair
	 b.findElement(By.xpath("//input[@value=\"Yes\"]")).click();
	 
	 //incidents
	 b.findElement(By.id("quotation_incidents")).sendKeys("sdfghjjh");
	 
	 //registration
	 b.findElement(By.name("registration")).sendKeys("sdf456");
	 
	 //annual mileage
	 b.findElement(By.name("mileage")).sendKeys("3456");
	 
	 //estimated value
	 b.findElement(By.name("value")).sendKeys("34567");
	 
	 //parking location
	 WebElement p=b.findElement(By.name("parkinglocation"));
	 Select loc=new Select(p);
	 loc.selectByValue("Public place");
	 
	 //start of policy
	 WebElement y=b.findElement(By.name("year"));
	 Select year=new Select(y);
	 year.selectByValue("2020");
	 
	 WebElement m=b.findElement(By.name("month"));
	 Select month=new Select(m);
	 month.selectByValue("12");
	 
	 WebElement d=b.findElement(By.name("date"));
	 Select date=new Select(d);
	 date.selectByValue("9");
	 
	 //save quotation
	 b.findElement(By.name("submit")).click();
	 
	 Thread.sleep(3000);
	 
	WebElement text= b.findElement(By.tagName("body"));
	String s=text.getText();
	System.out.println(s);
	 Thread.sleep(2000);
}
 
 @Test(priority=3)
 public void retrieveQuotation() throws InterruptedException {
	 b.get("https://demo.guru99.com/insurance/v1/header.php");
	 b.findElement(By.id("ui-id-3")).click();
	 
	 b.findElement(By.name("id")).sendKeys("42096");
	 Thread.sleep(2000);
	 
	 b.findElement(By.id("getquote")).click();
	 Thread.sleep(2000);
	 
	 WebElement r=b.findElement(By.tagName("table"));
	 String retrieve=r.getText();
	 System.out.println(retrieve);
	 Thread.sleep(2000);
	 
 }
 
 @Test(priority=4)
 public void logout() throws InterruptedException {
	 b.get("https://demo.guru99.com/insurance/v1/header.php");
	 Thread.sleep(1000);
	 
	 b.findElement(By.xpath("//input[@value='Log out']")).click();
	 Thread.sleep(2000);
 }

  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chrome\\chromedriver-win64\\chromedriver.exe");
	  b=new ChromeDriver();
	  
	  b.manage().window().maximize();
	 // b.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  b.close();
  }

}
