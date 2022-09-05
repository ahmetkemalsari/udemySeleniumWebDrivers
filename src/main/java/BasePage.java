import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        System.out.println("test");
    }
    public WebElement find(By locator){
        return driver.findElement(locator);
    }

    public List<WebElement> findAll(By locator){
        return driver.findElements(locator);
    }

    public void click(By locator){
        find(locator).click();
    }
    public void setText(By locator, String text){
        find(locator).sendKeys(text);
    }
    public void checked(By locator){
        checked(locator);
    }
    public boolean isDisplayed(By locator){
        return find(locator).isDisplayed();
    }
}
