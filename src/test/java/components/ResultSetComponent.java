package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//public class ResultSetComponent extends AbstractComponent{
//	
//	private WebDriver driver;
//	private WebDriverWait wait;
//	
//	@FindBy(id="result-stats")
//	private WebElement resultSet;
//	
//	public ResultSetComponent(WebDriver driver) {
//		this.driver=driver;
//		this.wait=new WebDriverWait(driver,30);
//		PageFactory.initElements(driver, this);
//	}

//	@Override
//	public boolean isDisplayed() {
//		this.wait.until(ExpectedConditions.visibilityOf(resultSet));
//		return searchBox.isDisplayed();
//	}
//	
//	public String getTextofResultSet(String arg) {
//		return resultSet.getText();
//	}


