package com.epam.training.Kislay_Kaushal.task3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class googleCloudTest {
    private WebDriver driver;
    private googleCloud googleCloudPage;

    @Before
    public void setUp() {
        // Set up WebDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://cloud.google.com/");

        // Initialize googleCloud page object
        googleCloudPage = new googleCloud(driver);
    }

    @Test
    public void testGoogleCloudPricingCalculator() {
        // Step 1: Perform search
        googleCloudPage.clickSearchButton();
        googleCloudPage.enterSearchText("Google Cloud Platform Pricing Calculator");
        googleCloudPage.clickSearchResult();
        googleCloudPage.clickGoogleCalculatorSite();

        // Step 2: Configure Compute Engine
        googleCloudPage.switchToComputeEngine();
        googleCloudPage.fillInstanceDetails("4");
        googleCloudPage.addGPUs();
        googleCloudPage.configureStorageAndLocation();

        // Step 3: Add to estimate and verify cost
        googleCloudPage.clickAddToEstimate();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
