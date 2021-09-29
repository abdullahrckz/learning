package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FrameDragDrop extends LaunchChrome {

	
	public void frameandDD()
	{
		
		WebElement framewebelement= driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(framewebelement);
		//driver.switchTo().frame(3);
		//driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();
		Actions a=new Actions(driver);
		WebElement drag=driver.findElement(By.xpath("//h5[text()='High Tatras']"));
		WebElement drop=driver.findElement(By.id("trash"));

		a.dragAndDrop(drag, drop).build().perform();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameDragDrop f= new FrameDragDrop();
		f.launch("https://www.globalsqa.com/demo-site/draganddrop/");
		f.frameandDD();

	}

}
