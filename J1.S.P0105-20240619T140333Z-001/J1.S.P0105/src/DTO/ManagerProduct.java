package DTO;

import java.util.ArrayList;
import java.util.List;

public class ManagerProduct {

    public ManagerProduct() {
    }

    public List<Product> createProductList() {
        List<Product> pList = new ArrayList<>();
        return pList;
    }

    public void inputAddProduct(List<Product> pList) {
        String productID;
        String productNameString;
        String locate;
        Double price;
        String dateOfManufacture, expirydate, receiptDate;
        String category;

        productID = DATA.InputData.inputID("Enter Product ID: ", "ID is Exist", 1, pList);
        productNameString = DATA.InputData.intputSring("Enter name: ", "input is not allowed to be empty, pls re-entry! ");
        locate = DATA.InputData.intputSring("Enter Location: ", "input is not allowed to be empty, pls re-entry! ");
        price = DATA.InputData.inputDouble("Enter Price: ", 0, Double.MAX_VALUE);
        dateOfManufacture = DATA.InputData.inputDate("Enter Date Manufacture: ", "Error Format");
        expirydate = DATA.InputData.inputDate("Enter Expiry Date: ", "Error Format");
        receiptDate = DATA.InputData.inputDate("Enter Receipt Date: ", "Error Format");
        category = DATA.InputData.intputSring("Enter Category: ", "input is not allowed to be empty, pls re-entry! ");

        pList.add(new Product(productID, productNameString, locate, price, dateOfManufacture, expirydate, receiptDate, category));
        System.out.println("Add Successfully!");

    }

    public void addProduct(List<Product> pList) {
        int n = DATA.InputData.inputInt("Enter Number Product want to add: ", 0, 5);
        for (int i = 0; i < n; i++) {
            inputAddProduct(pList);
        }
        String choice;
        while (true) {
            choice = DATA.InputData.inputYorN("Do you want to continue (Y/N)? ", "Y", "N");
            if (choice.equalsIgnoreCase("Y")) {
                inputAddProduct(pList);
            } else {
                break;
            }
        }
    }

    public void updateProduct(List<Product> pList) {

        String productID;
        String newProductID;
        String newProductName;
        String newLocate;
        Double newPrice;
        String newDateOfManufacture, newExpirydate, newReceiptDate;
        String newCategory;
        productID = DATA.InputData.inputID("Enter Product ID wanna update", "ID not exist in DATABASE", 2, pList);
        Product xxx = DATA.Validation.oExist(productID, pList,1);
        newProductID = DATA.InputData.inputID("Enter New Product ID: ", "ID is Exist", 1, pList);
        xxx.setProductID(newProductID);
        newProductName = DATA.InputData.intputSring("Enter New name: ", "input is not allowed to be empty, pls re-entry! ");
        xxx.setProductNameString(newProductName);
        newLocate = DATA.InputData.intputSring("Enter New Location: ", "input is not allowed to be empty, pls re-entry! ");
        xxx.setLocate(newLocate);
        newPrice = DATA.InputData.inputDouble("Enter New Price: ", 0, Double.MAX_VALUE);
        xxx.setPrice(newPrice);
        newDateOfManufacture = DATA.InputData.inputDate("Enter New Date Manufacture: ", "Error Format");
        xxx.setDateOfManufacture(newDateOfManufacture);
        newExpirydate = DATA.InputData.inputDate("Enter New Expiry Date: ", "Error Format");
        newReceiptDate = DATA.InputData.inputDate("Enter New Receipt Date: ", "Error Format");
        newCategory = DATA.InputData.intputSring("Enter New Category: ", "input is not allowed to be empty, pls re-entry! ");
        xxx.setCategory(newCategory);
        System.out.println("Update Successfully");

    }

    public void getInformation(List<Product> pList) {
        Ulis.Display.display(pList);
    }
    
    public void searchProduct(List<Product> pList){
        DATA.InputData.choiceSearh();
        int choice = DATA.InputData.inputInt("Your choice: ", 1, 4);        
        Product xxx;
        do {            
            switch (choice) {
                case 1:
                    String nameSearch = DATA.InputData.intputSring("Enter name wanna search: ", "input is not allowed to be empty, pls re-entry! ");
                    xxx = DATA.Validation.oExist(nameSearch, pList, 2);
                    if (xxx != null) {
                        getInformation(pList);
                        break;
                    }
                    System.out.println("Name not exist in Database!");                    
                case 2:
                    String categorySearch = DATA.InputData.intputSring("Enter Category wanna search: ", "input is not allowed to be empty, pls re-entry! ");
                    xxx = DATA.Validation.oExist(categorySearch, pList, 3);
                    if (xxx != null) {
                        System.out.println(xxx.toString());
                        break;                       
                    }
                    System.out.println("Category not exist in Database!");
                case 3:
//                search = "Storekeeper";
                    break;
                case 4:
//                search = "ReceiptDate";
                    break;
            }            
        } while (false);
     
    }
    
}
