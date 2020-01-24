package commandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Sas");
		driver.findElement(By.id("LastName")).sendKeys("uke");
		driver.findElement(By.id("Email")).sendKeys("sasuke23@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("sasuke");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("sasuke");
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		driver.close();
	}

}
