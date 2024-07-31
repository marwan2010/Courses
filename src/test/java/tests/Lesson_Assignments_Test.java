package tests;

import java.io.IOException;

import org.testng.annotations.Test;
import PageOBject.AssignmentsPage;
import PageOBject.ContentPage;
import PageOBject.LessonPage;


public class Lesson_Assignments_Test extends TestBase {

	PageOBject.HomePage homeObj;
	ContentPage ContentObj;

	AssignmentsPage AssignmentObj;
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
		driver.get("https://sang.greenboard.online/courses/coursesActions/1");
		homeObj.Coursetite("Course SF"+"-" +faker.book().title());
		homeObj.Video("https://youtu.be/bDJKs6r___g?si=KcjmuG4R6gVbwm6r");
		
		homeObj.shortDescription("Hello  Test From Short Description ");
		homeObj.longDescription("Hello  Test From long Description... " + faker.lorem().paragraph());
		
		homeObj.courseDays("10");
		homeObj.code("C0de-SF001");
		homeObj.test();
		homeObj.CheckBoxFreeCourse();
		homeObj.topic2(faker.app().name());
		homeObj.SelectOnOrganization();
		homeObj.upload();

		String filepath = "\\upload\\1.png";
		ProcessBuilder pb = new ProcessBuilder(workingDir + "\\upload\\test.exe", workingDir + filepath);
		pb.start();
		Thread.sleep(7000);
		homeObj.ClickOnSave();
		
		Thread.sleep(7000);
	}

	@Test(priority = 2)

	public void AddNewModuleCourse() {

		homeObj.clicksOnMoudlesTAb();
		homeObj.ClickAddMoudle();
		homeObj.code2("C0de-MSF-001");
		homeObj.title("introducation");
		homeObj.topic("test");
		homeObj.desc("Hello Test from Description Moudle ........." + faker.lorem().paragraph());
		homeObj.ClicksaveMoudle();

	}

	@Test(priority = 3)

	public void AddNewLessonCourse() throws InterruptedException, IOException {
		Thread.sleep(7000);
		LessonObj = new LessonPage(driver);

		LessonObj.ClickAddContents();
		LessonObj.lessonname("Level" + "0");
	
		LessonObj.description("Hello  Test from Description Lesson..." + faker.lorem().paragraph());
		LessonObj.ClickOnUploadfiles();
		String filepath = "\\upload\\sample.pdf";
		ProcessBuilder pb = new ProcessBuilder(workingDir + "\\upload\\test.exe", workingDir + filepath);
		pb.start();
		Thread.sleep(7000);
		LessonObj.ClickONsaveLesson();
		Thread.sleep(3000);
		/*
		 * for (int i = 1; i <= 100; i++) { homeObj.ClickAddContents2();
		 * homeObj.lessonname("Level"+" "+i);
		 * homeObj.videourl("https://youtu.be/T7SIxJOoQd8?si=CX8PxNGSuIf7xPcr");
		 * homeObj.ClickONsaveLesson(); }
		 */
	}

	@Test(priority = 4)

	public void AddNewAssignment() throws InterruptedException {
		Thread.sleep(7000);
		AssignmentObj = new AssignmentsPage(driver);
		AssignmentObj.ClickAddAssignment();
		AssignmentObj.AssignmentTitle("HomeWork");
		AssignmentObj.enterDescription("Hello From HomeWork");
		AssignmentObj.PassingScore("50");
		AssignmentObj.Assignmentdegree("100");
		AssignmentObj.ClickOnsaveHomeWork();

	}

}
