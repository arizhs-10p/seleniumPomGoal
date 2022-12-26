package test;

import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testOrangeHRM {

    WebDriver webDriver;
    LoginPage loginPage;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\ariz.siddiqui\\IdeaProjects\\com.seleniumPom\\src\\main\\resources\\geckodriver.exe");
        webDriver = new FirefoxDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://opensource-demo.orangehrmlive.com/");
        String ET = "OrangeHRM";
        String AT = webDriver.getTitle();
        Assert.assertEquals(ET,AT);
    }

    @Test(priority = 0)
    public void login() throws Exception {
        System.out.println("login start hai");
        loginPage = new LoginPage(webDriver);
        System.out.println("ok login");
        Thread.sleep(5000);
        loginPage.TypeUserName();
        System.out.println("2");
        loginPage.TypePassword();
        System.out.println("3");
        loginPage.ClickLoginBtn();
        System.out.println("4");
       // webDriver.quit();
    }

}
