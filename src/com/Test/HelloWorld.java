package com.Test;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Sleeper;

import com.gargoylesoftware.htmlunit.javascript.host.Window;

public class HelloWorld {
	
	public static void main(String[] args)  {
		System.out.println("Helloworld");
		
		System.setProperty("webdriver.chrome.driver","D:\\Amit_Java\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//----------------------------------------Google Page Code-----------------------------------//
		String baseurl="https://www.google.co.in";
		String expectedtitle="Google";
		String actualtitle="";
		driver.get(baseurl);
		actualtitle=driver.getTitle();
		WebElement element;
		element=driver.findElement(By.id("lst-ib"));         						//finding the search textbox in google page
		element.sendKeys("ToolsQA");                         						//Enter the string "ToolsQA" in search box  
		element=driver.findElement(By.xpath("//*[@class='sbico _wtf _Qtf']"));		//Click on search button after passing the string
		element.click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//driver.findElement(By.xpath("//div[@id='ires']//div//div[1]//div[1]//div[1]//div//div//h3//a")).click();//Generalize query to select first link on a web page
																		//or
		//element=driver.findElement(By.xpath("//a[contains(text(),'Free Selenium Tutorials - Guru99')]"));
		
		element=driver.findElement(By.xpath("//a[contains(text(),'ToolsQA')]"));     //Click on link having text "ToolsQA"
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		element.click();
		
		/*element=driver.findElement(By.xpath("//a[@href='/introduction-to-selenium.html']"));      //Select first link on a web page 
		element.click();*/
		
		
		Actions action=new Actions(driver); 										//Create object of Actions class to handle the mouse hover function
		
		element=driver.findElement(By.xpath("//ul[@id='primary-menu']//span[text()='Tutorial']"));    
		action.moveToElement(element).build().perform();   							//Hover the mouse on "Tutorial"
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		element=driver.findElement(By.xpath("//ul[@id='primary-menu']//span[text()='Web Automation Tools']")); //select element on which you want to hover the mouse
		action.moveToElement(element).build().perform();								//Hover the mouse on "Web Automation Tools" 
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		driver.findElement(By.xpath("//ul[@id='primary-menu']//span[text()='TestNG']")).click();   //After mouse hover,click on particular element
		//driver.findElement(By.xpath("//ul[@id='primary-menu']//span[text()='Java']")).click();             //After mouse hover,click on particular element
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
/*List<WebElement> a= driver.findElements(By.xpath("//input[1][@name='s']//following-sibling::a[@href='#go']"));  
   
		a.get(0).click();  //get first element from list
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@class='field searchform-s']")).sendKeys("TestNG");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;            //Scroll-down functionality
		jse.executeScript("window.scrollBy(0,700)", "");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	     driver.findElement(By.xpath("//a[@href='http://toolsqa.wpengine.com/selenium-webdriver/testng-introduction/']")).click();
	
	     driver.findElement(By.xpath("//span[text()='Java Basics']")).click();
	     try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	     driver.findElement(By.xpath("//span[text()='Classes and Objects']")).click();
	   
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//------------------------------------------------------X--------------------------------------//
		  
		  
		//String baseurl="https://www.toolsqa.com/";
		//String expectedtitle="TOOLSQA";
		//String actualtitle="";
		//driver.get(baseurl);
		
		
		//actualtitle=driver.getTitle();
		//WebElement element;
		//element=driver.findElement(By.className("menu-text"));
		//element.click();
		
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 
		/*if(actualtitle.contentEquals(expectedtitle))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}*/

		driver.close();
		System.exit(0);
		
	}

}
