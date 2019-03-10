
package pkg2_tema_4b;


public class frmPrincipal extends javax.swing.JFrame {

    public frmPrincipal() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        PuntoFijo = new javax.swing.JMenuItem();
        Newton = new javax.swing.JMenuItem();
        Secante = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Metodos ");

        jMenuItem1.setText("Biseccion");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        PuntoFijo.setText("Punto fijo");
        PuntoFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PuntoFijoActionPerformed(evt);
            }
        });
        jMenu1.add(PuntoFijo);

        Newton.setText("Newton");
        Newton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewtonActionPerformed(evt);
            }
        });
        jMenu1.add(Newton);

        Secante.setText("Secante");
        Secante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecanteActionPerformed(evt);
            }
        });
        jMenu1.add(Secante);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
        dlgBiseccion biseccion = new dlgBiseccion(this,true);
        
        biseccion.setLocationRelativeTo(this);
        
        biseccion.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void PuntoFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PuntoFijoActionPerformed
        // TODO add your handling code here:
        dlgPuntoFijo PuntoFijo = new dlgPuntoFijo(this,true);
        
        PuntoFijo.setLocationRelativeTo(this);
        
        PuntoFijo.setVisible(true);
    }//GEN-LAST:event_PuntoFijoActionPerformed

    private void NewtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewtonActionPerformed
        // TODO add your handling code here:
        dlgNewton Newton = new dlgNewton(this,true);
        
        Newton.setLocationRelativeTo(this);
        
        Newton.setVisible(true);
    }//GEN-LAST:event_NewtonActionPerformed

    private void SecanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecanteActionPerformed
        // TODO add your handling code here:
        dlgSecante Secante = new dlgSecante(this,true);
        
        Secante.setLocationRelativeTo(this);
        
        Secante.setVisible(true);
    }//GEN-LAST:event_SecanteActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Newton;
    private javax.swing.JMenuItem PuntoFijo;
    private javax.swing.JMenuItem Secante;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}