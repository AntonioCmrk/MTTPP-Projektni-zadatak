import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();
    private static final WebForm webForm = new WebForm(driver);
    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(priority = 0, testName = "Find page link")
    public static void findLink(){
        driver.get(Utils.BASE_URL);
        driver.manage().window().maximize();
        webForm.decline_cookies();
        webForm.search();
        webForm.find_link();

    }
    @Test(priority = 1, testName = "Check page")
    public static void checkPage(){
        webForm.click_link();
        webForm.check_sign();
    }
    @Test(priority = 2, testName = "Log in")
    public static void logIn(){
        webForm.log_in();
    }
    @Test(priority = 3, testName = "Search article")
    public static void searchArticle(){
        webForm.find_article();
    }
    @Test(priority = 4, testName = "Put in basket")
    public static void putInBasket(){
        webForm.pick_article();
        webForm.add_to_basket();
    }
    @Test(priority = 5, testName = "Take out of basket")
    public static void putOutOfBasket(){
        webForm.remove_from_basket();
    }
    @Test(priority = 6, testName = "Log out")
    public static void logOut(){
        webForm.log_out();
    }

    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}