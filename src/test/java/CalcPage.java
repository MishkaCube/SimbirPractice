import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalcPage {

    public WebDriver driver;

    public CalcPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//div[@jsname=\"j93WEe\"]")
    private WebElement bracket;

    @FindBy(xpath = "//div[@jsname=\"qCp9A\"]")
    private WebElement bracket1;

    @FindBy(xpath = "//div[@jsname=\"N10B9\"]")
    private WebElement oneBtn;

    @FindBy(xpath = "//div[@jsname=\"lVjWed\"]")
    private WebElement twoBtn;

    @FindBy(xpath = "//div[@jsname=\"KN1kY\"]")
    private WebElement threeBtn;

    @FindBy(xpath = "//div[@jsname=\"XSr6wc\"]")
    private WebElement plusBtn;

    @FindBy(xpath = "//div[@jsname=\"YovRWb\"]")
    private WebElement multBtn;

    @FindBy(xpath = "//div[@jsname=\"pPHzQc\"]")
    private WebElement minusBtn;

    @FindBy(xpath = "//div[@jsname=\"xAP7E\"]")
    private WebElement fourBtn;

    @FindBy(xpath = "//div[@jsname=\"bkEvMb\"]")
    private WebElement zeroBtn;

    @FindBy(xpath = "//div[@jsname=\"WxTTNd\"]")
    private WebElement divBtn;

    @FindBy(xpath = "//div[@jsname=\"Ax5wH\"]")
    private WebElement fiveBtn;

    @FindBy(xpath = "//div[@jsname=\"Pt8tGc\"]")
    private WebElement equalBtn;

    @FindBy(xpath = "//div[@jsname=\"abcgof\"]")
    private WebElement sixBtn;

    @FindBy(xpath = "//div[@jsname=\"aN1RFf\"]")
    private WebElement sinBtn;



    public void inputNumbers() {
        bracket.click();
        oneBtn.click();
        plusBtn.click();
        twoBtn.click();
        bracket1.click();
        multBtn.click();
        threeBtn.click();
        minusBtn.click();
        fourBtn.click();
        zeroBtn.click();
        divBtn.click();
        fiveBtn.click();
        equalBtn.click();
    }

    public void inputNumberTask2() {
        sixBtn.click();
        divBtn.click();
        zeroBtn.click();
        equalBtn.click();
    }

    public void inputNumberTask3() {
        sinBtn.click();
        equalBtn.click();
    }
}
