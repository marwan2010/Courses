package tests;

public class LoginTest extends TestBase {

	PageOBject.HomePage homeObj;

	public void loginToDasboard() {
		// Open Site in new chrome window
		driver.get(baseUrl);
		// Creating object of home page
		homeObj = new PageOBject.HomePage(driver);
		homeObj.businessEmail("admin@greenboard.com");
		homeObj.enterPassword("string");
		homeObj.ClickOnSubmit();

	}

}
