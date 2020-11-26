package test.day5_testng;

import org.testng.Assert;
import org.testng.annotations.*;


public class FirstTestNGClass {

    @BeforeClass
    public void before(){

    }
    @BeforeMethod
    public void setUp(){
        System.out.println("Before method running...");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("After method running...");
    }

    @Test
    public void test1() {
        System.out.println("Test1 is running...");

        String a = "A";
        String b = "B";

        Assert.assertEquals(a,b,"a b ye esit degil");

    }
    @Test
    public void test3(){
        System.out.println("Test3 is running...");

        String actualTitle = "Amazon prime";
        String expectedInTitle = "prime";
        String testString = "asdofjasdf";

        //if the boolean value we pass in assertTrue is "true", assertion will pass.
        //else it will fail

        //Assert.assertTrue(false);
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
        //Assert.assertTrue(actualTitle.contains(testString));
        System.out.println("JUST CHECKING IF THIS LINE IS RUNNING!!!!");
        Assert.assertFalse(actualTitle.contains(testString));

    }


}
