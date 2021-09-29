package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class mouseaction extends LaunchChrome {
	Actions a;
	public void douubleclick()
	{
		a=new Actions(driver);
		//WebElement doubleclick=driver.findElement(By.id("dblClkBtn"));
		WebElement doubleclick=driver.findElement(By.xpath("//button[text()='Double-click to generate alert box']"));

		a.doubleClick(doubleclick).build().perform();
		
	}
	public void contextclick()
	{
		a=new Actions(driver);
		//WebElement doubleclick=driver.findElement(By.id("dblClkBtn"));
		WebElement conte=driver.findElement(By.xpath("//span[text()='right click me']"));


		a.contextClick(conte).build().perform();
		
		
	}
	public void movetoelement() throws InterruptedException
	{
		a=new Actions(driver);
		//WebElement doubleclick=driver.findElement(By.id("dblClkBtn"));
		WebElement movetoelem=driver.findElement(By.xpath("//button[text()='Generate Confirm Box']"));

		Thread.sleep(5000);
		a.contextClick(movetoelem).build().perform();
		a.click(movetoelem).build().perform();
		
	}
	public void clickandhold() throws InterruptedException
	{
		a=new Actions(driver);
		//WebElement doubleclick=driver.findElement(By.id("dblClkBtn"));
		WebElement clickhold=driver.findElement(By.name("B"));

	
		a.clickAndHold(clickhold).build().perform();
		Thread.sleep(10000);
		a.release(clickhold).build().perform();
	
		
	}
	
public static void main(String[] args) throws InterruptedException {
		
		mouseaction m=new mouseaction();
		//m.launch("https://www.testandquiz.com/selenium/testing.html");
		//m.douubleclick();
		//m.launch("http://demo.guru99.com/test/simple_context_menu.html");
		//m.contextclick();
		//m.launch("https://www.testandquiz.com/selenium/testing.html");
		//m.movetoelement();
		m.launch("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		m.clickandhold();


	}

}
