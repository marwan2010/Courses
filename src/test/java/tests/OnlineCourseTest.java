package tests;

import java.io.IOException;
import org.testng.annotations.Test;
import PageOBject.ContentPage;
import PageOBject.LessonPage;
import PageOBject.ModulesPage;

public class OnlineCourseTest extends TestBase {

	PageOBject.HomePage homeObj;
	ContentPage ContentObj;
	ModulesPage ModuleObj;
	LessonPage LessonObj;

	@Test(priority = 0)

	public void loginToDasboard() {
		LoginTest login = new LoginTest();
		login.loginToDasboard();

	}

	@Test(priority = 1)

	public void CourseInformantion() throws InterruptedException, IOException {
		homeObj = new PageOBject.HomePage(driver);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get("https://sang.greenboard.online/courses/coursesActions/2");
		homeObj.Coursetite("Course On"+"-" +faker.book().title());
		homeObj.Video("https://youtu.be/bDJKs6r___g?si=KcjmuG4R6gVbwm6r");
		homeObj.upload();
		String filepath = "\\upload\\1.png";
		// autoit exe software for selecting file
		ProcessBuilder pb = new ProcessBuilder(workingDir + "\\upload\\test.exe", workingDir + filepath);
		pb.start();
		homeObj.shortDescription("Hello  Test From Short Description ");
		homeObj.longDescription("Hello  Test From long Description... " + faker.lorem().paragraph());
		homeObj.subCategory();

		homeObj.code("C0de-IOn-0003"+faker.book().hashCode());

		homeObj.test();
		homeObj.CheckBoxFreeCourse();
		homeObj.topic2(faker.app().name());
		homeObj.SelectOnOrganization();

		homeObj.ClickOnSave();
		Thread.sleep(7000);

	}

	@Test(priority = 2)

	public void AddNewModuleCourse() {
		ModuleObj = new ModulesPage(driver);
		ModuleObj.clicksOnMoudlesTAb();
		ModuleObj.ClickAddMoudle();
		ModuleObj.code2("C0de-MOn-003");
		ModuleObj.title("introducation");
		ModuleObj.topic("test");
		ModuleObj.desc("Hello Test from Description Moudle ........." + faker.lorem().paragraph());
		ModuleObj.ClicksaveMoudle();

	}

	@Test(priority = 3)

	public void AddNewLessonCourse() throws InterruptedException, IOException {
		Thread.sleep(7000);
		LessonObj = new LessonPage(driver);

		LessonObj.ClickAddContents();

		LessonObj.description("Hello  Test from Description Lesson..." + faker.lorem().paragraph());
		LessonObj.lessonname("Level" + "0");
		LessonObj.ClickOnUploadfiles();
		String filepath = "\\upload\\sample.pdf";
		// autoit exe software for selecting file
		ProcessBuilder pb = new ProcessBuilder(workingDir + "\\upload\\test.exe", workingDir + filepath);
		pb.start();
		Thread.sleep(7000);
		LessonObj.ClickONsaveLesson();
		Thread.sleep(7000);
	
	}

	public void test3() throws InterruptedException {
		Thread.sleep(7000);
		for (int i = 1; i <= 3; i++) {
			System.out.println(i);

			homeObj.ClickaddMoudle2();
			homeObj.code2("20");
			homeObj.title("Module" + " " + i);
			homeObj.topic("test");
			homeObj.ClicksaveMoudle();

		}

	}
}
