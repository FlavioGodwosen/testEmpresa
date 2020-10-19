package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import utils.Utils;

public class CT04AcessarPost {

    private WebDriver driver;
    JavascriptExecutor js;
    
    @Before
    public void setUp() {
        driver = new Utils().getDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void cT01AcessarPost() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://medium.com/revista-tspi");
        driver.findElement(By.cssSelector(".collectionHeader-heroInner")).click();

        js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0,3482.39990234375)");
        Thread.sleep(3000);
        js.executeScript("window.scrollTo(0,4120)");

        driver.findElement(By.linkText("SonarLint: Seu código com mais qualidade")).click();

    }
}


