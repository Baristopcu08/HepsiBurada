package Pages;


import Readers.property.PropertyReader;
import ReuseableClass.BaseClass;
import org.openqa.selenium.By;

public class SearchPage extends BaseClass {

    private static SearchPage instance;


    private SearchPage(){ }

    public static SearchPage getSearchPage() {
        if (instance == null) {
            instance = new SearchPage();
        }
        return instance;
    }

    public void searchProduct(String arananUrun){
        $(By.xpath(PropertyReader.read().get("searchParentLocator"))).click();
        $(By.xpath(PropertyReader.read().get("searchBox"))).sendKeys(arananUrun);
        $(By.xpath(PropertyReader.read().get("searchParentLocator"))).click();
        $(By.xpath(PropertyReader.read().get("searchButton"))).click();
     }

     public void clickProduct(){
         $(By.xpath(PropertyReader.read().get("parentProduct"))).click();
         $(By.xpath(PropertyReader.read().get("product"))).click();
     }

}
