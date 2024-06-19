
package DTO;



import java.util.ArrayList;
import java.util.List;
//import java.time.LocalDate;

public class ManagerWorker {
    public  final double epsi  = 0.000001;
    private  List<SalaryHistory> shList = new ArrayList<>() ;
    private List<Worker> wList = new ArrayList<>();

    public ManagerWorker() {

    }
    
    public void inputWorker(List<Worker> wList){
        String ID , name , workLocation;
        int age;
        double salary;
        
        ID = Data.DataInputer.inputStringID("Enter ID: ", "ID is Exist", 1,wList);
        name = Data.DataInputer.intputSring("Enter Name: ", "input is not allowed to be empty");
        age = Data.DataInputer.inputInt("Enter Age: ", 18, 50);
        salary = Data.DataInputer.inputDouble("Enter salary: ", "Salary must be greater than 0",epsi,Double.MAX_VALUE);
        workLocation = Data.DataInputer.intputSring("Enter Location: ", "input is not allowed to be empty");
        
        wList.add(new Worker(ID, name, age, salary, workLocation));
        System.out.println("Add Worker Succesfully!");
    }
    
    public  void addWorker(){
        int n = Data.DataInputer.inputInt("Enter Number Worker want to add: ", 0, 5);
        for (int i = 0; i < n; i++) {
            inputWorker(wList);
        }
        String choice;
        while (true) {
            choice = Data.DataInputer.inputYorN("Do you want to continue (Y/N)? ", "Y", "N");
            if (choice.equalsIgnoreCase("Y")) {
                inputWorker(wList);
            } else {
                break;
            }
        }        
    }
    
    public void updateWorker(int mode) {
        String ID;
        ID = Data.DataInputer.inputStringID("Enter ID Worker want update: ", "ID must Exist in Database not Null", 2, wList);
        //nomarl
        for (int i = 0; i < wList.size(); i++) {
            if (wList.get(i).getID().equals(ID)) {
                System.out.println("Before update");
                System.out.println(wList.get(i));
            }
        }
        double money = Data.DataInputer.inputDouble("Amount money: ", "Salary must be greater than 0", epsi, Double.MAX_VALUE);
        Worker xxx = Data.DataInputer.wExist(ID, wList);
        double update = 0;
        String Status = "";
        if (mode == 1) {
            update = xxx.getSalary() + money;
            Status = "UP";            
        } else if (mode == 2) {
            if (xxx.getSalary() > money) {
                update = xxx.getSalary() - money;
                Status = "Down";
            } else {
                update = 0;
            }
        }
        xxx.setSalary(update);
        shList.add(new SalaryHistory(xxx.getID(), xxx.getName(), xxx.getAge(), xxx.getSalary(), Status, java.time.LocalDate.now()));
        System.out.println(xxx.toString());        
    }
    
    public void getInformationUpdate(int mode){
        updateWorker(mode);
    }
    
    public  void getInformation(){
        display(shList);
    }
    
    public  void display(List list){
        //%s  | %8s | %2d  | %-7.1f | %-4s  | %-10s
        System.out.printf("%s | %8s | %2s | %-7.1s | %-4s | %-10s\n", "ID", "Name", "Age","Salary","Status","Date");
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
