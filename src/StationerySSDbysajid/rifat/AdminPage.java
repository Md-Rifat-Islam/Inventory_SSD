/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StationerySSDbysajid.rifat;

/**
 *
 * @author ASUS
 */
public class AdminPage extends javax.swing.JFrame {

    /**
     * Creates new form AdminPage
     */
    public AdminPage() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ChangeUsernameBtn = new java.awt.Button();
        ChangePasswordBtn = new java.awt.Button();
        ChangeDiscBtn = new java.awt.Button();
        EditVatBtn = new java.awt.Button();
        LogoutBtn = new java.awt.Button();
        ShowPrdBtn = new java.awt.Button();
        jPanel3 = new javax.swing.JPanel();
        AddPrdBtn = new java.awt.Button();
        EditPrdBtn = new java.awt.Button();
        RemovePrdBtn = new java.awt.Button();
        ExitBtn = new java.awt.Button();
        NotifyBtn = new java.awt.Button();
        ShowSalesBtn = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("StationerySSD_AdminPage");

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("GungsuhChe", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("StationerySSD");

        jLabel2.setFont(new java.awt.Font("GungsuhChe", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Administration");

        jLabel3.setFont(new java.awt.Font("GungsuhChe", 1, 24)); // NOI18N
        jLabel3.setText("The Options are");

        jLabel4.setFont(new java.awt.Font("GungsuhChe", 1, 24)); // NOI18N
        jLabel4.setText("Given On The Right Panel");

        jLabel5.setFont(new java.awt.Font("GungsuhChe", 1, 24)); // NOI18N
        jLabel5.setText("Choose As Needed");

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\Documents\\Java\\NetBeansProjects\\StationerySSD\\src\\StationerySSDbysajid\\rifat\\SStore.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(76, 76, 76)
                .addComponent(jLabel2)
                .addGap(85, 85, 85)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(325, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 204, 0));

        ChangeUsernameBtn.setBackground(new java.awt.Color(0, 204, 0));
        ChangeUsernameBtn.setFont(new java.awt.Font("Plantagenet Cherokee", 1, 36)); // NOI18N
        ChangeUsernameBtn.setForeground(new java.awt.Color(255, 255, 255));
        ChangeUsernameBtn.setLabel("Change User Name");
        ChangeUsernameBtn.setMinimumSize(new java.awt.Dimension(310, 55));
        ChangeUsernameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeUsernameBtnActionPerformed(evt);
            }
        });

        ChangePasswordBtn.setBackground(new java.awt.Color(0, 204, 0));
        ChangePasswordBtn.setFont(new java.awt.Font("Plantagenet Cherokee", 1, 36)); // NOI18N
        ChangePasswordBtn.setForeground(new java.awt.Color(255, 255, 255));
        ChangePasswordBtn.setLabel("Change Password");
        ChangePasswordBtn.setMinimumSize(new java.awt.Dimension(310, 55));
        ChangePasswordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePasswordBtnActionPerformed(evt);
            }
        });

        ChangeDiscBtn.setBackground(new java.awt.Color(0, 204, 0));
        ChangeDiscBtn.setFont(new java.awt.Font("Plantagenet Cherokee", 1, 36)); // NOI18N
        ChangeDiscBtn.setForeground(new java.awt.Color(240, 240, 240));
        ChangeDiscBtn.setLabel("Change Discount");
        ChangeDiscBtn.setMinimumSize(new java.awt.Dimension(310, 55));
        ChangeDiscBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeDiscBtnActionPerformed(evt);
            }
        });

        EditVatBtn.setBackground(new java.awt.Color(0, 204, 0));
        EditVatBtn.setFont(new java.awt.Font("Plantagenet Cherokee", 1, 36)); // NOI18N
        EditVatBtn.setForeground(new java.awt.Color(255, 255, 255));
        EditVatBtn.setLabel("Edit VAT");
        EditVatBtn.setMinimumSize(new java.awt.Dimension(310, 55));
        EditVatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditVatBtnActionPerformed(evt);
            }
        });

        LogoutBtn.setBackground(new java.awt.Color(255, 255, 0));
        LogoutBtn.setFont(new java.awt.Font("Plantagenet Cherokee", 1, 36)); // NOI18N
        LogoutBtn.setForeground(new java.awt.Color(0, 0, 0));
        LogoutBtn.setLabel("Logout");
        LogoutBtn.setMinimumSize(new java.awt.Dimension(310, 55));
        LogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtnActionPerformed(evt);
            }
        });

        ShowPrdBtn.setBackground(new java.awt.Color(0, 204, 0));
        ShowPrdBtn.setFont(new java.awt.Font("Plantagenet Cherokee", 1, 36)); // NOI18N
        ShowPrdBtn.setForeground(new java.awt.Color(240, 240, 240));
        ShowPrdBtn.setLabel("Show Products");
        ShowPrdBtn.setMinimumSize(new java.awt.Dimension(310, 55));
        ShowPrdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPrdBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ShowPrdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditVatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ChangeDiscBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ChangePasswordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ChangeUsernameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(ChangeUsernameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(ChangePasswordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(ChangeDiscBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(EditVatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(ShowPrdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 255, 0));

        AddPrdBtn.setBackground(new java.awt.Color(51, 204, 0));
        AddPrdBtn.setFont(new java.awt.Font("Plantagenet Cherokee", 1, 36)); // NOI18N
        AddPrdBtn.setForeground(new java.awt.Color(240, 240, 240));
        AddPrdBtn.setLabel("Add Product");
        AddPrdBtn.setMinimumSize(new java.awt.Dimension(310, 55));
        AddPrdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPrdBtnActionPerformed(evt);
            }
        });

        EditPrdBtn.setBackground(new java.awt.Color(0, 204, 0));
        EditPrdBtn.setFont(new java.awt.Font("Plantagenet Cherokee", 1, 36)); // NOI18N
        EditPrdBtn.setForeground(new java.awt.Color(240, 240, 240));
        EditPrdBtn.setLabel("Edit Product");
        EditPrdBtn.setMinimumSize(new java.awt.Dimension(310, 55));
        EditPrdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditPrdBtnActionPerformed(evt);
            }
        });

        RemovePrdBtn.setBackground(new java.awt.Color(0, 204, 0));
        RemovePrdBtn.setFont(new java.awt.Font("Plantagenet Cherokee", 1, 36)); // NOI18N
        RemovePrdBtn.setForeground(new java.awt.Color(240, 240, 240));
        RemovePrdBtn.setLabel("Remove Product");
        RemovePrdBtn.setMinimumSize(new java.awt.Dimension(310, 55));
        RemovePrdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemovePrdBtnActionPerformed(evt);
            }
        });

        ExitBtn.setBackground(new java.awt.Color(255, 0, 0));
        ExitBtn.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        ExitBtn.setForeground(new java.awt.Color(255, 255, 255));
        ExitBtn.setLabel("Exit");
        ExitBtn.setMinimumSize(new java.awt.Dimension(310, 55));
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });

        NotifyBtn.setBackground(new java.awt.Color(51, 204, 0));
        NotifyBtn.setFont(new java.awt.Font("Plantagenet Cherokee", 1, 36)); // NOI18N
        NotifyBtn.setForeground(new java.awt.Color(240, 240, 240));
        NotifyBtn.setLabel("Notifications");
        NotifyBtn.setMinimumSize(new java.awt.Dimension(310, 55));
        NotifyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotifyBtnActionPerformed(evt);
            }
        });

        ShowSalesBtn.setBackground(new java.awt.Color(51, 204, 0));
        ShowSalesBtn.setFont(new java.awt.Font("Plantagenet Cherokee", 1, 36)); // NOI18N
        ShowSalesBtn.setForeground(new java.awt.Color(240, 240, 240));
        ShowSalesBtn.setLabel("Show Sales");
        ShowSalesBtn.setMinimumSize(new java.awt.Dimension(310, 55));
        ShowSalesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowSalesBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RemovePrdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowSalesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NotifyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditPrdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddPrdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(145, 145, 145))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(AddPrdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(EditPrdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(RemovePrdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(ShowSalesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(NotifyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(ExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(137, 137, 137))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ChangeUsernameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeUsernameBtnActionPerformed
        // TODO add your handling code here:
        ChangeUserName GoToChangeUserNamePage = new ChangeUserName();
        GoToChangeUserNamePage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ChangeUsernameBtnActionPerformed

    private void ChangePasswordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePasswordBtnActionPerformed
        // TODO add your handling code here:
        ChangePassword GoToChangePassword = new ChangePassword();
        GoToChangePassword.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ChangePasswordBtnActionPerformed

    private void ChangeDiscBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeDiscBtnActionPerformed
        // TODO add your handling code here:
        ChangeDiscount GoToChangeDiscount = new ChangeDiscount();
        GoToChangeDiscount.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ChangeDiscBtnActionPerformed

    private void EditVatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditVatBtnActionPerformed
        // TODO add your handling code here:
        EditVat GoToEditVat = new EditVat();
        GoToEditVat.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EditVatBtnActionPerformed

    private void AddPrdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPrdBtnActionPerformed
        // TODO add your handling code here:
        AddProduct GoToEditProducts = new AddProduct();
        GoToEditProducts.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AddPrdBtnActionPerformed

    private void ShowPrdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPrdBtnActionPerformed
        // TODO add your handling code here:
        InfoOfProducts Info = new InfoOfProducts();
        AllProducts GoToAllProducts = new AllProducts();
        GoToAllProducts.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ShowPrdBtnActionPerformed

    private void EditPrdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditPrdBtnActionPerformed
        // TODO add your handling code here:
        EditProducts GoToEditProducts = new EditProducts();
        GoToEditProducts.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EditPrdBtnActionPerformed

    private void RemovePrdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemovePrdBtnActionPerformed
        // TODO add your handling code here:
        RemoveProduct GoToRemoveProduct = new RemoveProduct();
        GoToRemoveProduct.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RemovePrdBtnActionPerformed

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
        // TODO add your handling code here:
        ClosingPage GoToClosingPage = new ClosingPage();
        GoToClosingPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ExitBtnActionPerformed

    private void LogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtnActionPerformed
        // TODO add your handling code here:
        HomePage GoToHomePage = new HomePage();
        GoToHomePage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutBtnActionPerformed

    private void NotifyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotifyBtnActionPerformed
        // TODO add your handling code here:
        NotificationsPage GoToNotificationsPage = new NotificationsPage();
        GoToNotificationsPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_NotifyBtnActionPerformed

    private void ShowSalesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowSalesBtnActionPerformed
        // TODO add your handling code here:
        ShowSales GoToShowSales = new ShowSales();
        GoToShowSales.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ShowSalesBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button AddPrdBtn;
    private java.awt.Button ChangeDiscBtn;
    private java.awt.Button ChangePasswordBtn;
    private java.awt.Button ChangeUsernameBtn;
    private java.awt.Button EditPrdBtn;
    private java.awt.Button EditVatBtn;
    private java.awt.Button ExitBtn;
    private java.awt.Button LogoutBtn;
    private java.awt.Button NotifyBtn;
    private java.awt.Button RemovePrdBtn;
    private java.awt.Button ShowPrdBtn;
    private java.awt.Button ShowSalesBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
