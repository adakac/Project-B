
package project_b;

import javax.swing.JOptionPane;

public class ProjectB
{
    private void testmethod()
    {
        JOptionPane.showMessageDialog(null, "Test Example");
    }
    
    public static void main(String[] args)
    {
        ProjectB pb = new ProjectB();
        pb.testmethod();
        System.exit(1);
    }
    
}
