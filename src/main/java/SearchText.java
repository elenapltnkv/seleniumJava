import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;

public class SearchText {
    @FindBy(id="uniq163670862417773374")
    public WebElement searchLine;

    @FindBy(id="uniq163663692633295911")
    public WebElement inputText;

    @FindBy(xpath = "websearch-button__text")
    public WebElement buttonSearch;

    public SearchText searchLine() {
        searchLine.click();
        return this;
    }
    public SearchText searchText(){
        inputText.sendKeys((CharSequence) inputText);
        return this;
    }
    public SearchText buttonSearch(String search){
        buttonSearch.sendKeys((CharSequence) buttonSearch);
        return this;
    }
    public SearchText clickButton(){
        buttonSearch.click();
        return this;
    }
    public SearchText(Driver driver){
        //this.driver = driver;
        PageFactory.initElements((WebDriver) driver, this);

    }


}
