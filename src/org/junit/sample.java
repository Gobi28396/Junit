package org.junit;


import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {
static WebDriver d;
	@BeforeClass
	public static void beforeclass() {
		System.setProperty("webdriver.chrome.driver", "D:\\gobi042\\Selenium042\\driver\\chromedriver.exe");
		 d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();

	}
	@AfterClass
	public static void afterclass() {
	d.quit();	
	}
	@After
	public  void after() {
	Date d=new Date();
	System.out.println("end time "+d);

	}
	@Before
	public  void befor() {
		Date d=new Date();
		System.out.println("start time "+d);

	}
	@Test
	public  void test1() {
		WebElement q = d.findElement(By.id("email"));
		q.sendKeys("gobi@gmail.com");
		WebElement q1 = d.findElement(By.id("pass"));
		q1.sendKeys("987654321");
		WebElement q2 = d.findElement(By.id("loginbutton"));
		q2.click();
		

	}
	
	}
