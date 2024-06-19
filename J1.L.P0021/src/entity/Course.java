
package entity;


public enum Course {
    Java , C_Cpp, Net;

    @Override
    public String toString() {
       switch(this){
           case Java:
               return "Java";
           case C_Cpp:
               return "C/C++";
           case Net:
               return ".Net";
            default:
                throw new UnsupportedOperationException();
       }     
    }
        
}
