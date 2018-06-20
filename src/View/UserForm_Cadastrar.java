package View;

/**
 *
 * @authors Wellington José
 * 
 * Renilton Ribeiro
 */
import Business.Model.Modelos;
import Business.Model.Usuario;
import Infra.BD.UsuarioBDAdapter;
import Infra.InfraAdapter;
import Util.Exception.NomeInvalidoException;
import Util.Exception.SenhaInvalidaException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UserForm_Cadastrar extends javax.swing.JFrame {

    /**
     * Creates new form UserForm_Acessar
     */
    private String cpf;
    Modelos mod;
    InfraAdapter infraadapte;

    public UserForm_Cadastrar() {
        initComponents();
        mod = new Modelos();
        senhaTextField.setText("");
        loginTextField.setText("");
        cpf = "";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelLogin = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        loginTextField = new javax.swing.JTextField();
        senhaTextField = new javax.swing.JPasswordField();
        jButtonSair = new javax.swing.JButton();
        jButtonCadastrar = new javax.swing.JButton();
        jLabelAviso = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        senhaTextField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Cadastrar Login e Senha");

        jLabelLogin.setText("Login");

        jLabel3.setText("Senha");

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonCadastrar.setText("Salvar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jLabelAviso.setText("Digite um login, uma senha, confirme e depois salve.");

        jLabel5.setText("Confirme a senha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(loginTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(senhaTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(senhaTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)))
                    .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabelAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonSair))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLogin)
                    .addComponent(loginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(senhaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(senhaTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(37, 37, 37)
                .addComponent(jButtonCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // Evento do botão "Sair".
        this.dispose(); // Fechando a janela.
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        FachadaValidarNomeSenha fvns = new FachadaValidarNomeSenha();
        try {
            // capturando os login e senha
            String login = loginTextField.getText();
            String senha = String.valueOf(senhaTextField.getPassword());
            String senhaConfirmada = String.valueOf(senhaTextField1.getPassword());

            if (senha.equals(senhaConfirmada)) {
                fvns.validarNomeSenha(login, senha);

                // Salva os dados
                this.salvarDados(login, senha);

                // reabre a tela de acessar o sistema
                UserForm_Acessar usa = new UserForm_Acessar();
                usa.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Senha não confirma com a anterior");
            }

            this.dispose();
        } catch (NomeInvalidoException ex) {
            JOptionPane.showMessageDialog(null, "Login Inválido");
            loginTextField.setText("");
            senhaTextField.setText("");
            senhaTextField1.setText("");
        } catch (SenhaInvalidaException ex) {
            JOptionPane.showMessageDialog(null, "Senha Inválida");
            loginTextField.setText("");
            senhaTextField.setText("");
            senhaTextField1.setText("");
        }
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void salvarDados(String login, String senha) {
        // criando um novo usuario e salvando via adaptador no local apropriado
        Usuario us = mod.criarUsuario(cpf, login, senha);
        infraadapte = new UsuarioBDAdapter();

        try {
            infraadapte.salvarDados(us);
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Falha na conexão com o Banco de Dados.");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelAviso;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField loginTextField;
    private javax.swing.JPasswordField senhaTextField;
    private javax.swing.JPasswordField senhaTextField1;
    // End of variables declaration//GEN-END:variables
}
