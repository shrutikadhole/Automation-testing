package guru99_Project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class agileproject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		
		
		b.get("https://demo.guru99.com/Agile_Project/Agi_V1/");
		//login
		b.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys("1303");
		Thread.sleep(2000);
		b.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Guru99");
		Thread.sleep(2000);
		b.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		
		//mini statement
		b.findElement(By.linkText("Mini Statement")).click();
		WebElement ac=b.findElement(By.name("accountno"));
		
		Select accno=new Select(ac);
		//accno.selectByVisibleText("3308");
		
		accno.selectByIndex(1);
		Thread.sleep(2000);
		
		b.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		
		//navigate back
		b.navigate().back();
		Thread.sleep(2000);
		
		//logout
		b.findElement(By.linkText("Log out")).click();
		
		Thread.sleep(2000);
		
		Alert a=b.switchTo().alert();
		String c=a.getText();
		System.out.println(c);
		a.accept();
		
		Thread.sleep(2000);
		
		b.close();
	}

}
