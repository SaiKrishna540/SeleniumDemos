package commandsdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

		Select skills= new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
		List<WebElement>list=skills.getOptions();
		System.out.println("Number of List Elements in Skills: "+list.size());

		for(int i=0;i<list.size();i++){
		System.out.println("Elements in Skills are: "+list);
		}

		driver.close();
	}

}
