package test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class tableLogin {

    public static void login(WebDriver driver) {

        WebElement user = driver.findElement(By.id("ctl00_MainContent_username"));
        user.sendKeys("Tester");
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

    }

    public static void assertt(WebDriver driver, String name) {
        List<WebElement> list = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));
        for (WebElement each : list) {
            System.out.println(each.getText());

            if (each.getText().equals(name)) {
                Assert.assertTrue(true);
                return;
            }

        }
    }
}
