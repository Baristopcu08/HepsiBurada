package Pages;
import static Utilities.Driver.getDriver;


public class HomePage {

    private static HomePage instance;
    private  static final String homePageUrl="https://www.hepsiburada.com/";

    private HomePage(){ }


    public static HomePage getHomePage() {
        if (instance == null) {
            instance = new HomePage();
        }
        return instance;
    }


    public void userOnHomepage() {
        getDriver().get(homePageUrl);
    }

}
