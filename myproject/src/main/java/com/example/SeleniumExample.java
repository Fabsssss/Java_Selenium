package com.example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SeleniumExample {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",".\\src\\geckodriver.exe"); // Setting system properties of FirefoxDriver
		WebDriver driver = new FirefoxDriver(); //Creating an object of FirefoxDriver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://twitter.com/home");
		
		WebElement d = driver_wait(driver, "/html/body/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[5]/label/div/div[2]",10);
	    d.click();
		textbox_schreiben_xpath(driver, "/html/body/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[5]/label/div/div[2]/div/input","animeforlive@proton.me");
	    button_click(driver,"/html/body/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[6]/div");
	     
	    
	    WebElement a = driver_wait(driver, "/html/body/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div[2]/label/div/div[2]/div/input",10);
	    a.click();
		textbox_schreiben_xpath(driver, "/html/body/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div[2]/label/div/div[2]/div/input","animeforli28455");
	    button_click(driver,"/html/body/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div/div/div");
	   

		
		//		driver.quit();	    
	    
	   
	    WebElement b = driver_wait(driver, "/html/body/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div/div[3]/div/label/div/div[2]/div[1]/input",10);
	    b.click();
		textbox_schreiben_xpath(driver, "/html/body/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div/div[3]/div/label/div/div[2]/div[1]/input","AUiHzB3Jo8iCKTCT5B9S");
	    button_click(driver,"/html/body/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/div/div/div/div");
	   
	    List<WebElement> l = driver.findElements(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div"));
		if(l.size()> 0) {
			button_click(driver,"/html/body/div[1]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div");
		}
		
	    List<WebElement> l1 = driver.findElements(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div/div/div/div[2]/div[2]/div"));
		if(l1.size()> 0) {
			button_click(driver,"/html/body/div[1]/div/div/div[1]/div/div/div/div/div/div[2]/div[2]/div");
		}
		
		
		
		
		
		
		
		
	    //}
	   
	    
	    
	    
		//textbox_schreiben(driver, "/html/body/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div/div[3]/div/label/div/div[2]/div[1]/input","animeforlive@proton.me");
	    //		driver.findElement(By.name("q")).sendKeys("Browserstack Guide"); //name locator for text box
//		WebElement searchbutton = driver.findElement(By.name("btnK"));//name locator for google search
//		searchbutton.click();

	    
	}
	
	private static void button_click(WebDriver wd, String xpath) {
		WebElement button = wd.findElement(By.xpath(xpath));
		button.click();
	}
	private static void textbox_schreiben_xpath(WebDriver wd ,String xpath ,String text) {
	      WebElement textBox = wd.findElement(By.xpath(xpath));
	      textBox.sendKeys(text);
	}
	private static void textbox_schreiben_classname(WebDriver wd ,String classname ,String text) {
	      WebElement textBox = wd.findElement(By.className(classname));
	      textBox.sendKeys(text);
	}
	private static WebElement driver_wait(WebDriver wd ,String xpath, int time) {
		WebDriverWait wait = new WebDriverWait(wd, time);
	    WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
	    return element;
	}
	
}