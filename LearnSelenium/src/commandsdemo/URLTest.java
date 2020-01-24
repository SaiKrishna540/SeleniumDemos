package commandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URLTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		String givenurl="http://demowebshop.tricentis.com/";
		String actualurl= driver.getCurrentUrl();
		
		if(givenurl.equals(actualurl)){
			System.out.println("You are on the correct page");
		}
		else{
			System.out.println("Incorrect Page");
		}

		driver.findElement(By.id("Email")).sendKeys("saikrishna12@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Sai143");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();

		String expectedname = "Demo Web Shop";		
		String actualname=driver.getTitle();		
		int titlelength=actualname.length();
		System.out.println(titlelength);
		
		if(expectedname.equals(actualname)){
			System.out.println("You are on the correct page");
		}
		else{
			System.out.println("Incorrect Page");
		}
		
		String source=driver.getPageSource();
		int pagelength= driver.getPageSource().length();
		System.out.println(source);
		System.out.println(pagelength);
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		driver.close();

	}

}
