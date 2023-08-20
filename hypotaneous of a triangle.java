import java.util.Scanner;
class hypotaneous {
    public static void main(String[] args) {
        double x;
        double y;
        double z;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the length of the side x :");
        x=scanner.nextDouble();
        System.out.println("Enter the length of the side y :");
        y=scanner.nextDouble();
        z=Math.sqrt( (x*x)+(y*y));
        System.out.println("The hypotenuse is : "+z);
        scanner.close();


    }
    
}
