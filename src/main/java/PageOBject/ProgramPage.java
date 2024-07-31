package PageOBject;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProgramPage extends PagesBase {
	public ProgramPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@type='text'][@id='programTitle']")
	WebElement programTitle;
	@FindBy(xpath = "//input[@id='programCode']")
	WebElement programCode;
	@FindBy(xpath = "//input[@id='numberOfAbsence']")
	WebElement numberOfAbsence;

	@FindBy(xpath = "//*[@id=\"courseId\"]")
	WebElement drop;

	@FindBy(css = "div[class*='mat-ripple mat-mdc-option-ripple mat-mdc-focus-indicator']")
	List<WebElement> ss;

	@FindBy(css = ".mdc-list-item__primary-text")
	List<WebElement> text;

	@FindBy(xpath = "//*[@id=\"dayOfWeek\"]")
	WebElement dayOfWeek;
	@FindBy(xpath = "//input[@formcontrolname='startDate'][@id='startDate']")
	WebElement startDate;

	@FindBy(xpath = "//input[@formcontrolname='endDate'][@id='endDate']")
	WebElement endDate;

	@FindBy(xpath = "//input[@formcontrolname='startTime'][@id='startTime']")
	WebElement startTime;

	@FindBy(xpath = "//input[@formcontrolname='endTime'][@id='endTime']")
	WebElement endTime;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit;

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
	List<WebElement> test;

	@FindBy(className = "mdc-tab__text-label")
	List<WebElement> testz;

	@FindBy(xpath = "//button[@type='button'][@class='button button--primary button--curved px-5 ng-star-inserted']")
	WebElement add_module;

	@FindBy(xpath = "//input[@type='text'][@id='quizTitle']")
	WebElement quizTitle;

	@FindBy(xpath = "//input[@formcontrolname='timeLimit']")
	WebElement timeLimit;

	@FindBy(xpath = "//*[@id=\"mat-tab-content-1-0\"]/div/app-courses-info/div/div/div[1]/div[2]/div[4]/app-editor/div/ngx-editor/div/div/p")
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
	List<WebElement> Assignment;
	@FindBy(name = "last-name")
	WebElement last_name;

	@FindBy(xpath = "//button[@type='button'][@aria-label='Example icon-button with a menu']")
	WebElement add_content2;

	public void programTitle(String str)

	{

		setTextElementText(programTitle, str);

	}

	public void startDate(String str)

	{
		setTextElementText(startDate, str);
	}

	public void endDate(String str)

	{
		setTextElementText(endDate, str);
	}

	public void numberOfAbsence(String str)

	{
		setTextElementText(numberOfAbsence, str);
	}

	public void startTime(String str)

	{
		setTextElementText(startTime, str);

	}

	public void endTime(String str)

	{
		setTextElementText(endTime, str);
	}

	public void clickviewresult()

	{

		clickButton(list);
		action.sendKeys(Keys.DOWN).build().perform();// press down arrow key

		action.sendKeys(Keys.ENTER).build().perform();// press enter

	}

	public void courseDays(String str)

	{
		setTextElementText(courseDays, str);
	}

	public void ss()

	{
		// System.out.println("Number of itemsy: " + ss.size());
		int itemSize = text.size();
		for (int i = 0; i < itemSize; i++) {
			String optionsValue = text.get(i).getText();
			System.out.println(optionsValue);

		}

		clickButton(text.get(3));

	}

	public void programCode(String str)

	{
		setTextElementText(programCode, str);
	}

	public void clickondrop()

	{

		clickButton(drop);

	}

	public void SelectOndayOfWeek()

	{
		clickButton(dayOfWeek);

		int itemSize = text.size();
		for (int i = 0; i < itemSize; i++) {
			String optionsValue = text.get(i).getText();
			System.out.println(optionsValue);

		}

		clickButton(text.get(3));

	}

	public void ClickOnSaveProgramCourse()

	{

		clickButton(submit);

	}

	public void ClickOnSave()

	{

		clickButton(button);

	}

	public void ClickCheckBox()

	{

		clickButton(checkbox);
		// clickButton(checkbox2);

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

	{
		js.executeScript("window.scrollBy(0,550)", "");

		clickButton(add_content);
		clickButton(add_lesson);

	}

	public void ClickAddContents2()

	{
		js.executeScript("window.scrollBy(0,550)", "");

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
		action.sendKeys(Keys.DOWN).build().perform();// press down arrow key

		action.sendKeys(Keys.ENTER).build().perform();// press enter

		clickButton(test.get(1));
		action.sendKeys(Keys.DOWN).build().perform();// press down arrow key

		action.sendKeys(Keys.ENTER).build().perform();// press enter

		clickButton(test.get(2));
		action.sendKeys(Keys.DOWN).build().perform();// press down arrow key

		action.sendKeys(Keys.ENTER).build().perform();// press enter

		clickButton(test.get(3));
		action.sendKeys(Keys.DOWN).build().perform();// press down arrow key

		action.sendKeys(Keys.ENTER).build().perform();// press enter

	}

}
