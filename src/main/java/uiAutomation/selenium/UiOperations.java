package uiAutomation.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;

public class UiOperations extends UiWaitOperations{
    private static WebElement element;
    private static WebElement sourceElement;
    private static List<WebElement> elements;
    private static WebDriver driver;
    private static Actions actions;
    public UiOperations(WebDriver driver) {
        super(driver);
        UiOperations.driver = driver;
        actions = new Actions(driver);
    }
    public void getUrl(String url){
        try{
            driver.get(url);
            Assert.assertTrue(true, "Navigated to url successfully " + url);
            System.out.println("Successfully get url: " + url);
        }catch (Exception e){
            Assert.assertFalse(false,"Failed to navigate "+url);
            e.printStackTrace();
        }
    }
    public void click(String locator){
        try{
            element  = findElement(locator);
            element.click();
            System.out.println("Successfully perform click at locator: "+element);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public Actions clickAction(){
        if (elements == null){
            try{
                actions.click();
                System.out.println("Successfully perform click");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return actions;
    }
    public Actions clickActionWebElement(String locator){
        if (elements == null){
            try{
                element = findElement(locator);
                actions.click(element);
                System.out.println("Successfully perform click on element: "+element);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return actions;
    }
    public Actions contextClick(){
        if (elements == null){
            try{
                actions.contextClick();
                System.out.println("Successfully perform right click");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return actions;
    }
    public Actions clickAndHold(){
        try{
            actions.clickAndHold();
            System.out.println("Successfully perform click and hold");
        }catch (Exception e){
            e.printStackTrace();
        }
        return actions;
    }
    public Actions doubleClick(){
        try{
            actions.doubleClick();
            System.out.println("Successfully perform double click");
        }catch (Exception e){
            e.printStackTrace();
        }
        return actions;
    }
    public Actions doubleClick(String locator){
        try{
            element = findElement(locator);
            actions.doubleClick(element);
            System.out.println("Successfully perform double click");
        }catch (Exception e){
            e.printStackTrace();
        }
        return actions;
    }
    public Actions dragAndDrop(String sourceLocator, String targetLocator){
        try{
            sourceElement = findElement(sourceLocator);
            WebElement targetElement = findElement(targetLocator);
            actions.dragAndDrop(sourceElement, targetElement);
            System.out.println("Successfully drag and drop from source"+sourceElement+" to "+"target "+ targetElement);
        }catch (Exception e){
            e.printStackTrace();
        }
        return actions;
    }
    public Actions dragAndDropByAxis(String sourceLocator, int xAxis, int yAxis){
        try{
            sourceElement = findElement(sourceLocator);
            actions.dragAndDropBy(sourceElement,xAxis,yAxis);
            System.out.println("Successfully drag and drop from source "+sourceElement+" to "+xAxis+" and "+yAxis);
        }catch (Exception e){
            e.printStackTrace();
        }
        return actions;
    }
    public Actions moveToElement(String sourceLocator){
        try{
            sourceElement = findElement(sourceLocator);
            actions.moveToElement(sourceElement);
            System.out.println("Successfully moved to element: "+sourceElement);
        }catch (Exception e){
            e.printStackTrace();
        }
        return actions;
    }
    public Actions moveToElementByAxis(String sourceLocator, int xAxis, int yAxis){
        try{
            sourceElement = findElement(sourceLocator);
            actions.moveToElement(sourceElement,xAxis,yAxis);
            System.out.println("Successfully moved to element: "+sourceElement+" to "+xAxis+" and "+yAxis);
        }catch (Exception e){
            e.printStackTrace();
        }
        return actions;
    }
    public void perform(){
        try{
            actions.perform();
            System.out.println("Successfully perform action");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void quitBrowser(){
        try{
            driver.quit();
            System.out.println("Successfully quiting browser");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
