
package project_b;

import javax.swing.JOptionPane;

public class BL
{
    private void testmethod()
    {
        JOptionPane.showMessageDialog
            (null, "This is a test program I am not responible for bad password combinations/damages resulting from my software.");
    }
    
    private void startUI()
    {
        GUI gui = new GUI();
        gui.setLocationRelativeTo(null);
        gui.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        BL pb = new BL();
        pb.testmethod();
        pb.startUI();
    }
    
}
