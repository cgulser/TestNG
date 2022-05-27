package tests.day16_notations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C07_SoftAssert extends TestBase {
    @Test
    public void test01() throws InterruptedException {
        //1. “http://zero.webappsecurity.com/” Adresine gidin
        driver.get("http://zero.webappsecurity.com");
        //2. Sign in butonuna basin

        driver.findElement(By.id("signin_button")).click();

        //3. Login kutusuna “username” yazin
        WebElement login = driver.findElement(By.id("//input[@id='user_login']"));
        login.sendKeys("username");
        //4. Password kutusuna “password” yazin
        WebElement passkutusu = driver.findElement(By.id("//input[@id='user_password']"));
        passkutusu.sendKeys("password");
        //5. Sign in tusuna basin
        WebElement logintusu = driver.findElement(By.id("//input[@name='submit']"));
        logintusu.click();
        //6. Online banking menusu icinde Pay Bills sayfasina gidin
        //7. “Purchase Foreign Currency” tusuna basin
        //8. “Currency” drop down menusunden Eurozone’u secin
        //9. soft assert kullanarak "Eurozone (Euro)" secildigini test edin
        //10. soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin "Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)","China (yuan)","Denmark (krone)","Eurozone (euro)","Great Britain (pound)","Hong Kong (dollar)","Japan (yen)","Mexico (peso)","Norway (krone)","New Zealand (dollar)","Sweden (krona)","Singapore (dollar)","Thailand (baht)"


    }
}
