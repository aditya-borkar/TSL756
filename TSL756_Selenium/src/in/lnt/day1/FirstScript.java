package in.lnt.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D:\\Jars\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.seleniumhq.org/");
driver.findElement(By.linkText("Download")).click();
String title=driver.getTitle();
System.out.println("I am on"+title+"Page");
driver.findElement(By.name("q")).sendKeys("LNT");
Thread.sleep(3000);
driver.quit();
	}

}
