/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

// -> Pacote

package com.mycompany.calc;

/**
 * -> Autor do Projeto
 * @author Vent
 */

// -> Declarando a classe da interface, definindo sua visibilidade e importando o JFrame

public class Calc extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    
// - > Método construtor
    
    public Calc() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numb1 = new javax.swing.JLabel();
        num2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        soma = new javax.swing.JRadioButton();
        sub = new javax.swing.JRadioButton();
        multiplicacao = new javax.swing.JRadioButton();
        div = new javax.swing.JRadioButton();
        rest = new javax.swing.JRadioButton();
        res = new javax.swing.JLabel();
        result = new javax.swing.JTextField();
        calcButton = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        numb1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        numb1.setText("N1");

        num2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        num2.setText("N2");

        soma.setText("Soma (+)");

        sub.setText("Subtração (-)");

        multiplicacao.setText("Multiplicação (*)");

        div.setText("Divisão (/)");

        rest.setText("Resto (%)");

        res.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        res.setText("Resultado:");

        calcButton.setText("Calcular");
        calcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButtonActionPerformed(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        titulo.setText("Calculadora");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(num2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(multiplicacao)
                            .addComponent(sub)
                            .addComponent(soma)
                            .addComponent(div)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rest)
                                    .addGap(168, 168, 168)
                                    .addComponent(calcButton))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(res)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(numb1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numb1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num2))
                .addGap(18, 18, 18)
                .addComponent(soma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sub)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(multiplicacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(div)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calcButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rest))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(res)
                    .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

// -> Método para ação do botão "Calcular"
    
    private void calcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcButtonActionPerformed
        
// -> Declarando varáveis

        String nb1, nb2;
        Double num1, numb2;
        
// -> Puxando os valores digitados do TextField
        
        nb1 = t1.getText();
        nb2 = t2.getText();
        
// -> Atribuindo os valores das strings

        num1 = Double.parseDouble(nb1);
        numb2 = Double.parseDouble(nb2);
       
// -> Método para função dos RadioButtons que definem a operação
        
        if(soma.isSelected() == true) {
            double re = num1 + numb2;
            String mRe = String.valueOf(re);
            result.setText(mRe);
            }
        
                else 
                    if(sub.isSelected() == true) {
                        double re = num1 - numb2;
                        String mRe = String.valueOf(re);
                        result.setText(mRe);
                }

                        else 
                            if(multiplicacao.isSelected() == true) {
                                double re = num1 * numb2;
                                String mRe = String.valueOf(re);
                                result.setText(mRe);
                            }

                                else 
                                    if(div.isSelected() == true) {
                                        double re = num1 / numb2;
                                        String mRe = String.valueOf(re);
                                        result.setText(mRe);
                                    }

                                        else 
                                            if(rest.isSelected() == true) {
                                                double re = num1 / numb2;
                                                double re2 = num1 % numb2;
                                                String mRe = String.valueOf(re2);
                                                result.setText(mRe);
                                            }

    }//GEN-LAST:event_calcButtonActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Calc().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton calcButton;
    public javax.swing.JRadioButton div;
    public javax.swing.JRadioButton multiplicacao;
    public javax.swing.JLabel num2;
    public javax.swing.JLabel numb1;
    public javax.swing.JLabel res;
    public javax.swing.JRadioButton rest;
    public javax.swing.JTextField result;
    public javax.swing.JRadioButton soma;
    public javax.swing.JRadioButton sub;
    public javax.swing.JTextField t1;
    public javax.swing.JTextField t2;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
