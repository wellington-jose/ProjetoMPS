package View;

import Business.Control.ControlImpl;
import Business.Control.ControlPagamento;
import Business.Control.FabricaControlInt;
import Business.Control.Vendas;
import Business.Control.VendasMemento;
import Business.Model.FabricaModelInt;
import Business.Model.Modelos;
import Business.Model.Produto;
import Business.Model.VendaSingleton;
import Business.Model.VendaIndividual;
import Business.Model.Venda_Produtos;
import Infra.Pagamento.CartaoHipercard;
import Infra.Pagamento.CartaoTipo;
import Infra.Pagamento.CartaoVisa;
import Infra.Pagamento.FormasPagamento;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wellington
 */
public class Venda_ProdutoForm extends javax.swing.JFrame {

    /**
     * Creates new form Aquisicao2
     */
    private FabricaControlInt control;
    private FabricaModelInt control2;
    private final String idFunc;
    private final String nomeFunc;
    private String idNotaFiscal;
    private float valorTotal, valorTotal1;
    private final ArrayList<Venda_Produtos> pc;
    private final DefaultTableModel model;
    private ArrayList<Produto> lista;
    private final String data = "11-12-2017";
    private final String cliente = "Cliente A";
    private VendaSingleton venda;
    private final Vendas vendaMemento;

    public Venda_ProdutoForm(String id, String func) {
        initComponents();
        control = new ControlImpl();
        control2 = new Modelos();
        vendaMemento = new Vendas();
        this.idFunc = id;
        this.nomeFunc = func;
        this.maiuscula();
        this.valorTotal = valorTotal1 = 0;

        //        this.listarTodosProdutos(); // para preencher a lista de produtos
        lista = new ArrayList<>();
        this.simulacao();

        // criando uma tabela com 4 colunas e 0 linhas
        model = (DefaultTableModel) jTable1.getModel();
        model.setNumRows(0);
        model.setColumnCount(4);
        pc = new ArrayList<>();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2produto = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jLabelvalorUnitario = new javax.swing.JLabel();
        jComboBoxListar = new javax.swing.JComboBox();
        jLabelQuantidade = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JButton();
        jlabel10 = new javax.swing.JLabel();
        jLabel2Codigo = new javax.swing.JLabel();
        jTextFieldcodigo = new javax.swing.JTextField();
        jLabelvalorTotal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonIncluir = new javax.swing.JButton();
        jTextFieldProduto = new javax.swing.JTextField();
        jTextFieldValorUnitario = new javax.swing.JTextField();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelvalorTotal1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonEmitirNotaFiscal = new javax.swing.JButton();
        jComboBoxFormaPagamento = new javax.swing.JComboBox<>();
        jButtonDesfazer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Nota Fiscal Venda");

        jLabel2produto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2produto.setText("Produto");

        jLabelData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelData.setText("Data de Aquisição");

        jLabelvalorUnitario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelvalorUnitario.setText("Valor Unitário");

        jComboBoxListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxListarActionPerformed(evt);
            }
        });

        jLabelQuantidade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelQuantidade.setText("Quantidade");

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jlabel10.setText("Compras");

        jLabel2Codigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2Codigo.setText("Código");

        jLabelvalorTotal.setText("0.00");

        jLabel2.setText("Valor Total:  R$ ");

        jButtonIncluir.setText("Incluir");
        jButtonIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Produto", "Vlr", "Q", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(30);
        }

        jLabelvalorTotal1.setText("0.00");

        jLabel3.setText("Com Desconto:  R$ ");

        jButtonEmitirNotaFiscal.setText("Emitir NF");
        jButtonEmitirNotaFiscal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmitirNotaFiscalActionPerformed(evt);
            }
        });

        jComboBoxFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 - Dinheiro", "2 - Cheque", "3 - Cartão de Débito", "4 - Cartão de Crédito", "5 - Boleto" }));
        jComboBoxFormaPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFormaPagamentoActionPerformed(evt);
            }
        });

        jButtonDesfazer.setText("Desfazer");
        jButtonDesfazer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDesfazerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonDesfazer)
                                .addGap(34, 34, 34)
                                .addComponent(jButtonIncluir))
                            .addComponent(jLabelData, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelQuantidade)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelvalorUnitario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2produto)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2Codigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxListar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jlabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButtonSair, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelvalorTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonEmitirNotaFiscal)
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelvalorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addComponent(jlabel10)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2Codigo)
                            .addComponent(jComboBoxListar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2produto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabelvalorUnitario)
                                .addGap(17, 17, 17)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelQuantidade))
                        .addGap(97, 97, 97)
                        .addComponent(jLabelData))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabelvalorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonIncluir)
                            .addComponent(jButtonDesfazer))
                        .addGap(2, 2, 2)
                        .addComponent(jComboBoxFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabelvalorTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButtonEmitirNotaFiscal)
                .addGap(14, 14, 14)
                .addComponent(jButtonSair))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jComboBoxListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxListarActionPerformed
        this.incluirNomeProdutoNoJText();
    }//GEN-LAST:event_jComboBoxListarActionPerformed

    private void jButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirActionPerformed
        this.incluirProduto();
    }//GEN-LAST:event_jButtonIncluirActionPerformed

    private void jButtonEmitirNotaFiscalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmitirNotaFiscalActionPerformed
        try {
            // salvar venda
            control.criarControlVenda().salvarDados(venda);
            // salvando os produtos incluídos na Nota Fiscal
            for (Venda_Produtos p : pc) {
                control.criarControlVenda_Produtos().salvarDados(p);
            }
            JOptionPane.showMessageDialog(null, "Nota Fiscal salva com sucesso.");
            this.dispose();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no acesso ao Banco de Dados.");
        }
    }//GEN-LAST:event_jButtonEmitirNotaFiscalActionPerformed

    private void jComboBoxFormaPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFormaPagamentoActionPerformed
        int forma = jComboBoxFormaPagamento.getSelectedIndex();
        CartaoTipo t1;
        valorTotal = Float.parseFloat(jLabelvalorTotal.getText());
        venda = new VendaSingleton(data, cliente, valorTotal, idFunc);
        idNotaFiscal = String.valueOf(venda.getIdNotaFiscal());
        ControlPagamento pagamento = control.criarControlPagamento();

        switch (forma) {
            case 0:
                pagamento.efetuarPagamento(FormasPagamento.dinheiro, venda);
                break;
            case 1:
                pagamento.efetuarPagamento(FormasPagamento.cheque, venda);
                break;
            case 2:
                pagamento.tipoCartao(new CartaoHipercard());
                pagamento.efetuarPagamento(FormasPagamento.credito, venda);

                break;
            case 3:
                pagamento.tipoCartao(new CartaoVisa());
                pagamento.efetuarPagamento(FormasPagamento.debito, venda);

                break;
            case 4:
                pagamento.efetuarPagamento(FormasPagamento.boleto, venda);
                break;
        }

        jLabelvalorTotal1.setText(String.valueOf(venda.getValor()));
    }//GEN-LAST:event_jComboBoxFormaPagamentoActionPerformed

    private void jButtonDesfazerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDesfazerActionPerformed
        int linha = model.getRowCount() - 1;
        if (linha >= 0) {
            vendaMemento.desfazerVenda();
            model.removeRow(linha);
        }
    }//GEN-LAST:event_jButtonDesfazerActionPerformed

    private void incluirProduto() {
        // capturando os dados do Produto
        String idProduto = jTextFieldcodigo.getText();
        String produto = jTextFieldProduto.getText();
        String vlrUni = jTextFieldValorUnitario.getText();
        float valorUnitario = Float.parseFloat(vlrUni);
        int quantidade = Integer.parseInt(jTextFieldQuantidade.getText());

        // criando um objeto
        VendaIndividual vi = new VendaIndividual(produto, valorUnitario, quantidade);
        vendaMemento.set(vi);
        this.atualizarListaCompras(vi);
        // atualizando o valor total de todos os produtos incluídos
        valorTotal += (valorUnitario * quantidade);
        jLabelvalorTotal.setText(String.valueOf(valorTotal));
        // incluindo um produto no ArrayList para salvar depois
        pc.add(new Venda_Produtos(idNotaFiscal, idProduto, valorUnitario, quantidade));
        // consultando se tem mais produtos a serem incluídos na Nota Fiscal

        int volta = JOptionPane.showConfirmDialog(null, "Deseja incluir mais produtos? ",
                "Incluir", JOptionPane.YES_NO_CANCEL_OPTION);
        // SIM == 0;  NAO == 1;  CANCELAR == 2
        if (volta == 0) {
            this.limpar();
        } else {

        }
    }

    private void atualizarListaCompras(VendaIndividual v) {

        Object[] objeto = {v.getProd(), v.getVlrUnit(), v.getQuant(), v.getVlrtotal()};
        // adicionando esse objeto a tabela, sempre acrescentando uma linha.
        model.addRow(objeto);
    }

    private void listarTodosProdutos() {
        try {
            lista = control.criarControlProduto().listarTodos();
            int item = 1;
            for (Produto p : lista) {
                jComboBoxListar.addItem(item++ + " - " + p.getNome());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no acesso ao Banco de Dados.");
        }
    }

    private void simulacao() {
        lista.add(control2.criarProduto("001", "Papel", 12.0f));
        lista.add(control2.criarProduto("002", "Banner", 14.50f));
        lista.add(control2.criarProduto("003", "Adesivo", 2.20f));
        lista.add(control2.criarProduto("004", "Placa", 18.00f));

        int item = 1;
        for (Produto p : lista) {
            jComboBoxListar.addItem(item++ + " - " + p.getNome());
        }
    }

    private void incluirNomeProdutoNoJText() {
        int item = jComboBoxListar.getSelectedIndex();
        jTextFieldcodigo.setText(lista.get(item).getId());
        jTextFieldProduto.setText(lista.get(item).getNome());
        jTextFieldValorUnitario.setText(String.valueOf(lista.get(item).getPreco()));
        jTextFieldcodigo.disable();
        jTextFieldProduto.disable();
        jTextFieldValorUnitario.disable();
    }

    private void idNotaFiscalVenda() {
        try {
            idNotaFiscal = String.valueOf(control.criarControlVenda_Produtos().listarUltimoRegistro()); // capturando a última nota fiscal emitida
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no acesso ao Banco de Dados.");
        }
    }

    public void limpar() {
        String vazio = "";
        jTextFieldcodigo.setText(vazio);
        jTextFieldProduto.setText(vazio);
        jTextFieldQuantidade.setText(vazio);
        jTextFieldValorUnitario.setText(vazio);
    }

    private void maiuscula() {
        jTextFieldProduto.setDocument(new Maiuscula());
        jTextFieldQuantidade.setDocument(new Maiuscula());
        jTextFieldValorUnitario.setDocument(new Maiuscula());
    }

//    public static void main(String args[]) {
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Venda_ProdutoForm("111", "Carlos").setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDesfazer;
    private javax.swing.JButton jButtonEmitirNotaFiscal;
    private javax.swing.JButton jButtonIncluir;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JComboBox<String> jComboBoxFormaPagamento;
    private javax.swing.JComboBox jComboBoxListar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2Codigo;
    private javax.swing.JLabel jLabel2produto;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelQuantidade;
    private javax.swing.JLabel jLabelvalorTotal;
    private javax.swing.JLabel jLabelvalorTotal1;
    private javax.swing.JLabel jLabelvalorUnitario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldProduto;
    private javax.swing.JTextField jTextFieldQuantidade;
    private javax.swing.JTextField jTextFieldValorUnitario;
    private javax.swing.JTextField jTextFieldcodigo;
    private javax.swing.JLabel jlabel10;
    // End of variables declaration//GEN-END:variables

}
