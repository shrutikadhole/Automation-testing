package guru99_Project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class bankProject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		
		b.get("https://demo.guru99.com/V1/index.php");
		
		//login page
		b.findElement(By.name("uid")).sendKeys("mngr596657");
		Thread.sleep(3000);
		b.findElement(By.name("password")).sendKeys("Upuzaze");
		Thread.sleep(3000);
		b.findElement(By.name("btnLogin")).click();
		Thread.sleep(3000);
//		b.findElement(By.name("btnReset")).click();
//		Thread.sleep(3000);
		
		//dashboard
		//add new customer
		b.findElement(By.linkText("New Customer")).click();
		Thread.sleep(3000);
		//name
		b.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys("afjgg");
		Thread.sleep(3000);
		//gender
		b.findElement(By.xpath("(//input[@name=\"rad1\"])[2]")).click();
		Thread.sleep(3000);
		//calender
		b.findElement(By.xpath("//input[@type='date']")).sendKeys("20-11-2024");
		Thread.sleep(3000);
		//address
		b.findElement(By.xpath("//textarea[@name=\"addr\"]")).sendKeys("pune,maharashtra");
		//city
		b.findElement(By.name("city")).sendKeys("pune");
		Thread.sleep(3000);
		//state
		b.findElement(By.name("state")).sendKeys("maharashtra");
		Thread.sleep(3000);
		//PIN
		b.findElement(By.name("pinno")).sendKeys("357656");
		Thread.sleep(3000);
		//Telephone number
		b.findElement(By.name("telephoneno")).sendKeys("9845678642");
		Thread.sleep(3000);
		//E-mail
		b.findElement(By.name("emailid")).sendKeys("sdgfgh@123gmail.com");
		Thread.sleep(3000);
		//submit
		b.findElement(By.xpath("//input[@name=\"sub\"]")).click();
		Thread.sleep(2000);
		b.navigate().back();
		
		
		//Edit Customer
		b.findElement(By.linkText("Edit Customer")).click();
		Thread.sleep(3000);
		
		b.findElement(By.name("cusid")).sendKeys("6544");
		Thread.sleep(2000);
		b.findElement(By.name("AccSubmit")).click();
		Thread.sleep(2000);
		b.navigate().back();
		
		//Delete Customer
		/* b.findElement(By.linkText("Delete Customer")).click();
		Thread.sleep(2000);

		b.findElement(By.xpath("//input[@name=\"cusid\"]")).sendKeys("6544");
		Thread.sleep(2000);
		b.findElement(By.xpath("//input[@value=\"Submit\"]")).click();
		Thread.sleep(2000);
		b.navigate().back();
		*/
		
		//New Account
		b.findElement(By.linkText("New Account")).click();
		//Thread.sleep(2000);
		b.findElement(By.name("cusid")).sendKeys("6594");
		
		WebElement at=b.findElement(By.name("selaccount"));
		Select Acctype=new Select(at);
		Acctype.selectByValue("current");
		Thread.sleep(1000);
		b.findElement(By.name("inideposit")).sendKeys("4500");
		Thread.sleep(1000);
		b.findElement(By.name("button2")).click();
		Thread.sleep(2000);
		b.navigate().back();
		
		//Edit Account
		b.findElement(By.linkText("Edit Account")).click();
		Thread.sleep(1000);
		b.findElement(By.name("accountno")).sendKeys("4565");
		Thread.sleep(1000);
		b.findElement(By.name("AccSubmit")).click();
		b.navigate().back(); 
		
		//Delete Account
		b.findElement(By.linkText("Delete Account")).click();
		Thread.sleep(1000);
		b.findElement(By.xpath("//input[@name=\"accountno\"]")).sendKeys("6543");
		Thread.sleep(1000);
		b.findElement(By.xpath("//input[@name=\"AccSubmit\"]")).click();
		Thread.sleep(2000);
		b.navigate().back();
		
		//Mini statement
		b.findElement(By.linkText("Mini Statement")).click();
		Thread.sleep(1000);
		b.findElement(By.name("accountno")).sendKeys("7654");
		Thread.sleep(1000);
		b.findElement(By.name("AccSubmit")).click();
		Thread.sleep(1000);
		b.navigate().back();
		
		//Customised statement
		b.findElement(By.linkText("Customised Statement")).click();
		Thread.sleep(1000);
		b.findElement(By.name("accountno")).sendKeys("23456");
		Thread.sleep(1000);
		b.findElement(By.name("fdate")).sendKeys("12-03-2023");
		Thread.sleep(1000);
		b.findElement(By.name("tdate")).sendKeys("23-10-2025");
		Thread.sleep(1000);
		b.findElement(By.name("loweramt")).sendKeys("200");
		Thread.sleep(1000);
		b.findElement(By.name("tranno")).sendKeys("56344");
		Thread.sleep(1000);
		b.findElement(By.name("AccSubmit")).click();
		Thread.sleep(1000);
		b.navigate().back();
		
		//logout
		b.findElement(By.linkText("Log out")).click();
		Thread.sleep(1000);
		Alert l=b.switchTo().alert();
		String logout=l.getText();
		System.out.println(logout);
		l.accept();
		
		Thread.sleep(3000);
		b.close();
	}

}
