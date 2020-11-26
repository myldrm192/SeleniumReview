package test.day2_findElement;

import com.google.gson.internal.$Gson$Preconditions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

       // driver.findElement(By.name("q")).sendKeys("irem"+ Keys.ENTER);

        driver.findElement(By.linkText("About")).click();

        driver.navigate().back();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";

        if (actualTitle.contains(expectedTitle)){

        }






    }


}
