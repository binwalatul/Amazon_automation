package amazon_automation;

import common.driver_factory;
import org.openqa.selenium.chrome.ChromeDriver;

public class browse_category extends driver_factory {
    public static void main(String[] args){
        String URL="amazon.in";
        browser();
        ChromeDriver driver = new ChromeDriver();
        driver.get(URL);

    }
}
