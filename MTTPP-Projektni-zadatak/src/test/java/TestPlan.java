import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();
    private static final WebShop webShop = new WebShop(driver);
    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(priority = 0, testName = "Find page link")
    public static void findLink(){
        driver.get(Utils.BASE_URL);
        driver.manage().window().maximize();
        webShop.decline_cookies();
        webShop.search();
        webShop.find_link();

    }
    @Test(priority = 1, testName = "Check page")
    public static void checkPage(){
        webShop.click_link();
        webShop.check_sign();
    }
    @Test(priority = 2, testName = "Log in")
    public static void logIn(){
        webShop.log_in();
    }
    @Test(priority = 3, testName = "Search article")
    public static void searchArticle(){
        webShop.find_article();
    }
    @Test(priority = 4, testName = "Put in basket")
    public static void putInBasket(){
        driver.get(Utils.ARTICLES_URL);
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e){}
        webShop.pick_article();
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException e){}
        webShop.add_to_basket();
    }
    @Test(priority = 5, testName = "Take out of basket")
    public static void putOutOfBasket(){
        driver.get(Utils.BASKET_URL);
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException e){}
        webShop.remove_from_basket();
    }
    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}