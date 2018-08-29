import javax.swing.*;

public class Main {
    public static void main(String [] boom){
//        String input = JOptionPane.showInputDialog("ใส่ตัวเลข 1 ตัว", "0");
  //      JOptionPane.showMessageDialog( null,  "message","title",JOptionPane.ERROR_MESSAGE);
       int ans = JOptionPane.showConfirmDialog(null,"LOVE ME?", "Ask ",JOptionPane.YES_NO_OPTION);
        if(ans == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"I LOVE U 2.");
        }else{
            JOptionPane.showMessageDialog(null,"OK I LEAVE.");
        }
    }

}
