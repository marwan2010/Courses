package PageOBject;


import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class ContentPage extends PagesBase {
	public ContentPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	@FindBy(xpath = "//input[@type='text'][@id='AssignmentTitle']")
	WebElement AssignmentTitle;
	@FindBy(xpath = "//textarea[@id='description']")
	WebElement description;
	
	@FindBy(xpath = "//input[@id='PassingScore']")
	WebElement PassingScore;
	@FindBy(xpath = "//input[@id='solution']")
	WebElement PassingScore2	;
	@FindBy(xpath = "//input[@id='Assignmentdegree']")
	WebElement Assignmentdegree;

	@FindBy(xpath = "//button[@type='button'][@class='button button--primary button--curved button--lg ng-star-inserted']")
	WebElement saveHomework;
	

	@FindBy(xpath = "//*[@id=\"mat-mdc-dialog-3\"]/div/div/app-quiz-module/mat-dialog-content/div[2]/app-english-quiz-template/form/div[2]/div/div[3]/div[4]/div/ng-select/div/div/div[2]/input")
	WebElement list;
	@FindBy(css = "button[class*='btn btn-primary btn-lg px-5']")
	WebElement saveQuiz;
	
	@FindBy(xpath = "//button[@type='button'][@class='btn btn-white bg-white text-primary shadow-sm px-3 py-2 margin-dir-2']")
	WebElement newquestion;
	
	@FindBy(xpath = "//button[@type='button'][@class='button button--primary button--curved button--sm']")
	WebElement button;
	@FindBy(xpath = "//*[@id=\"mat-mdc-checkbox-76-input\"]")
	WebElement checkbox2;
	@FindBy(xpath = "//*[@id=\"mat-mdc-checkbox-77\"]/div/label")
	WebElement checkbox;
	
	

	@FindBy(xpath = "//textarea[@id='Topic']")
	WebElement Topic;
	
	@FindBy(xpath = "//input[@id='Video']")
	WebElement Video;
	@FindBy(id = "Ranks")
	WebElement role;
	
	@FindBy(xpath = "//input[@id='courseDays']")
	WebElement courseDays;

	
	
	@FindBy(xpath = "//div[@class='ng-input']")
	List<WebElement>  test;
	
	@FindBy(className = "mdc-tab__text-label")
	List<WebElement>  testz;

	@FindBy(xpath = "//button[@type='button'][@class='button button--primary button--curved px-5 ng-star-inserted']")
	WebElement add_module;

	
	@FindBy(xpath = "//input[@id='title']")
	WebElement title;
	
	@FindBy(xpath = "//input[@type='text'][@id='quizTitle']")
	WebElement quizTitle;
	
	@FindBy(xpath = "//input[@formcontrolname='timeLimit']")
	WebElement timeLimit;
	@FindBy(xpath = "//input[@formcontrolname='trialsNumber']")
	WebElement trialsNumber;
	
	@FindBy(xpath ="//*[@id=\"mat-tab-content-1-0\"]/div/app-courses-info/div/div/div[1]/div[2]/div[4]/app-editor/div/ngx-editor/div/div/p")
	WebElement test2;

	
	@FindBy(css = "button[class*='button button--outline button--light button--curved button--sm text-truncate ng-star-inserted']")
	WebElement add_moudle2;
	
	@FindBy(xpath = "//*[@id=\"mat-tab-content-1-1\"]/div/app-courses-modules/div/div[2]/app-courses-modules-content/div/div[2]/div[2]/div/div/button/span")
	WebElement add_content;
	
	@FindBy(xpath = "//span[@class='mat-mdc-menu-item-text']")
	WebElement add_lesson;
	
	@FindBy(xpath = "//input[@id='lessonname']")
	WebElement lessonname;
	
	
	
	@FindBy(xpath = "//button[@type='button'][@class='button button--primary button--curved button--lg']")
	WebElement savelesson;
	@FindBy(xpath = "//span[@class='mat-mdc-menu-item-text']")
	List<WebElement>  Assignment;
	@FindBy(name = "last-name")
	WebElement last_name;

	

	@FindBy(xpath = "//button[@type='button'][@aria-label='Example icon-button with a menu']")
	WebElement add_content2;
	
	



	




	public void AssignmentTitle(String str)

	{

		setTextElementText(AssignmentTitle, str);

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
		  action.sendKeys(Keys.DOWN).build().perform();//press down arrow key
		    
		    action.sendKeys(Keys.ENTER).build().perform();//press enter

	}
	
	public void courseDays(String str)

	{
		setTextElementText(courseDays, str);
	}
	
	public void Assignmentdegree(String str)

	{
		setTextElementText(Assignmentdegree, str);
	}

	
	public void PassingScore(String str)

	{
		setTextElementText(PassingScore, str);
	}
	public void PassingScore2(String str)

	{
		setTextElementText(PassingScore2, str);
	}
	
	public void title(String x)

	{
		setTextElementText(title, x);
	}


	
	public void role(String str)

	{
		  clickButton(testz.get(1));
		 // action.sendKeys(Keys.DOWN).build().perform();//press down arrow key
		    
		  //  action.sendKeys(Keys.ENTER).build().perform();//press enter

	}

	public void lessonname(String str)

	{
		setTextElementText(lessonname, str);
	}
	


	public void ClickOnsaveHomeWork()

	{

		clickButton(saveHomework);

	}
	
	public void ClickOnSaveQuiz()

	{
		js.executeScript("window.scrollBy(0,550)", "");
		clickButton(saveQuiz);

	}
	public void ClickOnSave()

	{

		clickButton(button);

	}
	public void ClickCheckBox()

	{   

		clickButton(checkbox);
		//clickButton(checkbox2);

	}
	
	
	public void ClickAddMoudle()

	{

		clickButton(add_module);

	}
	
	
	
	public void ClickaddMoudle2()

	{

		clickButton(add_moudle2);

	}
	
	
	public void ClickAddContents()

	{js.executeScript("window.scrollBy(0,550)", "");

		clickButton(add_content);
		clickButton(add_lesson);

	}
	
	public void ClickAddContents2()

	{js.executeScript("window.scrollBy(0,550)", "");

		clickButton(add_content2);
		clickButton(add_lesson);

	}
	
	public void ClickONsaveLesson()

	{

		clickButton(savelesson);

	}
	
	
	public void ClickAddAssignment()

	{

		clickButton(add_content2);
		clickButton(Assignment.get(1));

	}
	
	public void ClickAddQuiz()

	{

		clickButton(add_content2);
		clickButton(Assignment.get(2));

	}
	
	public void ClickOnNewQuestion()

	{

		clickButton(newquestion);

	}
	
	public void test()

	{

		clickButton(test.get(0));
		  action.sendKeys(Keys.DOWN).build().perform();//press down arrow key
		    
		    action.sendKeys(Keys.ENTER).build().perform();//press enter
		    
		    clickButton(test.get(1));
			  action.sendKeys(Keys.DOWN).build().perform();//press down arrow key
			    
			    action.sendKeys(Keys.ENTER).build().perform();//press enter
			    

			    clickButton(test.get(2));
				  action.sendKeys(Keys.DOWN).build().perform();//press down arrow key
				    
				    action.sendKeys(Keys.ENTER).build().perform();//press enter
				    

				    clickButton(test.get(3));
					  action.sendKeys(Keys.DOWN).build().perform();//press down arrow key
					    
					    action.sendKeys(Keys.ENTER).build().perform();//press enter
					    
					  
						    


	}


}
