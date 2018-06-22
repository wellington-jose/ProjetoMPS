package View;

import Business.Control.ControlFuncionario;
import Business.Model.Administrador;
import Business.Model.Cliente;
import Business.Model.Funcionario;
import Business.Model.Gerente;
import Business.Model.Modelos;
import Business.Model.PessoaJuridica;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author wellington
 */
public class ModelosForm_Cadastrar extends javax.swing.JFrame {

    /**
     * Creates new form ModelosForm_Cadastrar
     */
    private String cpf, nome, dataNascimento, endereco, telefone, email,
            facebook, dataAdmissao, responsavel, setor;
    private float salario;
    private Modelos mod;
    private int item, itemSelecionado;
    private ControlFuncionario controlFun;

    public ModelosForm_Cadastrar() {
        initComponents();
        mod = new Modelos();
        controlFun = new ControlFuncionario();
        item = itemSelecionado = 0;

        this.visualizarJLabel(false);
        cpf = nome = dataNascimento = endereco = telefone = email = null;
        facebook = dataAdmissao = responsavel = setor = null;
        salario = 0.0f;
        this.limpar();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCadatrar = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelDataNascimento = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxListarModelos = new javax.swing.JComboBox<>();
        jLabelVariavel = new javax.swing.JLabel();
        jLabelDataAdmissao = new javax.swing.JLabel();
        jLabelSetor = new javax.swing.JLabel();
        jTextFieldCPF = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldDataNascimento = new javax.swing.JTextField();
        jTextFieldEndereco = new javax.swing.JTextField();
        jTextFieldTelefone = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldVariavel = new javax.swing.JTextField();
        jTextFieldDataAdmissão = new javax.swing.JTextField();
        jTextFieldSetor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonDesfazer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelCadatrar.setText("Cadastrar");

        jLabelCPF.setText("CPF:");

        jLabel3.setText("Nome:");

        jLabelDataNascimento.setText("Data Nascimento:");

        jLabel5.setText("Endereço:");

        jLabel6.setText("Telefone:");

        jLabel7.setText("Email:");

        jComboBoxListarModelos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 - Cliente", "2 - Distribuidor", "3 - Funcionário", "4 - Gerente", "5 - Administrador" }));
        jComboBoxListarModelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxListarModelosActionPerformed(evt);
            }
        });

        jLabelVariavel.setText("Facebook:");

        jLabelDataAdmissao.setText("Data Admissão:");

        jLabelSetor.setText("Setor:");

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonDesfazer.setText("Desfazer");
        jButtonDesfazer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDesfazerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButtonDesfazer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalvar)
                        .addGap(116, 116, 116)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBoxListarModelos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelCadatrar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelSetor)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFieldSetor))
                                .addComponent(jTextFieldVariavel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabelVariavel)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextFieldEndereco)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabelDataNascimento)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextFieldDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabelCPF)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(36, 36, 36)
                                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelDataAdmissao)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextFieldDataAdmissão))))
                        .addGap(0, 78, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxListarModelos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCadatrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCPF)
                    .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDataNascimento)
                    .addComponent(jTextFieldDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelVariavel)
                    .addComponent(jTextFieldVariavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataAdmissao)
                    .addComponent(jTextFieldDataAdmissão, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSetor))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonDesfazer))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxListarModelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxListarModelosActionPerformed
        this.limpar();
        this.modificarJLabel();
    }//GEN-LAST:event_jComboBoxListarModelosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        switch (itemSelecionado) {
            case 0: {
                // salvar cliente
                this.cadastrarCliente();
                Cliente c = mod.criarCliente(cpf, nome, dataNascimento, endereco, telefone, email, facebook);
                JOptionPane.showMessageDialog(this, "Salvou cliente");
                break;
            }
            case 1: {
                // salvar Distribuidor
                this.cadastrarDistribuidor();
                PessoaJuridica pj = mod.criarPessoaJuridica(cpf, nome, responsavel, endereco,
                        telefone, email);
                JOptionPane.showMessageDialog(this, "Salvou Distribuido");
                break;
            }
            case 2: {
                // salvar Funcionário
                this.cadastrarFuncionario();
                Funcionario func = mod.criarFuncionario(cpf, nome, dataNascimento, endereco,
                        telefone, email, salario, dataAdmissao, setor);
                try {
                    controlFun.salvarDados(func);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Erro de conexão com o Banco de Dados");
                }
                JOptionPane.showMessageDialog(this, "Salvou Funcionario");
                break;
            }
            case 3: {
                // salvar Gerente
                this.cadastrarFuncionario();
                Gerente ger = mod.criarGerente(cpf, nome, dataNascimento, endereco,
                        telefone, email, salario, dataAdmissao, setor);
                JOptionPane.showMessageDialog(this, "Salvou Gerente");
                break;
            }
            case 4: {
                // salvar Administrador
                this.cadastrarFuncionario();
                Administrador adm = mod.criarAdministrador(cpf, nome, dataNascimento, endereco,
                        telefone, email, salario, dataAdmissao, setor);
                JOptionPane.showMessageDialog(this, "Salvou administrador");
                break;
            }
        }

        jComboBoxListarModelos.setSelectedIndex(0);
        this.limpar();

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonDesfazerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDesfazerActionPerformed

    }//GEN-LAST:event_jButtonDesfazerActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ModelosForm_Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ModelosForm_Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ModelosForm_Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ModelosForm_Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ModelosForm_Cadastrar().setVisible(true);
//            }
//        });
//    }

    private void cadastrarPessoa() {
        cpf = jTextFieldCPF.getText();
        nome = jTextFieldNome.getText();
        dataNascimento = jTextFieldDataNascimento.getText();
        endereco = jTextFieldEndereco.getText();
        telefone = jTextFieldTelefone.getText();
        email = jTextFieldEmail.getText();
    }

    private void cadastrarCliente() {
        this.cadastrarPessoa();
        facebook = jTextFieldVariavel.getText();
    }

    private void cadastrarDistribuidor() {
        this.cadastrarPessoa();
        responsavel = jTextFieldVariavel.getText();
    }

    private void cadastrarFuncionario() {
        this.cadastrarPessoa();
        salario = Float.parseFloat(jTextFieldVariavel.getText());
        dataAdmissao = jTextFieldDataAdmissão.getText();
        setor = jTextFieldSetor.getText();
    }

    private void visualizarJLabel(boolean v) {
        jLabelVariavel.setVisible(v);
        jLabelDataAdmissao.setVisible(v);
        jLabelSetor.setVisible(v);

        jTextFieldVariavel.setVisible(v);
        jTextFieldDataAdmissão.setVisible(v);
        jTextFieldSetor.setVisible(v);
    }

    private void modificarJLabel() {
        itemSelecionado = jComboBoxListarModelos.getSelectedIndex();

        switch (itemSelecionado) {
            case 0: {
                this.visualizarJLabel(false);
                jLabelCadatrar.setText("Cadastrar Cliente");
                jLabelCPF.setText("CPF");
                jLabelVariavel.setVisible(true);
                jLabelVariavel.setText("Facebook:");
                jTextFieldVariavel.setVisible(true);
                break;
            }
            case 1: {
                this.visualizarJLabel(false);
                jLabelCadatrar.setText("Cadastrar Distribuidor");
                jLabelDataNascimento.setVisible(false);
                jTextFieldDataNascimento.setVisible(false);
                jLabelCPF.setText("CNPJ");
                jLabelVariavel.setVisible(true);
                jLabelVariavel.setText("Responável:");
                jTextFieldVariavel.setVisible(true);
                break;
            }
            case 2: {
                this.visualizarJLabel(true);
                jLabelCadatrar.setText("Cadastrar Funcionário");
                jLabelCPF.setText("CPF");
                jLabelVariavel.setText("Salário:");
                jTextFieldVariavel.setText("0");
                break;
            }
            case 3: {
                this.visualizarJLabel(true);
                jLabelCadatrar.setText("Cadastrar Gerente");
                jLabelCPF.setText("CPF");
                jLabelVariavel.setText("Salário:");
                jTextFieldVariavel.setText("0");
                break;
            }
            case 4: {
                this.visualizarJLabel(true);
                jLabelCadatrar.setText("Cadastrar Administrador");
                jLabelCPF.setText("CPF");
                jLabelVariavel.setText("Salário:");
                jTextFieldVariavel.setText("0");
                break;
            }
        }
    }

    private void limpar() {
        String vazio = "";
        jTextFieldCPF.setText(vazio);
        jTextFieldNome.setText(vazio);
        jTextFieldDataNascimento.setText(vazio);
        jTextFieldEndereco.setText(vazio);
        jTextFieldTelefone.setText(vazio);
        jTextFieldEmail.setText(vazio);
        jTextFieldVariavel.setText(vazio);
        jTextFieldDataAdmissão.setText(vazio);
        jTextFieldSetor.setText(vazio);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonDesfazer;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxListarModelos;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCadatrar;
    private javax.swing.JLabel jLabelDataAdmissao;
    private javax.swing.JLabel jLabelDataNascimento;
    private javax.swing.JLabel jLabelSetor;
    private javax.swing.JLabel jLabelVariavel;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldDataAdmissão;
    private javax.swing.JTextField jTextFieldDataNascimento;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldSetor;
    private javax.swing.JTextField jTextFieldTelefone;
    private javax.swing.JTextField jTextFieldVariavel;
    // End of variables declaration//GEN-END:variables
}
