/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.ManagerProduct;
import DTO.Product;
import java.util.List;

/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args) {
        ManagerProduct mp = new ManagerProduct();
        List<Product> pList = mp.createProductList();
        mp.addProduct(pList);
//        mp.updateProduct(pList);
        mp.getInformation(pList);
        mp.searchProduct(pList);
        mp.searchProduct(pList);
    }
}
