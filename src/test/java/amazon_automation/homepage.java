package amazon_automation;

import common.driver_factory;
import org.openqa.selenium.chrome.ChromeDriver;

public class homepage extends driver_factory {
    public static void main(String[] args){
        browser();
        ChromeDriver driver=new ChromeDriver();
        driver.get("http://amazon.in");
        driver.findElementById("twotabsearchtextbox").sendKeys("Watches");
        driver.findElementByCssSelector(".nav-search-submit.nav-sprite .nav-input").click();
        String winHandleBefore = driver.getWindowHandle();
        driver.findElementById("result_0").click();
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        driver.findElementById("add-to-cart-button").click();
        driver.findElementById("hlb-ptc-btn-native").click();
        driver.findElementByCssSelector("input[type='email']").sendKeys("binwal.atul@gmail.com");
//        driver.findElementById("continue").click();
        driver.findElementById("ap_password").sendKeys("Tannu-03");
        driver.findElementById("signInSubmit").click();
        driver.close();
        driver.switchTo().window(winHandleBefore);
        driver.close();

    }
}