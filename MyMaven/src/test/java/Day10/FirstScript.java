package Day10;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import util.Base2;
import util.BrowserSetup;
public class FirstScript extends Base2
{
  @Test
  public void f() throws IOException {
	  ExtentReports extReport= new ExtentReports();
	  extReport.attachReporter(new ExtentHtmlReporter("Google.html"));
	ExtentTest test=extReport.createTest("Title Test");
	driver.get("http://google.com");
	test.info("Checking File");
	Assert.assertEquals(driver.getTitle(), "Google");
	BrowserSetup.getScreenShot("title");
	  
	BrowserSetup.getScreenShot("title");
	  test.pass("Title Test Pass");
	  test.addScreencastFromPath(".\\titleFri_Mar_15_15_17_44_IST_2019.png");
	  extReport.flush();
  }
}
