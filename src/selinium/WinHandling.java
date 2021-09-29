package selinium;

import org.openqa.selenium.By;
import java.util.*;

public class WinHandling extends LaunchChrome{
	public void css()
	{
		//driver.findElement(By.cssSelector("input[id ='email']")).sendKeys("abdullah");
		//driver.findElement(By.cssSelector("input[id ='pass']")).sendKeys("abdullah");
		//driver.findElement(By.cssSelector("input[id ^='ema']")).sendKeys("abdullah");//first character
		//driver.findElement(By.cssSelector("input[id $='ss']")).sendKeys("abdullah");//last character
		driver.findElement(By.cssSelector("input#email")).sendKeys("abdullah");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("abdullah");
		//driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy _9npi")).sendKeys("abdullah");

	}
	public void winhan() throws InterruptedException
	{
		String s=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> m=driver.getWindowHandles();
		System.out.println(s);
		System.out.println(m);
		for(String k:m)
		{
			driver.switchTo().window(k);
		}
		driver.findElement(By.name("emailid")).sendKeys("abdullahrckz001@gmail.com");
		driver.findElement(By.name("btnLogin")).click();
		driver.close();
		Thread.sleep(5000);
		driver.switchTo().window(s);
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> u=driver.getWindowHandles();
		for(String i:u)
		{
			driver.switchTo().window(i);
		}
		driver.findElement(By.name("emailid")).sendKeys("ab@gmail.com");
		driver.findElement(By.name("btnLogin")).click();
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WinHandling win=new WinHandling();
		//win.launch("http://demo.guru99.com/popup.php");
		win.launch("https://en-gb.facebook.com/");
		//win.winhan();
		win.css();

	}

}
