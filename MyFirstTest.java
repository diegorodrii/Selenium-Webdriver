package com.company.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Beep Informatica\\eclipse-workspace\\demostracion\\src\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mayoral.com");
		
		//para maximizar
		
		driver.manage().window().maximize();
		
		//title
		
		System.out.println("The title of the page is " + driver.getTitle());
		
	}

}
