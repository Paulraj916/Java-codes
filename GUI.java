import javax.swing.JOptionPane;
public class GUI {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name ");
        JOptionPane.showMessageDialog(null,"hello "+name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age "));
        JOptionPane.showMessageDialog(null,"your age is "+age);
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height "));
        JOptionPane.showMessageDialog(null,"your height  is "+height);
        JOptionPane.showConfirmDialog(null, "YOUR PHONE IS ON RISK ", "WARNING",1 );
        float height1 = Float.parseFloat(JOptionPane.showInputDialog("Enter your height1 "));
        System.out.println(height1);
    }
}
