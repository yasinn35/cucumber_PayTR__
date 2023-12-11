package PageObjectModels;

import Utilities.DriverManager;
import Utilities.Methods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ExampleLocators extends Methods {
    public ExampleLocators() {
        PageFactory.initElements(DriverManager.Driver(), this);
    }
    @FindBy(xpath = "//div[@class='cookie__area__cta']")
    public List<WebElement> acceptCookieButton;
    @FindBy(xpath = "//a[text()='Ürünler']")
    public WebElement urunler;
    @FindBy(xpath = "//div[@id='online-odeme-cozumleri']/a")
    public List<WebElement> onlineodemecozumleri;
    @FindBy(xpath = "//div[text()='Fiziksel Ödeme Çözümleri']")
    public WebElement fizikselodemecozumleri;
    @FindBy(xpath = "//div[@id='fiziksel-odeme-cozumleri']/a")
    public List<WebElement> fizikselodemesecenekleri;
    @FindBy(xpath = "//div[text()='Alternatif Ödeme Çözümleri']")
    public WebElement alternatifodemecozumleri;
    @FindBy(xpath = "//div[@id='alternatif-cozumler']/a")
    public List<WebElement> alternatifodemesecenekleri;

}
