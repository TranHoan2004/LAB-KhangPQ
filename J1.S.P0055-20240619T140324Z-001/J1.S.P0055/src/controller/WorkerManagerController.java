package controller;

import bo.WorkerInputter;
import bo.WorkerManager;
import entity.SalaryHistory;
import entity.Worker;
import java.util.ArrayList;
import utils.ValidationAndNormalText;

public class WorkerManagerController {

    private WorkerInputter workerInputter;
    private WorkerManager workerManager;

    public WorkerManagerController() {
        workerManager = new WorkerManager();
    }

    public Worker inputWorker() {
        workerInputter = new WorkerInputter();
        Worker w = workerInputter.inputID();
        if (!workerManager.isExist(w)) {
            w = workerInputter.inputInformation();
            return w;
        } else {
            System.err.println("Duplicated! Try again");
            return inputWorker();
        }
    }

    public boolean addAllWorker() {
        Worker w = inputWorker();
        if (workerManager.addWorker(w)) {
            workerInputter.getWorker();
        }
        return false;
    }

    public Worker updateWorker(int mode) throws Exception {
        String ID = ValidationAndNormalText.intputSring("Enter ID WANA UPDATE: ", "Eror Fomat");
        Worker w = workerManager.getWorkerID(ID);
        Double money = ValidationAndNormalText.inputDouble("Enter Amount: ", 0.0000001, Double.MAX_VALUE);
        return workerManager.updateSalaryWorker(ID, w, mode, money);
    }

    
    public void displayHistoryOrListWorker(int mode) {
        ArrayList<SalaryHistory> salaryHistorys = workerManager.getListSalaryHistorys();
        ArrayList<Worker> listWorkers = workerManager.getAllListWorker();
        if (mode == 1) {
            if (listWorkers.isEmpty()) {
                System.err.println("list is Empty!");
            } else {
                System.out.println(Worker.TI_STRING);
                for (Worker listWorker : listWorkers) {
                    System.out.println(listWorker);
                }
            }
        } else if (mode == 2) {
            if (salaryHistorys.isEmpty()) {
                System.err.println("Nothing to update");
            } else {
                System.out.println(Worker.TI_STRING);
                for (SalaryHistory s : salaryHistorys) {
                    System.out.println(s);
                }
            }
        }
    }
}
