package categories;

import baseTest.BaseTest;
import org.testng.annotations.Test;
import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class categoriesTest extends BaseTest {
    private String [] phoneList = {"Samsung galaxy s6, Nokia lumia 1520, Nexus 6, Samsung galaxy s7, Iphone 6 32gb, Sony xperia z5, HTC One M9"};
    private String [] laptopList = {"Sony vaio i5, Sony vaio i7, MacBook air, Dell i7 8gb, 2017 Dell 15.6 Inch, MacBook Pro"};
    private String [] monitorList = {"Apple monitor 24, ASUS Full HD"};

    @Test
    public void checkPhones(){
        homePage.chooseCategory("Phones");
        assertEquals(homePage.checkList().toString(), Arrays.toString(phoneList), "List is not the same");
    }
    @Test
    public void checkLaptops(){
        homePage.chooseCategory("Laptops");
        assertEquals(homePage.checkList().toString(), Arrays.toString(laptopList), "Lists are not the same");
    }
    @Test
    public void checkMonitors(){
        homePage.chooseCategory("Monitors");
        assertEquals(homePage.checkList().toString(), Arrays.toString(monitorList), "Lists are not the same");
    }
}
