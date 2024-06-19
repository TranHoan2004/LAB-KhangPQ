package entity;

public class EastAsiaCountries extends Country{

    private String countryTerrain;
    public static final String TI_STRING = String.format("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area",
                "Terrain");
    public EastAsiaCountries() {
    }

    public EastAsiaCountries(String countryTerrain, String countryCode,
            String countryName, double countryArea) {
        super(countryCode, countryName, countryArea);
        this.countryTerrain = countryTerrain;
    }


    public String getCountryTerrain() {
        return countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    @Override
    public String toString() {
        return String.format(super.toString()+"%-25s", countryTerrain);
    }   
}
