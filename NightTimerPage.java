package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NightTimerPage {
    private WebDriver driver;
    private By selectCheckbox = By.xpath("//input[@id='UCM-CM-APP:SINGLE_PORTFOLIO:table_header_0-0_select:data-table-checkbox-renderer']");
    private By pauseButton = By.xpath("//button[@id='pause']");

    public NightTimerPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSelectCheckbox() {
        driver.findElement(selectCheckbox).click();
    }

    public void clickPauseButton() {
        driver.findElement(pauseButton).click();
    }
}

