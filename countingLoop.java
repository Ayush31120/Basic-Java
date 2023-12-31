/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author hp
 */
public class countingLoop extends javax.swing.JFrame {

    /**
     * Creates new form countingLoop
     */
    public countingLoop() {
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

        Heading = new javax.swing.JLabel();
        Information = new javax.swing.JLabel();
        LowestLimitTF = new javax.swing.JTextField();
        HighestLimitTF = new javax.swing.JTextField();
        CountBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ResultArea = new javax.swing.JTextArea();
        LetsDoItBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Heading.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Heading.setText("A Counting Loop");

        Information.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        Information.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Information.setText("Enter any Positive Integers and I will Count From the Lowest to its Highest");

        LowestLimitTF.setEditable(false);
        LowestLimitTF.setText("Lowest Limit");

        HighestLimitTF.setEditable(false);
        HighestLimitTF.setText("Higest Limit");

        CountBtn.setText("Count");
        CountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountBtnActionPerformed(evt);
            }
        });

        ResultArea.setEditable(false);
        ResultArea.setColumns(20);
        ResultArea.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ResultArea.setRows(5);
        ResultArea.setText("Results Will Be Here!!");
        jScrollPane1.setViewportView(ResultArea);

        LetsDoItBtn.setText("Let's Do it");
        LetsDoItBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LetsDoItBtnActionPerformed(evt);
            }
        });

        ResetBtn.setText("Reset");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(Information, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Heading, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LowestLimitTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CountBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(HighestLimitTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LetsDoItBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ResetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Heading)
                .addGap(18, 18, 18)
                .addComponent(Information, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LetsDoItBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ResetBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LowestLimitTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CountBtn)
                    .addComponent(HighestLimitTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LetsDoItBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LetsDoItBtnActionPerformed
        // TODO add your handling code here:
        LowestLimitTF.setEditable(true);
        HighestLimitTF.setEditable(true);
        LowestLimitTF.setText("");
        HighestLimitTF.setText("");
        ResultArea.setText("Here We Go!!");
    }//GEN-LAST:event_LetsDoItBtnActionPerformed

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        // TODO add your handling code here:
        LowestLimitTF.setEditable(false);
        HighestLimitTF.setEditable(false);
        LowestLimitTF.setText("Lowest Limit");
        HighestLimitTF.setText("Higest Limit");
        ResultArea.setText("Results Will Be Here!!");
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void CountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountBtnActionPerformed
        // TODO add your handling code here:
        int lower = Integer.parseInt(LowestLimitTF.getText());
        int upper = Integer.parseInt(HighestLimitTF.getText());
        ResultArea.append("\n");
        while(lower<=upper){
            ResultArea.append(lower+"\n");
            lower++;
        }
    }//GEN-LAST:event_CountBtnActionPerformed

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
            java.util.logging.Logger.getLogger(countingLoop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(countingLoop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(countingLoop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(countingLoop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new countingLoop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CountBtn;
    private javax.swing.JLabel Heading;
    private javax.swing.JTextField HighestLimitTF;
    private javax.swing.JLabel Information;
    private javax.swing.JButton LetsDoItBtn;
    private javax.swing.JTextField LowestLimitTF;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JTextArea ResultArea;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
