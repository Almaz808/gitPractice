package _00_Practice;

import org.openqa.selenium.WebDriver;

public class BrowserHelper {

    private WebDriver driver;

    public BrowserHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void openURL(String URL){//get просто выполняет  переход к содержимому, открывет сайты.
        driver.navigate().to(URL);//Navigate Выполняет  переход к содержимому, открывет сайты. Запоминает переходы
    }

    public void goBack(){
        driver.navigate().back();
    }

    public void goForward(){
        driver.navigate().forward();
    }
    public void refreshThePage(){
        driver.navigate().refresh();
    }





}
