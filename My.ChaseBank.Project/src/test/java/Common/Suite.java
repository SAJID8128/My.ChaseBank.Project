package Common;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Suite {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This will execute before the Suite.");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("This will execute after the Suite.");
	}

}
