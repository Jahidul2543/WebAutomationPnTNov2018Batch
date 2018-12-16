import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/jahidul/IdeaProjects/WebAutomation2018/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com");
        driver.findElement(By.id("search_query_top")).sendKeys("Shoes", Keys.ENTER);
        //driver.findElement(By.name("submit_search")).click();
        driver.quit();
        /*
        * Learn about locators
        *  Show me the use of all types of locators
        * Show me at least 3 ways of writing XPath and CSS
        * What is WebDriver?
        *
        * */

    }
}
