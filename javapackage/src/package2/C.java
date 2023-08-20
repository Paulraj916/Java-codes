package package2;
import package1.*;
//*******************************************
//public: visible in all classes in all packages
//protected: visible to all classes in the same package or classes in other packages that are a subclass
//default: visible to all classes in the same package 
//private: visible only in the same class
//*******************************************

public class C {
    public    String publicMessage = "This is public";
    protected String protectedMessage = "This is protected ";
              String defaultMessage ="This is the default";
    private   String privateMessage ="This is the private";
}
