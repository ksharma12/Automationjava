package uiAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import uiAutomation.objectRepository.Or;
import uiAutomation.selenium.UiOperations;

public class Test {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        UiOperations obj = new UiOperations(driver);
        String url = "http://www.tizag.com/htmlT/htmlcheckboxes.php";
        obj.getUrl(url);
        driver.manage().window().maximize();
        obj.click(Or.checkBox);
        obj.quitBrowser();
    }
}
