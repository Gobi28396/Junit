package org.junit;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin {
	static WebDriver d;
	@BeforeClass
	public static void beforeclass() {
		System.setProperty("webdriver.chrome.driver", "D:\\gobi042\\Selenium042\\driver\\chromedriver.exe");
		 d=new ChromeDriver();
		d.get("https://adactin.com/HotelApp/");
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
		String u = d.getCurrentUrl();
		boolean c = u.contains("adactin");
		Assert.assertTrue("check url", c);
		WebElement q = d.findElement(By.id("username"));
		q.sendKeys("Gobi28396");
		String t = q.getAttribute("value");
		Assert.assertEquals("varify username","Gobi28396", t);
		
		WebElement q1 = d.findElement(By.id("password"));
		q1.sendKeys("Gobi28396");
		String t1 = q1.getAttribute("value");
		Assert.assertEquals("verify pass", "Gobi28396", t1);
		WebElement q2 = d.findElement(By.id("login"));
		q2.click();
		String v = d.getCurrentUrl();
		boolean b = v.contains("SearchHotel");
		Assert.assertTrue("check current url", b);

	}
	
	}

	
	
	
	
	
	


