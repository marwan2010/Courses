package tests;

import java.io.IOException;

import org.testng.annotations.Test;
import PageOBject.ContentPage;
import PageOBject.LessonPage;
import PageOBject.QuizPage;

public class QuizTest extends TestBase {

	PageOBject.HomePage homeObj;
	ContentPage ContentObj;
	QuizPage QuizObj;

	LessonPage LessonObj;

	@Test(priority = 0)

	public void loginToDasboard() {
		LoginTest login = new LoginTest();
		login.loginToDasboard();

	}

	@Test(priority = 1)

	public void AddNeQuestionMultiplechoice() throws InterruptedException {
		Thread.sleep(7000);
		homeObj = new PageOBject.HomePage(driver);
		driver.get("https://sang.greenboard.online/courses/coursesActions/1/2366bc0a-6095-4f42-a940-f8d92faf5d29");
		homeObj.clicksOnMoudlesTAb();
		QuizObj = new QuizPage(driver);
		QuizObj.ClickAddQuiz();
		QuizObj.enterQuizTitle("Quiz Multiple-choice"+" "+faker.number().digit());
		QuizObj.enterDescription("Hello  Test Dummey Description->> Multiple-choice...."+faker.lorem().paragraph());
		QuizObj.timeLimit("1");
		QuizObj.trialsNumber("1");
		QuizObj.PassingScore2("60");
		QuizObj.select_Show_Result_Dopdown(0);

		QuizObj.ClickOnAddNewQuestionBTn();
		QuizObj.selectQuestionType(0);

		QuizObj.questionText("Hello Test Dummy Question...>> Multiple-choice",0);
		QuizObj.ClickAddAnswer();
		QuizObj.answerText("Dummy Answer");
		QuizObj.CheckBoxAnswer();
		QuizObj.ClickOnSaveQuiz();
		

	}

	@Test(priority = 2)

	public void AddQuestionTrueOrFalse() throws InterruptedException {
		//Thread.sleep(7000);
		
		QuizObj.ClickAddQuiz();
		QuizObj.enterQuizTitle("Quiz TrueOrFalse"+" "+faker.number().digit());
		QuizObj.enterDescription("Hello Dummy Description -->TrueOrFalse ..."+faker.lorem().paragraph());
		QuizObj.timeLimit("1");
		QuizObj.trialsNumber("1");
		QuizObj.PassingScore2("60");
		QuizObj.select_Show_Result_Dopdown(1);

		QuizObj.ClickOnAddNewQuestionBTn();
		QuizObj.selectQuestionType(1);
		QuizObj.questionText("Hello Test Dummy questionText...>>TrueOrFalse " , 0);
		QuizObj.CheckBoxAnswer();
		
	
		QuizObj.ClickOnSaveQuiz();

	}

	@Test(priority = 3)

	public void AddQuestionMatch() throws InterruptedException {
		QuizObj.ClickAddQuiz();
		QuizObj.enterQuizTitle("Quiz Match"+" "+faker.number().digit());
		QuizObj.enterDescription("Hello Dummy Description -->Match ..."+faker.lorem().paragraph());
		QuizObj.timeLimit("1");
		QuizObj.trialsNumber("1");
		QuizObj.PassingScore2("60");
		QuizObj.select_Show_Result_Dopdown(2);
		QuizObj.ClickOnAddNewQuestionBTn();
		QuizObj.selectQuestionType(2);
		QuizObj.Add_NewTXTBox_Fixed_Answer_To_Question();
		
		QuizObj.Answer("lol", 0);
		QuizObj.Answer("lol2", 1);
		QuizObj.ClickOnSaveQuiz();


	}
	
	@Test(priority = 3)

	public void AddQuestionFillBlank() throws InterruptedException {
		QuizObj.ClickAddQuiz();
		QuizObj.enterQuizTitle("Quiz FillBlank"+" "+faker.number().digit());
		QuizObj.enterDescription("Hello Dummy Description -->FillBlank ..."+faker.lorem().paragraph());
		QuizObj.timeLimit("1");
		QuizObj.trialsNumber("1");
		QuizObj.PassingScore2("60");
		QuizObj.select_Show_Result_Dopdown(2);
		QuizObj.ClickOnAddNewQuestionBTn();
		QuizObj.selectQuestionType(3);
		QuizObj.fillBlankQuestion("Question Dummey 0");
		QuizObj.fillBlankAnswer("Answer Dummey 0");
		QuizObj.ClickSaveButton();
		QuizObj.fillBlankQuestion("Question Dummey 1");
		QuizObj.fillBlankAnswer("Answer Dummey 1");
		QuizObj.ClickSaveButton();
		QuizObj.ClickOnSaveQuiz();


	}
	
	
	//@Test(priority = 4)

	public void AddNeQuestionMultiplechoiceImage() throws InterruptedException, IOException {
		Thread.sleep(7000);

		QuizObj.ClickAddQuiz();
		QuizObj.enterQuizTitle("Quiz Multiple-choice Images"+" "+faker.number().digit());
		QuizObj.enterDescription("Hello  Test Dummey Description->> Multiple-choice Images..."+faker.lorem().paragraph());
		QuizObj.timeLimit("1");
		QuizObj.trialsNumber("1");
		QuizObj.PassingScore2("60");
		QuizObj.select_Show_Result_Dopdown(0);

		QuizObj.ClickOnAddNewQuestionBTn();
		QuizObj.selectQuestionType(4);

		QuizObj.questionText("Hello Test Dummy Question...>> Multiple-choice Images",0);
		QuizObj.ClickAddAnswer();
		QuizObj.uploadImage();
		
			String filepath="\\upload\\1.png";
		       //autoit exe software for selecting file
			ProcessBuilder pb= new ProcessBuilder(workingDir + "\\upload\\test.exe",workingDir + filepath );
			pb.start();
		

	}

}
