package PageOBject;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuizPage extends PagesBase {
	public QuizPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@type='text'][@id='AssignmentTitle']")
	WebElement QuestionTitle;
	@FindBy(xpath = "//textarea[@id='description']")
	WebElement description;

	@FindBy(xpath = "//input[@id='PassingScore']")
	WebElement PassingScore;
	@FindBy(xpath = "//input[@id='solution']")
	WebElement PassingScore2;

	@FindBy(xpath = "//*[@id=\"mat-mdc-dialog-3\"]/div/div/app-quiz-module/mat-dialog-content/div[2]/app-english-quiz-template/form/div[2]/div/div[3]/div[4]/div/ng-select/div/div/div[2]/input")
	WebElement list;
	@FindBy(css = "button[class*='btn btn-primary btn-lg px-5']")
	WebElement saveQuiz;

	@FindBy(xpath = "//button[@type='button'][@class='btn btn-white bg-white text-primary shadow-sm px-3 py-2 margin-dir-2']")
	WebElement newquestion;

	
	@FindBy(xpath = "//*[@id=\"mat-mdc-checkbox-76-input\"]")
	WebElement checkbox2;
	@FindBy(xpath = "//*[@id=\"mat-mdc-checkbox-77\"]/div/label")
	WebElement checkbox;

	@FindBy(xpath = "//textarea[@id='Topic']")
	WebElement Topic;

	@FindBy(xpath = "//input[@id='Video']")
	WebElement Video;

	@FindBy(className = "mdc-tab__text-label")
	List<WebElement> testz;

	
	@FindBy(xpath = "//input[@id='title']")
	WebElement title;

	@FindBy(xpath = "//input[@type='text'][@id='quizTitle']")
	WebElement quizTitle;

	@FindBy(xpath = "//input[@formcontrolname='timeLimit']")
	WebElement timeLimit;
	@FindBy(xpath = "//input[@formcontrolname='trialsNumber']")
	WebElement trialsNumber;

	@FindBy(xpath = "//*[@id=\"mat-tab-content-1-0\"]/div/app-courses-info/div/div/div[1]/div[2]/div[4]/app-editor/div/ngx-editor/div/div/p")
	WebElement test2;

	@FindBy(xpath = "//*[@id=\"mat-tab-content-1-1\"]/div/app-courses-modules/div/div[2]/app-courses-modules-content/div/div[2]/div[2]/div/div/button/span")
	WebElement add_content;

	@FindBy(xpath = "//button[@type='button'][@aria-label='Example icon-button with a menu']")
	WebElement add_content2;

	@FindBy(xpath = "//span[@class='mat-mdc-menu-item-text']")
	List<WebElement> Assignment;
	
	@FindBy(xpath = "//div[@role='combobox'][@class='ng-input']")
	WebElement combobox;
	@FindBy(xpath = "//span[@class='ng-option-label ng-star-inserted']")
	List<WebElement> option;

	@FindBy(xpath = "//ng-select[@formcontrolname='type'][@class='ng-select-searchable ng-select-clearable ng-select ng-select-single ng-untouched ng-pristine ng-invalid']")
	WebElement combobox2;
	
	@FindBy(xpath = "//div[@class='ProseMirror NgxEditor__Content']")
	List<WebElement> questionText;
	
	@FindBy(xpath = "//div[@class='mdc-checkbox']")
	List<WebElement> checkboxAnswer;
	
	@FindBy(xpath = "//input[@formcontrolname='fillBlankQuestion']")
	WebElement fillBlankQuestion;	
	
	@FindBy(xpath = "//input[@formcontrolname='fillBlankAnswer']")
	WebElement fillBlankAnswer;	
	
	@FindBy(xpath = "//label[@class='mdc-label']")
	List<WebElement> label;
	@FindBy(xpath = "//button[@type='button'][@class='btn text-primary shadow-sm px-3 py-2 margin-dir-2 mt-2']")
	WebElement save;
	
	@FindBy(xpath = "//button[@type='button'][@class='button button--light-grey button--curved button--icon']")
	WebElement AddAnswer;
	
	@FindBy(xpath = "//input[@formcontrolname='answerText']")
	List<WebElement>  answerText;	
	
	@FindBy(xpath = "//label[@for='mat-mdc-checkbox-78-input'][@class='mdc-label']")
	WebElement checkboxrandom;
	
	@FindBy(css = "button[class*='button-icon button-icon--primary col-md-3']")
	WebElement AddMatch;
	
	@FindBy(xpath = "//input[@type='text'][@formcontrolname='answer']")
	List<WebElement> answer;
	@FindBy(xpath = "//span[@class='input-group-text input-group-text-index']")
	List<WebElement> answer2;
	@FindBy(xpath = "//button[@type='button'][@class='btn btn-white bg-white text-primary shadow-sm px-3 py-2 margin-dir-2 mb-3']")
	WebElement Addquestion;
	
	@FindBy(css = "button[class*='input-group-text input-group-text-index']")
	List<WebElement> answerMatch;
	
	@FindBy(css = ".custom-file mx-3 custom-file-input'")
	WebElement uploadImage;
	
	
	public void uploadImage()

	{
		clickButton(uploadImage);
	

	}
	public void QuestionTitle(String str)

	{

		setTextElementText(QuestionTitle, str);

	}

	public void enterDescription(String str)

	{
		setTextElementText(description, str);
	}

	public void enterQuizTitle(String str)

	{
		setTextElementText(quizTitle, str);
	}

	public void trialsNumber(String str)

	{
		setTextElementText(trialsNumber, str);

	}

	public void timeLimit(String str)

	{
		setTextElementText(timeLimit, str);
	}

	public void clickviewresult()

	{

		clickButton(list);
		action.sendKeys(Keys.DOWN).build().perform();// press down arrow key

		action.sendKeys(Keys.ENTER).build().perform();// press enter

	}
	public void fillBlankQuestion(String str)

	{
		setTextElementText(fillBlankQuestion, str);
	}
	public void fillBlankAnswer(String str)

	{
		setTextElementText(fillBlankAnswer, str);
	}
	
	public void select_Show_Result_Dopdown(int i)

	{

		clickButton(combobox);
		clickButton(option.get(i));

	}
	
	public void selectQuestionType(int i)

	{

		clickButton(combobox2);
		clickButton(option.get(i));
		
	}
	
	public void CheckBoxAnswer()

	{

		
		clickButton(checkboxAnswer.get(0));
		clickButton(checkboxAnswer.get(1));
		clickButton(checkboxAnswer.get(3));
	
		//clickButton(checkboxAnswer.get(5));
		
		
	}
	
	public void label()

	{
      
		
		clickButton(checkboxrandom);
       

		//clickButton(label.get(1));
	//clickButton(label.get(3));
		
		//clickButton(checkboxAnswer.get(5));
		
		
	}
	
	public void Add_NewTXTBox_Fixed_Answer_To_Question()

	{

		clickButton(AddMatch);
		clickButton(AddMatch);

	}
	
	public void ClickSaveButton()

	{

		clickButton(save);

	}
	
	public void ClickAddAnswer()

	{

		clickButton(AddAnswer);
		clickButton(AddAnswer);
		

	}


	
	
	public void CheckBoxAnswer2(int i)

	{

		
		clickButton(checkboxAnswer.get(i));
		clickButton(checkboxAnswer.get(i));
		//clickButton(checkboxAnswer.get(5));
		
		
	}
	
	public void Answer(String str,int i)

	{
		if(answer2.get(i).isDisplayed())
		System.out.println("Hello, World!"+answer.size());
		setTextElementText(answer.get(i), str);
	}



	public void PassingScore(String str)

	{
		setTextElementText(PassingScore, str);
	}

	public void PassingScore2(String str)

	{
		setTextElementText(PassingScore2, str);
	}
	
	public void questionText(String str ,int i)

	{

		setTextElementText(questionText.get(i),str);

	}

	public void title(String x)

	{
		setTextElementText(title, x);
	}

	public void ClickOnSaveQuiz()

	{
		js.executeScript("window.scrollBy(0,550)", "");
		clickButton(saveQuiz);

	}

	public void ClickCheckBox()

	{

		clickButton(checkbox);

	}

	

	public void ClickAddQuiz()

	{

		clickButton(add_content2);
		clickButton(Assignment.get(2));

	}

	public void ClickOnAddNewQuestionBTn()

	{

		clickButton(newquestion);

	}
	
	public void answerText(String str)

	{
		for (int x=0; x<answerText.size(); x++) 

		setTextElementText(answerText.get(x), str+" "+x);
	}
	

}
