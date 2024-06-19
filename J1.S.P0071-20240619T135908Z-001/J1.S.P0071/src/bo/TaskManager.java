package bo;

import entity.Task;
import java.util.ArrayList;

public class TaskManager {

    private ArrayList<Task> tList;
    private int lastID;

    public TaskManager() {
        tList = new ArrayList<>();
        lastID = 1;
    }

    public ArrayList<Task> getListTask() {
        return tList;
    }

    public boolean addTask(Task task) {
        task.setId(lastID++);
        return tList.add(task);
    }

    private int searchTask(int id) {
        for (int i = 0; i < tList.size(); i++) {
            if (tList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public Task deleteTask(int id) throws Exception {
        int index = searchTask(id);
        if (index != -1) {
            return tList.remove(index);
        } else {
            throw new Exception("ID does not exist in DB!!");
        }
    }

    public String getAllTaskString() {
        String ret = (Task.TI_STRING);
        if (tList.isEmpty()) {
            return ret + ("\nList is empty!");
        } else {

            for (Task task : tList) {
                ret += ("\n" + task);
            }
            return ret;
        }
    }

}
