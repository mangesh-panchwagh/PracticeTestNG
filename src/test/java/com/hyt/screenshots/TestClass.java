package com.hyt.screenshots;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestClass extends BaseTest {

	@Test(testName="TestGoogle")
	public void TestGoogle() throws Exception {

		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		assertEquals(actualTitle, expectedTitle,"Title Mismatch");
		
	}

	@Test(testName="TestNoteAffect")
	public void TestNoteAffect() throws Exception {
		driver.get("https://eventtest.noteaffect.com/");
		driver.findElement(By.name("Email")).sendKeys("mangesh013@gmail.com", Keys.ENTER);
		driver.findElement(By.name("Password")).sendKeys("Pass123!");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		// Title Assertion
		/*
		String expectedTitle = "NoteAffect";
		String actualTitle = driver.getTitle();
		assertEquals(actualTitle, expectedTitle,"Title Mismatch");
		*/
		
		// URL Assertion
		String expectedURL = "https://eventtest.noteaffect.com/ap";
		String actualURL = driver.getCurrentUrl();
		assertEquals(actualURL, expectedURL,"URL Mismatch");
		Thread.sleep(2000);
		
		// Text Assertion
		String expectedText = "https://eventtest.noteaffect.com/app/instructor/courses";
		Thread.sleep(2000);
		String actualText = driver.findElement(By.xpath("//h1[contains(text(),'Event Management')]")).getText();
		assertEquals(actualURL, expectedURL,"Heading Mismatch");
		Thread.sleep(2000);
		
		System.out.println("Title : " + driver.getTitle());
		System.out.println("URL : " + driver.getCurrentUrl());
		System.out.println("Heading : " + actualText);
	}
	
	@Test(testName="TestOrangeHRM")
	public void TestOrangeHRM() throws Exception {

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(10000);
		Assert.assertTrue(driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed());
		
	}
}
