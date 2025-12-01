package POM;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleLinksText {
@FindBy(tagName="a")
private List<WebElement> LinkText;
	
GoogleLinksText(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public void linksText()
{
	for(WebElement l: LinkText)
	{
		String a = l.getText();
		System.out.println(a);
	}
}


}
