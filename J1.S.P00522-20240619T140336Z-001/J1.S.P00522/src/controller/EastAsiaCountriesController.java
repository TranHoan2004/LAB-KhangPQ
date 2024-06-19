package controller;

import bo.EastAsiaCountriesInputter;
import bo.EastAsiaCountriesManager;
import entity.Country;
import entity.EastAsiaCountries;
import java.util.ArrayList;
import utils.ValidationAndNormalizingTextUtil;

public class EastAsiaCountriesController {

    private EastAsiaCountriesInputter asiaCountriesInputter;
    private EastAsiaCountriesManager asiaCountriesManager;

    public EastAsiaCountriesController() {
        asiaCountriesManager = new EastAsiaCountriesManager();
    }

    
    //add country
    public EastAsiaCountries addCountry() throws Exception {
        asiaCountriesInputter = new EastAsiaCountriesInputter();
        EastAsiaCountries e = asiaCountriesInputter.getInputInformation();
        asiaCountriesManager.addCountry(e);
        return e;
    }
    
    
    //display
    public void getRecentlyEnteredInformation() {
        ArrayList<Country> getAllList = asiaCountriesManager.getAllList();
        if (getAllList.isEmpty()) {
            System.err.println("Nothing in list");
        } else {
            System.out.println(EastAsiaCountries.TI_STRING);
            for (Country o : getAllList) {
                System.out.println(o);
            }
        }
    }
    
    
    //get searchByName
    public void searchInformationByName() {
        String name = ValidationAndNormalizingTextUtil.normalFormName(ValidationAndNormalizingTextUtil.getNonEmptyString("Enter Name of country wanna search: "));
        ArrayList<Country> find = asiaCountriesManager.searchByNameCountry(name);
        if (find.isEmpty()) {
            System.err.println("List is empty");
        } else {
            System.out.println(EastAsiaCountries.TI_STRING);
            for (Country o : find) {
                System.out.println(o);
            }
        }
    }
    
    //get Sorted
    public void sortInformationByAscendingOrder() {
        ArrayList<Country> getSorted = asiaCountriesManager.sortComparator();
        if (getSorted.isEmpty()) {
            System.err.println("List Empty");
        } else {
            System.out.println(EastAsiaCountries.TI_STRING);
            for (Country country : getSorted) {
                System.out.println(country);
            }
        }
    }
    
}
