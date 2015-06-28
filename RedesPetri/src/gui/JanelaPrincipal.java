/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import principal.RedeDePetri;

public class JanelaPrincipal extends javax.swing.JFrame {

    
    private RedeDePetri redeDePetri;
    
    /**
     * Creates new form JanelaPrincipal
     */
    public JanelaPrincipal() {
        initComponents();
        redeDePetri = exemplo1();
        atualizar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTextoRede = new javax.swing.JTextArea();
        campoLugar = new javax.swing.JTextField();
        campoTransicao = new javax.swing.JTextField();
        botaoLugar = new javax.swing.JButton();
        botaoTransicao = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoOrigem = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoDestino = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campoPeso = new javax.swing.JTextField();
        botaoAresta = new javax.swing.JButton();
        botaoLimparRede = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        menuItemAbrir = new javax.swing.JMenuItem();
        menuItemSalvar = new javax.swing.JMenuItem();
        menuOpcoes = new javax.swing.JMenu();
        menuItemVizualizar = new javax.swing.JMenuItem();
        menuItemArvoreDeCobertura = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Descrição da rede de petri"));

        areaTextoRede.setEditable(false);
        areaTextoRede.setColumns(20);
        areaTextoRede.setRows(5);
        jScrollPane1.setViewportView(areaTextoRede);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                .addContainerGap())
        );

        campoLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoLugarActionPerformed(evt);
            }
        });

        botaoLugar.setText("Inserir lugar");
        botaoLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLugarActionPerformed(evt);
            }
        });

        botaoTransicao.setText("Inserir transição");
        botaoTransicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTransicaoActionPerformed(evt);
            }
        });

        jLabel2.setText("Lugar");

        jLabel3.setText("Transição");

        jLabel4.setText("Aresta de");

        jLabel5.setText("para");

        jLabel6.setText("com peso");

        botaoAresta.setText("Inserir aresta");
        botaoAresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoArestaActionPerformed(evt);
            }
        });

        botaoLimparRede.setText("Limpar rede");
        botaoLimparRede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparRedeActionPerformed(evt);
            }
        });

        menuArquivo.setText("Arquivo");

        menuItemAbrir.setText("Abrir");
        menuArquivo.add(menuItemAbrir);

        menuItemSalvar.setText("Salvar");
        menuItemSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalvarActionPerformed(evt);
            }
        });
        menuArquivo.add(menuItemSalvar);

        jMenuBar1.add(menuArquivo);

        menuOpcoes.setText("Opções");

        menuItemVizualizar.setText("Vizualizar");
        menuItemVizualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVizualizarActionPerformed(evt);
            }
        });
        menuOpcoes.add(menuItemVizualizar);

        menuItemArvoreDeCobertura.setText("Árvore de cobertura");
        menuItemArvoreDeCobertura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemArvoreDeCoberturaActionPerformed(evt);
            }
        });
        menuOpcoes.add(menuItemArvoreDeCobertura);

        jMenuBar1.add(menuOpcoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoOrigem, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                                    .addComponent(campoTransicao))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botaoTransicao, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(botaoLimparRede))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(botaoAresta))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 105, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(botaoLugar))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoTransicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoTransicao)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(botaoLimparRede)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(campoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(campoPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoAresta))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemSalvarActionPerformed

    private void campoLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoLugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoLugarActionPerformed

    private void botaoLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLugarActionPerformed
        // TODO add your handling code here:
        redeDePetri.inserirLugar(campoLugar.getText());
        atualizar();
    }//GEN-LAST:event_botaoLugarActionPerformed

    private void botaoTransicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTransicaoActionPerformed
        // TODO add your handling code here:
        redeDePetri.inserirTransicao(campoTransicao.getText());
        atualizar();
    }//GEN-LAST:event_botaoTransicaoActionPerformed

    private void botaoArestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoArestaActionPerformed
        // TODO add your handling code here:
        redeDePetri.inserirArestaQualquer(campoOrigem.getText(), campoDestino.getText(), Integer.parseInt(campoPeso.getText()));
        atualizar();
    }//GEN-LAST:event_botaoArestaActionPerformed

    private void botaoLimparRedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparRedeActionPerformed
        // TODO add your handling code here:
        limparRede();
    }//GEN-LAST:event_botaoLimparRedeActionPerformed

    private void menuItemVizualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVizualizarActionPerformed
        // TODO add your handling code here:
        DesenhoRedeDePetri desenho = new DesenhoRedeDePetri(redeDePetri, "Vizualização da rede de petri");
        desenho.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        desenho.setVisible(true);
    }//GEN-LAST:event_menuItemVizualizarActionPerformed

    private void menuItemArvoreDeCoberturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemArvoreDeCoberturaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showInputDialog(null, "Informe os valores da marcação inicial separados por espaço:", "Marcação inicial", JOptionPane.QUESTION_MESSAGE);
    }//GEN-LAST:event_menuItemArvoreDeCoberturaActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }
    
    public final RedeDePetri exemplo1() {
        RedeDePetri rede = new RedeDePetri();
        String []lugares = {"p1", "p2", "p3", "p4"};
        String []transicoes = {"t1", "t2", "t3"};
        rede.inserirLugares(lugares);
        rede.inserirTransicoes(transicoes);
        rede.inserirArestaQualquer("p1", "t1", 1);
        rede.inserirArestaQualquer("p2", "t2", 1);
        rede.inserirArestaQualquer("p2", "t3", 1);
        rede.inserirArestaQualquer("p3", "t3", 1);
        rede.inserirArestaQualquer("t1", "p2", 1);
        rede.inserirArestaQualquer("t1", "p3", 1);
        rede.inserirArestaQualquer("t2", "p1", 1);
        rede.inserirArestaQualquer("t3", "p3", 1);
        rede.inserirArestaQualquer("t3", "p4", 1);
        return rede;
    }
    
    private void atualizar() {
        campoLugar.setText("");
        campoTransicao.setText("");
        campoOrigem.setText("");
        campoDestino.setText("");
        campoPeso.setText("");
        areaTextoRede.setText(redeDePetri.toString());
    }
    
    private void limparRede() {
        redeDePetri = new RedeDePetri();
        atualizar();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTextoRede;
    private javax.swing.JButton botaoAresta;
    private javax.swing.JButton botaoLimparRede;
    private javax.swing.JButton botaoLugar;
    private javax.swing.JButton botaoTransicao;
    private javax.swing.JTextField campoDestino;
    private javax.swing.JTextField campoLugar;
    private javax.swing.JTextField campoOrigem;
    private javax.swing.JTextField campoPeso;
    private javax.swing.JTextField campoTransicao;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenuItem menuItemAbrir;
    private javax.swing.JMenuItem menuItemArvoreDeCobertura;
    private javax.swing.JMenuItem menuItemSalvar;
    private javax.swing.JMenuItem menuItemVizualizar;
    private javax.swing.JMenu menuOpcoes;
    // End of variables declaration//GEN-END:variables
}
