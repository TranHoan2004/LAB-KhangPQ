/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import bo.WorkerManager;
import controller.Controller;
import model.Worker;
import utils.Validation;

/**
 *
 * @author nguye
 */
public class Main {

    public static void main(String[] args) {
        Controller m = new Controller();
        WorkerManager wm = new WorkerManager();
        while (true) {
            System.out.println("----------Menu----------");
            System.out.println(
                    "1.Add Worker\n"
                    + "2.Up salary\n"
                    + "3.Down salary\n"
                    + "4.Display information of all\n"
                    + "5.Display information salary\n"
                    + "6.Exit\n");
            System.out.println("Your choice: ");
            int choice = Validation.checkIntLimit(1, 6);
            switch (choice) {
                case 1:
                    try {
                        Worker w = m.addWorker();
                          System.out.println("Add successfuly.");
                          System.out.println(Worker.TIL_STRING);
                          System.out.println(w);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                   
                    break;
                case 2:
                    m.updateSalay(1);
                    System.out.println("Update success.");
                    break;
                case 3:
                    m.updateSalay(2);
                    System.out.println("Update success.");
                    break;
                case 4:
                    m.dispalyAll();
                    break;
                case 5:
                     m.displayInformationUpdate();
                    break;
                case 6:
                                 String ID = Validation.checkInputString("Enter id: ");
                                   wm.searchWorkerById(ID);
            }
        }
    }
}
