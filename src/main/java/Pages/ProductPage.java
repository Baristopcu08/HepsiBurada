package Pages;


import Readers.property.PropertyReader;
import ReuseableClass.BaseClass;
import org.openqa.selenium.By;

import java.text.MessageFormat;

public class ProductPage extends BaseClass {

    private static ProductPage instance;


    private ProductPage(){ }

    public static ProductPage getProductPage() {
        if (instance == null) {
            instance = new ProductPage();
        }
        return instance;
    }

    public void addCard(){
        SwichSecondWindow();
        $(By.xpath(PropertyReader.read().get("addCard"))).click();
     }

     public void gotoShoppingCart(String linkText){

         $(By.xpath(MessageFormat.format(PropertyReader.read().get("gotoShoppingCart"),linkText))).click();
     }


}
