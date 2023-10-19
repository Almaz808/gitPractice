package _24_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public abstract class BaseTest {

    WebDriver driver;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();//настроить ChromeDriver для подключения браузера
        WebDriver driver = new ChromeDriver();//управляем браузером, мотор
        driver.manage().window().maximize();//на полное окно
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//максимально время загрузки - если больше ошибка !!!
    }

    @AfterClass
    public void tearDown(){
        driver.close();
        driver.quit();
    }

}
