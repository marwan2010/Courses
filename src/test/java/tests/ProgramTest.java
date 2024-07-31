package tests;

import org.testng.annotations.Test;
import PageOBject.ProgramPage;

public class ProgramTest extends TestBase {

	ProgramPage ProgObj;

	@Test(priority = 0)

	public void loginToDasboard() {
		LoginTest login = new LoginTest();
		login.loginToDasboard();

	}

	@Test(priority = 1)

	public void RedirectToPrograms() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get("https://sang.greenboard.online/program-tech/program-action/2");
		ProgObj = new ProgramPage(driver);
		ProgObj.programTitle("New Program");
		ProgObj.programCode("010");
		ProgObj.clickondrop();
		ProgObj.numberOfAbsence("1");
		ProgObj.ss();
	
		ProgObj.startDate("17/07/2024");
		ProgObj.endDate("18/07/2024");
		ProgObj.startTime("2:00PM");
		ProgObj.endTime("6:00PM");
		ProgObj.SelectOndayOfWeek();
		ProgObj.ClickOnSaveProgramCourse();


	}
}
