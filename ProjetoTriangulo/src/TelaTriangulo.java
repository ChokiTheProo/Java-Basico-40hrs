/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Roger Varela
 */
public class TelaTriangulo extends javax.swing.JFrame {

    /**
     * Creates new form TelaTriangulo
     */
    public TelaTriangulo() {
        initComponents();
        panResposta.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sliB = new javax.swing.JSlider();
        sliC = new javax.swing.JSlider();
        sliA = new javax.swing.JSlider();
        lblA = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();
        lblC = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnVerificar = new javax.swing.JButton();
        panResposta = new java.awt.Panel();
        lblTipo = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Segmento A");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 24, -1, -1));

        jLabel2.setText("Segmento B");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 64, -1, -1));

        jLabel3.setText("Segmento C");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 112, -1, -1));

        sliB.setMaximum(20);
        sliB.setValue(0);
        sliB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliBStateChanged(evt);
            }
        });
        getContentPane().add(sliB, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 63, -1, -1));

        sliC.setMaximum(20);
        sliC.setValue(0);
        sliC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliCStateChanged(evt);
            }
        });
        getContentPane().add(sliC, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 111, -1, -1));

        sliA.setMaximum(20);
        sliA.setValue(0);
        sliA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliAStateChanged(evt);
            }
        });
        getContentPane().add(sliA, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 23, -1, -1));

        lblA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblA.setText("0");
        getContentPane().add(lblA, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 23, -1, -1));

        lblB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblB.setText("0");
        getContentPane().add(lblB, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 61, 17, -1));

        lblC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblC.setText("0");
        getContentPane().add(lblC, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 109, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/triangulo-escaleno-1.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 330, -1));

        btnVerificar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 176, -1, -1));

        lblTipo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblTipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipo.setText("Tipo de triangulo");
        lblTipo.setVerifyInputWhenFocusTarget(false);

        lblStatus.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatus.setText("Forma ou nao");
        lblStatus.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout panRespostaLayout = new javax.swing.GroupLayout(panResposta);
        panResposta.setLayout(panRespostaLayout);
        panRespostaLayout.setHorizontalGroup(
            panRespostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panRespostaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );
        panRespostaLayout.setVerticalGroup(
            panRespostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panRespostaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(panResposta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 490, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
     panResposta.setVisible(true);
     int a = sliA.getValue();
     int b = sliB.getValue();
     int c = sliC.getValue();
     if(a<b+c && b<a+c && c<a+b){
         lblStatus.setText("Formam um triangulo");
         if (a==b && b==c){
             lblTipo.setText("equilatero");
         }else if
                 (a!=b && b!=c && a!=c){
             lblTipo.setText("Esqualeno");
         
         }else{
             lblTipo.setText("Isoceles");
         }
     }else{
         lblStatus.setText("Não formam um trinagulo");
         lblTipo.setText("--");
         
     }
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void sliAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliAStateChanged
       lblA.setText(Integer.toString(sliA.getValue()));
        
    }//GEN-LAST:event_sliAStateChanged

    private void sliBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliBStateChanged

lblB.setText(Integer.toString(sliB.getValue()));        // TODO add your handling code here:
    }//GEN-LAST:event_sliBStateChanged

    private void sliCStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliCStateChanged

lblC.setText(Integer.toString(sliC.getValue()));        // TODO add your handling code here:
    }//GEN-LAST:event_sliCStateChanged

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
            java.util.logging.Logger.getLogger(TelaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTriangulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTipo;
    private java.awt.Panel panResposta;
    private javax.swing.JSlider sliA;
    private javax.swing.JSlider sliB;
    private javax.swing.JSlider sliC;
    // End of variables declaration//GEN-END:variables
}