package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import utils.Utils;

public class CT05AcessoSalesForce {
    private WebDriver driver;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        driver = new Utils().getDriver();
    }


    @Test
    public void cT01AcessarPost() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://bradesco-crm--qa.my.salesforce.com/");
        //driver.findElement(By.cssSelector(".collectionHeader-heroInner")).click();
        driver.findElement(By.id("username")).sendKeys("flavio.souza@bradesco.com.br.qa"); // Achando o elemento pelo ID e passando o valor
        driver.findElement(By.id("password")).sendKeys("Lukinh@s03"); // Achando o elemento pelo ID e passando o valor

        driver.findElement(By.id("Login")).click();


        //js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollTo(0,3482.39990234375)");
        //Thread.sleep(3000);
        //js.executeScript("window.scrollTo(0,4120)");

        //driver.findElement(By.linkText("SonarLint: Seu código com mais qualidade")).click();
    }
    }
