package DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OldStyleDropDwon {
    public static void main(String[] args) {
        String url ="https://demoqa.com/select-menu" +"";
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get(url);
        driver.manage().window().maximize();

        //Declare object of UI select

        Select oldStyleMenu = new Select(driver.findElement(By.id("oldSelectMenu")));

        //Select by index
        //oldStyleMenu.selectByIndex(1);

        //Select by value
        //oldStyleMenu.selectByValue("8");

        //Select by text
        oldStyleMenu.selectByVisibleText("Indigo");
    }
}
