package tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import utils.Utils;

public class CT06AcessoOutlookTest {
    private WebDriver driver;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        driver = new Utils().getDriver();
    }

    @Test
    public void cT01AcessoOutlook() {
        driver.get("https://outlook.live.com/owa/");
        driver.manage().window().setSize(new Dimension(628, 680));
        driver.findElement(By.cssSelector(".auxiliary-actions .internal > font > font")).click();
        driver.findElement(By.id("i0116")).click();
        driver.findElement(By.id("i0116")).sendKeys("flavio.souza@cognizant.com");
        driver.findElement(By.id("idSIButton9")).click();
        driver.findElement(By.cssSelector("div:nth-child(3) > small > font > font")).click();
        driver.findElement(By.cssSelector(".ms-Overlay")).click();
        driver.findElement(By.cssSelector("#AgAAAAAAAQACAAAAKAn2tQAAAAA\\= .\\_1Cz6QWtbduTKlAyf910p0h")).click();
        js.executeScript("window.scrollTo(0,0)");
        {
            WebElement element = driver.findElement(By.cssSelector(".aKEZUGyWi5haT6riFXgvp"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector(".aKEZUGyWi5haT6riFXgvp"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector(".aKEZUGyWi5haT6riFXgvp"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        driver.findElement(By.cssSelector(".PlainText")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".ms-TooltipHost > .ms-Button--icon .css-52"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.cssSelector(".ms-TooltipHost > .ms-Button--icon .css-52")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".\\_2pWlLjJ_ABQoPAJuw14xWG"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.findElement(By.cssSelector(".ms-Icon--ChromeClose")).click();
    }
}

