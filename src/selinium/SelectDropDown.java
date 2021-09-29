package selinium;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown extends LaunchChrome{
	
	public void select()
	{
		WebElement p=driver.findElement(By.xpath("//select[@name='country']"));
		Select s = new Select(p);
		//s.selectByValue("INDIA");
		//s.selectByVisibleText("JAPAN");
		s.selectByIndex(7);
		List<WebElement> mm= s.getOptions();
		for(WebElement kk:mm)
		{
			//System.out.println(kk.getText());
			System.out.println(kk.getAttribute("value"));
			String bb=kk.getText();
			if(bb.equalsIgnoreCase("JAPAN"))
			{
				s.selectByVisibleText(bb);
			}
		}
		
	}
	public void jscript() throws InterruptedException
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		//driver.findElement(By.xpath("//button[text()='✕']")).click();//normal click
		WebElement clk=driver.findElement(By.xpath("//button[text()='✕']"));
		js.executeScript("arguments[0].click();",clk);//using javascript click();
		js.executeScript("window.scrollBy(0,2000)");//scroll down
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-5000)");//scroll up
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//driver.get("https://www.facebook.com/");//normal launch url
		String s= "https://www.facebook.com/";
		js.executeScript("window.location=\'"+s+"\'");//java script using launch url
		
	}
	public void andorcontain()
	{
		//driver.findElement(By.xpath("//input[contains(@id,'mai')]")).sendKeys("abdullahrckz001@gmail.com");
		//driver.findElement(By.xpath("//input[starts-with(@id,'pa')]")).sendKeys("graphics123");
		driver.findElement(By.xpath("//input[contains(@id,'mai')and @name='email']")).sendKeys("abdullahrckz001@gmail.com");
		driver.findElement(By.xpath("//input[starts-with(@id,'pass')or @name='pass']")).sendKeys("graphics123");
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SelectDropDown sd=new SelectDropDown();
		
		//sd.launch("https://www.flipkart.com/");
		sd.launch("http://demo.guru99.com/test/newtours/register.php");
		//sd.andorcontain();
		sd.select();
		//sd.jscript();
		
		

	}
	

}
