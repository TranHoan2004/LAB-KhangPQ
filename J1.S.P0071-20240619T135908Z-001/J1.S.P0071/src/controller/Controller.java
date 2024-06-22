package controller;

import bo.TaskInputter;
import bo.TaskManager;
import entity.Task;
import utils.Validation;

public class Controller {

    private TaskInputter taskInputter;
    private TaskManager taskManager;

    public Controller() {
        taskManager = new TaskManager();
    }

    public Task getInformationTask() {
        taskInputter = new TaskInputter();
        Task t = taskInputter.informationTask();
        taskManager.addTask(t);
        return t;
    }

    public Task deleteTask() throws Exception {
        int id = Validation.getInt("Input id of task: ", "Must input an integer number",
                "Integer number must in range [1," + Integer.MAX_VALUE + "]", 1, Integer.MAX_VALUE);
        return taskManager.deleteTask(id);
    }

    public void getDisplay() {
        System.out.println(taskManager.getAllTaskString());;
    }

}
