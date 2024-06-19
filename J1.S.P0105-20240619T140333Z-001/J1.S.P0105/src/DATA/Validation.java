
package DATA;

import DTO.Product;
import java.util.List;

//TH1: add mode = 1;
public class Validation {
    public static Product oExist(String anything, List<Product> pList, int mode) {
        for (Product o : pList) {
            if ((o.getProductID().equalsIgnoreCase(anything) && mode == 1)
                    || (o.getProductNameString().equalsIgnoreCase(anything) && mode == 2) ||
                    (o.getCategory().equalsIgnoreCase(anything) && mode == 3)) {
                return o;
            }
        }
        return null;
    }

    public static Product searchByName(String productName,List<Product> pList){
        for (Product o : pList) {
            if(o.getProductNameString().equalsIgnoreCase(productName)){
                return o;
            }
        }
        return null;
    }
}
