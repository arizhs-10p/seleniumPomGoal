package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver Driver;

    By username = By.name("username");
            //("//input[contains(@name,'txtUsername')]");

    By password = By.name("password");
    //("//input[@name='txtPassword']");


    By loginbtn = By.xpath("//button[@type='submit']");
            //id("btnLogin");

    public LoginPage(WebDriver webDriver)
    {
        this.Driver=webDriver;
    }

    public void TypeUserName()
    {
        Driver.findElement(username).sendKeys("Admin");
    }
    public void TypePassword()
    {
        Driver.findElement(password).sendKeys("admin123");
    }
    public void ClickLoginBtn()
    {
        Driver.findElement(loginbtn).click();
    }
}
