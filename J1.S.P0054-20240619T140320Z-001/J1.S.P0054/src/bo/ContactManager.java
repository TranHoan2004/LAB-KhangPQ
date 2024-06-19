//
//package bo;
//
//import java.util.ArrayList;
//import model.Contact;
//
//public class ContacManager {
//     private ArrayList<Contact> list;
//     private int id;
//
//    public ContacManager() {
//        list  = new ArrayList<>();
//        int id = 0;
//    }
//    
//    public ContacManager(ArrayList<Contact> list){
//        this.list = list;
//    }
//    
//    public Contact addContact(Contact c){
//        c.setID(++id);
//        list.add(c);
//        return c;
//    }
//     
//    public Contact deleteContact(int id) throws Exception{
//        int index = searchContactById(id);
//        if(index != -1 ){
//            return list.remove(index);
//        }
//        throw new Exception("Contact not found!");
//    }
//    
//    public int searchContactById(int id){
//        for (int i = 0; i < list.size(); i++) {
//           if(id == list.get(i).getID()){
//               return i;
//           }
//        }
//        return -1;
//    }
//
//    
//     
//}
