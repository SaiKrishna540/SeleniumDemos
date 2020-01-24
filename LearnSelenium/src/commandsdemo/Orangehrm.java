package commandsdemo;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Orangehrm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();	
	
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String Expectedtitle="OrangeHRM";
		System.out.println(Expectedtitle);
	
		String Actualtitle=driver.getTitle();
		System.out.println(Actualtitle);
		if(Expectedtitle.equals(Actualtitle)){
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
	
		WebDriverWait Mywait=new WebDriverWait(driver, 10);
		Mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='welcome']")));
		
		driver.findElement(By.id("welcome")).click();
//		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		System.out.println("End");
		}
		else {
			System.out.println("Incorrect Title");
		}
		driver.close();
	}

}
