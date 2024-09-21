package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import pages.homepage;

public class testng_demo {
	
	WebDriver driver = null;
	ExtentReports extent;
    ExtentTest test;
	homepage hp;
	
	@BeforeTest
	public void setuptest() {
//		switch()
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter("extentReport.html");
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://magento.softwaretestingboard.com/");
		
		test = extent.createTest("Luma SignIn Test");
		
	}
	
	@Test
	public void homepage1() { 
		hp = new homepage(driver, test);
		test.generateLog(Status.INFO, "testing disclaimer");
		hp.verifyDisclaimer();
		test.generateLog(Status.PASS, "disclaimer match");
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
		extent.flush();
	}

}
