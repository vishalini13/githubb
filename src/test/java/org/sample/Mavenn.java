package org.sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mavenn {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("vishal@gmail.com");
		
		WebElement element2 = driver.findElement(By.id("pass"));
		element2.sendKeys("54321");
		
		WebElement element3 = driver.findElement(By.name("login"));
		element3.click();
		
		
		
		 
		
		
		
		
		
	}

}
