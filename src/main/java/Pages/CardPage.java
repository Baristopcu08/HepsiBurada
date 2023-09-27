package Pages;


import Readers.property.PropertyReader;
import ReuseableClass.BaseClass;
import org.openqa.selenium.By;

public class CardPage extends BaseClass {

    private static CardPage instance;


    private CardPage(){ }

    public static CardPage getCardPage() {
        if (instance == null) {
            instance = new CardPage();
        }
        return instance;
    }


    public void alisverisKredisinetikla(){
        $(By.xpath(PropertyReader.read().get("alisverisKredisi"))).click();
        sleep0nSecond();
    }

    public void taksitYapilamaztikla(){

        $(By.xpath(PropertyReader.read().get("taksitYapilamaz"))).click();
        sleep0nSecond();
    }

    public void bilgiEkraniniKapat(){

        $(By.xpath(PropertyReader.read().get("bilgiEkraniKapat"))).click();
        sleep0nSecond();

    }


}
