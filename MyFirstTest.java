package com.company.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyFirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setHeadless(false);
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Beep Informatica\\eclipse-workspace\\demostracion\\src\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		driver.get("https://github.com/login");
		
		
		//para maximizar

		driver.manage().window().maximize();

		//titulo

		System.out.println("El t�tulo de la p�gina es " + driver.getTitle());
		
		// cerrar
		// driver.close();
		
		//encontrar elementos de la p�gina e interactuar con ellos
	
		//usando id y class
		//driver.get("https://github.com/login");
		
		//driver.findElement(By.id("login_field")).sendKeys("usuario");
		//driver.findElement(By.id("password")).sendKeys("contrase�a");
		
		//driver.findElement(By.className("js-sign-in-button")).click();

		//usando xpath
		
			//tagname[@attribute='value']/abc/xyz
		
		
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("usuario");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("contrase�a");
		driver.findElement(By.xpath("//input[@name='commit']")).click();
		
		//usando CSSSelector 
		
		//driver.findElement(By.cssSelector("input#login_field")).sendKeys("usuario");
		//driver.findElement(By.cssSelector("input#password")).sendKeys("contrase�a");
		//driver.findElement(By.cssSelector("input.js-sign-in-button")).click();
		
	}

}













