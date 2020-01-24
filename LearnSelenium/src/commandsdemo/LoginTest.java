package commandsdemo;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
//		System.setProperty("webdriver.gecko.driver", "E:\\Softwares Required For Testing Batch\\seleniumGH20software\\geckodriver-v0.26.0-win64\\geckodriver.exe");
//		WebDriver driver= new FirefoxDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("Email")).sendKeys("saikrishna12@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Sai143");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		String expectedname = "Demo Web Shop";
		
		String actualname=driver.getTitle();
		
		if(expectedname.equals(actualname)){
			System.out.println("You are on the correct page");
		}
		else{
			System.out.println("Incorrect Page");
		}
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		driver.close();
	}

}
	