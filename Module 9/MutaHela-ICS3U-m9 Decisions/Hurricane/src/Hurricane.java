/*
  *Created by M.Helal
  *On October 5
  *to create a mock hurricane scale application
 */

public class Hurricane extends javax.swing.JFrame {

    /**
     * Creates new form Hurricane
     */
    public Hurricane() {
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

        hurricaneScaleLabel = new javax.swing.JLabel();
        enterCategoryLabel = new javax.swing.JLabel();
        categoryInput = new javax.swing.JTextField();
        enterButton = new javax.swing.JButton();
        outputLabelCategory = new javax.swing.JLabel();
        outputLabelSpeed = new javax.swing.JLabel();
        hurricanePicture = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hurricaneScaleLabel.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        hurricaneScaleLabel.setForeground(new java.awt.Color(0, 0, 153));
        hurricaneScaleLabel.setText("Hurricane Scale");

        enterCategoryLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        enterCategoryLabel.setText("Please enter a hurricane category (1-5):");

        categoryInput.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        enterButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        enterButton.setText("Enter");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        outputLabelCategory.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        outputLabelSpeed.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        hurricanePicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hurricane.gif"))); // NOI18N
        hurricanePicture.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterCategoryLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(categoryInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(enterButton))
                    .addComponent(hurricaneScaleLabel)
                    .addComponent(outputLabelCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(outputLabelSpeed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hurricanePicture, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hurricaneScaleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterCategoryLabel)
                    .addComponent(categoryInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(outputLabelCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(outputLabelSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(hurricanePicture, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        // validate input
        try {
            int category = Integer.parseInt(categoryInput.getText());
        } catch (NumberFormatException e) {
            outputLabelCategory.setText("");
            outputLabelSpeed.setText("Please enter a valid category.");
            return;
        }
        // initialize variable
        int category = Integer.parseInt(categoryInput.getText());

        // print wind speed for category entered using switch statement
        switch (category) {
            case 1:
                outputLabelCategory.setText("Windspeeds for category 1 are:");
                outputLabelSpeed.setText("74-95 mph or 64-82 kt or "
                        + "119-153 km/hr.");
                break;
            case 2:
                outputLabelCategory.setText("Windspeeds for category 2 are:");
                outputLabelSpeed.setText("96-110 mph or 83-95 kt or "
                        + "154-177 km/hr.");
                break;
            case 3:
                outputLabelCategory.setText("Windspeeds for category 3 are:");
                outputLabelSpeed.setText("111-130 mph or 96-113 kt or "
                        + "178-209 km/hr.");
                break;
            case 4:
                outputLabelCategory.setText("Windspeeds for category 4 are:");
                outputLabelSpeed.setText("131-155 mph or 114-135 kt or "
                        + "210-249 km/hr.");
                break;
            case 5:
                outputLabelCategory.setText("Windspeeds for category 5 are:");
                outputLabelSpeed.setText("greater than 155 mph or 135kt "
                        + "or 249 km/hr.");
                break;
            default:
                outputLabelCategory.setText("");
                outputLabelSpeed.setText("Invalid category, please enter"
                        + " a category from 1 to 5.");
        }

    }//GEN-LAST:event_enterButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Hurricane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hurricane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hurricane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hurricane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hurricane().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField categoryInput;
    private javax.swing.JButton enterButton;
    private javax.swing.JLabel enterCategoryLabel;
    private javax.swing.JLabel hurricanePicture;
    private javax.swing.JLabel hurricaneScaleLabel;
    private javax.swing.JLabel outputLabelCategory;
    private javax.swing.JLabel outputLabelSpeed;
    // End of variables declaration//GEN-END:variables
}
