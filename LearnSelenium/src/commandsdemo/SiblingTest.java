package commandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiblingTest {

		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "E:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.navigate().to("http://demo.automationtesting.in/WebTable.html");
			driver.manage().window().maximize();
			
//			driver.findElement(By.xpath("//a[contains(text(),'WebTable')]//parent::li//preceding-sibling::li[1]//child::a[contains(text(),'Register')]")).click();
//			driver.findElement(By.xpath("//a[contains(text(),'Register')]//parent::li//following-sibling::li[1]//child::a[contains(text(),'WebTable')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'WebTable')]//parent::li//following-sibling::li[1]//child::a[contains(text(),'Register')]")).click();
			
			Thread.sleep(3000);
			
			driver.close();
		}		
}
