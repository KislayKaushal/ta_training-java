package com.epam.training.Kislay_Kaushal.task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PastebinPage {
    private WebDriver driver;

    // Locators
    private By newPasteField = By.id("postform-text");
    private By pasteExpirationDropdown = By.id("select2-postform-expiration-container");
    private By tenMinutesOption = By.xpath("//li[contains(text(),'10 Minutes')]");
    private By pasteTitleField = By.id("postform-name");
    private By createPasteButton = By.xpath("//button[contains(text(),'Create New Paste')]");

    // Constructor
    public PastebinPage(WebDriver driver) {
        this.driver = driver;
    }

    // Page Actions
    public void enterPasteContent(String content) {
        driver.findElement(newPasteField).sendKeys(content);
    }

    public void selectPasteExpiration() {
        driver.findElement(pasteExpirationDropdown).click();
        driver.findElement(tenMinutesOption).click();
    }

    public void enterPasteTitle(String title) {
        driver.findElement(pasteTitleField).sendKeys(title);
    }

    public void clickCreatePaste() {
        driver.findElement(createPasteButton).click();
    }
}
