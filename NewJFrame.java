/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculator;

/**
 *
 * @author baook
 */
public class NewJFrame extends javax.swing.JFrame {
    String opr1 = "";
    String operator = "";
    boolean checkEqual = false;
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtResult = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jNum1 = new javax.swing.JButton();
        jNum2 = new javax.swing.JButton();
        jNum3 = new javax.swing.JButton();
        jSum = new javax.swing.JButton();
        jSqrt = new javax.swing.JButton();
        jNum4 = new javax.swing.JButton();
        jNum5 = new javax.swing.JButton();
        jNum6 = new javax.swing.JButton();
        jSub = new javax.swing.JButton();
        jPercent = new javax.swing.JButton();
        jNum7 = new javax.swing.JButton();
        jNum8 = new javax.swing.JButton();
        jNum9 = new javax.swing.JButton();
        jMul = new javax.swing.JButton();
        jFrac = new javax.swing.JButton();
        jNum0 = new javax.swing.JButton();
        jPow = new javax.swing.JButton();
        jClear = new javax.swing.JButton();
        jDivide = new javax.swing.JButton();
        jEqual = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CASIO");
        setLocation(new java.awt.Point(530, 200));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("CASIO");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtResult.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtResult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtResult)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtResult)
                .addContainerGap())
        );

        jPanel2.setLayout(new java.awt.GridLayout(4, 5, 5, 5));

        jNum1.setText("1");
        jNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNum1ActionPerformed(evt);
            }
        });
        jPanel2.add(jNum1);

        jNum2.setText("2");
        jNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNum1ActionPerformed(evt);
            }
        });
        jPanel2.add(jNum2);

        jNum3.setText("3");
        jNum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNum1ActionPerformed(evt);
            }
        });
        jPanel2.add(jNum3);

        jSum.setText("+");
        jSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSumActionPerformed(evt);
            }
        });
        jPanel2.add(jSum);

        jSqrt.setText("sqrt");
        jSqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSqrtActionPerformed(evt);
            }
        });
        jPanel2.add(jSqrt);

        jNum4.setText("4");
        jNum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNum1ActionPerformed(evt);
            }
        });
        jPanel2.add(jNum4);

        jNum5.setText("5");
        jNum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNum1ActionPerformed(evt);
            }
        });
        jPanel2.add(jNum5);

        jNum6.setText("6");
        jNum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNum1ActionPerformed(evt);
            }
        });
        jPanel2.add(jNum6);

        jSub.setText("-");
        jSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSumActionPerformed(evt);
            }
        });
        jPanel2.add(jSub);

        jPercent.setText("%");
        jPercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSqrtActionPerformed(evt);
            }
        });
        jPanel2.add(jPercent);

        jNum7.setText("7");
        jNum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNum1ActionPerformed(evt);
            }
        });
        jPanel2.add(jNum7);

        jNum8.setText("8");
        jNum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNum1ActionPerformed(evt);
            }
        });
        jPanel2.add(jNum8);

        jNum9.setText("9");
        jNum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNum1ActionPerformed(evt);
            }
        });
        jPanel2.add(jNum9);

        jMul.setText("*");
        jMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSumActionPerformed(evt);
            }
        });
        jPanel2.add(jMul);

        jFrac.setText("1/x");
        jFrac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSqrtActionPerformed(evt);
            }
        });
        jPanel2.add(jFrac);

        jNum0.setText("0");
        jNum0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNum1ActionPerformed(evt);
            }
        });
        jPanel2.add(jNum0);

        jPow.setText("+/-");
        jPow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPowActionPerformed(evt);
            }
        });
        jPanel2.add(jPow);

        jClear.setText("C");
        jClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClearActionPerformed(evt);
            }
        });
        jPanel2.add(jClear);

        jDivide.setText("/");
        jDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSumActionPerformed(evt);
            }
        });
        jPanel2.add(jDivide);

        jEqual.setText("=");
        jEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEqualActionPerformed(evt);
            }
        });
        jPanel2.add(jEqual);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultActionPerformed

    private void jNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNum1ActionPerformed
        if (checkEqual) {
            checkEqual = false;
            txtResult.setText("");
        }
        String cmd = evt.getActionCommand();
        txtResult.setText(txtResult.getText()+cmd);
    }//GEN-LAST:event_jNum1ActionPerformed

    private void jPowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPowActionPerformed
        try {
            Double value = Double.parseDouble(txtResult.getText());
        value = - value;
        txtResult.setText(value+"");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jPowActionPerformed

    private void jSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSumActionPerformed
        if (checkEqual) {
            checkEqual = false;
            txtResult.setText("");
        }
        String cmd = evt.getActionCommand();
        operator = cmd;
        opr1 = txtResult.getText();
        txtResult.setText("");
    }//GEN-LAST:event_jSumActionPerformed

    private void jEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEqualActionPerformed
        if (txtResult.getText()==""|| opr1.equals("")) {
            return;
        }
        try {
            double op1 = Double.parseDouble(opr1);
            double op2 = Double.parseDouble(txtResult.getText());
            double result = 0;
            if(operator.equals("+")){
                result = op1+op2;
            }
            else if(operator.equals("-")){
                result = op1-op2;
            } else if(operator.equals("*")){
                result = op1*op2;
            } else if(operator.equals("/")){
                result = op1/op2;
            }
            txtResult.setText(result+"");
            checkEqual = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jEqualActionPerformed

    private void jClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClearActionPerformed
        txtResult.setText("");
        opr1 = "";
        operator="";
        checkEqual = false;
    }//GEN-LAST:event_jClearActionPerformed

    private void jSqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSqrtActionPerformed
        String cmd = evt.getActionCommand();
        if (txtResult.getText()=="") {
            return;
        }
        checkEqual = true;
        try {
            double value = Double.parseDouble(txtResult.getText());
            if (cmd.equals("sqrt")) {
                value = Math.sqrt(value);
            }
            else if(cmd.equals("%")){
                value = value *100;
            } else if(cmd.equals("1/x")){
                value = 1/value;
            }
            txtResult.setText(value+"");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jSqrtActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jClear;
    private javax.swing.JButton jDivide;
    private javax.swing.JButton jEqual;
    private javax.swing.JButton jFrac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton jMul;
    private javax.swing.JButton jNum0;
    private javax.swing.JButton jNum1;
    private javax.swing.JButton jNum2;
    private javax.swing.JButton jNum3;
    private javax.swing.JButton jNum4;
    private javax.swing.JButton jNum5;
    private javax.swing.JButton jNum6;
    private javax.swing.JButton jNum7;
    private javax.swing.JButton jNum8;
    private javax.swing.JButton jNum9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jPercent;
    private javax.swing.JButton jPow;
    private javax.swing.JButton jSqrt;
    private javax.swing.JButton jSub;
    private javax.swing.JButton jSum;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables
}
