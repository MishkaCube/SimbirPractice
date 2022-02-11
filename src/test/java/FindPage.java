import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindPage {
    public WebDriver driver;
    public FindPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@class=\"gLFyf gsfi\"]")
    private WebElement findField;

    @FindBy(xpath = "//input[@class=\"gNO89b\"]")
    private WebElement findButton;

    public void input(String message) {
        findField.sendKeys(message);
    }
    public void clickBtn() {
        findButton.click();
    }

}
