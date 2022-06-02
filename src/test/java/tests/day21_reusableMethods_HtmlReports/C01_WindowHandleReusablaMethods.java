package tests.day21_reusableMethods_HtmlReports;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

public class C01_WindowHandleReusablaMethods {

    @Test
    public void test01() {

        //● https://the-internet.herokuapp.com/windows adresine gidin.
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        Driver.getDriver().findElement(By.linkText("Click Here")).click();

        String ilksayfaWH=Driver.getDriver().getWindowHandle();
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        Set<String> windowsHandleSeti=Driver.getDriver().getWindowHandles();

    }

    @Test
    public void test02() {
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        ReusableMethods.switchToWindow("New Window");

        String expectedTitle= "New Window";
        String actualTitle= Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);

        Driver.closeDriver();


    }
}
