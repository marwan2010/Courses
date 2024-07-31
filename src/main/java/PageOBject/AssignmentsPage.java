package PageOBject;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AssignmentsPage extends PagesBase {
	public AssignmentsPage(WebDriver driver) {
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
	WebElement PassingScore2;
	@FindBy(xpath = "//input[@id='Assignmentdegree']")
	WebElement Assignmentdegree;

	@FindBy(xpath = "//button[@type='button'][@class='button button--primary button--curved button--lg ng-star-inserted']")
	WebElement saveHomework;

	@FindBy(xpath = "//textarea[@id='Topic']")
	WebElement Topic;

	@FindBy(className = "mdc-tab__text-label")
	List<WebElement> testz;

	@FindBy(xpath = "//span[@class='mat-mdc-menu-item-text']")
	List<WebElement> Assignment;

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

	public void role(String str)

	{
		clickButton(testz.get(1));
		// action.sendKeys(Keys.DOWN).build().perform();//press down arrow key

		// action.sendKeys(Keys.ENTER).build().perform();//press enter

	}

	public void ClickOnsaveHomeWork()

	{

		clickButton(saveHomework);

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

}
