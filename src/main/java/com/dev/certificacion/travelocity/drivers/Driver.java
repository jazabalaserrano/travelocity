package com.dev.certificacion.travelocity.drivers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
	static WebDriver driver;

	public Driver() {
		Properties prop = new Properties(); 
		try {
			prop.load(new FileInputStream("src/test/resources/users.properties"));
			String downloadPath = prop.getProperty("fileDownloadLocal");
			System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
			HashMap<String, Object> preferences = new HashMap<String,Object>();
	        preferences.put("profile.default_content_settings.popups", 0);
	        preferences.put("download.prompt_for_download",downloadPath);
	        preferences.put("download.default_directory", downloadPath);
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito", "--start-maximized", "--disable-infobars"
		    , "-enable-print-preview", "--kiosk-printing"
			);
			options.setExperimentalOption("prefs", preferences);
			driver = new ChromeDriver(options);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

	public static Driver web() {
		return new Driver();
	}

	public static WebDriver inThePage(String url) {
		driver.get(url);
		return driver;
	}

	public static WebDriver inTheStage() {
		return driver;
	}
}