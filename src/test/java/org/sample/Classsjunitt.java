package org.sample;

import org.base.BaseClasss;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Classsjunitt extends BaseClasss {
	@BeforeClass
	public static void beforeClass() {
		browserLaunch("chrome");
		urlLaunch("https://adactinhotelapp.com/index.php");
		maximize();
		implicitlyWait(10);
		
	}
//    @AfterClass
//    public static void after() {
//    	quit();
//	
//}
    @Test
    public void test1() throws InterruptedException {
    	WebElement element = driver.findElement(By.xpath("//a[text()='New User Register Here']"));
    	element.click();
    	
    	WebElement element2 = driver.findElement(By.name("username"));
    	element2.sendKeys("vishalii");
    	
    	WebElement element3 = driver.findElement(By.name("password"));
    	element3.sendKeys("654321");
    	
    	WebElement element4 = driver.findElement(By.xpath("//input[@id='re_password']"));
    	element4.sendKeys("654321");
    	
    	WebElement element5 = driver.findElement(By.xpath("//input[@name='full_name']"));
    	element5.sendKeys("vishalselvam");
    	
    	WebElement element6 = driver.findElement(By.xpath("//input[@name='email_add']"));
    	element6.sendKeys("vishalinitamilselvam2001@gmail.com");
    	
    	Thread.sleep(10000);
    	
    	WebElement element7 = driver.findElement(By.xpath("//input[@type='checkbox']"));
    	element7.click();
    	
    	WebElement element8 = driver.findElement(By.id("Submit"));
    	element8.click();
    	
    	WebElement element9 = driver.findElement(By.xpath("//a[text()='Go back to Login page']"));
    	element9.click();
    	
    	WebElement element10 = driver.findElement(By.id("username"));
    	element10.sendKeys("vishalii");
    	
    	WebElement element11 = driver.findElement(By.id("password"));
    	element11.sendKeys("654321");
    	
    	WebElement element12 = driver.findElement(By.id("login"));
    	element12.click();
    	

    	WebElement drpdwn = driver.findElement(By.id("location"));
    	drpdwn.click();
    	
    	Select s=new Select(drpdwn);
    	s.selectByValue("Paris");
    	
    	WebElement element24 = driver.findElement(By.xpath("//select[@id='room_nos']"));
    	element24.click();
    	Select t=new Select(element24);
    	t.selectByValue("1");
    	
    	WebElement element25 = driver.findElement(By.xpath("//input[@id='datepick_in']"));
    	element25.sendKeys("14/07/2023");
    	
    	WebElement element26 = driver.findElement(By.xpath("//input[@name='datepick_out']"));
    	element26.sendKeys("18/07/2023");
    	
    	WebElement element27 = driver.findElement(By.xpath("//select[@name='adult_room']"));
    	element27.click();
    	Select o=new Select(element27);
    	o.selectByVisibleText("1 - One");
    	
    	WebElement click = driver.findElement(By.id("Submit"));
    	click.click();
    	
    	WebElement element13 = driver.findElement(By.xpath("//input[@name='radiobutton_2']"));
    	element13.click();
    	
    	WebElement element14 = driver.findElement(By.id("continue"));
    	element14.click();
    	
    	WebElement element15 = driver.findElement(By.xpath("//input[@name='first_name']"));
    	element15.sendKeys("deva");
    	
    	WebElement element16 = driver.findElement(By.xpath("//input[@name='last_name']"));
    	element16.sendKeys("dharshini");
    	
    	WebElement element17 = driver.findElement(By.name("address"));
    	element17.sendKeys("14, navalur, chennai.");
    	
    	WebElement element18 = driver.findElement(By.xpath("//input[@id='cc_num']"));
    	element18.sendKeys("9876543211234567");
    	
    	WebElement element19 = driver.findElement(By.xpath("//select[@id='cc_type']"));
    	element19.click();
    	Select e=new Select(element19);
    	e.selectByVisibleText("VISA");
    	
    	WebElement element20 = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
    	element20.click();
    	Select l=new Select(element20);
    	l.selectByVisibleText("September");
    	
    	WebElement element21 = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
    	element21.click();
    	Select c=new Select(element21);
    	c.selectByValue("2023");
    	
    	WebElement element22 = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
    	element22.sendKeys("1234");
    	
    	WebElement element23 = driver.findElement(By.xpath("//input[@name='book_now']"));
    	element23.click();
    	
    	WebElement element28 = driver.findElement(By.xpath("//input[@name='order_no']"));
        String attribute = element28.getAttribute("value");
    	System.out.println("Room order no: "+attribute);
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    
    	
 
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
    
    
}
