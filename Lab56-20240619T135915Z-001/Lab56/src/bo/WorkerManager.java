
package bo;

import java.util.ArrayList;
import java.util.List;
import model.SalaryHistory;
import model.Worker;
import utils.Validation;

public class WorkerManager {

    private List<Worker> list;
    private List<SalaryHistory> shlist;

    public WorkerManager() {
        list = new ArrayList<>();
        shlist = new ArrayList<>();
    }

    public List<SalaryHistory> getAllListUpdate() {
        return shlist;
    }

    public List<Worker> getAllList() {
        return list;
    }

    public boolean addWorker(Worker w) {
        return list.add(w);
    }

    public void updateSalaryById(int mode, String id, double money) {
        Worker o = searchWorkerById(id);
        String status = null;
        if (mode == 1) {
            o.setSalary(o.getSalary() + money);
            status = "UP";
        } else if (mode == 2) {
            if (o.getSalary() > money) {
                o.setSalary(o.getSalary() - money);
            }
            status = "DOWN";
        }
        shlist.add(new SalaryHistory(id, o.getName(), o.getAge(), o.getSalary(), status, java.time.LocalDate.now()));
    }

    public Worker searchWorkerById(String id) {
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getId())) {
                return list.get(i);
            }
        }
        return null;
    }

}
