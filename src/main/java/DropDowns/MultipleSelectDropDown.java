package DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectDropDown {
    public static void main(String[] args) {
        String url ="https://demoqa.com/select-menu" +"";
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get(url);
        driver.manage().window().maximize();

        //Declare object of UI select

        Select newStyleMenu = new Select(driver.findElement(By.id("cars")));

        //Select by index
        newStyleMenu.selectByIndex(2);

        //Select by value
        newStyleMenu.selectByValue("audi");

        //Select by text
        newStyleMenu.selectByVisibleText("Volvo");

    }
}
