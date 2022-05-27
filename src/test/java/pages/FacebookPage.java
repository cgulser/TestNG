package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookPage {
    public FacebookPage(){



    }

    @FindBy (id = "email")
    public WebElement mailKutusu;

    @FindBy (id = "pass")
    public WebElement sifreKutusu;

    @FindBy (name = "login")
    public WebElement logintusu;

    //@FindBy (className = "_9ay7")
    //public WebElement mailKutusu;

    //@FindBy (id = "email")
    //public WebElement mailKutusu;




}
