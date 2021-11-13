import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class SeleniumWeb {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--no-sandbox")
                .addArguments("--disable-notification");

        System.setProperty(
                "webdriver.chrome.driver", "src/main/resources/chromedriver.exe"
        );
        WebDriver driver = new ChromeDriver();
        driver.get("https://yandex.ru/images/?utm_source=main_stripe_big");
        Actions actions = new Actions(driver);
        driver.findElement(By.xpath("//input[1]")).click();
        driver.findElement(By.xpath("//input[1]")).sendKeys("Game of the thrones");
        driver.findElement(By.xpath("//div[2]/button/div")).click();
        //driver.findElement(By.xpath("//div/ul/li[1]/div/a")).click();
        driver.findElement(By.xpath("//button[1]")).click();
        //driver.findElement(By.xpath("//span[contains(@tone, 'white')]")).click();
        List<WebElement> menuItems = driver.findElements(By.xpath("//span[@class='_2ZRlR']"));
        Thread.sleep(5000);


        ((JavascriptExecutor)driver).executeScript("window.open");
        Thread.sleep(5000);

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        Thread.sleep(5000);
        driver.quit();
    }

}
