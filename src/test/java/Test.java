

public class Test extends BaseTest {
    HomePage homePage;

    @org.junit.jupiter.api.Test
    public void searchOnGoogle(){
        homePage = new HomePage(driver);
        homePage.loginToFacebook("brn_mskn@hotmail.com","aKs.14159");
        system.println("jenkins test");
    }


}
