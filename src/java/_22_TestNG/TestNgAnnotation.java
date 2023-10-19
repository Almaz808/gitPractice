package _22_TestNG;

//import javaFaker.FakeDataProvider;
import org.testng.Assert;
import org.testng.annotations.*;


public class TestNgAnnotation {

    String expectedFakeName;

    @AfterClass//срабатывает один раз после @Test                                   8й
    public void tearDown(){
        System.out.println("Close Chrome browser ");
    }

    @BeforeMethod//срабатывает перед каждым @Test.                                 2й   5й
    public void beforeMethod(){
        System.out.println("This is Before method ");
       // expectedFakeName = FakeDataProvider.generationFakeName();
    }

    @AfterMethod////срабатывает после @Test.                                        4й  7й
    public void afterMethod(){
        expectedFakeName = null;
        System.out.println(expectedFakeName);
        System.out.println("Screenshot");
    }

    @Test(description = "Verify food title is displayed on Home page")//description - описание тесту
    @Ignore//игнорирует метод
    public void testFoodTitle(){
        System.out.println("Check food title");
        System.out.println();
        System.out.println(expectedFakeName);
        Assert.assertEquals(0,1);
    }

    @Test//                                                                           3й
    public void testPharmacyTitle(){
        System.out.println("Check Pharmacy title");
        System.out.println(expectedFakeName);
    }

    @Test//                                                                             6й
    public void testShops(){
        System.out.println("Check Shop title");
        System.out.println(expectedFakeName);

    }

    @BeforeClass//срабатывает один раз перед @Test                                      1й
    public void setUp(){
        System.out.println("Configure chrome browser ");
        System.out.println("Go to Nambafood.com ");
    }
}
