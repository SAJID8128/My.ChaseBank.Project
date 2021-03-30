package variables;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import Common.Suite;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Edge extends Suite {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This will execute before the Class.");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("This will execute after the Class.");
	}
	
	@BeforeMethod
	public void beforeMethod() {		
		System.out.println("This will execute before every Method.");
	}
	
	@AfterMethod
	public void afterMethod() {		
		System.out.println("This will execute after every Method.");
	}

	public WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.chase.com/");
	}

	@Test
	public void getTitle() {
		String title = driver.getTitle();
		System.out.println("The Title is: " + title);
	}

	@Test
	public void geturl() {		
		String url = driver.getCurrentUrl();
		System.out.println("The Url is: " + url);
	}

	@AfterTest
	public void tearDown() {		
		driver.quit();
	}

}
