
package project_b;

import java.awt.Color;
import javax.swing.UIManager;

public class GUI extends javax.swing.JFrame 
{
    private String text;
    private int amount;
    
    public GUI() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pbOutput = new javax.swing.JProgressBar();
        pfInput = new javax.swing.JPasswordField();
        lbOutput = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Password Strength Test");
        setResizable(false);

        pbOutput.setFocusable(false);

        pfInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                onInput(evt);
            }
        });

        lbOutput.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jMenu1.setText("Credits");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onCredits(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pbOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                    .addComponent(pfInput)
                    .addComponent(lbOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pbOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onInput(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_onInput
        text = pfInput.getText();
        
        //<editor-fold defaultstate="collapsed" desc=" Basiswert ">
        switch(text.length())
        {
            case  0: {amount = 0;  break;}
            case  1: {amount = 1;  break;}
            case  2: {amount = 2;  break;}
            case  3: {amount = 4;  break;}
            case  4: {amount = 8; break;}
            case  5: {amount = 16; break;}
            case  6: {amount = 32; break;}
            case  7: {amount = 64; break;}
            default: {amount = 65; break;}
        }
        
        if (text.length() >= 20){amount = 70;}
        if (text.length() >= 24){amount = 75;}
        if (text.length() >= 28){amount = 85;}
        if (text.length() >= 32){amount = 95;}
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc=" Boni für sehr seltene Chars (+25%) "> 
        if(text.contains("\"") == true){amount +=  25;}
        if(text.contains("§") == true){amount +=  25;}
        if(text.contains("`") == true){amount +=  25;}
        if(text.contains("´") == true){amount +=  25;}
        if(text.contains("~") == true){amount +=  25;}
        if(text.contains("}") == true){amount +=  25;}
        if(text.contains("{") == true){amount +=  25;}
        if(text.contains("[") == true){amount +=  25;}
        if(text.contains("]") == true){amount +=  25;}
        if(text.contains("²") == true){amount +=  25;}
        if(text.contains("³") == true){amount +=  25;}
        if(text.contains("^") == true){amount +=  25;}
        if(text.contains("°") == true){amount +=  25;}
        if(text.contains("€") == true){amount +=  25;}
        if(text.contains("µ") == true){amount +=  25;}
        if(text.contains("<") == true){amount +=  25;}
        if(text.contains(">") == true){amount +=  25;}
        if(text.contains("|") == true){amount +=  25;}
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc=" Boni für seltene Chars (+15%) "> 
        if(text.contains("!") == true){amount +=  15;}
        if(text.contains("$") == true){amount +=  15;}
        if(text.contains("%") == true){amount +=  15;}
        if(text.contains("&") == true){amount +=  15;}
        if(text.contains("/") == true){amount +=  15;}
        if(text.contains("(") == true){amount +=  15;}
        if(text.contains(")") == true){amount +=  15;}
        if(text.contains("=") == true){amount +=  15;}
        if(text.contains("?") == true){amount +=  15;}
        if(text.contains("+") == true){amount +=  15;}
        if(text.contains("*") == true){amount +=  15;}
        if(text.contains("'") == true){amount +=  15;}
        if(text.contains("#") == true){amount +=  15;}
        if(text.contains(",") == true){amount +=  15;}
        if(text.contains(".") == true){amount +=  15;}
        if(text.contains(";") == true){amount +=  15;}
        if(text.contains(":") == true){amount +=  15;}
        if(text.contains("-") == true){amount +=  15;}
        if(text.contains("_") == true){amount +=  15;}
        if(text.contains("@") == true){amount +=  15;}
        if(text.contains("ä") == true){amount +=  15;}
        if(text.contains("ö") == true){amount +=  15;}
        if(text.contains("ü") == true){amount +=  15;}
        if(text.contains("Ä") == true){amount +=  15;}
        if(text.contains("Ö") == true){amount +=  15;}
        if(text.contains("Ü") == true){amount +=  15;}
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc=" Boni für Zahlen (+5%) "> 
        if(text.contains("0") == true){amount +=  5;}
        if(text.contains("9") == true){amount +=  5;}
        if(text.contains("8") == true){amount +=  5;}
        if(text.contains("7") == true){amount +=  5;}
        if(text.contains("6") == true){amount +=  5;}
        if(text.contains("5") == true){amount +=  5;}
        if(text.contains("4") == true){amount +=  5;}
        if(text.contains("3") == true){amount +=  5;}
        if(text.contains("2") == true){amount +=  5;}
        if(text.contains("1") == true){amount +=  5;}
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc=" Minus für schlechte Kombis "> 
        if((
                  (text.contains("123") == true)
                ||(text.contains("321") == true)
                ||(text.contains("987") == true)
                ||(text.contains("789") == true)
                ||(text.contains("abc") == true)
                ||(text.contains("ABC") == true)
                ||(text.contains("asdf") == true)
                ||(text.contains("ASDF") == true)
                ||(text.contains("1337") == true)
                )&&(text.length() < 12))
        {amount -=  40;}
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc=" Über und unter 100%, Farbausgabe "> 
        if(amount < 0){amount = 0;}
        if(amount > 100)
        {
           amount = 100;
           lbOutput.setText("Password strengh: " + amount + "%+"); 
        }
        else
        {
           lbOutput.setText("Password strengh: " + amount + "%"); 
        }
        
        if(amount < 85)
        {
            pbOutput.setBackground(Color.red);
        }
        if(amount > 85)
        {
            pbOutput.setBackground(Color.yellow);
        }
        if(amount >= 95)
        {
            pbOutput.setBackground(Color.green);
        }
        //</editor-fold>
        
        pbOutput.setValue(amount);
        
    }//GEN-LAST:event_onInput

    private void onCredits(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onCredits
        Credits credits = new Credits(this, true);
        credits.setLocationRelativeTo(null);
        credits.setVisible(true);
    }//GEN-LAST:event_onCredits

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbOutput;
    private javax.swing.JProgressBar pbOutput;
    private javax.swing.JPasswordField pfInput;
    // End of variables declaration//GEN-END:variables
}
