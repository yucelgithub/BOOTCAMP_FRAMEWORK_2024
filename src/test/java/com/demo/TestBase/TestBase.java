package com.demo.TestBase;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Demo.Utilities.Utils;



   public class TestBase {
	
	public WebDriver driver;
	public Properties prop;
	public FileInputStream ip;
	public FileInputStream ip1;
	public Properties dataprop;
	
	public TestBase() throws Exception	{
		//C:\Users\yucel\eclipse-workspace\BootCampMavenProjectTest\src\main\java\com\Demo\Config\config.properties
		 prop = new Properties();
		 ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\Demo\\Config\\config.properties");
         prop.load(ip);
         
         dataprop = new Properties();
         ip1 = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\demo\\TestData\\testData.properties");
         dataprop.load(ip1);
	}
	public WebDriver initializeBrowserOpenApplication(String browserName) {
		if(browserName.equals(prop.getProperty("browser"))) {
			ChromeOptions options = new ChromeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.EAGER);
			options.addArguments("--start-maximized");
			options.addArguments("--incognito");
			options.setExperimentalOption("excludeSwitches",Arrays.asList("enable-automation","disable-infobars"));
			driver = new ChromeDriver(options);
			
		}else if(browserName.equals(dataprop.getProperty("secondaryBrowser"))){
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}else if(browserName.equals(dataprop.getProperty("tertiaryBrowser"))){
		        driver = new EdgeDriver();
		        driver.manage().window().maximize();
		}      
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utils.IMPLICIT_WAIT));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Utils.PAGE_LOAD_TIMEOUT));
		 driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(Utils.SCRIPT_TIMEOUT));
		 driver.get(prop.getProperty("url"));
		 return driver;
		 
		        
	 }
	
	}	        
		        
			
		
			
		
	
		
	


