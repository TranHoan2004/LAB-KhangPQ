package bo;

import entity.Account;
import java.util.ArrayList;

public class AccountManager {

    private ArrayList<Account> aList;

    public AccountManager() {
        aList = new ArrayList<>();
    }

    public boolean addAccount(Account a) {
        return aList.add(a);
    }

    public boolean isSameName(Account a) {
        for (int i = 0; i < aList.size(); i++) {
            if (aList.get(i).getName().contains(a.getName())) {
                return true;
            }
        }
        return false;
    }

    private int searchAccount(String userName, String passWords) {
        for (int i = 0; i < aList.size(); i++) {
            if (aList.get(i).getUsername().equalsIgnoreCase(userName)
                    && aList.get(i).getPassword().equalsIgnoreCase(passWords)) {
                return i;
            }
        }
        return -1;
    }

    public Account getAccount(String userName, String passWords) throws Exception {
        int index = searchAccount(userName, passWords);
        if (index != -1) {
            return aList.get(index);
        }
        throw new Exception("User Not Found");
    }

    public Account changePassWord(Account a, String userName, String oldPassWord, String newPassWord, String reNewPassWord) throws Exception {
        int index = searchAccount(userName, oldPassWord);
        if(index != -1){
            
        }
        return a;
    }
}
