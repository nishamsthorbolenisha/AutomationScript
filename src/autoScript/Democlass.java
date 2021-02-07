package autoScript;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Democlass {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
//		driver.get("https://www.craftsvilla.com/");
//		
		Actions act=new Actions(driver);
//		WebElement sar = driver.findElement(By.xpath("//a[contains(text(),'SAREES')]"));
//		
//		
//		act.moveToElement(sar).perform();
//		Thread.sleep(2000);
//		WebElement cotton_sar = driver.findElement(By.xpath("//a[contains(text(),'Cotton Sarees')]"));
//		act.contextClick(cotton_sar).perform();
//		
//		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_T);
//		r.keyRelease(KeyEvent.VK_T);
//		Thread.sleep(2000);
//		driver.quit();
//		
		//drag and drop
//		driver.get("file:///C:/Users/HP/Desktop/drag&drop.html");
//		
//    	WebElement src = driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"));
//    	WebElement dest = driver.findElement(By.xpath("//p[contains(text(),'Drop here')]"));
//    	act.dragAndDrop(src, dest).perform();
//    	driver.close();
		
		//DoubleClick
		driver.get("file:///C:/Users/HP/Desktop/doubliclick.html");
		WebElement btn = driver.findElement(By.xpath("//button[contains(text(),'Double-click here')]"));
		act.doubleClick(btn).perform();
		Thread.sleep(2000);
		driver.close();
	
		
		


}
}