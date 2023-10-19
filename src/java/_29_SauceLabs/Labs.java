package _29_SauceLabs;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class Labs {//Sauce labs - сайт чтобы на маке провести кросфплатформенный тест использую винду и наоборот

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setPlatformName("Windows 11");
        browserOptions.setBrowserVersion("latest");
        Map<String, Object> sauceOptions = new HashMap<>();
        sauceOptions.put("build", "selenium-build-HOU2O");
        sauceOptions.put("name", "<your test name>");
        browserOptions.setCapability("sauce:options", sauceOptions);

        URL url = new URL("https://oauth-kaparov777almaz-e1a6f:ed7ffad9-4d24-46c5-9bc8-4d9a96b52490@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
        RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);

        driver.get("https://nambafood.kg/diyar?language=ru");
        Thread.sleep(6000);
    }
}
