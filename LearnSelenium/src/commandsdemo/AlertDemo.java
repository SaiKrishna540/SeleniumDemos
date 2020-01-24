package commandsdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		Alert alert1=driver.switchTo().alert();
		
		String alerttitle1=driver.switchTo().alert().getText();
		
		System.out.println("Alert Title is: "+alerttitle1);
		
		Thread.sleep(3000);

		alert1.accept();

		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		Alert alert2=driver.switchTo().alert();
		
		String alerttitle2=driver.switchTo().alert().getText();
		
		System.out.println("Alert Title is: "+alerttitle2);
		
		Thread.sleep(3000);

		alert2.dismiss();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		Alert alert3=driver.switchTo().alert();
		
		alert3.sendKeys("Testing");
		System.out.println(alert3);
		
		alert3.accept();
		Thread.sleep(3000);
		
		driver.close();
	}
}
