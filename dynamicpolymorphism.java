import java.util.Scanner;
public class dynamicpolymorphism {

    public static void main(String[] args) {
  
        //Dynamic Polymorphism
        
        Scanner scanner = new Scanner(System.in);
        Animal2 animal;
        
        System.out.println("What animal do you want?"); 
        System.out.print("(1=dog) or (2=cat): ");
        int choice = scanner.nextInt();
        
        if(choice==1) {
         animal = new Dog2();
         animal.speak();
        }
        else if(choice==2) {
         animal = new Cat();
         animal.speak();
        }
        else {
         animal = new Animal2();
         System.out.println("That choice was invalid");
         animal.speak();
        }
       }
}