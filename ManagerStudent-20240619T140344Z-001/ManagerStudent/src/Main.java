
import java.util.List;


public class Main {

    
    public static void main(String[] args) {
       StudentManagement m = new StudentManagement();
       List<Student> t = m.createStudentList();
       int choice;
       while(true){
//        step 1: dislay menu
        Menu.display();
//        step 2: ask user to choose one option of above
        choice = Menu.getChoice();
//        step 3: perfrom fuction according to option
        switch(choice){
//            Option 1: import data
            case 1: m.importData(t);
                   break;
//            Option 2: Find and Sort
            case 2: m.FindAndSort(t);
                   break;
//            Option 3 : Update/Delete
            case 3: m.UpdateORDelete(t);
                    break;
//            Option 4 : Report 
            case 4: m.Report(t);
                    break;
//             Option 5 : Exit
            case 5: return;
        }
        
       }
    }
    
}
