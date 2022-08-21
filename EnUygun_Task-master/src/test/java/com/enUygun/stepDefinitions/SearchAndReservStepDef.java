package com.enUygun.stepDefinitions;

import com.enUygun.pages.HomePage;
import com.enUygun.utilities.ConfigurationReader;
import com.enUygun.utilities.Driver;


public class SearchAndReservStepDef extends Hooks {


    public void user_is_already_on_base_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    public void user_enter_in_Nereden_text_box_and_choose_to_airport(String nereden) {
        HomePage homePage = new HomePage();
        homePage.neredenTextBox.sendKeys(nereden);
        homePage.istAirports.click();

    }

    public void user_enter_in_Nereye_text_box_and_chooses_to_airport(String nereye) {
        HomePage homePage = new HomePage();
        homePage.nereyeTextBox.sendKeys(nereye);
        homePage.esbAirport.click();
    }

    public void user_chooses_departure_date() {
        HomePage homePage = new HomePage();
        homePage.departureDayPicker.click();
        homePage.nextMonthArrow.click();
        homePage.departureDay.click();
    }

    public void user_click_oneway_check_box() {
        HomePage homePage = new HomePage();
        homePage.onlyWayCheckBox.click();
    }

    public void user_chooses_return_date() {
        HomePage homePage = new HomePage();
        homePage.returnDay.click();
    }

    public void user_click_Ucuz_bilet_bul_button() {
        new HomePage().ucuzBiletBulButton.click();
    }


    public void user_chooses_one_of_departure_flight_and_click_Seç_button() throws InterruptedException {
        new HomePage().departureFlight.click();
        Thread.sleep(3000);
    }


    public void user_chooses_one_of_return_flight_and_click_Seç_button() throws InterruptedException {
        new HomePage().returnFlight.click();
        Thread.sleep(3000);
    }

    public void secbutton_function() throws InterruptedException {
        new HomePage().secButton.click();
        Thread.sleep(3000);
    }

}
