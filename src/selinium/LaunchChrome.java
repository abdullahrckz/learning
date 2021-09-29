package selinium;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	public static WebDriver driver;
	
	public void launch(String url)
	{
		String path=".//driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
	}
	public void clicksendkey() throws InterruptedException
	{
		WebElement username=driver.findElement(By.xpath("//input[@name='email']"));
		WebElement password=driver.findElement(By.xpath("//input[@name='pass']"));
		// or driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abdullahrckz001@gmail.com);
		//or driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("fsfffffaf");
		username.sendKeys("abdullahrckz@gmail.com");
		password.sendKeys("graphic2222s123");
		WebElement uname=driver.findElement(By.id("email"));
		//WebElement pass=driver.findElement(By.id("pass"));
		uname.clear();
		//0r username.clear();
		uname.sendKeys("abdullahrckz001@gmail.com");
		WebElement loginb=driver.findElement(By.tagName("button"));
		loginb.click();
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Forgotten password")).click();
		driver.close();
		
	}

	public static void main(String[] args) throws InterruptedException, IOException, AWTException{
		
		LaunchChrome f=new LaunchChrome();
		f.launch("https://en-gb.facebook.com/");
		f.clicksendkey();

	}

}
