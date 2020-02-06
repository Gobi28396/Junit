package org.junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Samplee {
	@Test
	public  void test1() {
		System.setProperty("webdriver.chrome.driver", "D:\\gobi042\\Selenium042\\driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://adactin.com/HotelApp/");
		d.manage().window().maximize();

		WebElement q = d.findElement(By.id("username"));
		q.sendKeys("Gobi28396");
		String t = q.getAttribute("id");
		System.out.println(t);
		
		WebElement q1 = d.findElement(By.id("password"));
		q1.sendKeys("Gobi28396");
		String t1 = q1.getAttribute("name");
System.out.println(t1);
WebElement p = d.findElement(By.xpath("//a[text()='New User Register Here']"));
String text = p.getText();
System.out.println(text);
	}

}
