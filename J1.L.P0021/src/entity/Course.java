
package entity;

import java.util.logging.Logger;


public enum Course {
    Java , C_Cpp, dotNet;
    private static final Logger LOG = Logger.getLogger(Course.class.getName());
    
//    @Override
    public Course getCourse(int digit) {
       switch(digit){
           case 1:
               return Java;
           case 2:
               return C_Cpp;
           case 3:
               return dotNet;
            default:
                throw new UnsupportedOperationException();
       }     
    }
        
}
