package bo;

import entity.Country;
import entity.EastAsiaCountries;
import java.util.ArrayList;
import java.util.Collections;

public class EastAsiaCountriesManager {

    private ArrayList<Country> asiaCountrieses;

    public EastAsiaCountriesManager() {
        asiaCountrieses = new ArrayList<>();
    }

    public ArrayList<Country> getAllList() {
        return asiaCountrieses;
    }

    
    //add and check id
    public boolean addCountry(Country e) throws Exception {
        if (!checkIfExist(e.getCountryCode())) {
            return asiaCountrieses.add(e);
        }
        throw new Exception("ID is exits in DB");
    }

    
    //check id
    private boolean checkIfExist(String code) {
        for (int i = 0; i < asiaCountrieses.size(); i++) {
            if (asiaCountrieses.get(i).getCountryCode().contains(code)) {
                return true;
            }
        }
        return false;
    }

    //searchByName
    public ArrayList<Country> searchByNameCountry(String name) {
        ArrayList<Country> ret = new ArrayList<>();
        for (Country o : asiaCountrieses) {
            if (o.getCountryName().toUpperCase().contains(name.toUpperCase())) {
                ret.add(o);
            }
        }
        return ret;
    }
    //sort
    public ArrayList<Country> sortComparator() {
        ArrayList<Country> cloneCountry = new ArrayList<>();
        cloneCountry = (ArrayList) asiaCountrieses.clone();
        Collections.sort(cloneCountry);
        return cloneCountry;
    }
}
