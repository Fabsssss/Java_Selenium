package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
	    WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[5]/label/div/div[2]")));
		
	    element.click();
		

		textbox_schreiben_xpath(driver, "/html/body/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[5]/label/div/div[2]/div/input","animeforlive@proton.me");
	    button_click(driver,"/html/body/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[6]/div");
	     
	    if(driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div[1]/div/h1/span/span")).getAttribute("innerHTML") == "Gib deine Telefonnummer oder deinen Nutzernamen ein") {
	    	button_click(driver,"/html/body/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div[2]/label/div/div[2]/div/input");
	    	WebElement f = driver.switchTo().activeElement();
	    	//textbox_schreiben_classname(driver, "/html/body/div[1]/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div[2]/label/div/div[2]/div/input","animeforlive@proton.me");
	 	   f.sendKeys("test");
	    }
	   
	    
	    
	    
		//textbox_schreiben(driver, "/html/body/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div/div[3]/div/label/div/div[2]/div[1]/input","animeforlive@proton.me");
	    //		driver.findElement(By.name("q")).sendKeys("Browserstack Guide"); //name locator for text box
//		WebElement searchbutton = driver.findElement(By.name("btnK"));//name locator for google search
//		searchbutton.click();
//		driver.quit();
	    
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
	
}