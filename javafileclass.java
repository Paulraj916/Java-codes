import java.io.File;

public class javafileclass {

 public static void main(String[] args) {
  
  // file = An abstract representation of file and directory pathnames
  
  //File file = new File("secret_message.txt");
  File file = new File("C:/Users/ADMIN/OneDrive/Desktop/secret_message.txt");

  if(file.exists()) {
   System.out.println("That file exists! :O!");
   System.out.println(file.getPath());
   System.out.println(file.getAbsolutePath());
   System.out.println(file.isFile());
   //file.delete();  //To delete
  }
  else {
   System.out.println("That file doesn't exist :(");
  }  
 }
}
