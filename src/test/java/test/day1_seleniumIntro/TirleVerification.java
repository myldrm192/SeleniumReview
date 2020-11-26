package test.day1_seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TirleVerification {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();



        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        System.out.println(driver.getPageSource());

        String actualTitle = driver.getTitle();
        String expectedTitle="Google";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Passed");
        }else{
            System.out.println("Fail");
        }

        driver.close();


    }
}
