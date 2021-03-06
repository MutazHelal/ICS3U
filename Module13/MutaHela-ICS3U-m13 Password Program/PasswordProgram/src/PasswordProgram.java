/*
  *Created by M.Helal
  *On October 15
  *to create a simple password program
 */

public class PasswordProgram extends javax.swing.JFrame {

    /**
     * Creates new form PasswordProgram
     */
    public PasswordProgram() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLbael = new javax.swing.JLabel();
        enterNameLabel = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        outputLabel = new javax.swing.JLabel();
        passInput = new javax.swing.JTextField();
        enterPassLabel1 = new javax.swing.JLabel();
        generatePasswordButton = new javax.swing.JButton();
        enterPassLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLbael.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        titleLbael.setForeground(new java.awt.Color(0, 102, 0));
        titleLbael.setText("Password Program");

        enterNameLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        enterNameLabel.setText("Enter a username:");

        nameInput.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        outputLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        outputLabel.setForeground(new java.awt.Color(204, 0, 0));

        passInput.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        enterPassLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        enterPassLabel1.setText("(at least 8 characters)");

        generatePasswordButton.setText("Generate Password");
        generatePasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatePasswordButtonActionPerformed(evt);
            }
        });

        enterPassLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        enterPassLabel2.setText("Enter a password:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(outputLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleLbael)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enterNameLabel)
                                .addGap(18, 18, 18)
                                .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(enterPassLabel1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(generatePasswordButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(enterPassLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(passInput, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 42, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLbael)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterNameLabel)
                    .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterPassLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enterPassLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generatePasswordButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generatePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatePasswordButtonActionPerformed
        //intialize variables
        String name = (nameInput.getText());
        String pass = (passInput.getText());

        //output formatted username and password to user
        if (pass.length() < 8) {
            outputLabel.setText("Password must be atleast 8 characters.");
        } else {
            int randomNum = (int) Math.ceil(Math.random() * 100);
            outputLabel.setText("Username: " + name.toLowerCase()
                    + "  Password: " + pass.toLowerCase() + randomNum);
        }
    }//GEN-LAST:event_generatePasswordButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PasswordProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PasswordProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PasswordProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PasswordProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PasswordProgram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterNameLabel;
    private javax.swing.JLabel enterPassLabel1;
    private javax.swing.JLabel enterPassLabel2;
    private javax.swing.JButton generatePasswordButton;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel outputLabel;
    private javax.swing.JTextField passInput;
    private javax.swing.JLabel titleLbael;
    // End of variables declaration//GEN-END:variables
}
