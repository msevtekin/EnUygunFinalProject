package com.enUygun.pages;

import com.enUygun.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.get(), this);}

    // Projemizde istenilen xpath tanımlamaları
    @FindBy(xpath = "//input[@id='OriginInput']")
    public WebElement neredenTextBox;

    @FindBy(css = "#react-autowhatever-OriginInput-section-0-item-0")
    public WebElement istAirports;

    @FindBy(css = "#DestinationInput")
    public WebElement nereyeTextBox;

    @FindBy(xpath = "//*[@id=\"react-autowhatever-DestinationInput-section-0-item-0\"]")
    public WebElement esbAirport;

    @FindBy(xpath = "//div[@class='SingleDatePicker SingleDatePicker_1']")
    public WebElement departureDayPicker;

    @FindBy(xpath = "//div[@class='DayPickerNavigation_button DayPickerNavigation_button_1 DayPickerNavigation_button__horizontal DayPickerNavigation_button__horizontal_2'][2]")
    public WebElement nextMonthArrow;

    @FindBy(xpath = "//td[@aria-label='Cumartesi, 10 Eylül 2022']")
    public WebElement departureDay;

    @FindBy(css = "#oneWayCheckbox")
    public WebElement onlyWayCheckBox;

    @FindBy(xpath = "//td[@aria-label='Pazartesi, 10 Ekim 2022']")
    public WebElement returnDay;

    @FindBy(xpath = "//button[@class='primary-btn block']")
    public WebElement ucuzBiletBulButton;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div/div/div[1]/div[1]/label/div[2]")
    public WebElement departureFlight;

    @FindBy(xpath = "//div[@data-flight-id='PC1256:U:2022-10-10 07:20:00:20X1']")
    public WebElement returnFlight;

    @FindBy(xpath = "//button[@id='tooltipTarget_0']")
    public WebElement secButton;

}
