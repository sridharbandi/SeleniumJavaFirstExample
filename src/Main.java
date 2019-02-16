import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        //Set the path of chromedriver. replace with chromedriver path
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
        //ChromeDriver instantiation
        WebDriver driver = new ChromeDriver();
        //Maximizes the browser
        driver.manage().window().maximize();
        //Open the URL
        driver.get("http://www.google.com/");
        //WebElement instantiation
        WebElement searchBox = driver.findElement(By.name("q"));
        //Type Selenium
        searchBox.sendKeys("Selenium");
        //Simulate Hit Keyboard Enter
        searchBox.submit();
        //Close the browser
        driver.quit();
    }
}
