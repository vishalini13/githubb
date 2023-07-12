package org.proj;

import java.time.Duration;
import java.util.Date;

import org.base.BaseClasss;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjecttClasss extends BaseClasss {
	@BeforeClass
	public static void beforeclass() {
		browserLaunch("chrome");
		urlLaunch("https://www.facebook.com/");
		maximize();
		implicitlyWait(10);
		System.out.println("before class");
		
	}
	@AfterClass
	public static void afterr() {
		quit();
		System.out.println("after class");
	}
	@Before
	public void before() {
		Date d=new Date();
		System.out.println("start time"+d);
	}
	@After
	public void after() {
		Date d=new Date();
		System.out.println("end time"+d);
	}
	@Test
	public void test1() {
		LoginPage l=new LoginPage();
		sendkeys(l.getTxtusername(),"vishal@gmail.com");
		sendkeys(l.getTxtpassword(),"987654");
		click(l.getBtnlogin());
	}
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

		


		
	}


