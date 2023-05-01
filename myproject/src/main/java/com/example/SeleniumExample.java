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
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver",".\\src\\geckodriver.exe"); // Setting system properties of FirefoxDriver
		WebDriver driver = new FirefoxDriver(); //Creating an object of FirefoxDriver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		driver.get("https://twitter.com/home");
//		
//	
//		driver_wait(driver, "/html/body/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[5]/label/div/div[2]",10).click();
//		textbox_schreiben_xpath(driver, "/html/body/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[5]/label/div/div[2]/div/input","animeforlive@proton.me");
//	    button_click(driver,"/html/body/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[6]/div");
//	     
//	    
//	    driver_wait(driver, "/html/body/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div[2]/label/div/div[2]/div/input",10).click();
//		textbox_schreiben_xpath(driver, "/html/body/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div[2]/label/div/div[2]/div/input","animeforli28455");
//	    button_click(driver,"/html/body/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div/div/div");
//	   
//
//	    driver_wait(driver, "/html/body/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div/div[3]/div/label/div/div[2]/div[1]/input",10).click();
//		textbox_schreiben_xpath(driver, "/html/body/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div/div[3]/div/label/div/div[2]/div[1]/input","AUiHzB3Jo8iCKTCT5B9S");
//	    button_click(driver,"/html/body/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/div/div/div/div");
//
//	    driver_wait(driver, "/html/body/div[1]/div/div/div[2]/header/div/div/div/div[1]/div[3]/a/div/span/div/div/span/span",10).click();
//	    
//	    
//	    System.out.println("TEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
//	    Thread.sleep(1000);
//	    driver_wait(driver, "/html/body/div[1]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div",10);
//	    driver_wait(driver, "/html/body/div[1]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div[2]",10).click();
//	    WebElement test = driver_wait(driver, "/html/body/div[1]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div/div[3]/div[2]/div[1]/div/div/div/div/div[2]/div[1]/div/div/div/div/div/div[2]/div/div/div/div/label/div[1]/div/div/div/div/div/div[2]/div",10);
//	    test.click();
//	    test.sendKeys("test");
//	    System.out.println("TEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
//	    WebElement file = driver_wait(driver, "/html/body/div[1]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div/div[3]/div[2]/div[1]/div/div/div/div/div[2]/div[3]/div/div/div[1]/input",10);
//	    file.sendKeys("C:\\Users\\Fabs\\Desktop\\SD\\gg.png");
		
		
	    
	    
	    
	    driver.get("https://www.facebook.com/profile.php?id=100091907666106");
	    System.out.println("pquhegrpowejriofvw");
	    
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    WebElement q = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@class, '" + "x9f619 x1n2onr6 x1ja2u2z x78zum5 xdt5ytf x193iq5w xeuugli x1iyjqo2 xs83m0k x150jy0e x1e558r4 xjkvuk6 x1iorvi4 xdl72j9" + "')]")));
	    q.click();
	    
	    WebElement r = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@class, '" + "_42ft _4jy0 _al66 _4jy3 _4jy1 selected _51sy" + "')]")));
	    r.click();	
	    ////*[@id="u_0_j_jL"]
	    
	  //*[@id="u_0_j_OB"]//*[@id="u_0_j_NG"]
	  

	    
	    
	    
	    driver_wait(driver, "//*[@id=\":rs:\"]",10).click();
		textbox_schreiben_xpath(driver, "//*[@id=\":rs:\"]","animeforlive@proton.me");
		
		driver_wait(driver, "//*[@id=\":ru:\"]",10).click();
		textbox_schreiben_xpath(driver, "//*[@id=\":ru:\"]","9BxTJTLF626AETWyUWVe");
		
		
		WebElement w = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@class, '" + "x1n2onr6 x1ja2u2z x78zum5 x2lah0s xl56j7k x6s0dn4 xozqiw3 x1q0g3np xi112ho x17zwfj4 x585lrc x1403ito x972fbf xcfux6l x1qhh985 xm0m39n x9f619 xn6708d x1ye3gou xtvsq51 x1fq8qgq" + "')]")));
	    w.click();
	    
	    Thread.sleep(5000);
	   // driver.quit();	
	}
	
	
	
	private static void button_click_and_write(WebDriver wd, String xpath,String text) {
	WebElement d = driver_wait(wd, xpath,10);
    d.click();
	textbox_schreiben_xpath(wd, xpath,text);
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