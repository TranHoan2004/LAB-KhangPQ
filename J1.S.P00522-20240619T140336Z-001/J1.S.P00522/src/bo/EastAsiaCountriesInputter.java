package bo;

import entity.EastAsiaCountries;
import utils.ValidationAndNormalizingTextUtil;

public class EastAsiaCountriesInputter {

    private EastAsiaCountries e = new EastAsiaCountries();

    public EastAsiaCountries getCountry() {
        return e;
    }

    public EastAsiaCountries getInputInformation() {
        e.setCountryCode(ValidationAndNormalizingTextUtil.normalFormName(ValidationAndNormalizingTextUtil.getNonEmptyString("Enter Code: ")));
        e.setCountryName(ValidationAndNormalizingTextUtil.normalFormName(ValidationAndNormalizingTextUtil.getNonEmptyString("Enter Name of country: ")));
        e.setCountryArea(ValidationAndNormalizingTextUtil.inputDouble("Enter total Area: ", 0.0000001, Double.MAX_VALUE));
        e.setCountryTerrain(ValidationAndNormalizingTextUtil.normalFormName(ValidationAndNormalizingTextUtil.getNonEmptyString("Enter Terrain: ")));
        return e;
    }

}
