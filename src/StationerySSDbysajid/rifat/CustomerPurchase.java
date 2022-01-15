/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StationerySSDbysajid.rifat;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;
import static StationerySSDbysajid.rifat.InfoOfProducts.sprice;
import static StationerySSDbysajid.rifat.InfoOfProducts.bprice;
import static StationerySSDbysajid.rifat.InfoOfProducts.id;
import static StationerySSDbysajid.rifat.InfoOfProducts.name;
import static StationerySSDbysajid.rifat.InfoOfProducts.qty;
import static StationerySSDbysajid.rifat.WelcomePage.NumberOfProducts;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static StationerySSDbysajid.rifat.BuyingStyff.PName;
import static StationerySSDbysajid.rifat.BuyingStyff.PPrice;
import static StationerySSDbysajid.rifat.BuyingStyff.PQty;
/**
 *
 * @author ASUS
 */

public class CustomerPurchase extends javax.swing.JFrame {
    
    
    /**
     * Creates new form CustomerPurchase
     */
    public CustomerPurchase() {
        //InfoOfProducts Info = new InfoOfProducts();
        setPreferredSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize()));
        initComponents();
        showProducts();
        
        //showbuy();
    }
void showProducts(){
        jPanel2.revalidate();
        jPanel2.repaint();
        int n;
        ReadFile r = new ReadFile();
        String Path ="ProductsInformation.csv";
        n=r.ReadProducts(Path);
        String[] names = r.GetProductNames();
        float[] prices = r.GetPrdSellingPrices();
        int []q=r.GetPrdQtys();
        //InfoOfProducts Info = new InfoOfProducts();
        GridBagConstraints grid = new GridBagConstraints ();
        grid.insets = new Insets(20,20,20,20); 
        int row=0;
        int col=0;
        
        for(int i=1;i<n;i++){
            //JOptionPane.showMessageDialog(null, i);
            //System.out.println(i);
            if(q[i]<=0){
                continue;
            }
            CutomerPrd p = new CutomerPrd();
            p.SetName(names[i]);
            p.SetPrice(prices[i]);            //JOptionPane.showMessageDialog(null, name.get(i));
            jPanel2.add(p,grid);
            row++;
            if(row==3){
                col++;
                row=0;
            }            
            grid.gridx=row;
            grid.gridy=col;
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("GungsuhChe", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("StationerySSD");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 241, -1));

        jLabel2.setFont(new java.awt.Font("GungsuhChe", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Purchase");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 204, -1));

        jLabel3.setFont(new java.awt.Font("GungsuhChe", 1, 24)); // NOI18N
        jLabel3.setText("The Options are");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel4.setFont(new java.awt.Font("GungsuhChe", 1, 24)); // NOI18N
        jLabel4.setText("Given On The Right Panel");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        jLabel5.setFont(new java.awt.Font("GungsuhChe", 1, 24)); // NOI18N
        jLabel5.setText("Choose As Needed");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        jLabel7.setFont(new java.awt.Font("GungsuhChe", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Consumer");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 204, -1));

        button1.setBackground(new java.awt.Color(0, 204, 0));
        button1.setFont(new java.awt.Font("Plantagenet Cherokee", 1, 18)); // NOI18N
        button1.setForeground(new java.awt.Color(240, 240, 240));
        button1.setLabel("Show Cart");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel1.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 315, 50));

        button2.setBackground(new java.awt.Color(0, 204, 0));
        button2.setFont(new java.awt.Font("Plantagenet Cherokee", 1, 18)); // NOI18N
        button2.setForeground(new java.awt.Color(240, 240, 240));
        button2.setLabel("Continue To Checkout");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        jPanel1.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 315, 50));

        button3.setBackground(new java.awt.Color(255, 255, 0));
        button3.setFont(new java.awt.Font("Plantagenet Cherokee", 1, 18)); // NOI18N
        button3.setLabel("Back");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        jPanel1.add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 315, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\Documents\\Java\\NetBeansProjects\\StationerySSD\\src\\StationerySSDbysajid\\rifat\\SStore.jpg")); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 180, -1));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(102, 204, 0));
        jPanel2.setLayout(new java.awt.GridBagLayout());
        jScrollPane1.setViewportView(jPanel2);

        jScrollPane2.setViewportView(jScrollPane1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1131;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 0);
        getContentPane().add(jScrollPane2, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
        CustomerPage GoToCustomerPage = new CustomerPage();
        GoToCustomerPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button3ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        //for(int i=0;i<PName.size();i++){
        //    System.out.println(PName.get(i)+" "+PQty.get(i));
        //}
        BoughtProducts GoToBoughtProducts = new BoughtProducts();
        GoToBoughtProducts.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        CustomerInfo c = new CustomerInfo();
        c.setVisible(true);
    }//GEN-LAST:event_button2ActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerPurchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerPurchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerPurchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerPurchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerPurchase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}