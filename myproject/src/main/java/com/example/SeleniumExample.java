package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumExample {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",".\\src\\geckodriver.exe"); // Setting system properties of FirefoxDriver
		WebDriver driver = new FirefoxDriver(); //Creating an object of FirefoxDriver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://twitter.com/home");
		button_click(driver,"/html/body/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[5]/label/div/div[2]/div");
		textbox_schreiben(driver, "/html/body/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[5]/label/div/div[2]/div/input","animeforlive@proton.me");
		
//		driver.findElement(By.name("q")).sendKeys("Browserstack Guide"); //name locator for text box
//		WebElement searchbutton = driver.findElement(By.name("btnK"));//name locator for google search
//		searchbutton.click();
//		driver.quit();
	}
	
	private static void button_click(WebDriver wd, String xpath) {
		WebElement button = wd.findElement(By.xpath(xpath));
		button.click();
	}
	private static void textbox_schreiben(WebDriver wd ,String xpath ,String text) {
	      WebElement textBox = wd.findElement(By.xpath(xpath));
	      textBox.sendKeys(text);
	}
	
}