package PageOBject;

import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends PagesBase {
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "email")
	WebElement email;

	@FindBy(xpath = "//input[@type='password']")
	WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit;

	@FindBy(xpath = "//button[@type='button'][@class='button button--primary button--curved button--sm']")
	WebElement button;
	@FindBy(xpath = "//input[@type='checkbox'][@id='exampleCheck1']")
	WebElement checkbox;
	@FindBy(xpath = "//input[@id='courseTitle']")
	WebElement courseTitle;

	@FindBy(xpath = "//textarea[@id='Topic']")
	WebElement Topic;

	@FindBy(xpath = "//*[@id=\"mat-tab-content-0-0\"]/div/app-courses-info/div/div/div[1]/div[2]/div[6]/div")
	WebElement Organization;

	@FindBy(xpath = "//input[@id='Video']")
	WebElement Video;
	@FindBy(id = "Ranks")
	WebElement role;

	@FindBy(xpath = "//input[@id='courseDays']")
	WebElement courseDays;

	@FindBy(xpath = "//input[@id='code']")
	WebElement code;
	@FindBy(id = "subCategory")
	WebElement subCategory;

	@FindBy(xpath = "//div[@class='ng-input']")
	List<WebElement> test;

	@FindBy(className = "mdc-tab__text-label")
	List<WebElement> testz;
	@FindBy(xpath = "//span[@class='ng-option-label ng-star-inserted']")
	List<WebElement> dropdown;
	@FindBy(xpath = "//button[@type='button'][@class='button button--primary button--curved px-5 ng-star-inserted']")
	WebElement add_module;

	@FindBy(xpath = "//input[@id='code']")
	WebElement code2;
	@FindBy(xpath = "//input[@id='title']")
	WebElement title;

	@FindBy(xpath = "//input[@type='text'][@class='ng2-tag-input__text-input ng-untouched ng-pristine ng-valid']")
	WebElement topic;

	@FindBy(xpath = "//input[@type='text'][@formcontrolname='item']")
	WebElement topic2;
	@FindBy(xpath = "//*[@id=\"mat-tab-content-0-0\"]/div/app-courses-info/div/div/div[2]/label")
	WebElement upload;

	@FindBy(xpath = "//input[@type='file']")
	WebElement upload2;

	@FindBy(xpath = "//div[@class='ProseMirror NgxEditor__Content']")
	WebElement longdesc;
	@FindBy(xpath = "//*[@id=\"mat-tab-content-1-0\"]/div/app-courses-info/div/div/div[1]/div[2]/div[4]/app-editor/div/ngx-editor/div/div/p")
	WebElement test2;

	@FindBy(xpath = "//button[@type='button'][@class='button button--primary button--curved']")
	WebElement add_moudle;

	@FindBy(css = "button[class*='button button--outline button--light button--curved button--sm text-truncate ng-star-inserted']")
	WebElement add_moudle2;

	@FindBy(xpath = "//*[@id=\"mat-tab-content-1-1\"]/div/app-courses-modules/div/div[2]/app-courses-modules-content/div/div[2]/div[2]/div/div/button/span")
	WebElement add_content;

	@FindBy(xpath = "//span[@class='mat-mdc-menu-item-text']")
	WebElement add_lesson;

	@FindBy(xpath = "//input[@id='lessonname']")
	WebElement lessonname;

	@FindBy(xpath = "//input[@formcontrolname='videoURL']")
	WebElement videoURL;

	@FindBy(xpath = "//button[@type='button'][@class='button button--primary button--curved button--lg']")
	WebElement savelesson;
	@FindBy(xpath = "//span[@class='mat-mdc-menu-item-text']")
	List<WebElement> Assignment;
	@FindBy(name = "last-name")
	WebElement last_name;

	@FindBy(xpath = "//button[@type='button'][@aria-label='Example icon-button with a menu']")
	WebElement add_content2;

	@FindBy(xpath = "//h1")
	WebElement Header;

	@FindBy(xpath = "//*[@id=\"mat-mdc-dialog-0\"]/div/div/app-courses-module-actions/mat-dialog-content/div[2]/form/div[4]/app-editor/div/ngx-editor/div/div")
	WebElement desc;

	public String veryHeader() {
		String ActualTitle = Header.getText();
		return ActualTitle;
	}

	public boolean veryHeader2() {
		boolean ActualTitle = submit.isDisplayed();
		return ActualTitle;
	}

	public void businessEmail(String str)

	{

		setTextElementText(email, str);

	}

	public void enterPassword(String str)

	{
		setTextElementText(password, str);
	}

	public void Coursetite(String str)

	{
		setTextElementText(courseTitle, str);
	}

	public void topic2(String str)

	{
		setTextElementText(topic2, str);
		action.sendKeys(Keys.ENTER).build().perform();// press enter

	}

	public void shortDescription(String str)

	{
		setTextElementText(Topic, str);

	}

	public void longDescription(String str)

	{
		setTextElementText(longdesc, str);

	}

	public void Video(String str)

	{
		setTextElementText(Video, str);
		// driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);

		js.executeScript("window.scrollBy(0,750)");
		// setTextElementText(test, str);
	}

	public void courseDays(String str)

	{
		setTextElementText(courseDays, str);
	}

	public void code(String str)

	{
		setTextElementText(code, str);
	}
	
	public void subCategory()

	{
		clickButton(subCategory);

		// System.out.println("Number of itemsy: " + ss.size());
		

		clickButton(dropdown.get(1));

	}


	public void code2(String str)

	{
		setTextElementText(code2, str);
	}

	public void title(String x)

	{
		setTextElementText(title, x);
	}

	public void topic(String str)

	{
		setTextElementText(topic, str);
	}

	public void clicksOnMoudlesTAb ()

	{
		clickButton(testz.get(1));
		// action.sendKeys(Keys.DOWN).build().perform();//press down arrow key

		// action.sendKeys(Keys.ENTER).build().perform();//press enter

	}

	public void lessonname(String str)

	{
		setTextElementText(lessonname, str);
	}

	public void desc(String str)

	{
		setTextElementText(desc, str);
	}

	public void upload()

	{
		clickButton(upload);
	

	}

	public void ClickOnSubmit()

	{

		clickButton(submit);

	}

	public void SelectOnOrganization()

	{

		clickButton(Organization);
		action.sendKeys(Keys.DOWN).build().perform();// press down arrow key

		action.sendKeys(Keys.ENTER).build().perform();// press enter

	}

	public void ClickOnSave()

	{

		clickButton(button);

	}

	public void CheckBoxFreeCourse()

	{

		clickButton(checkbox);

	}

	public void ClickAddMoudle()

	{

		clickButton(add_module);

	}

	public void ClicksaveMoudle()

	{

		clickButton(add_moudle);

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
