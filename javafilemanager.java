import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class javafilemanager {
    public static void main(String[] args) {
        System.out.println("Enter the text");
        Scanner scanner = new Scanner(System.in);
        String a=scanner.nextLine();
        
        try {
            FileWriter writer = new FileWriter("javafilemanagertext.txt");
            writer.write(a);
            writer.append("\n THE END");
            writer.close();
        } catch (IOException e) {
            //TODO: handle exception
            e.printStackTrace();
        }

        scanner.close();
    }
}
 