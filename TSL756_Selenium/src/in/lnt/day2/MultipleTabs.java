package in.lnt.day2;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.BrowserSetup;

public class MultipleTabs {
public static void main(String[] args) {
	WebDriver driver=BrowserSetup.browserStart("Chrome","https://www.seleniumhq.org/");
	String ParentID=driver.getWindowHandle();
	List<WebElement> ls=driver.findElements(By.xpath("/html/body/div[3]/div[1]/ul/li"));
	System.out.println(ls.size());
	for(WebElement E:ls)
	{
		new Actions(driver).moveToElement(E).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).perform();
	}
		Set<String> allWin=driver.getWindowHandles();
		java.util.Iterator<String> itr=allWin.iterator();
		while(itr.hasNext())
		{
			String ID=itr.next();
					System.out.println(ID);
					if(!(ID.equals(ParentID)))
					{
						driver.switchTo().window(ID);
						System.out.println("You are on "+driver.getTitle());
						driver.close();   // CLosing Tab/Window
					}
			driver.switchTo().window(ParentID);						
		}
	}
}

