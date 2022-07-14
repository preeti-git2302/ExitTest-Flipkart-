package com.ExitTest.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.ExitTest.utiles.ScreenShot;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseTest {

	protected static WebDriver driver;
	public static File file;
	public static FileInputStream fis;
	public static Properties prop;
	public static ExtentReports extent;
	public static ExtentTest extentTest;
	
	static {
		try {
			file = new File("./Resources/Config.Properties");
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
   }
	static { String log4jConfigFile = System.getProperty("user.dir") +
			File.separator + "./Resources/log4j2.xml";

			Configurator.initialize(null,log4jConfigFile);
			}
			public static Logger logger = LogManager.getLogger(BaseTest.class.getName());
	
	@BeforeSuite
	public void setExtent() {
		extent = new ExtentReports("./Reports/ExtentReport.html");
	}
	
	@AfterSuite
	public void endReport() {
		extent.flush();
		extent.close();
	}
	
	@BeforeMethod
	@Parameters ({"browser"})
	public static void intializerDriver(String browser) {
		if(browser.equalsIgnoreCase("edge"))
		{
		System.setProperty(prop.getProperty("EdgeProperty"), prop.getProperty("EdgePath"));
		driver = new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty(prop.getProperty("ChromeProperty"), prop.getProperty("ChromePath"));
		//driver = new ChromeDriver();
	    ChromeOptions options = new ChromeOptions();
	        
	    //add the headless argument
	    options.addArguments(prop.getProperty("headless"));
	        
	    //pass the options parameter in the Chrome driver declaration
	    driver = new ChromeDriver(options);
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
		System.setProperty(prop.getProperty("FireFoxProperty"), prop.getProperty("FireFoxPath"));
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments(prop.getProperty("headless"));
		driver = new FirefoxDriver(options);
		}
		else {
			System.out.println("Invalid Browser");
		}
		//String number = prop.getProperty("wait");
		//int num = Integer.parseInt(number);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
	
	@BeforeMethod
	public static void openUrl() {
		driver.get(prop.getProperty("url"));
	}
	
	@BeforeMethod
	public static void windowMaximize() {
		driver.manage().window().maximize();
	}
		
	@BeforeMethod
	public void startTest(Method name) {
		
		String testname = name.getName();
		extentTest = extent.startTest(testname);
	}
	
	@AfterMethod
	public void resultTest(ITestResult result) throws IOException {
		
		if(result.getStatus() == ITestResult.FAILURE) {
			
			String imagePath = ScreenShot.captureScreenshot(driver, result.getName());
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(imagePath));
			
		}
		else {
			
			if(result.getStatus() == ITestResult.SUCCESS) {
				
				extentTest.log(LogStatus.PASS, "Test Case Pass");	
			}	
		}
		
	}
	
	@AfterMethod
	public void endTest() {
		extent.endTest(extentTest);
	}
	
	@AfterMethod
	public static void testclose() {
		driver.close();
	}
}