package com.qa.util;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.rules.ErrorCollector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcore {
	public static WebDriver driver;
	public static Properties prop;
	public  static ErrorCollector collector;

	public Testcore() {// super clas constr
		try {
			prop = new Properties();
			FileInputStream f = new FileInputStream(
					"F:\\Salenium Project\\com.ShearkhanPom\\src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(f);
			// log.info("config file load");
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public static void initilization() {
		String browsername = prop.getProperty("chrome");
		if (prop.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "");
			driver = new FirefoxDriver();
			System.out.println("Load firefox");
			// log.info("firefox load");

		} else if (prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"F:\\jar\\selenium jar\\chromeupdate\\updated chrome2019\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Load chrome");
			// log.info("chrome load");

		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));
	}

}
