package se.reky.hakan.web;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.lang.model.element.Element;
import java.time.Duration;
import java.util.List;

@Disabled
public class PlayerControllerTest
{
    private ChromeDriver driver;

    @BeforeAll
    static void init(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setUp(){
        driver = new ChromeDriver();
    }

    @AfterEach
    void tearDown(){

        if(driver != null){
            driver.quit();
        }

    }

    @Test
    void testPlayerListLength(){
        driver.get("http://localhost:8080/players");
        List<WebElement> playerList = driver.findElements(By.tagName("li"));
        Assertions.assertEquals(playerList.size(), 2);

    }


    @Test
    void correctAmountOfPLayerAreShown(){
        driver.get("http://localhost:8080/players");
        WebElement firstElement = driver.findElement(By.className("player-name"));
        Assertions.assertTrue(firstElement.isDisplayed());
    }

    @Test
    void testShowTitle(){
        driver.get("http://localhost:8080/players");
        Assertions.assertEquals("Players List", driver.getTitle());
    }

    @Test
    void testLoginButton(){
        driver.get("http://localhost:8080/players");
        WebElement loginButton = driver.findElement(By.tagName("button"));
        Assertions.assertEquals("Logga in", loginButton.getText());

    }

    @Test
    void testShowUniquePlayer(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("http://localhost:8080/players");
        WebElement player1 = driver.findElement(By.className("click-player"));
        player1.click();
        WebElement playerName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("player-name")));

        Assertions.assertTrue(playerName.isDisplayed());
    }

}
