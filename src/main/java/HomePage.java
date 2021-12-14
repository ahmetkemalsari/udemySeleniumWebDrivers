import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    private final By searchBoxInputLocator = By.name("q");
    private final By searchBoxButtonLocator = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]");
    private final By firstResultLocator = By.xpath("/html/body/div[7]/div/div[9]/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div[1]/div/div/div/div[1]/a/h3");

    private final By emailInputLocator = By.id("email");
    private final By passwordFieldLocator = By.id("pass");
    private final By loginButtonLocator = By.name("login");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchBoxText(String text){
        setText(searchBoxInputLocator,text);
        click(searchBoxButtonLocator);
    }

    public void goToFirstResult(){
        click(firstResultLocator);
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        driver.get("https://www.yahoo.com/");
      //  driver.navigate().back();

        
    }
    public void loginToFacebook(String email,String password){
        driver.get("https://tr-tr.facebook.com/");
        setText(emailInputLocator,email);
        setText(passwordFieldLocator,password);
        click(loginButtonLocator);


    }

}
