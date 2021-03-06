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
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Emerson Jr.
 */
public class CadastroTeam extends javax.swing.JFrame {

    /**
     * Creates new form CadastroTeam
     *
     * @param metTeam
     * @param main
     * @param met
     */
    public CadastroTeam(Metodos_Cadastro_Time metTeam, MainWindow main, Metodos_Comum met) {
        initComponents();
        enfeite1.setVisible(false);
        enfeite2.setVisible(false);
        this.metTeam = metTeam;
        this.main = main;
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

        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buttonSave = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        buttonVoltar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        buttonRemover = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        enfeite2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        enfeite1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        labelEdit = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        labelSalvar = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        labelGrupo1 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        comboEdit = new javax.swing.JComboBox<>();
        jPanel10 = new javax.swing.JPanel();
        fieldNome = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        spinnerGrupo = new javax.swing.JSpinner();
        labelQtd = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        comboCampanha = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle(Constantes.getVersion());
        setResizable(false);

        jPanel4.setLayout(new java.awt.GridLayout(3, 1));
        jPanel4.add(jLabel14);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Cadastro de Time:");
        jPanel4.add(jLabel15);
        jPanel4.add(jLabel16);

        getContentPane().add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel6.setLayout(new java.awt.GridLayout(3, 5));
        jPanel6.add(jLabel1);

        buttonSave.setText("Salvar");
        buttonSave.setEnabled(false);
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });
        jPanel6.add(buttonSave);
        jPanel6.add(jLabel2);

        buttonVoltar.setText("Voltar");
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });
        jPanel6.add(buttonVoltar);
        jPanel6.add(jLabel3);
        jPanel6.add(jLabel4);
        jPanel6.add(jLabel5);

        buttonRemover.setText("Remover");
        buttonRemover.setEnabled(false);
        buttonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoverActionPerformed(evt);
            }
        });
        jPanel6.add(buttonRemover);
        jPanel6.add(jLabel7);
        jPanel6.add(jLabel8);
        jPanel6.add(jLabel9);
        jPanel6.add(jLabel10);
        jPanel6.add(jLabel11);
        jPanel6.add(jLabel12);
        jPanel6.add(jLabel13);

        getContentPane().add(jPanel6, java.awt.BorderLayout.PAGE_END);

        jPanel5.setLayout(new java.awt.GridLayout(1, 1));

        enfeite2.setText("ENF");
        jPanel5.add(enfeite2);

        getContentPane().add(jPanel5, java.awt.BorderLayout.LINE_END);

        jPanel7.setLayout(new java.awt.GridLayout(1, 1));

        enfeite1.setText("ENF");
        jPanel7.add(enfeite1);

        getContentPane().add(jPanel7, java.awt.BorderLayout.LINE_START);

        jPanel3.setLayout(new java.awt.GridLayout(2, 1));

        jPanel12.setLayout(new java.awt.GridLayout(3, 1, 20, 0));

        jPanel1.setLayout(new java.awt.GridLayout(1, 6));

        jPanel17.setLayout(new java.awt.GridLayout(1, 1));

        labelEdit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEdit.setText("Time");
        jPanel17.add(labelEdit);

        jPanel1.add(jPanel17);

        jPanel18.setLayout(new java.awt.GridLayout(1, 1));

        labelSalvar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSalvar.setText("Nome");
        jPanel18.add(labelSalvar);

        jPanel1.add(jPanel18);

        jPanel19.setLayout(new java.awt.GridLayout(1, 2));

        labelGrupo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGrupo1.setText("Grupo");
        jPanel19.add(labelGrupo1);

        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Qtd. Grupo");
        jPanel19.add(jLabel35);

        jPanel1.add(jPanel19);

        jPanel12.add(jPanel1);

        jPanel2.setLayout(new java.awt.GridLayout(1, 6, 20, 0));

        jPanel9.setLayout(new java.awt.GridLayout(1, 1));

        comboEdit.setEnabled(false);
        comboEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEditActionPerformed(evt);
            }
        });
        jPanel9.add(comboEdit);

        jPanel2.add(jPanel9);

        jPanel10.setLayout(new java.awt.GridLayout(1, 2, 20, 0));

        fieldNome.setEnabled(false);
        jPanel10.add(fieldNome);

        jPanel2.add(jPanel10);

        jPanel11.setLayout(new java.awt.GridLayout(1, 2));

        spinnerGrupo.setModel(new javax.swing.SpinnerListModel(new String[] {"Grupo:", "A", "B", "C", "D", "E", "F", "G", "H"}));
        spinnerGrupo.setEnabled(false);
        ChangeListener listener = new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                // System.out.println("Source: " + e.getSource());
                try {
                    if("Grupo:".equals(spinnerGrupo.getValue().toString())){
                        labelQtd.setText("0");
                        buttonSave.setEnabled(false);
                    }else{
                        labelQtd.setText(metTeam.doSpinnerLabel(met.getGrupo(spinnerGrupo.getValue().toString()), Integer.parseInt(comboCampanha.getSelectedItem().toString().split(" - ")[0])));
                        if("4".equals(labelQtd.getText())
                            &&(!spinnerGrupo.getValue().equals(comboEdit.getSelectedItem().toString().split("[)]")[0])
                                ||("SALVAR".equals(buttonSave.getText().toUpperCase())))){
                            buttonSave.setEnabled(false);
                        }else{
                            buttonSave.setEnabled(true);
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(CadastroTeam.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        spinnerGrupo.addChangeListener(listener);
        jPanel11.add(spinnerGrupo);

        labelQtd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelQtd.setText("0");
        jPanel11.add(labelQtd);

        jPanel2.add(jPanel11);

        jPanel12.add(jPanel2);

        jPanel8.setLayout(new java.awt.GridLayout(1, 0));
        jPanel8.add(jLabel37);

        jPanel12.add(jPanel8);

        jPanel3.add(jPanel12);

        jPanel13.setLayout(new java.awt.GridLayout(3, 1));

        jPanel14.setLayout(new java.awt.GridLayout(1, 1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Selecione a Campanha:");
        jPanel14.add(jLabel31);

        jPanel13.add(jPanel14);

        jPanel15.setLayout(new java.awt.GridLayout(1, 3));
        jPanel15.add(jLabel23);

        comboCampanha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCampanhaActionPerformed(evt);
            }
        });
        jPanel15.add(comboCampanha);
        jPanel15.add(jLabel24);

        jPanel13.add(jPanel15);

        jPanel16.setLayout(new java.awt.GridLayout(1, 1));
        jPanel16.add(jLabel30);

        jPanel13.add(jPanel16);

        jPanel3.add(jPanel13);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Deseja Realmente sair?", Constantes.getVersion(), JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            Limpa();
            this.setVisible(false);
            main.setVisible(true);
        }
    }//GEN-LAST:event_buttonVoltarActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        try {
            if ("Editar".equals(buttonSave.getText())) {
                aux = metTeam.updateTeam(fieldNome.getText(),
                        Constantes.getAux_string()[comboEdit.getSelectedIndex() - 1],
                        met.getGrupo(spinnerGrupo.getValue().toString()),
                        comboCampanha.getSelectedItem().toString().split(" - ")[0],
                        true);
            } else {
                aux = metTeam.updateTeam(fieldNome.getText(),
                        "0",
                        met.getGrupo(spinnerGrupo.getValue().toString()),
                        comboCampanha.getSelectedItem().toString().split(" - ")[0],
                        false);
            }
            if (aux == 0) {
                slv_text = "Time existente, por favor escolha outro nome!";
            } else if ("Editar".equals(buttonSave.getText())) {
                slv_text = "Time " + fieldNome.getText().toUpperCase()
                        + ", cadastrado sobre o codigo "
                        + aux + ", editado com sucesso!";
            } else {
                slv_text = "Time " + fieldNome.getText().toUpperCase()
                        + ", cadastrado sobre o codigo "
                        + aux + " com sucesso!";
            }
            JOptionPane.showMessageDialog(this, slv_text);
            met.doComboTime(comboEdit, comboCampanha.getSelectedItem().toString().split(" - ")[0]);
            if (aux != 0) {
                Limpa();
            }
//            buttonVoltar.doClick();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroTeam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void comboCampanhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCampanhaActionPerformed
        try {
            if (comboCampanha.getSelectedIndex() == 0) {
                spinnerGrupo.setEnabled(false);
                fieldNome.setEnabled(false);
                buttonSave.setEnabled(false);
                comboEdit.setEnabled(false);
            } else {
                comboEdit.setSelectedIndex(0);
                if ("Editar".equals(buttonSave.getText())) {
                    met.doComboTime(comboEdit, comboCampanha.getSelectedItem().toString().split(" - ")[0]);
                    comboEdit.setEnabled(true);
                } else {
                    spinnerGrupo.setEnabled(true);
                    fieldNome.setEnabled(true);
                    fieldNome.setText("");
                    comboEdit.setEnabled(false);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadastroTeam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_comboCampanhaActionPerformed

    private void comboEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEditActionPerformed
        if (comboEdit.getSelectedIndex() != 0) {
            aux2 = comboEdit.getSelectedItem().toString().split("[)]");
            fieldNome.setText(aux2[1]);
            fieldNome.setEnabled(true);
            spinnerGrupo.setValue(aux2[0]);
            spinnerGrupo.setEnabled(true);
            buttonSave.setEnabled(true);
            buttonRemover.setEnabled(true);
        } else {
            fieldNome.setText("");
            spinnerGrupo.setValue("Grupo:");
            spinnerGrupo.setEnabled(false);
            fieldNome.setEnabled(false);
            buttonSave.setEnabled(false);
            buttonRemover.setEnabled(false);
        }
    }//GEN-LAST:event_comboEditActionPerformed

    private void buttonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoverActionPerformed
  JOptionPane.showMessageDialog(this, "nao implementado!");
    }//GEN-LAST:event_buttonRemoverActionPerformed
    private final Metodos_Comum met;
    private final MainWindow main;
    private final Metodos_Cadastro_Time metTeam;
    private int aux;
    String slv_text;
    private String[] aux2;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonRemover;
    private javax.swing.JButton buttonSave;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JComboBox<String> comboCampanha;
    private javax.swing.JComboBox<String> comboEdit;
    private javax.swing.JLabel enfeite1;
    private javax.swing.JLabel enfeite2;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel labelEdit;
    private javax.swing.JLabel labelGrupo1;
    private javax.swing.JLabel labelQtd;
    private javax.swing.JLabel labelSalvar;
    private javax.swing.JSpinner spinnerGrupo;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JComboBox<String> getComboCampanha() {
        return comboCampanha;
    }

    public javax.swing.JButton getButtonSave() {
        return buttonSave;
    }

    private void Limpa() {
        spinnerGrupo.setEnabled(false);
        spinnerGrupo.setValue("Grupo:");
        comboEdit.setSelectedIndex(0);
        comboCampanha.setSelectedIndex(0);
        comboCampanhaActionPerformed(null);
    }

    public javax.swing.JComboBox<String> getComboEdit() {
        return comboEdit;
    }

    public javax.swing.JLabel getLabelEdit() {
        return labelEdit;
    }

    public javax.swing.JButton getButtonRemover() {
        return buttonRemover;
    }
}
