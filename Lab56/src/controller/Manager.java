/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bo.Inputer;
import bo.WorkerManager;
import model.SalaryHistory;
import model.Worker;
import utils.Validate;


public class Manager {

    private WorkerManager workerManager;
    private Inputer inputer;

    public Manager() {
        workerManager = new WorkerManager();
        
    }

    public Worker inputWorker() {
         inputer = new Inputer();
        Worker w = inputer.inputInfonation();
        return w;
    }

    public Worker addWorker() throws Exception {
        if (workerManager.addWorker(inputWorker())) {
            return inputer.getWorker();
        }
        throw new Exception("Add fail.");
    }

    public void displayInformationUpdate() {
        System.out.println(SalaryHistory.TIL_UpDate);
        for (SalaryHistory o : workerManager.getAllListUpdate()) {
            System.out.println(o);
        }
    }

    public void dispalyAll(){
        System.out.println(Worker.TIL_STRING);
        for (Worker o : workerManager.getAllList()) {
            System.out.println(o);
        }
    }

    public void updateSalay(int mode) {
        String id = workerManager.getCode("Enter code to update: ", "Id not exised", 2);
        double money = Validate.checkDouble("Enter money to update: ");
        workerManager.updateSalaryById(mode, id, money);
    }

}
