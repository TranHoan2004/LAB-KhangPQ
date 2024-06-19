
package model;


public class Contact {
    private int ID;
    private String fullName;
    private String group;
    private String address;
    private String phone;

    public Contact() {
    }

    public Contact(String fullName,int ID,  String group, String address, String phone) {
        this.ID = ID;
        this.fullName = fullName;
        this.group = group;
        this.address = address;
        this.phone = phone;
     
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFirstName() {
         String[] t = fullName.split(" ");
         String res ="";
        
            res = t[0];       
        
         return res;
    }


    public String getLastName() {
    String[] t = fullName.split(" ");
         String res ="";
         for (int i = 1; i < t.length; i++) {
            res += t[i]+" ";       
        }
         return res.trim();
    }

    @Override
    public String toString() {
        return String.format("%-5d%-25s%-20s%-20s%-20s%-25s%-20s",
                    getID(), getFullName(),
                    getFirstName(), getLastName(),
                    getGroup(), getAddress(), getPhone());
    }
     
    
   
   
}
