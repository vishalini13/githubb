package org.sample;

import org.base.BaseClasss;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.pages.LoginPage;

public class SampleeClass extends BaseClasss {


	

	public static void main(String[] args) {
		browserLaunch("chrome");
		urlLaunch("https://www.facebook.com/");
		maximize();
		implicitlyWait(10);
		LoginPage l=new LoginPage();
//		sendkeys(l.getTxtusername(),"vishal");
//		sendkeys(l.getTxtpassword(),"98765");
//		driver.navigate().refresh();
//		sendkeys(l.getTxtusername(),"deva");
//		sendkeys(l.getTxtpassword(),"8765");
		
		click(l.getCreatebtn());
		sendkeys(l.getFstname(),"vishal");
		sendkeys(l.getLstname(),"vivek");
		sendkeys(l.getPhnno(),"9876543210"); 
		sendkeys(l.getPswrd(),"87654");
		click(l.getDate());
		
	
		Select s=new Select(date);
		s.selectByValue("19");
		click(l.getGender());
		click(l.getSign()); 
		
		

	}

}
