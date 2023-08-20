public class objectoreintedprogrammin_oop {
    public static void main(String[] args) {
        //object = an instance of a class tghat may contains attributes and methods 
        //example :(phone ,desk ,computer,coffee cup )
        car mycar1 =new car();
        car mycar2 =new car();
        System.out.println(mycar1.model);
        System.out.println(mycar1.make);

        System.out.println();

        System.out.println(mycar2.model);
        System.out.println(mycar2.make);

        mycar1.drive();
        mycar1.brake();
    }
}
