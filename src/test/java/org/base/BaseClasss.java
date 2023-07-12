package org.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClasss {
	public static WebDriver driver;

	public static WebDriver browserLaunch(String browsername) {
		switch (browsername) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		}
		return driver;

	}
	// geturl

	public static void urlLaunch(String url) {
		driver.get(url);

	}
	// maximize

	public static void maximize() {
		driver.manage().window().maximize();
	}
//	implicitlywait

	public static void implicitlyWait(long sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);

	}
	
//	currenturl
	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
		
	}
//	gettile
	
	public static String  getTitle() {
		String title = driver.getTitle();
		return title;
	}
//	quit
	public static void quit() {
		driver.quit();
	}
//	close
	public static void close() {
		driver.close();
	}
//	sendkeys
	public static void sendkeys(WebElement e,String data) {
		e.sendKeys(data);	
	}
//	click
	public static void click(WebElement e) {
		e.click();
	}
//	gettext
	public static String getText(WebElement e) {
		String text = e.getText();
		return text;
	}
//	getattributevalue
	public static String getAttribute(WebElement e) {
		String attribute = e.getAttribute("value");
		return attribute;
	}
//	innertext
	public static String InnerText(WebElement e) {
		String attribute = e.getAttribute("innerText");
		return attribute;
	}

//	movetoelement
	public static void moveToElement(WebElement target) {
		Actions a=new Actions(driver);
		a.moveToElement(target).perform();
	}
//	draganddrop
	public static void dragAndDrop(WebElement src, WebElement des) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src,des).perform();
		
	}
//	selectbyindex
	public static void selectByIndex(WebElement drpdown, int i) {
		Select s=new Select(drpdown);
		s.selectByIndex(i);
	}
//staticwait
	public static void thread(long sec) throws InterruptedException {
		Thread.sleep(sec);
	}
//	doubleclick
	public static void doubleClick(WebElement e) {
		Actions a=new Actions(driver);
		a.doubleClick(e).perform();
	}
//	contextclick
	public static void contextClick(WebElement e) {
		Actions a=new Actions(driver);
		a.contextClick(e).perform();
	}
//	switchtoalert
	public static void switchToAlert() {
	Alert al=driver.switchTo().alert();
	}
//	accept
	public static void accept() {
	Alert al=driver.switchTo().alert();
	al.accept();
	}
//	dismiss
	public static void dismiss() {
		Alert al=driver.switchTo().alert();
		al.dismiss();
	}
//	selectbyvalue
	public static void selectByValue(WebElement drpdown,String value) {
		Select s=new Select(drpdown);
		s.selectByValue(value);
	}
//	selectbyvisibletext
	public static void selectByVisibleText(WebElement drpdown, String text) {
		Select s=new Select(drpdown);
		s.selectByVisibleText(text);
	}
//	firstselectedoptions
	public static String firstSelectedOptions(WebElement drpdown, String option ) {
	Select s=new Select(drpdown);
	s.getFirstSelectedOption();
	return option;
	}
//	allselectedoptions
	public static String allSelectedOptions(WebElement drpdown, String select) {
		Select s=new Select(drpdown);
		s.getAllSelectedOptions();
		return select;
	}
//	deselectbyvalue
	public static String deSelectByValue(WebElement drpdown, String deselect) {
		Select s=new Select(drpdown);
		s.deselectByValue(deselect);
		return deselect;
	}
//	javascript
//	public static void javaScript(String data,int i) {
//	JavascriptExecutor js=(JavascriptExecutor)driver;
//	js.executeScript("arguments[i].setAttribute('data'")
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
