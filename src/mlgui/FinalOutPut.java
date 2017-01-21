/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mlgui;

import java.awt.Color;

/**
 *
 * @author radioactive
 */
public class FinalOutPut extends javax.swing.JFrame {

    /**
     * Creates new form FinalOutPut
     */
    public FinalOutPut() {
        initComponents();
         this.getContentPane().setBackground(new Color(207,216,220));
    }
    public FinalOutPut(String subjectnameList[] ,int SubjectCount[], String info[],
            String grade[] , int currentsem, int floor[]) {
         this.getContentPane().setBackground(new Color(207,216,220));
        int size = floor.length;
        int max[] = new int [size]; 
        int min[] = new int[size];  
        for(int i=0;i<size;i++)
        {
            max[i] = floor[i]+1;
            min[i] = floor[i]-1;
        }
        
        initComponents();
        Jheading.setText(info[0]+"  YOUR PREDICTED SCORE IN "+currentsem+" SEMESTER ARE " );
        if (currentsem==6)
        {
            System.out.println("hey got u");
            
            //srtiing subject name
        jOutputSubject1.setText(subjectnameList[45]);
        jOutputSubject1.setForeground(Color.red);
        jOutputSubject2.setText(subjectnameList[46]);
        jOutputSubject3.setText(subjectnameList[47]);
        jOutputSubject4.setText(subjectnameList[48]);
        jOutputSubject5.setText(subjectnameList[49]);
        jOutputSubject6.setText(subjectnameList[50]);
        jOutputSubject7.setText(subjectnameList[51]);
        // setting marks
        jMarks1.setText(" "+grade[min[0]]+"                          "+grade[max[0]]+"                      "+grade[floor[0]]);
        jMarks2.setText(" "+grade[min[1]]+"                          "+grade[max[1]]+"                      "+grade[floor[1]]);
        jMarks3.setText(" "+grade[min[2]]+"                          "+grade[max[2]]+"                      "+grade[floor[2]]);
        jMarks4.setText(" "+grade[min[3]]+"                          "+grade[max[3]]+"                      "+grade[floor[3]]);
        jMarks5.setText(" "+grade[min[4]]+"                          "+grade[max[4]]+"                      "+grade[floor[4]]);
        jMarks6.setText(" "+grade[min[5]]+"                          "+grade[max[5]]+"                      "+grade[floor[5]]);
        jMarks7.setText(" "+grade[min[6]]+"                          "+grade[max[6]]+"                      "+grade[floor[6]]);
        
        
       //setting extra subjects off
        
        jOutputSubject10.setVisible(false);
        jOutputSubject11.setVisible(false);
        jOutputSubject8.setVisible(false);
        jOutputSubject9.setVisible(false);
        jMarks10.setVisible(false);
        jMarks9.setVisible(false);
        jMarks11.setVisible(false);
       jMarks8.setVisible(false);
    }
        if(currentsem==5)
        {
            jOutputSubject1.setText(subjectnameList[37]);
        jOutputSubject1.setForeground(Color.red);
        jOutputSubject2.setText(subjectnameList[38]);
        jOutputSubject3.setText(subjectnameList[39]);
        jOutputSubject4.setText(subjectnameList[40]);
        jOutputSubject5.setText(subjectnameList[41]);
        jOutputSubject6.setText(subjectnameList[42]);
        jOutputSubject7.setText(subjectnameList[43]);
        jOutputSubject7.setText(subjectnameList[44]);
        jOutputSubject8.setText(subjectnameList[45]);
        
        jMarks1.setText(" "+grade[min[0]]+"                          "+grade[max[0]]+"                      "+grade[floor[0]]);
        jMarks2.setText(" "+grade[min[1]]+"                          "+grade[max[1]]+"                      "+grade[floor[1]]);
        jMarks3.setText(" "+grade[min[2]]+"                          "+grade[max[2]]+"                      "+grade[floor[2]]);
        jMarks4.setText(" "+grade[min[3]]+"                          "+grade[max[3]]+"                      "+grade[floor[3]]);
        jMarks5.setText(" "+grade[min[4]]+"                          "+grade[max[4]]+"                      "+grade[floor[4]]);
        jMarks6.setText(" "+grade[min[5]]+"                          "+grade[max[5]]+"                      "+grade[floor[5]]);
        jMarks7.setText(" "+grade[min[6]]+"                          "+grade[max[6]]+"                      "+grade[floor[6]]);
        jMarks8.setText(" "+grade[min[7]]+"                          "+grade[max[7]]+"                      "+grade[floor[7]]);
        jOutputSubject10.setVisible(false);
        jOutputSubject11.setVisible(false);
        //jOutputSubject8.setVisible(false);
        jOutputSubject9.setVisible(false);
        jMarks10.setVisible(false);
        jMarks9.setVisible(false);
        jMarks11.setVisible(false);
       //jMarks8.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOutputSubject1 = new javax.swing.JLabel();
        jOutputSubject2 = new javax.swing.JLabel();
        jOutputSubject3 = new javax.swing.JLabel();
        jOutputSubject4 = new javax.swing.JLabel();
        jOutputSubject5 = new javax.swing.JLabel();
        jOutputSubject6 = new javax.swing.JLabel();
        jMarks1 = new javax.swing.JLabel();
        jMarks2 = new javax.swing.JLabel();
        jMarks3 = new javax.swing.JLabel();
        jMarks4 = new javax.swing.JLabel();
        jMarks5 = new javax.swing.JLabel();
        jMarks6 = new javax.swing.JLabel();
        jOutputSubject7 = new javax.swing.JLabel();
        jOutputSubject8 = new javax.swing.JLabel();
        jOutputSubject9 = new javax.swing.JLabel();
        jOutputSubject10 = new javax.swing.JLabel();
        jOutputSubject11 = new javax.swing.JLabel();
        jMarks7 = new javax.swing.JLabel();
        jMarks8 = new javax.swing.JLabel();
        jMarks9 = new javax.swing.JLabel();
        jMarks10 = new javax.swing.JLabel();
        jMarks11 = new javax.swing.JLabel();
        Jheading = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jOutputSubject1.setForeground(new java.awt.Color(51, 51, 0));
        jOutputSubject1.setText("jLabel1");

        jOutputSubject2.setForeground(new java.awt.Color(51, 0, 51));
        jOutputSubject2.setText("jLabel2");

        jOutputSubject3.setForeground(new java.awt.Color(51, 51, 0));
        jOutputSubject3.setText("jLabel3");

        jOutputSubject4.setText("jLabel4");

        jOutputSubject5.setText("jLabel5");

        jOutputSubject6.setText("jLabel6");

        jMarks1.setForeground(new java.awt.Color(204, 0, 0));
        jMarks1.setText("jLabel7");

        jMarks2.setForeground(new java.awt.Color(204, 0, 0));
        jMarks2.setText("jLabel8");

        jMarks3.setForeground(new java.awt.Color(204, 0, 0));
        jMarks3.setText("jLabel9");

        jMarks4.setForeground(new java.awt.Color(204, 0, 0));
        jMarks4.setText("jLabel10");

        jMarks5.setForeground(new java.awt.Color(204, 0, 0));
        jMarks5.setText("jLabel11");

        jMarks6.setForeground(new java.awt.Color(255, 0, 0));
        jMarks6.setText("jLabel12");

        jOutputSubject7.setText("jLabel1");

        jOutputSubject8.setText("jLabel1");

        jOutputSubject9.setText("jLabel1");

        jOutputSubject10.setText("jLabel1");

        jOutputSubject11.setText("jLabel1");

        jMarks7.setForeground(new java.awt.Color(255, 0, 0));
        jMarks7.setText("jLabel1");

        jMarks8.setForeground(new java.awt.Color(204, 0, 0));
        jMarks8.setText("jLabel1");

        jMarks9.setForeground(new java.awt.Color(204, 0, 0));
        jMarks9.setText("jLabel1");

        jMarks10.setForeground(new java.awt.Color(204, 0, 0));
        jMarks10.setText("jLabel1");

        jMarks11.setForeground(new java.awt.Color(204, 0, 0));
        jMarks11.setText("jLabel1");

        Jheading.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Jheading.setForeground(new java.awt.Color(255, 0, 0));
        Jheading.setText("Your Predicted Scores are 7");

        jLabel1.setText("MIN                    MAX                     ACTUAL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jOutputSubject8)
                    .addComponent(jOutputSubject9)
                    .addComponent(jOutputSubject10)
                    .addComponent(jOutputSubject11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Jheading)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jOutputSubject7)
                                .addGap(113, 113, 113)
                                .addComponent(jMarks7)
                                .addGap(61, 61, 61))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jOutputSubject5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jMarks5))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jOutputSubject4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jMarks4))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jOutputSubject1)
                                        .addComponent(jOutputSubject2)
                                        .addComponent(jOutputSubject3))
                                    .addGap(51, 51, 51)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jMarks3)
                                        .addComponent(jMarks2)
                                        .addComponent(jMarks1)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jOutputSubject6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jMarks6)
                                        .addComponent(jMarks8)
                                        .addComponent(jMarks9)
                                        .addComponent(jMarks10)
                                        .addComponent(jMarks11))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel1)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Jheading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jOutputSubject1)
                    .addComponent(jMarks1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jOutputSubject2)
                    .addComponent(jMarks2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jOutputSubject3)
                    .addComponent(jMarks3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jOutputSubject4)
                    .addComponent(jMarks4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jOutputSubject5)
                    .addComponent(jMarks5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jOutputSubject6)
                    .addComponent(jMarks6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jOutputSubject7)
                    .addComponent(jMarks7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jOutputSubject8)
                    .addComponent(jMarks8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jOutputSubject9)
                    .addComponent(jMarks9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jOutputSubject10)
                    .addComponent(jMarks10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jOutputSubject11)
                    .addComponent(jMarks11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FinalOutPut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinalOutPut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinalOutPut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinalOutPut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinalOutPut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jheading;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jMarks1;
    private javax.swing.JLabel jMarks10;
    private javax.swing.JLabel jMarks11;
    private javax.swing.JLabel jMarks2;
    private javax.swing.JLabel jMarks3;
    private javax.swing.JLabel jMarks4;
    private javax.swing.JLabel jMarks5;
    private javax.swing.JLabel jMarks6;
    private javax.swing.JLabel jMarks7;
    private javax.swing.JLabel jMarks8;
    private javax.swing.JLabel jMarks9;
    private javax.swing.JLabel jOutputSubject1;
    private javax.swing.JLabel jOutputSubject10;
    private javax.swing.JLabel jOutputSubject11;
    private javax.swing.JLabel jOutputSubject2;
    private javax.swing.JLabel jOutputSubject3;
    private javax.swing.JLabel jOutputSubject4;
    private javax.swing.JLabel jOutputSubject5;
    private javax.swing.JLabel jOutputSubject6;
    private javax.swing.JLabel jOutputSubject7;
    private javax.swing.JLabel jOutputSubject8;
    private javax.swing.JLabel jOutputSubject9;
    // End of variables declaration//GEN-END:variables
}
