
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MorningTimerPage {
    private WebDriver driver;
    private By selectCheckbox = By.xpath("//input[@id='UCM-CM-APP:SINGLE_PORTFOLIO:table_header_0-0_select:data-table-checkbox-renderer']");
    private By enableButton = By.xpath("//button[@id='enable']");

    public MorningTimerPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSelectCheckbox() {
        driver.findElement(selectCheckbox).click();
    }

    public void clickEnableButton() {
        driver.findElement(enableButton).click();
    }
}

