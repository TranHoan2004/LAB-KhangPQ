
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {

        ManagerEastAsiaCountries me = new ManagerEastAsiaCountries();
        ArrayList<Country> t = me.createCountryList();
        
        int choice;
        
        while (true) {
            Menu.display();
            choice = Menu.getChoice();
            switch (choice) {
                case 1:
                    me.importData(t);
                    break;
                case 2:
                    me.printCountry(t);
                    break;
                case 3:
                    me.searchNameCountry(t);
                    break;
                case 4:
                    me.printCountrySorted(t);
                    break;
                case 5:
                    System.out.println("Have a nice day!");
                    return;
            }
        }
    }
}
