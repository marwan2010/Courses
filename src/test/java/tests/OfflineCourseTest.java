package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import PageOBject.ContentPage;
import PageOBject.LessonPage;
import PageOBject.ModulesPage;

public class OfflineCourseTest extends TestBase {

	PageOBject.HomePage homeObj;
	ContentPage ContentObj;
	LessonPage LessonObj;
	ModulesPage ModuleObj;

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
		driver.get("https://sang.greenboard.online/courses/coursesActions/3");
		homeObj.Coursetite("Course Off"+"-" +faker.book().title());
		homeObj.Video("https://youtu.be/bDJKs6r___g?si=KcjmuG4R6gVbwm6r");
		homeObj.upload();
		String filepath = "\\upload\\1.png";
		ProcessBuilder pb = new ProcessBuilder(workingDir + "\\upload\\test.exe", workingDir + filepath);
		pb.start();
		Thread.sleep(2000);
		homeObj.shortDescription("Hello  Test From Short Description ");
		homeObj.longDescription("Hello  Test From long Description ");
		homeObj.code("C0de-Off-0002"+faker.book().hashCode());
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
		ModuleObj.code2("C0de-MOff-002");
		ModuleObj.title("Introducation");
		ModuleObj.topic("test");
		ModuleObj.ClicksaveMoudle();

	}

	@Test(priority = 3)

	public void AddNewLessonCourse() throws InterruptedException, IOException {
		Thread.sleep(7000);
		

		ModuleObj.ClickAddContents();
		LessonObj = new LessonPage(driver);
		LessonObj.lessonname("Level" + "0");

		LessonObj.description("Hello  Test from Description Lesson..." + faker.lorem().paragraph());
		LessonObj.ClickOnUploadfiles();
		String filepath = "\\upload\\sample.pdf";
		ProcessBuilder pb = new ProcessBuilder(workingDir + "\\upload\\test.exe", workingDir + filepath);
		pb.start();
		Thread.sleep(5000);
		LessonObj.ClickONsaveLesson();

	}

}
