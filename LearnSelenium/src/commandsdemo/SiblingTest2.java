package commandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiblingTest2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/computers");
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//a[contains(text(),'Computers')]//parent::li//parent::ul//child::li//a[contains(text(),'Electronics')]")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'Computers')]//ancestor::html//descendant::div//a[contains(text(),'Camera')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Computers')]//parent::li//parent::ul//child::li//a[contains(text(),'Electronics')]//ancestor::li//following-sibling::a[contains(text(),'Camera')]")).click();
		Thread.sleep(3000);
		driver.close();
	}	
}
