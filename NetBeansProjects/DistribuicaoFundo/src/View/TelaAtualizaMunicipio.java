/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import dao.MunicipioDAO;
import distribuicaofundo.model.Municipio;
import javax.swing.JOptionPane;

/**
 *
 * @author marcos
 */
public class TelaAtualizaMunicipio extends javax.swing.JFrame {

    /**
     * Creates new form TelaAtualizaMunicipio
     */
    public TelaAtualizaMunicipio() {
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        nome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cnpj = new javax.swing.JTextField();
        respFinanceiro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        telefone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        whatsapp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nro_eleitores = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bancofefc = new javax.swing.JTextField();
        contafefc = new javax.swing.JTextField();
        agenciafefc = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        bancoMulheres = new javax.swing.JTextField();
        contaMulheres = new javax.swing.JTextField();
        agenciaMulheres = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        bancoDoacoes = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        contaDoacoes = new javax.swing.JTextField();
        agenciaDoacoes = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nome");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("CNPJ");

        jLabel3.setText("Responsável Financeiro");

        jLabel4.setText("E-mail");

        jLabel5.setText("Telefone");

        jLabel6.setText("whatsapp");

        jLabel7.setText("Nro Eleitores");

        jLabel8.setText("Banco FEFC");

        jLabel9.setText("Conta FEFC");

        jLabel10.setText("Agência FEFC");

        jLabel11.setText("Banco Mulheres");

        jLabel12.setText("Conta Mulheres");

        jLabel13.setText("Agência Mulheres");

        jButton2.setText("Atualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel14.setText("Banco Doações");

        jLabel15.setText("Conta Doações");

        jLabel16.setText("Agência Doações");

        jLayeredPane1.setLayer(nome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cnpj, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(respFinanceiro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(email, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(telefone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(whatsapp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(nro_eleitores, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(bancofefc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(contafefc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(agenciafefc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(bancoMulheres, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(contaMulheres, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(agenciaMulheres, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(bancoDoacoes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(contaDoacoes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(agenciaDoacoes, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(59, 59, 59))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(bancoMulheres, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                    .addComponent(telefone, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cnpj, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bancofefc, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(52, 52, 52)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(whatsapp)
                                    .addComponent(respFinanceiro)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contafefc)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(contaMulheres)
                                    .addComponent(jLabel15)
                                    .addComponent(contaDoacoes, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)))
                            .addComponent(jLabel14)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(279, 279, 279)
                                .addComponent(jButton2))
                            .addComponent(bancoDoacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10)
                            .addComponent(email)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nro_eleitores)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agenciafefc)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(agenciaMulheres)
                            .addComponent(jLabel16)
                            .addComponent(agenciaDoacoes))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(respFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(whatsapp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nro_eleitores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bancofefc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contafefc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agenciafefc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bancoMulheres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contaMulheres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agenciaMulheres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bancoDoacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contaDoacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agenciaDoacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jButton2)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String nomeMun = nome.getText();
        
        MunicipioDAO munid = new MunicipioDAO();
        
        Municipio muni = null;
        
        try{
        muni = munid.getMunicipio(nomeMun);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "O nome do município foi digitado incorretamente!");
            return;
        }
      
        if(muni == null){
        JOptionPane.showMessageDialog(null, "O nome do município foi digitado incorretamente!");
            return;
    }
        
        cnpj.setText(muni.getCnpj());
        respFinanceiro.setText(muni.getResponsavel());
        email.setText(muni.getEmail());
        telefone.setText(muni.getTelefone());
        whatsapp.setText(muni.getWhatsapp());
        nro_eleitores.setText(muni.getNro_eleitores());
        bancofefc.setText(muni.getBanco());
        contafefc.setText(muni.getConta());
        agenciafefc.setText(muni.getAgencia());
        bancoMulheres.setText(muni.getBancoMulheres());
        contaMulheres.setText(muni.getContaMulheres());
        agenciaMulheres.setText(muni.getAgenciaMulheres());
        bancoDoacoes.setText(muni.getBancoDoacoes());
        contaDoacoes.setText(muni.getContaDoacoes());
        agenciaDoacoes.setText(muni.getAgenciaDoacoes());
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        try{
        
        Municipio municipio = new Municipio(
                  nome.getText().trim(),
                  cnpj.getText().trim(),
                  nro_eleitores.getText().trim(),
                  respFinanceiro.getText().trim(),
                  email.getText().trim(),
                  telefone.getText().trim(),
                  whatsapp.getText().trim(),
                  bancofefc.getText().trim(),
                  agenciafefc.getText().trim(),
                  contafefc.getText().trim(),
                  bancoMulheres.getText().trim(),        
                  agenciaMulheres.getText().trim(),
                  contaMulheres.getText().trim(),
                  bancoDoacoes.getText().trim(),
                  agenciaDoacoes.getText().trim(),
                  contaDoacoes.getText().trim());
        
        MunicipioDAO mdao = new MunicipioDAO();
        mdao.update(municipio);
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Falha ao atualizar município");
            return;
        }
        
        nome.setText("");
        cnpj.setText("");
        respFinanceiro.setText("");
        email.setText("");
        telefone.setText("");
        whatsapp.setText("");
        nro_eleitores.setText("");
        bancofefc.setText("");
        contafefc.setText("");
        agenciafefc.setText("");
        bancoMulheres.setText("");
        contaMulheres.setText("");
        agenciaMulheres.setText("");
        bancoDoacoes.setText("");
        contaDoacoes.setText("");
        agenciaDoacoes.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAtualizaMunicipio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizaMunicipio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizaMunicipio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizaMunicipio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAtualizaMunicipio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField agenciaDoacoes;
    private javax.swing.JTextField agenciaMulheres;
    private javax.swing.JTextField agenciafefc;
    private javax.swing.JTextField bancoDoacoes;
    private javax.swing.JTextField bancoMulheres;
    private javax.swing.JTextField bancofefc;
    private javax.swing.JTextField cnpj;
    private javax.swing.JTextField contaDoacoes;
    private javax.swing.JTextField contaMulheres;
    private javax.swing.JTextField contafefc;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField nro_eleitores;
    private javax.swing.JTextField respFinanceiro;
    private javax.swing.JTextField telefone;
    private javax.swing.JTextField whatsapp;
    // End of variables declaration//GEN-END:variables
}