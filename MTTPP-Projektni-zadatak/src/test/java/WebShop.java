import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class WebShop extends PageObject{
    private final String page_name = "ABOUT YOU";
    private final String email = "RicardoNVargas@jourrapide.com";
    private final String password = "123456";
    private final String user_name = "RICARDO";
    private final String article_name = "majica";
    @FindBy(xpath = "//*[@id=\"W0wltc\"]/div")
    private WebElement decline_btn;
    @FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
    private WebElement search_box;
    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/a/h3")
    private WebElement page_link;
    @FindBy(xpath = "//*[@id=\"react-root\"]/header/div[3]/section/div[2]/a/div/span[1]")
    private WebElement page_sign1;
    @FindBy(xpath = "//*[@id=\"react-root\"]/header/div[3]/section/div[2]/a/div/span[2]/span")
    private WebElement page_sign2;
    @FindBy(xpath = "//*[@id=\"onetrust-reject-all-handler\"]")
    private WebElement decline_cookies_btn2;
    @FindBy(xpath = "//*[@id=\"react-root\"]/header/div[3]/section/div[3]/div/div/div[1]")
    private WebElement log_in_btn1;
    @FindBy(xpath = "//*[@id=\"modal-root\"]/div/div/div/div/div[2]/div[1]/div[2]")
    private WebElement log_in_btn2;
    @FindBy(xpath = "//*[@id=\"modal-root\"]/div/div/div/div/div[2]/div[2]/div[3]/form/div[1]/div[1]/label/input")
    private WebElement email_box;
    @FindBy(xpath = "//*[@id=\"modal-root\"]/div/div/div/div/div[2]/div[2]/div[3]/form/div[1]/div[2]/label/input")
    private WebElement password_box;
    @FindBy(xpath = "//*[@id=\"modal-root\"]/div/div/div/div/div[2]/div[2]/div[3]/form/div[3]/div/button")
    private WebElement log_in_btn3;
    @FindBy(xpath = "//*[@id=\"react-root\"]/header/div[3]/section/div[2]/a/div/span[2]/span")
    private WebElement user_name_on_page;
    @FindBy(xpath = "//*[@id=\"react-root\"]/header/div[4]/section/div[2]/div/input")
    private WebElement articles_box;
    @FindBy(xpath = "//*[@id=\"react-root\"]/header/div[4]/section/div[2]/div[2]/div[1]/div/div/div[1]/div[1]")
    private WebElement articles_box_submit;
    @FindBy(xpath = "//*[@id=\"@aboutyou/router::SCROLL_ANCHOR\"]/div[2]/section/div[2]/section/div[1]/ul/li[1]/a/div[3]/div")
    private WebElement first_article;
    @FindBy(xpath = "//*[@id=\"page-content-wrapper\"]/section/div[2]/div/div/div/section/div[1]/button/div/span")
    private WebElement size_selector;
    @FindBy(xpath = "//*[@id=\"page-content-wrapper\"]/section/div[2]/div/div/div/section/div[1]/div/div/ul/li[1]/div/div")
    private WebElement size;
    @FindBy(xpath = "//*[@id=\"page-content-wrapper\"]/section/div[2]/div/div/div/section/div[2]/div/button[1]/div")
    private WebElement add_to_basket_btn;
    @FindBy(xpath = "//*[@id=\"page-content-wrapper\"]/div/section[2]/div/section[1]/div[1]/div/div[1]/div[2]/div/div[1]/div[1]/div/button/div")
    private WebElement remove_from_basket_btn;
    public WebShop(WebDriver driver) {
        super(driver);
    }
    public void decline_cookies(){
        decline_btn.click();
    }
    public void search(){
        search_box.sendKeys("about you");

        search_box.submit();
    }
    public void find_link(){
        Assert.assertEquals(page_link.getText().substring(0,9), page_name);
    }
    public void click_link(){
        page_link.click();
    }
    public void check_sign(){
        Assert.assertEquals(page_sign1.getText() + " " + page_sign2.getText(), page_name);
        decline_cookies_btn2.click();
    }
    public void log_in(){
        log_in_btn1.click();
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e){}
        log_in_btn2.click();
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e){}
        email_box.sendKeys(email);
        password_box.sendKeys(password);
        log_in_btn3.click();
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException e){}
        Assert.assertEquals(user_name_on_page.getText(), user_name);
    }
    public void find_article(){
        articles_box.sendKeys(article_name);
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e){}
        articles_box_submit.click();
    }
    public void pick_article(){
        first_article.click();
    }
    public void add_to_basket(){
        size_selector.click();
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e){}
        size.click();
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e){}
        add_to_basket_btn.click();
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException e){}

    }
    public void remove_from_basket() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        remove_from_basket_btn.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
    }
}