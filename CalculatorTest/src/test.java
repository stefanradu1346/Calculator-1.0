/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stefan
 */
public class test extends javax.swing.JFrame {

    int primnumar;
    int  secnumar;
    float rezultat;
    
    String operatie;
    
    public test() {
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

        jColorChooser1 = new javax.swing.JColorChooser();
        jColorChooser2 = new javax.swing.JColorChooser();
        jColorChooser3 = new javax.swing.JColorChooser();
        unu = new javax.swing.JButton();
        doi = new javax.swing.JButton();
        patru = new javax.swing.JButton();
        sapte = new javax.swing.JButton();
        trei = new javax.swing.JButton();
        cinci = new javax.swing.JButton();
        sase = new javax.swing.JButton();
        opt = new javax.swing.JButton();
        noua = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        impartit = new javax.swing.JButton();
        egal = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        inmultit = new javax.swing.JButton();
        Rezultat = new javax.swing.JTextField();
        zero = new javax.swing.JButton();

        jColorChooser2.setBackground(new java.awt.Color(255, 102, 102));
        jColorChooser2.setForeground(new java.awt.Color(255, 0, 153));
        jColorChooser2.setToolTipText("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        unu.setText("1");
        unu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unuActionPerformed(evt);
            }
        });

        doi.setText("2");
        doi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doiActionPerformed(evt);
            }
        });

        patru.setText("4");
        patru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patruActionPerformed(evt);
            }
        });

        sapte.setText("7");
        sapte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sapteActionPerformed(evt);
            }
        });

        trei.setText("3");
        trei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                treiActionPerformed(evt);
            }
        });

        cinci.setText("5");
        cinci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinciActionPerformed(evt);
            }
        });

        sase.setText("6");
        sase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saseActionPerformed(evt);
            }
        });

        opt.setText("8");
        opt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optActionPerformed(evt);
            }
        });

        noua.setText("9");
        noua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nouaActionPerformed(evt);
            }
        });

        plus.setBackground(new java.awt.Color(204, 102, 0));
        plus.setText("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(102, 102, 102));
        jButton13.setText("C");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        impartit.setBackground(new java.awt.Color(204, 102, 0));
        impartit.setForeground(new java.awt.Color(51, 51, 51));
        impartit.setText("÷");
        impartit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                impartitActionPerformed(evt);
            }
        });

        egal.setBackground(new java.awt.Color(204, 102, 0));
        egal.setText("=");
        egal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                egalActionPerformed(evt);
            }
        });

        minus.setBackground(new java.awt.Color(204, 102, 0));
        minus.setText(" —");
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });

        inmultit.setBackground(new java.awt.Color(204, 102, 0));
        inmultit.setText("×");
        inmultit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inmultitActionPerformed(evt);
            }
        });

        Rezultat.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        Rezultat.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Rezultat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RezultatActionPerformed(evt);
            }
        });

        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(patru, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(cinci, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sase, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inmultit, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(unu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(doi, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(trei, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(egal, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Rezultat, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(sapte, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(opt, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(noua, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(impartit, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(Rezultat, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noua, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sapte, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(impartit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patru, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cinci, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sase, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(inmultit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(unu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(egal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(trei, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unuActionPerformed
        String Numarintrare=Rezultat.getText() + unu.getText();
        Rezultat.setText(Numarintrare);
    }//GEN-LAST:event_unuActionPerformed

    private void doiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doiActionPerformed
        String Numarintrare=Rezultat.getText() + doi.getText();
        Rezultat.setText(Numarintrare);
    }//GEN-LAST:event_doiActionPerformed

    private void patruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patruActionPerformed
        String Numarintrare=Rezultat.getText() + patru.getText();
        Rezultat.setText(Numarintrare);
    }//GEN-LAST:event_patruActionPerformed

    private void sapteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sapteActionPerformed
        String Numarintrare=Rezultat.getText() + sapte.getText();
        Rezultat.setText(Numarintrare);
    }//GEN-LAST:event_sapteActionPerformed

    private void treiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_treiActionPerformed
        String Numarintrare=Rezultat.getText() + trei.getText();
        Rezultat.setText(Numarintrare);
    }//GEN-LAST:event_treiActionPerformed

    private void cinciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinciActionPerformed
        String Numarintrare=Rezultat.getText() + cinci.getText();
        Rezultat.setText(Numarintrare);
    }//GEN-LAST:event_cinciActionPerformed

    private void saseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saseActionPerformed
        String Numarintrare=Rezultat.getText() + sase.getText();
        Rezultat.setText(Numarintrare);
    }//GEN-LAST:event_saseActionPerformed

    private void optActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optActionPerformed
        String Numarintrare=Rezultat.getText() + opt.getText();
        Rezultat.setText(Numarintrare);
    }//GEN-LAST:event_optActionPerformed

    private void nouaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nouaActionPerformed
       String Numarintrare=Rezultat.getText() + noua.getText();
        Rezultat.setText(Numarintrare);
    }//GEN-LAST:event_nouaActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        primnumar=Integer.parseInt(Rezultat.getText());
        Rezultat.setText("");
        operatie="+";
    }//GEN-LAST:event_plusActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        Rezultat.setText("");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void impartitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_impartitActionPerformed
        primnumar=Integer.parseInt(Rezultat.getText());
        Rezultat.setText("");
        operatie="÷";
    }//GEN-LAST:event_impartitActionPerformed

    private void egalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_egalActionPerformed
        String raspuns;
        
        secnumar= Integer.parseInt(Rezultat.getText());
        if(operatie == "+"){
            rezultat= primnumar + secnumar;
            raspuns=String.format("%.0f",rezultat);
            Rezultat.setText(raspuns);
        }
        else if(operatie == "×"){
            rezultat= primnumar * secnumar;
            raspuns=String.format("%.0f",rezultat);
            Rezultat.setText(raspuns);
        }
        else if(operatie == "-"){
            rezultat= primnumar - secnumar;
            raspuns=String.format("%.0f",rezultat);
            Rezultat.setText(raspuns);
            
        }else if(operatie == "÷"){
            rezultat= primnumar / secnumar;
            raspuns=String.format("%.2f",rezultat);
            Rezultat.setText(raspuns);
        }
        
        
    }//GEN-LAST:event_egalActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
         primnumar=Integer.parseInt(Rezultat.getText());
        Rezultat.setText("");
        operatie="-";
    }//GEN-LAST:event_minusActionPerformed

    private void inmultitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inmultitActionPerformed
         primnumar=Integer.parseInt(Rezultat.getText());
        Rezultat.setText("");
        operatie="×";
    }//GEN-LAST:event_inmultitActionPerformed

    private void RezultatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RezultatActionPerformed
        
    }//GEN-LAST:event_RezultatActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
          String Numarintrare=Rezultat.getText() + zero.getText();
        Rezultat.setText(Numarintrare);        
    }//GEN-LAST:event_zeroActionPerformed

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
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Rezultat;
    private javax.swing.JButton cinci;
    private javax.swing.JButton doi;
    private javax.swing.JButton egal;
    private javax.swing.JButton impartit;
    private javax.swing.JButton inmultit;
    private javax.swing.JButton jButton13;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JColorChooser jColorChooser3;
    private javax.swing.JButton minus;
    private javax.swing.JButton noua;
    private javax.swing.JButton opt;
    private javax.swing.JButton patru;
    private javax.swing.JButton plus;
    private javax.swing.JButton sapte;
    private javax.swing.JButton sase;
    private javax.swing.JButton trei;
    public javax.swing.JButton unu;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
