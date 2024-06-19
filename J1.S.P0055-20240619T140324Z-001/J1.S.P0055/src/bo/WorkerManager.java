package bo;

import entity.Worker;
import java.util.ArrayList;
import entity.SalaryHistory;

public class WorkerManager {

    private ArrayList<Worker> wList;
    private ArrayList<SalaryHistory> salaryHistorys;

    public WorkerManager() {
        wList = new ArrayList<>();
        salaryHistorys = new ArrayList<>();
    }

    public ArrayList<Worker> getAllListWorker() {
        return wList;
    }

    public ArrayList<SalaryHistory> getListSalaryHistorys() {
        return salaryHistorys;
    }

    public boolean isExist(Worker w) {
        for (int i = 0; i < wList.size(); i++) {
            if (wList.get(i).getID().contains(w.getID())) {
                return true;
            }
        }
        return false;
    }

    public boolean addWorker(Worker w) {
        return wList.add(w);
    }

    private int searchById(String id) {
        for (int index = 0; index < wList.size(); index++) {
            if (wList.get(index).getID().equalsIgnoreCase(id)) {
                return index;
            }
        }
        return -1;
    }

    public Worker getWorkerID(String id) throws Exception {
        int index = searchById(id);
        if (index != -1) {
            return wList.get(index);
        }
        throw new Exception("Id not found");
    }

    public Worker updateSalaryWorker(String ID, Worker w, int mode, double money) throws Exception {
        String status = "";
        double update = 0;
        if (mode == 1) {
            update = w.getSalary() + money;
            status = "UP";
        } else if (mode == 2) {
            if (w.getSalary() > money) {
                update = w.getSalary() - money;
                status = "Down";
            } else {
                update = 0;
            }
        }
        w.setSalary(update);
        salaryHistorys.add(new SalaryHistory(ID, w.getName(), w.getAge(), w.getSalary(), status, java.time.LocalDate.now()));
        return w;
    }

}
