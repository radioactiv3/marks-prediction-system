/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mlgui;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author radioactive
 */
public class SemesterFourMarks extends javax.swing.JFrame {

    /**
     * Creates new form SemesterFourMarks
     */
     public String[] overallGrade = new String[57];
    public String[] localGrade = new String[7];
    public int CurrentSemester ;
    public String[] Information = new String[7];
    public SemesterFourMarks() {
        this.getContentPane().setBackground(new Color (200,230,201));
        initComponents();
    }
    public SemesterFourMarks(String[]A , String[] info ,int value) {
        
        overallGrade =A;
        CurrentSemester = value;
        this.getContentPane().setBackground(new Color (200,230,201));
        Information = info;
        initComponents();
    }
    public SemesterFourMarks(int value) {
        initComponents();
        CurrentSemester =value;
        this.getContentPane().setBackground(new Color (200,230,201));
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
        jCSem4_S1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jCSem4_S2 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jCSem4_S3 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jCSem4_S4 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jCSem4_S5 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jCSem4_S6 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jCSem4_S7 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Semester Four Marks");

        jLabel1.setText("Mathematics - IV");

        jCSem4_S1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "P", "F", "Ex" }));

        jLabel2.setText("Design & Analysis of Algorithm");

        jCSem4_S2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "P", "F", "Ex" }));
        jCSem4_S2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCSem4_S2ActionPerformed(evt);
            }
        });

        jLabel3.setText("\tComputer Organization");

        jCSem4_S3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "P", "F", "Ex" }));
        jCSem4_S3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCSem4_S3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Formal Language & Automata Theory");

        jCSem4_S4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "P", "F", "Ex" }));
        jCSem4_S4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCSem4_S4ActionPerformed(evt);
            }
        });

        jLabel5.setText("Object Oriented Programming");

        jCSem4_S5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "P", "F", "Ex" }));
        jCSem4_S5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCSem4_S5ActionPerformed(evt);
            }
        });

        jLabel6.setText("Algorithm Laboratory");

        jCSem4_S6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "P", "F", "Ex" }));
        jCSem4_S6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCSem4_S6ActionPerformed(evt);
            }
        });

        jLabel7.setText("Object Oriented Programming Laboratory");

        jCSem4_S7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "P", "F", "Ex" }));
        jCSem4_S7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCSem4_S7ActionPerformed(evt);
            }
        });

        jButton1.setText("Proceed");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jButton1)
                .addContainerGap(165, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5)
                        .addComponent(jLabel7)
                        .addComponent(jLabel6)
                        .addComponent(jLabel4))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jCSem4_S6, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCSem4_S2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCSem4_S1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCSem4_S3, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCSem4_S4, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCSem4_S5, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCSem4_S7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(113, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 275, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel2)
                                    .addGap(20, 20, 20)
                                    .addComponent(jLabel3)
                                    .addGap(24, 24, 24)
                                    .addComponent(jLabel4))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jCSem4_S1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCSem4_S2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCSem4_S3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCSem4_S4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addComponent(jLabel5))
                        .addComponent(jCSem4_S5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jCSem4_S6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jCSem4_S7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(56, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCSem4_S2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCSem4_S2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCSem4_S2ActionPerformed

    private void jCSem4_S3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCSem4_S3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCSem4_S3ActionPerformed

    private void jCSem4_S4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCSem4_S4ActionPerformed
        // TODO add your h andling code here:
    }//GEN-LAST:event_jCSem4_S4ActionPerformed

    private void jCSem4_S5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCSem4_S5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCSem4_S5ActionPerformed

    private void jCSem4_S6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCSem4_S6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCSem4_S6ActionPerformed

    private void jCSem4_S7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCSem4_S7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCSem4_S7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        localGrade[0] = jCSem4_S1.getSelectedItem().toString();
        localGrade[1] = jCSem4_S2.getSelectedItem().toString(); 
        localGrade[2] = jCSem4_S3.getSelectedItem().toString();
        localGrade[3] = jCSem4_S4.getSelectedItem().toString();
        localGrade[4] = jCSem4_S5.getSelectedItem().toString();
        localGrade[5] = jCSem4_S6.getSelectedItem().toString();
        localGrade[6] = jCSem4_S7.getSelectedItem().toString();
        int i =0,j=0;
        int k =0;
        while(overallGrade[i]!=null)
            ++i;
        for(j=0;j<7;j++)
        {
            overallGrade[i+j] =localGrade[j];
        }
        for(k=0;k<38;k++)
        {
            System.out.println("the value of final grade the is "+overallGrade[k] +""+k);
        }
         //localGrade[0] = jCSem4_S1.getSelectedItem().toString(); 
        if (CurrentSemester>5)
        {
            SemesterSix newFrameInfour = new SemesterSix(overallGrade,Information,CurrentSemester);
            newFrameInfour.setVisible(true);
            dispose();
        }
        else {
             try {
                SegregateModels newMOdel = new SegregateModels(overallGrade, Information, CurrentSemester);
            } catch (Exception ex) {
                System.out.println(""+ex);
                Logger.getLogger(SemesterFiveMarks.class.getName()).log(Level.SEVERE, null, ex);
            }
                System.out.println("calling output");
                System.out.println("calling output");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SemesterFourMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SemesterFourMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SemesterFourMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SemesterFourMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SemesterFourMarks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jCSem4_S1;
    private javax.swing.JComboBox jCSem4_S2;
    private javax.swing.JComboBox jCSem4_S3;
    private javax.swing.JComboBox jCSem4_S4;
    private javax.swing.JComboBox jCSem4_S5;
    private javax.swing.JComboBox jCSem4_S6;
    private javax.swing.JComboBox jCSem4_S7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}