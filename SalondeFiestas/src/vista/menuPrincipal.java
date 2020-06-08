package vista;

public class menuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public menuPrincipal() {
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

        addClient = new javax.swing.JButton();
        reserve = new javax.swing.JButton();
        queue = new javax.swing.JButton();
        adduser = new javax.swing.JButton();
        exitOnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        addClient.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addClient.setText("Agregar cliente");
        addClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClientActionPerformed(evt);
            }
        });

        reserve.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        reserve.setText("Hacer una reservación");
        reserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveActionPerformed(evt);
            }
        });

        queue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        queue.setText("Ver reservaciones");
        queue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queueActionPerformed(evt);
            }
        });

        adduser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        adduser.setText("Agregar usuario");
        adduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adduserActionPerformed(evt);
            }
        });

        exitOnClose.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        exitOnClose.setText("Salir");
        exitOnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitOnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(addClient)
                    .addComponent(reserve)
                    .addComponent(queue)
                    .addComponent(adduser)
                    .addComponent(exitOnClose))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(addClient)
                .addGap(23, 23, 23)
                .addComponent(reserve)
                .addGap(23, 23, 23)
                .addComponent(queue)
                .addGap(23, 23, 23)
                .addComponent(adduser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(exitOnClose)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClientActionPerformed
        agregarCliente second = new agregarCliente();
        second.setVisible(true);
        setVisible(false);   
    }//GEN-LAST:event_addClientActionPerformed

    private void adduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adduserActionPerformed
        agregarUsuario second = new agregarUsuario();
        second.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_adduserActionPerformed

    private void reserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserveActionPerformed
        Reservaciones second = new Reservaciones();
        second.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_reserveActionPerformed

    private void exitOnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitOnCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitOnCloseActionPerformed

    private void queueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queueActionPerformed
        verReservaciones second = new verReservaciones();
        second.setVisible(true);
        setVisible(false);   
    }//GEN-LAST:event_queueActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addClient;
    private javax.swing.JButton adduser;
    private javax.swing.JButton exitOnClose;
    private javax.swing.JButton queue;
    private javax.swing.JButton reserve;
    // End of variables declaration//GEN-END:variables
}