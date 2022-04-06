
import java.awt.*;

/*
  *Created by M.Helal
  *On October 3
  *to create a mock random number generator
 */
public class RandomNumbers extends javax.swing.JFrame {

    /**
     * Creates new form RandomNumbers
     */
    public RandomNumbers() {
        initComponents();
        getContentPane().setBackground(Color.lightGray);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        fromLabel = new javax.swing.JLabel();
        minInput = new javax.swing.JTextField();
        toLabel = new javax.swing.JLabel();
        maxInput = new javax.swing.JTextField();
        generateButton = new javax.swing.JButton();
        outputLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleLabel.setText("Generate my Random Number");

        fromLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fromLabel.setText("From");

        minInput.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        minInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minInputActionPerformed(evt);
            }
        });

        toLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        toLabel.setText("to");

        maxInput.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        maxInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxInputActionPerformed(evt);
            }
        });

        generateButton.setText("Generate");
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        outputLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(outputLabel)
                    .addComponent(titleLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fromLabel)
                        .addGap(18, 18, 18)
                        .addComponent(minInput, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(toLabel)
                        .addGap(18, 18, 18)
                        .addComponent(maxInput, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(generateButton)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fromLabel)
                        .addComponent(minInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(toLabel)
                        .addComponent(maxInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(generateButton))
                .addGap(18, 18, 18)
                .addComponent(outputLabel)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minInputActionPerformed

    private void maxInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maxInputActionPerformed

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        // initialize variables
        int min = Integer.parseInt(minInput.getText());
        int max = Integer.parseInt(maxInput.getText());

        // generate random number from inputs
        int randomNumber = (int) Math.floor(Math.random() * (max - min + 1)
                + min);

        // output random number to the user
        outputLabel.setText("Your random number from " + min + " to " + max
                + " inclusive, is: " + randomNumber);
    }//GEN-LAST:event_generateButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RandomNumbers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RandomNumbers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RandomNumbers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RandomNumbers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RandomNumbers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fromLabel;
    private javax.swing.JButton generateButton;
    private javax.swing.JTextField maxInput;
    private javax.swing.JTextField minInput;
    private javax.swing.JLabel outputLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel toLabel;
    // End of variables declaration//GEN-END:variables
}