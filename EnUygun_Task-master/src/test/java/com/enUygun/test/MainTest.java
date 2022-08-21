package com.enUygun.test;

import com.enUygun.stepDefinitions.SearchAndReservStepDef;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class MainTest extends SearchAndReservStepDef {

    WebDriverWait wait;
    WebDriver driver;

    @Test (priority = 1)
    public void EnUygun_Test_Scenario() throws InterruptedException {

        user_is_already_on_base_page();
        user_enter_in_Nereden_text_box_and_choose_to_airport("istanbul");
        user_enter_in_Nereye_text_box_and_chooses_to_airport("amsterdam");
        user_chooses_departure_date();
        user_click_oneway_check_box();
        user_chooses_return_date();
        user_click_Ucuz_bilet_bul_button();
        user_chooses_one_of_departure_flight_and_click_Seç_button();
        user_chooses_one_of_return_flight_and_click_Seç_button();
        secbutton_function();
    }


}
