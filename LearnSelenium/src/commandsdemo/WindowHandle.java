package commandsdemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "E:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.navigate().to("http://demo.automationtesting.in/Windows.html");
//			String parentWindowHandle = driver.getWindowHandle();
			System.out.println("The title of main window is:"+driver.getTitle());
			
			driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]")).click();;
			
//			WebElement clickElement = driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]")); 
//			clickElement.click();
			
			Set<String>windowids=driver.getWindowHandles();
			
			Iterator<String>iter=windowids.iterator();
			
			String mainWindow=iter.next();
			
			String childWindow=iter.next();
			
			driver.switchTo().window(childWindow);

			System.out.println("The title of child window is:"+driver.getTitle());
			
			driver.close();
			
			driver.switchTo().window(mainWindow);
			
			System.out.println("The title of main window is:"+driver.getTitle());
			
			driver.close();		
	}
}
