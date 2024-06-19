package ui;

import controller.EastAsiaCountriesController;
import entity.EastAsiaCountries;
import utils.ValidationAndNormalizingTextUtil;

public class Main {

    public static void main(String[] args) throws Exception {
        EastAsiaCountriesController asiaCountriesController = new EastAsiaCountriesController();
        String menu = "                      WELCOME TO COUNTRY MANAGEMENT\n"
                + "                      1. Input the information of 11 countries in East Asia\n"
                + "                      2. Display the information of country you've just input\n"
                + "                      3. Search the information of country by user-entered name\n"
                + "                      4. Display the information of countries sorted name in ascending order\n"
                + "                      5. Exit\n"
                + "Enter one option in above : ";

        while (true) {
            int choice = ValidationAndNormalizingTextUtil.getInt(menu, "Input number only!", "Must input an integer in range [1,5]", 1, 5);
            switch (choice) {
                case 1:
                    try {
                        EastAsiaCountries e = asiaCountriesController.addCountry();
                        System.out.println(e);
                        System.out.println("Add successfully!");
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 2:
                    asiaCountriesController.getRecentlyEnteredInformation();
                    break;
                case 3:
                    asiaCountriesController.searchInformationByName();
                    break;
                case 4:
                    System.out.println("======================== Display Sorted by Name ========================");
                    asiaCountriesController.sortInformationByAscendingOrder();
                    break;
                case 5:
                    return;
            }
        }
    }

}
