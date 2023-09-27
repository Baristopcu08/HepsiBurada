package Steps;

import ReuseableClass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Pages.CardPage.getCardPage;
import static Pages.HomePage.getHomePage;
import static Pages.ProductPage.getProductPage;
import static Pages.SearchPage.getSearchPage;
import static Utilities.Driver.getDriver;

public class GeneralSteps extends BaseClass {

    @Given("Kullanici Ana Sayfadadir")
    public void userOnHomepage() {
        getHomePage().userOnHomepage();
    }


    @When("Kullanıcı ürün arama alanına {string} yazar")
    public void searchProduct(String productName){

        getSearchPage().searchProduct(productName);
    }

    @When("Kullanıcı listelenen Ürünlerden birinine tıklar")
    public void clickProduct(){

       getSearchPage().clickProduct();
    }

    @When("Kullanıcı ürünü sepete ekler")
    public void kkullaniciUrunuSepeteEkler(){

        getProductPage().addCard();

    }

    @When("Kullanıcı {string} butonuna tıklar")
    public void kullaniciSepeteGider(String linkText){

        getProductPage().gotoShoppingCart(linkText);

    }

    @When("Kullanıcı Alışveriş Kredisi linkine tıklar")
    public void alisverisKredisiLinkinetikla(){

        getCardPage().alisverisKredisinetikla();

    }
    @When("Kullanıcı Karta taksit yapılamaz linkine tıklar")
    public void taksitYapilamazLinkinetikla(){

        getCardPage().taksitYapilamaztikla();

    }


    @When("Kullanıcı açılan açılan bilgi ekranını kapatır")
    public void acilanBilgiEkraniniKapat(){

        getCardPage().bilgiEkraniniKapat();

    }

    @Then("Açılan ekranda {string} bölümün olduğunu görür")
    public void elemetingorunurOldugunuDogrula(String linkText){

        BaseClass.isVisibleElement(linkText);

    }

}

