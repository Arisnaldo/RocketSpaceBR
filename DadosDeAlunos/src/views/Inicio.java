/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author Rocket Space
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
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

        jToggleButton1 = new javax.swing.JToggleButton();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        rSButtonRiple1 = new rojeru_san.RSButtonRiple();
        rSButtonRiple2 = new rojeru_san.RSButtonRiple();
        jLabel1 = new javax.swing.JLabel();
        rSButtonRiple3 = new rojeru_san.RSButtonRiple();
        rSButtonRiple4 = new rojeru_san.RSButtonRiple();
        jLabel2 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");

        kGradientPanel1.setkEndColor(new java.awt.Color(153, 255, 0));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 51, 0));

        rSButtonRiple1.setBackground(new java.awt.Color(0, 102, 0));
        rSButtonRiple1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/iconfinder_user-add_216490.png"))); // NOI18N
        rSButtonRiple1.setText("Cadastrar Aluno");
        rSButtonRiple1.setColorHover(new java.awt.Color(51, 51, 51));
        rSButtonRiple1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        rSButtonRiple2.setBackground(new java.awt.Color(0, 102, 0));
        rSButtonRiple2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/iconfinder_11_Search_106236.png"))); // NOI18N
        rSButtonRiple2.setText("Pesquisar Aluno");
        rSButtonRiple2.setColorHover(new java.awt.Color(51, 51, 51));
        rSButtonRiple2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconfinder_130-man-student-2_3099383.png"))); // NOI18N

        rSButtonRiple3.setBackground(new java.awt.Color(0, 102, 0));
        rSButtonRiple3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/iconfinder_icons_exit_1564505.png"))); // NOI18N
        rSButtonRiple3.setText("Sair");
        rSButtonRiple3.setColorHover(new java.awt.Color(51, 51, 51));
        rSButtonRiple3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        rSButtonRiple4.setBackground(new java.awt.Color(0, 102, 0));
        rSButtonRiple4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/iconfinder_refresh_134221.png"))); // NOI18N
        rSButtonRiple4.setText("Alterar Dados");
        rSButtonRiple4.setColorHover(new java.awt.Color(51, 51, 51));
        rSButtonRiple4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconfinder_Moon_1715799.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rSButtonRiple1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(rSButtonRiple4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rSButtonRiple2, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(rSButtonRiple3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSButtonRiple1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonRiple2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSButtonRiple3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonRiple4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton jToggleButton1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private rojeru_san.RSButtonRiple rSButtonRiple1;
    private rojeru_san.RSButtonRiple rSButtonRiple2;
    private rojeru_san.RSButtonRiple rSButtonRiple3;
    private rojeru_san.RSButtonRiple rSButtonRiple4;
    // End of variables declaration//GEN-END:variables
}
