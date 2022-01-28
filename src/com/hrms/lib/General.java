package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class General extends Globle {
	public void openapplication() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Training\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("application open");
	}

	public void login() {
		driver.findElement(By.name(txt_usenm)).sendKeys(un);
		driver.findElement(By.name(txt_pwnm)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("login compleated");
	}

	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("lohout copmleaded");
	}

	public void close() {
		driver.close();

	}
}
