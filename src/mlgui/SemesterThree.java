package mlgui;


import java.awt.Color;
import mlgui.SemesterTwo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author radioactive
 */
public class SemesterThree extends javax.swing.JFrame {

    /**
     * Creates new form SemesterThree
     */
    int previousLength;
    int currentSemester;
    public SemesterThree() {
        this.getContentPane().setBackground(new Color(207,216,220));
        initComponents();
        // jBSem1Mrks.setEnabled(false);
    }
    public SemesterThree(int value , String[] info)
    {
        this.getContentPane().setBackground(new Color(207,216,220));
        currentSemester =value;
        Information =info ;
        initComponents();
    }
    
    public String[] overallGrade = new String[57];
    // public String[] overallGradeLocal = new String[10];
     public String[] Information=  new String[7];
     
    public SemesterThree(String[] A, String []info ,int value)
    {
        this.getContentPane().setBackground(new Color(207,216,220));
         currentSemester = value;
         Information =info; 
         previousLength =A.length;
         System.out.println("msv"+A[2]);
        System.out.println("getting from 2");
        initComponents();
         if (A[11]!= null)
        jBSem1Mrks.setEnabled(false);
        for(int i =0;i<A.length-1;i++)
        {
            overallGrade[i] = A[i];
       }
//        for(int i =0;i<A.length-;i++)
//        {
//            System.out.println(""+overallGrade[i]); 
//    }
        System.out.println("Done after "+A.length);
    }
    
    public String[] Grade2 = new String[9];
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jBSem1Mrks = new javax.swing.JButton();
        jBSubmitThree = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Click to Enter first Sem's Marks");

        jBSem1Mrks.setText("SEM1 Marks");
        jBSem1Mrks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSem1MrksActionPerformed(evt);
            }
        });

        jBSubmitThree.setText("Proceed");
        jBSubmitThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSubmitThreeActionPerformed(evt);
            }
        });

        jLabel10.setText("Enter SEcond Sememster's Marks");

        jButton1.setText("Sem 2 marks ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jBSem1Mrks)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBSubmitThree)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jBSem1Mrks))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jButton1))
                .addGap(43, 43, 43)
                .addComponent(jBSubmitThree)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSubmitThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSubmitThreeActionPerformed
        // TODO add your handling code here:
        //dispose();
//        Grade2[0] = jCSem2_1.getSelectedItem().toString();
//        Grade2[1] = jCSem2_2.getSelectedItem().toString();
//        Grade2[2] = jCSem2_3.getSelectedItem().toString();
//        Grade2[3] = jCSem2_4.getSelectedItem().toString();
//        Grade2[4] = jCSem2_5.getSelectedItem().toString();
//        Grade2[5] = jCSem2_6.getSelectedItem().toString();
//        Grade2[6] = jCSem2_7.getSelectedItem().toString();
//        Grade2[7] = jCSem2_8.getSelectedItem().toString();
//        
       // String Grade1[] = new String[11];
       // Grade1 = new SemesterTwo().Grade;
       // for(int i=0;i< Grade1.length;i++)
          //  overallGrade[i] = Grade1[i];
        
        System.out.println("the final len is "+previousLength);
        if(currentSemester==3&& overallGrade[22]!=null)
        {
            System.out.println("call your cluster here"+overallGrade[22]);//to test if we are getting or not;
        dispose();
        }
        if(currentSemester>3&& overallGrade[23]==null)
        {
            SemesterFour newframeInthree  = new SemesterFour(overallGrade,Information,currentSemester);
            newframeInthree.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jBSubmitThreeActionPerformed

    private void jBSem1MrksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSem1MrksActionPerformed
        // TODO add your handling code here:
        System.out.println("you are entering First sem now \n");
        SemesterTwo newframeInThree = new SemesterTwo(currentSemester);
        newframeInThree.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBSem1MrksActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        SemesterTwoMarks newFrame = new SemesterTwoMarks(overallGrade ,Information,currentSemester);
        newFrame.setVisible(true);
        dispose();
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
            java.util.logging.Logger.getLogger(SemesterThree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SemesterThree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SemesterThree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SemesterThree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SemesterThree().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSem1Mrks;
    private javax.swing.JButton jBSubmitThree;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    // End of variables declaration//GEN-END:variables
}