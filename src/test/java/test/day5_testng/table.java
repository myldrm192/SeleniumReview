package test.day5_testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.utilities.WebDriverFactory;
import test.utilities.tableLogin;

public class table {


    WebDriver driver;


    @BeforeMethod
    public void tablePractice() {

    driver=WebDriverFactory.getDriver("chrome");
    driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

    }

    @Test

    public void table(){

        tableLogin.login(driver);
        tableLogin.assertt(driver,"Paul Brown");


        }
    }




