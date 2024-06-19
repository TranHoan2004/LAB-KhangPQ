
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ManagerEastAsiaCountries {
    ArrayList<Country> createCountryList() {
        ArrayList<Country> t = new ArrayList<>();
        return t;
    }
    
    public static void inputCountry(ArrayList<Country> ct){
        String countryCode;
        String countryName;
        float totalArea;
        String countryTerrain;
          
        do {
            countryCode = GetInputData.stringInput("Enter code of country: ");
            try {
                if (!checkCountryExist(ct, countryCode)) {                    
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.err.println("Country exist.");
            }
        } while (true);

        countryName = GetInputData.stringInput("Enter name of country: ");
        totalArea = GetInputData.floatInput("Enter total area: ");
        countryTerrain = GetInputData.stringInput("Enter Terrain of country");
        ct.add(new Country(countryCode, countryName, totalArea, countryTerrain));
    }
    
    public void importData(ArrayList<Country> t){
        int n=GetInputData.sizeListStudent(); 
        for (int i = 0; i < n; i++) {
            System.out.println("Country " + (i +1));
            inputCountry(t);
            System.out.println();
        }
        String choice;
        while (true) {            
            choice = GetInputData.inputYorN("Do you want to continue (Y/N)? ", "Y", "N");
            if (choice.equalsIgnoreCase("Y")) {
                inputCountry(t);
            } else {
                break;
            }
        }
    }
    public void printCountry(ArrayList<Country> ct){
        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area",
                "Terrain");
        for (Country country : ct) {
            country.display();
        }
    }
    
    
    
    public Country searchByName(ArrayList<Country> t,String name){
        if(t.isEmpty())
            return null;
        for (int i = 0; i < t.size(); i++) {
            if(t.get(i).getCountryName().equalsIgnoreCase(name))
                return t.get(i);
        }
        return null;
    }

    public void searchNameCountry( ArrayList<Country> t) {
        String name;
        name = GetInputData.stringInput("Enter name wanna search: ");
        Country xxx = searchByName(t, name);
        if (xxx == null) {
            System.out.println("NOT FOUND!!");
        } else {
            System.out.println("Country found");
            xxx.display();
        }
    }
    
    public  void printCountrySorted(ArrayList<Country> t) {
        System.out.println("Before sorting");
        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area",
                "Terrain");
        for (Country x : t) {
            x.display();
        }
        System.out.println("After sorting");
        Collections.sort(t);
        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area",
                "Terrain");
        for (Country country : t) {
            country.display();
        }
    }
    
    public static boolean checkCountryExist(ArrayList<Country> lc, String countryCode) {
        for (Country country : lc) {
            if (country.getCountryCode().equalsIgnoreCase(countryCode)) {
                return false;
            }
        }
        return true;
    }
}
