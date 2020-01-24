package commandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Nar");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("uto");

		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required']")).sendKeys("naruto@gmail.com");
		driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern']")).sendKeys("9876543211");
		driver.findElement(By.xpath("//input[@name='radiooptions' and @ value='Male']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox1' and @value='Cricket']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox2' and @value='Movies']")).click();
//		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		
		WebElement skills=driver.findElement(By.xpath("//select[@id='Skills']"));
		Select skill1= new Select(skills);
		skill1.selectByVisibleText("Java");
		
		WebElement country=driver.findElement(By.xpath("//select[@id='countries']"));
		Select country1= new Select(country);
		country1.selectByVisibleText("India");

//		WebElement selectcountry=driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']"));
//		Select selectcountry1= new Select(selectcountry);
//		selectcountry1.selectByVisibleText("India");
		
		WebElement year=driver.findElement(By.xpath("//select[@id='yearbox']"));
		Select sel1= new Select(year);
		sel1.selectByVisibleText("1993");
		
		WebElement month=driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select sel2= new Select(month);
		sel2.selectByVisibleText("November");

		WebElement day=driver.findElement(By.xpath("//select[@id='daybox']"));
		Select sel3= new Select(day);
		sel3.selectByVisibleText("7");

		driver.findElement(By.id("firstpassword")).sendKeys("N@ruto1");
		driver.findElement(By.id("secondpassword")).sendKeys("N@ruto1");
		driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
//		driver.findElement(By.xpath("//button[@id='Button1']")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
