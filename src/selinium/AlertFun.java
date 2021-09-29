package selinium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class AlertFun extends LaunchChrome {
	static int c=1;
	public static void screenshot() throws IOException
	{
		TakesScreenshot ss=(TakesScreenshot)driver;
		File src=ss.getScreenshotAs(OutputType.FILE);
		File path= new File("./Screenshots/Screen"+c+".png");
		FileUtils.copyFile(src, path);
		c++;
	}

	
	public void handleAlert() throws InterruptedException, IOException
	{
		screenshot();
		driver.findElement(By.name("submit")).click();
		//Thread.sleep(2000);
		//driver.switchTo().alert().accept();
		//Thread.sleep(2000);
		//driver.switchTo().alert().accept();
		String me= driver.switchTo().alert().getText();
		if(me.contains("delete"))
		{
		driver.switchTo().alert().dismiss();
		}
		//driver.switchTo().alert().sendKeys("hi");
		System.out.println("jl");
		System.out.println(me);
		System.out.println("jf");
		screenshot();
		
		driver.close();
		
	}
	public void rbtMethod() throws AWTException, InterruptedException
	{
	Robot r=new Robot();
		driver.findElement(By.name("cusid")).click();
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_B);
		r.keyRelease(KeyEvent.VK_B);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		
		}
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		// TODO Auto-generated method stub
		AlertFun a=new AlertFun();
		a.launch("http://demo.guru99.com/test/delete_customer.php");
		//a.handleAlert();
		a.rbtMethod();

	}

}
