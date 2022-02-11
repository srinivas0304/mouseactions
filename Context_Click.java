package mouseActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Context_Click 
{
	@Test
	public void rightClick() throws Exception
	{
		System.setProperty("webdriver.edge.driver", "C:\\\\Selenium\\\\Drivers\\\\new edge\\\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement ele=driver.findElement(By.xpath("//a[text()='Gmail']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(ele).contextClick().build().perform();
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
	
	}
	
}
