package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Pages.NightTimerPage;
import java.time.LocalTime;

public class NightTimerTest {
    private WebDriver driver;
    private NightTimerPage nightTimerPage;

    @BeforeClass
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("debuggerAddress", "localhost:8989");
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver(options);
        nightTimerPage = new NightTimerPage(driver);

        // Calculate the time difference for the desired execution time
        LocalTime currentTime = LocalTime.now();
        LocalTime targetTime = LocalTime.of(18, 04);
        long timeDifference = targetTime.toSecondOfDay() - currentTime.toSecondOfDay();

        // If the current time is after the target time, add 24 hours to the time difference
        if (timeDifference < 0) {
            timeDifference += 24 * 60 * 60; // 24 hours in seconds
        }

        // Sleep for the calculated time difference
        try {
            Thread.sleep(timeDifference * 1000); // Convert seconds to milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.get("https://advertising.amazon.co.uk/cm/portfolios/A3L4I0EKHW0UAG");
    }

    @Test
    public void testNightTimer() {
        nightTimerPage.clickSelectCheckbox();
        nightTimerPage.clickPauseButton();
    }

    //@AfterClass
    //public void tearDown() {
        //driver.quit();
    //}
}
