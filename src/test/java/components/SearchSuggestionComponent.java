package components;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchSuggestionComponent extends AbstractComponent{
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	@FindBy(xpath="//ul[@class='G43f7e']/li")
	private List<WebElement> suggestions;
	
	public SearchSuggestionComponent(WebDriver driver) {
		this.driver=driver;
		this.wait = new WebDriverWait(driver,30);
		PageFactory.initElements(driver, this);
	}

	@Override
	public boolean isDisplayed() {
		return this.wait.until((d)->this.suggestions.size()>0);
	}

}
