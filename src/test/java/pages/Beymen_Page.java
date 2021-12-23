package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Beymen_Page {

    public Beymen_Page() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[@class='o-header__userInfo--text'])[1]")
    public WebElement hesabımText;

    @FindBy(xpath = "(//span[@class='o-header__userInfo--text'])[2]")
    public WebElement favorilerimText;

    @FindBy(xpath = "(//span[@class='o-header__userInfo--text'])[3]")
    public WebElement sepetimText;

    @FindBy(className = "o-header__logo")
    public WebElement beymenText;

    @FindBy(css = "input.default-input.o-header__search--input")
    public WebElement searchBox;

    @FindBy(id = "moreContentButton")
    public WebElement dahaFazlaGoster;

    @FindBy(css = "div.m-productImageList")
    public WebElement ilkUrun;

    @FindBy(css = "span.m-variation__item")
    public WebElement bedenSecimi;

    @FindBy(id="addBasket")
    public WebElement sepetEkle;

    @FindBy(id="priceNew")
    public WebElement sayfadakiFiyat;

    @FindBy(className = "m-productPrice__salePrice")
    public WebElement sepetkiFiyat;

    @FindBy(id="quantitySelect0")
    public WebElement adetArtirma;

    @FindBy(css ="span.m-productPrice__salePrice")
    public WebElement toplamFiyat;

    @FindBy(id = "removeCartItemBtn0")
    public WebElement sepetSil;

    @FindBy(xpath = "(//strong[@class='m-empty__messageTitle'])[2]")
    public WebElement silindiEkrani;


}
