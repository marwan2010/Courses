package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import PageOBject.AssignmentsPage;
import PageOBject.ContentPage;
import PageOBject.LessonPage;
import PageOBject.ModulesPage;
import PageOBject.QuizPage;

public class SelfCourseTest extends TestBase {

	PageOBject.HomePage homeObj;
	ModulesPage ModuleObj;
	ContentPage ContentObj;
	QuizPage QuizObj;
	AssignmentsPage AssignmentObj;
	LessonPage LessonObj;

	@Test(priority = 0)

	public void loginToDasboard() {
	 LoginTest login =new LoginTest(); 
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
	      homeObj.upload();
		
		String filepath="\\upload\\1.png";
	       //autoit exe software for selecting file
		ProcessBuilder pb= new ProcessBuilder(workingDir + "\\upload\\test.exe",workingDir + filepath );
		pb.start();
		homeObj.Video("https://youtu.be/bDJKs6r___g?si=KcjmuG4R6gVbwm6r");
		homeObj.shortDescription("Hello  Test From Short Description ");
		homeObj.longDescription("Hello  Test From long Description... "+faker.lorem().paragraph());
		homeObj.courseDays("10");
		homeObj.code("C0de-ISF01"+faker.book().hashCode());
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
		ModuleObj.code2("CODE-MSF001");
		ModuleObj.title("introducation");
		ModuleObj.topic("test");
		ModuleObj.desc("Hello Test from Description Moudle ........."+faker.lorem().paragraph());
		ModuleObj.ClicksaveMoudle();

	}

	@Test(priority = 3)

	public void AddNewLessonCourse() throws InterruptedException, IOException {
		Thread.sleep(7000);
		LessonObj = new LessonPage(driver);

		LessonObj.ClickAddContents();
		
		
		LessonObj.description("Hello  Test from Description Lesson..."+faker.lorem().paragraph());
		LessonObj.lessonname("Level" + "0");
		LessonObj.ClickOnUploadfiles();
		String filepath="\\upload\\sample.pdf";
	       //autoit exe software for selecting file
		ProcessBuilder pb= new ProcessBuilder(workingDir + "\\upload\\test.exe",workingDir + filepath );
		pb.start();
		
		LessonObj.ClickONsaveLesson();
		Thread.sleep(9000);
		/*
		 * for (int i = 1; i <= 100; i++) { homeObj.ClickAddContents2();
		 * homeObj.lessonname("Level"+" "+i);
		 * homeObj.videourl("https://youtu.be/T7SIxJOoQd8?si=CX8PxNGSuIf7xPcr");
		 * homeObj.ClickONsaveLesson(); }
		 */
	}

	//@Test(priority = 4)

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
	

	//@Test(priority = 4)

	public void AddNewQuiz() throws InterruptedException {
		Thread.sleep(7000);
		QuizObj = new QuizPage(driver);
		QuizObj.ClickAddQuiz();
		QuizObj.enterQuizTitle("Quiz Test"+faker.number().digits(20));
		QuizObj.enterDescription("Hello From New Quez");
		QuizObj.timeLimit("1");
		QuizObj.trialsNumber("1");
		QuizObj.PassingScore2("60");
		QuizObj.clickviewresult();
		//QuizObj.ClickOnNewQuestion();
		//QuizObj.ClickOnSaveQuiz();
		Thread.sleep(7000);
		QuizObj.ClickCheckBox();

	}

	
	@Test(priority = 4)
	public void test3() throws InterruptedException {
		
		for (int i = 1; i <= 20; i++) {
			System.out.println(i);

			
			homeObj.ClickaddMoudle2();
			homeObj.code2("SELF-0"+i);
			homeObj.title("Intro"+" "+i);
			homeObj.topic2("Test");
			//homeObj.desc("Hello Test from Description Moudle ........."+faker.lorem().paragraph());
			homeObj.ClicksaveMoudle();
			Thread.sleep(7000);
		}

	}
}
