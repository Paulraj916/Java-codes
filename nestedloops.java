import java.util.Scanner;
class nestedloops { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows;
        int column;
        String symbol ="";
        System.out.println("Enter the no.of rows you want : ");
        rows =scanner.nextInt();
        System.out.println("Enter the no.of column you want :");
        column =scanner.nextInt();
        System.out.println("Enter the symbol you want : ");
        symbol =scanner.next();
        for(int i=1;i<=rows;i++){
            System.out.println();
            for(int j=1;j<=column;j++){
                System.out.print(symbol);
            }
        }


    }
    
}
