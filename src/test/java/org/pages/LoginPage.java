package org.pages;

import org.base.BaseClasss;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClasss {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="email")
	private WebElement txtusername;

	@FindBy(id = "pass")
	private WebElement txtpassword;

	@FindBy(name = "login")
	private WebElement btnlogin;
	
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement createbtn;
	
	@FindBy(name="firstname")
	private WebElement fstname;
	
	@FindBy(name="lastname")
	private WebElement lstname;
	
	@FindBy(xpath="//input[@aria-label='Mobile number or email address']")
	private WebElement phnno;
	
	@FindBy(xpath="//input[@data-type='password']")
	private WebElement pswrd;
	
	@FindBy(id="day")
	private WebElement date;
	

	
	public WebElement getDate() {
		return date;
	}

	public void setDate(WebElement date) {
		this.date = date;
	}

	@FindBy(xpath="//label[text()='Female']")
	private WebElement gender;
	
	public WebElement getGender() {
		return gender;
	}

	@FindBy(xpath="//button[text()='Sign Up']")
	private WebElement sign;

	public WebElement getCreatebtn() {
		return createbtn;
	}

	public WebElement getFstname() {
		return fstname;
	}

	public WebElement getLstname() {
		return lstname;
	}

	public WebElement getPhnno() {
		return phnno;
	}

	public WebElement getPswrd() {
		return pswrd;
	}

	public WebElement getSign() {
		return sign;
	}

	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}


	}


