package PageOBject;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class LessonPage extends PagesBase {
	public LessonPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//button[@type='button'][@class='button button--primary button--curved button--sm']")
	WebElement button;

	@FindBy(xpath = "//textarea[@id='Topic']")
	WebElement Topic;

	@FindBy(xpath = "//input[@id='Video']")
	WebElement Video;
	@FindBy(id = "Ranks")
	WebElement role;
	

	@FindBy(css = ".file-upload")
	WebElement files;

	

	@FindBy(xpath = "//div[@class='ng-input']")
	List<WebElement> test;

	@FindBy(className = "mdc-tab__text-label")
	List<WebElement> testz;

	@FindBy(xpath = "//button[@type='button'][@class='button button--primary button--curved px-5 ng-star-inserted']")
	WebElement add_module;

	@FindBy(xpath = "//input[@id='title']")
	WebElement title;


	@FindBy(xpath = "//*[@id=\"mat-tab-content-1-0\"]/div/app-courses-info/div/div/div[1]/div[2]/div[4]/app-editor/div/ngx-editor/div/div/p")
	WebElement test2;

	@FindBy(css = "button[class*='button button--outline button--light button--curved button--sm text-truncate ng-star-inserted']")
	WebElement add_moudle2;

	@FindBy(xpath = "//*[@id=\"mat-tab-content-1-1\"]/div/app-courses-modules/div/div[2]/app-courses-modules-content/div/div[2]/div[2]/div/div/button/span")
	WebElement add_content;

	@FindBy(xpath = "//span[@class='mat-mdc-menu-item-text']")
	WebElement add_lesson;

	@FindBy(id = "lessonname")
	WebElement lessonname;
	@FindBy(xpath = "//*[@id=\"mat-mdc-dialog-1\"]/div/div/app-lesson-actions/mat-dialog-content/div[2]/form/div/div[2]/div[2]/app-editor/div/ngx-editor/div/div")
	WebElement description;

	@FindBy(xpath = "//button[@type='button'][@class='button button--primary button--curved button--lg']")
	WebElement savelesson;
	@FindBy(xpath = "//span[@class='mat-mdc-menu-item-text']")
	List<WebElement> Assignment;
	@FindBy(xpath = "//span[@class='mat-icon notranslate material-icons mat-ligature-font mat-icon-no-color']")
	WebElement content;

	@FindBy(xpath = "//button[@type='button'][@aria-label='Example icon-button with a menu']")
	WebElement add_content2;

	public void enterLessonTitle(String x)

	{
		setTextElementText(title, x);
	}

	public void role(String str)

	{
		clickButton(testz.get(1));
		// action.sendKeys(Keys.DOWN).build().perform();//press down arrow key

		// action.sendKeys(Keys.ENTER).build().perform();//press enter

	}

	public void lessonname(String str)

	{
		setTextElementText(lessonname, str);
	}

	
	public void description(String str)

	{
		setTextElementText(description, str);
	}
	
	public void ClickOnSave()

	{

		clickButton(button);

	}
	
	public void ClickOnUploadfiles()

	{

		clickButton(files);
		

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

}
