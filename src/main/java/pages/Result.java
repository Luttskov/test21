package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import static org.openqa.selenium.support.PageFactory.initElements;

public class Result {

    @FindBy(css = "#rso span[jsname*='ubtiRe']")
    public WebElement mem;

    @FindBy(css = "#rso span[jsname*='VssY5c']")
    public WebElement result;

    public Result(WebDriver driver) {
        initElements(driver, this);
    }

    public String getMem() {
        return mem.getText();
    }

    public String getResult() {
        return result.getText();
    }

}
