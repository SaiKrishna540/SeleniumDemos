package commandsdemo;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotDemo {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://smallpdf.com/pdf-to-word");
		driver.manage().window().maximize();
		
		Robot robot=new Robot();
		robot.setAutoDelay(3000);
		driver.findElement(By.xpath("//div[@class='l0v3m7-6 hIetmX']")).click();
		
		StringSelection stringselect=new StringSelection("C:\\Users\\IBM\\Desktop\\ISTQB\\tryqa.com-ISTQB-Dumps-and-Mock-Tests-for-Foundation-Level-Paper-1");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselect, null);
		robot.setAutoDelay(3000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.setAutoDelay(3000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		driver.close();
	}

}
