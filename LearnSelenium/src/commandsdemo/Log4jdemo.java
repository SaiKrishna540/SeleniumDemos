package commandsdemo;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jdemo {

	public static void main(String[] args) {
		Logger log=Logger.getLogger(Log4jdemo.class);
		
		System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		
		log.info("Apllication Started Successfully");
		
		String expectedresult="Google";
		String actualresult=driver.getTitle();

		log.warn("Check title");
		if(expectedresult.equals(actualresult)) {
			System.out.println("Correct Title");
			
			log.info("Correct Page");
			driver.close();
		}
		else {
			System.out.println("Incorrect Title");
			
			driver.close();
		}
	}
}
