package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigationHeaderComponent {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	@FindBy(xpath="")
	private WebElement allTab;
	
	@FindBy(xpath="")
	private WebElement booksTab;
	
	@FindBy(xpath="")
	private WebElement imagesTab;
	
	@FindBy(xpath="")
	private WebElement videosTab;
	
	@FindBy(xpath="")
	private WebElement newsTab;
	
	@FindBy(xpath="")
	private WebElement moreTab;
	
	@FindBy(xpath="")
	private WebElement toolsTab;
	
	public NavigationHeaderComponent(WebDriver driver) {
		this.driver=driver;
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(driver, this);
	}
	
	
	

}
