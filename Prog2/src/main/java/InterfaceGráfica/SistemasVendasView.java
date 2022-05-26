/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InterfaceGráfica;

import com.mycompany.prog2.Categoria;
import com.mycompany.prog2.Produto;
import java.util.ArrayList;

/**
 *
 * @author João
 */
public class SistemasVendasView extends javax.swing.JFrame {

    private ArrayList<Categoria> categorias;
    private ArrayList<Produto> produtos;
    
    public SistemasVendasView() {
        this.categorias = new ArrayList<Categoria>();
        this.produtos = new ArrayList<Produto>();
        initComponents();
    }
    
    public ArrayList<Categoria> getCategorias(){
        return this.categorias;
    }
    
    public ArrayList<Produto> getProdutos(){
        return this.produtos;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mbSistemaVendas = new javax.swing.JMenuBar();
        mnCadastro = new javax.swing.JMenu();
        miCadastroCategoria = new javax.swing.JMenuItem();
        miCadastroProduto = new javax.swing.JMenuItem();
        mnRelatorios = new javax.swing.JMenu();
        miRelatorioCategoria = new javax.swing.JMenuItem();
        miRelatorioProduto = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Vendas");

        mnCadastro.setText("Cadastros");

        miCadastroCategoria.setText("Categoria");
        miCadastroCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastroCategoriaActionPerformed(evt);
            }
        });
        mnCadastro.add(miCadastroCategoria);

        miCadastroProduto.setText("Produto");
        miCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastroProdutoActionPerformed(evt);
            }
        });
        mnCadastro.add(miCadastroProduto);

        mbSistemaVendas.add(mnCadastro);

        mnRelatorios.setText("Relatórios");

        miRelatorioCategoria.setText("Categorias");
        miRelatorioCategoria.setToolTipText("");
        miRelatorioCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRelatorioCategoriaActionPerformed(evt);
            }
        });
        mnRelatorios.add(miRelatorioCategoria);

        miRelatorioProduto.setText("Produtos");
        miRelatorioProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRelatorioProdutoActionPerformed(evt);
            }
        });
        mnRelatorios.add(miRelatorioProduto);

        mbSistemaVendas.add(mnRelatorios);

        setJMenuBar(mbSistemaVendas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miCadastroCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastroCategoriaActionPerformed
        //Criar objeto da view q será exibida
        CadastroCategoriaView cadCategoriaView = new CadastroCategoriaView(this);
        //exibir a view
        cadCategoriaView.setVisible(true);
    }//GEN-LAST:event_miCadastroCategoriaActionPerformed

    private void miCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastroProdutoActionPerformed
        CadastroProdutoView cadProdutoView = new CadastroProdutoView(this);
        cadProdutoView.setVisible(true);
    }//GEN-LAST:event_miCadastroProdutoActionPerformed

    private void miRelatorioCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRelatorioCategoriaActionPerformed
        RelatorioCategoriaView relCategoriaView = new RelatorioCategoriaView(this);
        relCategoriaView.setVisible(true);
    }//GEN-LAST:event_miRelatorioCategoriaActionPerformed

    private void miRelatorioProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRelatorioProdutoActionPerformed
        RelatorioProdutoView relProdutoView = new RelatorioProdutoView(this);
        relProdutoView.setVisible(true);
    }//GEN-LAST:event_miRelatorioProdutoActionPerformed


            
            
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
            java.util.logging.Logger.getLogger(SistemasVendasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemasVendasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemasVendasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemasVendasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemasVendasView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar mbSistemaVendas;
    private javax.swing.JMenuItem miCadastroCategoria;
    private javax.swing.JMenuItem miCadastroProduto;
    private javax.swing.JMenuItem miRelatorioCategoria;
    private javax.swing.JMenuItem miRelatorioProduto;
    private javax.swing.JMenu mnCadastro;
    private javax.swing.JMenu mnRelatorios;
    // End of variables declaration//GEN-END:variables
}
