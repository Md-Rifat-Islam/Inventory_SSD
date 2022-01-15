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
public class ProductInfo extends javax.swing.JPanel {

    /**
     * Creates new form ProductInfo
     */
    public ProductInfo() {
        initComponents();
    }
    
    public void SetName(String name){
        PrdName.setText(name);
    }
    public void SetId(int id){
        PrdId.setText(Integer.toString(id));
    }
    public void SetPrice(float price){
        PrdPrice.setText(Float.toString(price));
    }
    public void SetSellPrice(float price){
        PrdSellingPrice.setText(Float.toString(price));
    }
    public void SetQty(int qty){
        PrdQty.setText(Integer.toString(qty));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PrdName = new javax.swing.JLabel();
        PrdPrice = new javax.swing.JLabel();
        PrdId = new javax.swing.JLabel();
        PrdSellingPrice = new javax.swing.JLabel();
        PrdQty = new javax.swing.JLabel();
        PrdId1 = new javax.swing.JLabel();
        PrdId2 = new javax.swing.JLabel();
        PrdId3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 0));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        PrdName.setFont(new java.awt.Font("GungsuhChe", 0, 18)); // NOI18N
        PrdName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PrdName.setText("jLabel1");

        PrdPrice.setFont(new java.awt.Font("GungsuhChe", 0, 18)); // NOI18N
        PrdPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PrdPrice.setText("jLabel1");

        PrdId.setFont(new java.awt.Font("GungsuhChe", 0, 18)); // NOI18N
        PrdId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PrdId.setText("jLabel1");

        PrdSellingPrice.setFont(new java.awt.Font("GungsuhChe", 0, 18)); // NOI18N
        PrdSellingPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PrdSellingPrice.setText("jLabel1");

        PrdQty.setFont(new java.awt.Font("GungsuhChe", 0, 18)); // NOI18N
        PrdQty.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PrdQty.setText("jLabel1");

        PrdId1.setFont(new java.awt.Font("GungsuhChe", 0, 18)); // NOI18N
        PrdId1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PrdId1.setText("Buy Price");

        PrdId2.setFont(new java.awt.Font("GungsuhChe", 0, 18)); // NOI18N
        PrdId2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PrdId2.setText("Sell Price");

        PrdId3.setFont(new java.awt.Font("GungsuhChe", 0, 18)); // NOI18N
        PrdId3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PrdId3.setText("Qty");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PrdId3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PrdQty, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PrdId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PrdName, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PrdId1)
                                .addGap(18, 18, 18)
                                .addComponent(PrdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PrdId2)
                                .addGap(18, 18, 18)
                                .addComponent(PrdSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrdId)
                    .addComponent(PrdName))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrdId1)
                    .addComponent(PrdPrice))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrdId2)
                    .addComponent(PrdSellingPrice))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrdId3)
                    .addComponent(PrdQty))
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PrdId;
    private javax.swing.JLabel PrdId1;
    private javax.swing.JLabel PrdId2;
    private javax.swing.JLabel PrdId3;
    private javax.swing.JLabel PrdName;
    private javax.swing.JLabel PrdPrice;
    private javax.swing.JLabel PrdQty;
    private javax.swing.JLabel PrdSellingPrice;
    // End of variables declaration//GEN-END:variables
}
