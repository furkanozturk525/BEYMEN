package test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Beymen_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Beymen_Test {

    @Test
    public void beymenTest() {

        Beymen_Page beymen = new Beymen_Page();

        Driver.getDriver().get(ConfigReader.getProperty("beymenUrl"));

        ReusableMethods.waitFor(3);

        beymen.beymenText.isDisplayed();
        beymen.hesabımText.isDisplayed();
        beymen.favorilerimText.isDisplayed();
        beymen.sepetimText.isDisplayed();

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        ReusableMethods.waitFor(3);

        beymen.searchBox.sendKeys("Pantolon" + Keys.ENTER);
        ReusableMethods.waitFor(2);
        js.executeScript("arguments[0].scrollIntoView();",beymen.searchBox );


        ReusableMethods.waitFor(2);
        beymen.dahaFazlaGoster.click();

        js.executeScript("arguments[0].scrollIntoView();", beymen.searchBox);

        ReusableMethods.waitForVisibility(beymen.ilkUrun,3);
        beymen.ilkUrun.click();

        ReusableMethods.waitFor(3);

        beymen.bedenSecimi.click();
        ReusableMethods.waitFor(3);
        beymen.sepetEkle.click();

        String sayfaFiyati=beymen.sayfadakiFiyat.getText();
        System.out.println(sayfaFiyati);
        ReusableMethods.waitFor(3);
        beymen.sepetimText.click();

        String sepetFiyati=beymen.sepetkiFiyat.getText();
        System.out.println(sepetFiyati);
        Assert.assertEquals(sayfaFiyati,sepetFiyati);

        ReusableMethods.waitFor(3);
        Select options=new Select(beymen.adetArtirma);
        options.selectByValue("2");

        ReusableMethods.waitFor(3);
        String toplamFiyat=beymen.toplamFiyat.getText();
        System.out.println("Sepetteki 2 tanenin fiyat1="+toplamFiyat);

        Assert.assertFalse(toplamFiyat.equals(sepetFiyati));

        ReusableMethods.waitFor(3);
        beymen.sepetSil.click();
        ReusableMethods.waitFor(3);
        beymen.silindiEkrani.isDisplayed();

    }
}
