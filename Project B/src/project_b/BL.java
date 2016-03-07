
package project_b;

import javax.swing.JOptionPane;

public class BL
{
    private void testmethod()
    {
        JOptionPane.showMessageDialog
            (null, "I am not responible for bad\npassword combinations/damages\nresulting from my software.");
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
