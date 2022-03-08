/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bolao_copa;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Emerson Jr.
 */
public class CadastroCampanha extends javax.swing.JFrame {

    /**
     * Creates new form CadastroCampanha
     *
     * @param main
     * @param metCadCamp
     * @param met
     */
    public CadastroCampanha(MainWindow main, Metodos_Cadastro_Campanha metCadCamp, Metodos_Comum met) {
        this.cancel = true;
        initComponents();
        this.main = main;
        enfeite1.setVisible(false);
        enfeite2.setVisible(false);
        this.metCadCamp = metCadCamp;
        this.met = met;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        radioEdit = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        comboCampanha = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        radioNovo = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        fieldId = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        fieldCampanha = new javax.swing.JTextField();
        checkAtivo = new javax.swing.JCheckBox();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        buttonSave = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        buttonVoltar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        enfeite1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        enfeite2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle(Constantes.getVersion());
        setPreferredSize(new java.awt.Dimension(682, 485));
        setResizable(false);

        jPanel5.setLayout(new java.awt.GridLayout(2, 1));

        jPanel1.setLayout(new java.awt.GridLayout(2, 1));

        buttonGroup.add(radioEdit);
        radioEdit.setText("Editar");
        radioEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioEditActionPerformed(evt);
            }
        });
        jPanel1.add(radioEdit);

        jPanel4.setLayout(new java.awt.GridLayout(3, 1));
        jPanel4.add(jLabel20);

        comboCampanha.setEnabled(false);
        comboCampanha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCampanhaActionPerformed(evt);
            }
        });
        jPanel4.add(comboCampanha);
        jPanel4.add(jLabel22);

        jPanel1.add(jPanel4);

        jPanel5.add(jPanel1);

        jPanel3.setLayout(new java.awt.GridLayout(2, 1));

        buttonGroup.add(radioNovo);
        radioNovo.setSelected(true);
        radioNovo.setText("Novo");
        radioNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNovoActionPerformed(evt);
            }
        });
        jPanel3.add(radioNovo);

        jPanel2.setLayout(new java.awt.GridLayout(3, 3, 20, 0));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("ID");
        jPanel2.add(jLabel17);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Campanha");
        jPanel2.add(jLabel18);
        jPanel2.add(jLabel19);

        jPanel10.setLayout(new java.awt.GridLayout(1, 0));
        jPanel10.add(jLabel25);

        fieldId.setEditable(false);
        fieldId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldId.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        fieldId.setFocusable(false);
        jPanel10.add(fieldId);
        jPanel10.add(jLabel26);

        jPanel2.add(jPanel10);
        jPanel2.add(fieldCampanha);

        checkAtivo.setSelected(true);
        checkAtivo.setText("Ativo");
        checkAtivo.setEnabled(false);
        checkAtivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(checkAtivo);
        jPanel2.add(jLabel21);
        jPanel2.add(jLabel23);
        jPanel2.add(jLabel24);

        jPanel3.add(jPanel2);

        jPanel5.add(jPanel3);

        getContentPane().add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel6.setLayout(new java.awt.GridLayout(3, 1));
        jPanel6.add(jLabel14);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Cadastro de Campanha:");
        jPanel6.add(jLabel15);
        jPanel6.add(jLabel16);

        getContentPane().add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel7.setLayout(new java.awt.GridLayout(3, 5));
        jPanel7.add(jLabel1);
        jPanel7.add(jLabel2);
        jPanel7.add(jLabel3);
        jPanel7.add(jLabel4);
        jPanel7.add(jLabel5);
        jPanel7.add(jLabel6);

        buttonSave.setText("Salvar");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });
        jPanel7.add(buttonSave);
        jPanel7.add(jLabel7);

        buttonVoltar.setText("Voltar");
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });
        jPanel7.add(buttonVoltar);
        jPanel7.add(jLabel8);
        jPanel7.add(jLabel9);
        jPanel7.add(jLabel10);
        jPanel7.add(jLabel11);
        jPanel7.add(jLabel12);
        jPanel7.add(jLabel13);

        getContentPane().add(jPanel7, java.awt.BorderLayout.PAGE_END);

        jPanel8.setLayout(new java.awt.GridLayout(1, 1));

        enfeite1.setText("ENF");
        jPanel8.add(enfeite1);

        getContentPane().add(jPanel8, java.awt.BorderLayout.LINE_START);

        jPanel9.setLayout(new java.awt.GridLayout(1, 1));

        enfeite2.setText("ENF");
        jPanel9.add(enfeite2);

        getContentPane().add(jPanel9, java.awt.BorderLayout.LINE_END);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        try {
            int aux_campanha;
            if (radioEdit.isSelected()) {
                aux_campanha = metCadCamp.doCampanha(fieldCampanha.getText().toUpperCase(),
                        checkAtivo.isSelected(),
                        fieldId.getText());
            } else {
                aux_campanha = metCadCamp.doCampanha(fieldCampanha.getText().toUpperCase(),
                        checkAtivo.isSelected(),
                        "0");
            }
            if (aux_campanha == 0) {
                aux_text = "Campanha ja existente, escolha outro nome!";
            } else if (radioEdit.isSelected()) {
                aux_text = "Campanha " + fieldCampanha.getText().toUpperCase()
                        + ", referene ao código " + aux_campanha
                        + " editada com sucesso!";
            } else {
                aux_text = "Campanha " + fieldCampanha.getText().toUpperCase()
                        + ", criada com o código " + aux_campanha
                        + "!";
            }
            JOptionPane.showMessageDialog(this, aux_text);
            if (aux_campanha != 0) {
                Limpa();
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadastroCampanha.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Deseja Realmente sair?", Constantes.getVersion(), JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            main.setVisible(true);
        }
        Limpa();
    }//GEN-LAST:event_buttonVoltarActionPerformed

    private void radioEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioEditActionPerformed
        fieldCampanha.setEnabled(false);
        checkAtivo.setEnabled(false);
        comboCampanha.setEnabled(true);
        fieldCampanha.setText("");
        fieldId.setText("");
        buttonSave.setEnabled(false);
    }//GEN-LAST:event_radioEditActionPerformed

    private void radioNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNovoActionPerformed
        comboCampanha.setSelectedIndex(0);
        fieldCampanha.setEnabled(true);
        checkAtivo.setEnabled(true);
        comboCampanha.setEnabled(false);
        buttonSave.setEnabled(true);
        checkAtivo.setEnabled(false);
        checkAtivo.setSelected(true);
        fieldCampanha.setText("");
        fieldId.setText("");
    }//GEN-LAST:event_radioNovoActionPerformed

    private void comboCampanhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCampanhaActionPerformed
        if (comboCampanha.getSelectedIndex() != 0) {
            fieldCampanha.setEnabled(true);
            checkAtivo.setEnabled(true);
            aux = comboCampanha.getSelectedItem().toString().split(" - ");
            fieldCampanha.setText(aux[1]);
            fieldId.setText(aux[0]);
            if ("1".equals(Constantes.getAux_string()[comboCampanha.getSelectedIndex() - 1])) {
                checkAtivo.setSelected(true);
            } else {
                checkAtivo.setSelected(false);
            }
            buttonSave.setEnabled(true);
        } else {
            fieldCampanha.setEnabled(false);
            checkAtivo.setEnabled(false);
            fieldCampanha.setText("");
            fieldId.setText("");
            buttonSave.setEnabled(false);
        }
    }//GEN-LAST:event_comboCampanhaActionPerformed
    private final MainWindow main;
    private String[] aux;
    private final Metodos_Cadastro_Campanha metCadCamp;
    private String aux_text;
    private final Metodos_Comum met;
    private boolean cancel;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton buttonSave;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JCheckBox checkAtivo;
    private javax.swing.JComboBox<String> comboCampanha;
    private javax.swing.JLabel enfeite1;
    private javax.swing.JLabel enfeite2;
    private javax.swing.JTextField fieldCampanha;
    private javax.swing.JTextField fieldId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton radioEdit;
    private javax.swing.JRadioButton radioNovo;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JComboBox<String> getComboCampanha() {
        return comboCampanha;
    }

    public void Limpa() {
        try {
            fieldCampanha.setText("");
            fieldId.setText("");
            comboCampanha.setSelectedIndex(0);
            //radioNovo.setSelected(true);
            radioNovo.doClick();
            met.doComboCampanha(comboCampanha, 0);
        } catch (SQLException ex) {
            Logger.getLogger(CadastroCampanha.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}