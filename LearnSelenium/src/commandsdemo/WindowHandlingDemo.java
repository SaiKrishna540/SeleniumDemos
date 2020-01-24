package commandsdemo;
import java.util.Iterator;		
import java.util.Set;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		

public class WindowHandlingDemo {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();			
		//Launching the site.				
		driver.get("http://demo.guru99.com/popup.php");	
		
		driver.manage().window().maximize();	
		String MainWindow=driver.getWindowHandle();		
		System.out.println(MainWindow);
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();			
		        		
		// To handle all new opened window.				
		Set<String> s1=driver.getWindowHandles();		
		Iterator<String> i1=s1.iterator();		
		        		
		while(i1.hasNext())
		{
			String ChildWindow=i1.next();
			
			if(!MainWindow.equalsIgnoreCase(ChildWindow)) {
				
				// Switching to Child window
				driver.switchTo().window(ChildWindow);
				driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("gaurav.3n@gmail.com");                			
		        driver.findElement(By.xpath("//input[@name='btnLogin']")).click();			
		        
		        System.out.println(MainWindow);
		        driver.close();
			}
		}
		driver.switchTo().window(MainWindow);
	}
}	
	

