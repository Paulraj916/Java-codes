package package1;
import package2.*;
//*******************************************
//public: visible in all classes in all packages
//protected: visible to all classes in the same package or classes in other packages that are a subclass
//default: visible to all classes in the same package 
//private: visible only in the same class
//*******************************************

public class A {
    protected String protectedMessage = "This is protected ";
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c);
    }

}
