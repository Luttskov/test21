package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.support.PageFactory.initElements;

public class Button {

    @FindBy(xpath = "//*[contains(text(), 'открывающая скобка')]/..")
    private WebElement lftpar;

    public WebDriver driver;
    public Button(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}
