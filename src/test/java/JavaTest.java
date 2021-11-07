import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaTest {
    WebDriver driver;
    WebDriverWait webDriverWait;

    @BeforeAll
    static void setupDriwer(){
        WebDriverManager.chromedriver().setup();
    }
    @BeforeEach
    void initBrowser(){
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, 5);
    }
    @Test
    void openSiteTest() throws InterruptedException {
        driver.get("https://yandex.ru/images/?utm_source=main_stripe_big");
        assertEquals("https://yandex.ru/images/?utm_source=main_stripe_big",
                "https://yandex.ru/images/?utm_source=main_stripe_big");
        Thread.sleep(5000);
    }

    @Test
    void searchSiteTest() throws InterruptedException {
        driver.get("https://yandex.ru/images/?utm_source=main_stripe_big");
        Actions actions = new Actions(driver);
        driver.findElement(By.xpath("//input[1]")).click();
        driver.findElement(By.xpath("//input[1]")).sendKeys("Game of the thrones");
        driver.findElement(By.xpath("//div[2]/button/div")).click();
        List<WebElement> searchText = driver.findElements(By.xpath("//input[@id='uniq16359301777471261641']"));
        assertEquals("Game of the thrones", "Game of the thrones");
        Thread.sleep(5000);
    }
    @AfterEach
    void tearDown(){
        driver.quit();
    }
}
