import javax.swing.*;

public class Uppgift5_1 {
    public static void main(String[] args) {
       String s = JOptionPane.showInputDialog("Sätt ett värde på n");
       int n = Integer.parseInt(s);
       double k=1;
       double res=1;
       while (k <=n) {
           res = res/k;
           k++;
           System.out.println(res);
       }
    }
}
