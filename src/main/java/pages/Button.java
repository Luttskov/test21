package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import static org.openqa.selenium.support.PageFactory.initElements;

public class Button {

    @FindBy(css = "div[jsname*='j93WEe']")
    public WebElement lftpar;
    @FindBy(css = "div[jsname*='N10B9")
    public WebElement one;
    @FindBy(css = "div[jsname*='XSr6wc']")
    public WebElement plus;
    @FindBy(css = "div[jsname*='lVjWed']")
    public WebElement two;
    @FindBy(css = "div[jsname*='qCp9A']")
    public WebElement rgtpar;
    @FindBy(css = "div[jsname*='YovRWb']")
    public WebElement multi;
    @FindBy(css = "div[jsname*='KN1kY']")
    public WebElement three;
    @FindBy(css = "div[jsname*='pPHzQc']")
    public WebElement minus;
    @FindBy(css = "div[jsname*='xAP7E']")
    public WebElement four;
    @FindBy(css = "div[jsname*='bkEvMb']")
    public WebElement zero;
    @FindBy(css = "div[jsname*='WxTTNd']")
    public WebElement split;
    @FindBy(css = "div[jsname*='Ax5wH']")
    public WebElement five;
    @FindBy(css = "div[jsname*='Pt8tGc']")
    public WebElement equ;
    @FindBy(css = "div[jsname*='abcgof']")
    public WebElement six;
    @FindBy(css = "div[jsname*='aN1RFf']")
    public WebElement sin;


    public Button(WebDriver driver) {initElements(driver, this);

    }
}
