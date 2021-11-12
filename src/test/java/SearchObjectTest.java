import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.sql.Driver;

public class SearchObjectTest {
    WebDriver driver;
    WebDriverWait webDriverWait;
    SearchText searchText;

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupDriver() {
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, 5);
        searchText = new SearchText(driver);
    }

    @Test
    void searchNewText(){
       new SearchText(driver).searchLine()
               .searchText()
               .clickButton();
    }

    @AfterEach
    void tearDown(){
        driver.quit();
    }
}
