/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ManageEnterpriseAdmin;


import Business.EcoSystem;
import Business.Enterprise.Enterprise;

import Business.Network.Network;

import Business.UserAccount.UserAccount;

import Business.WorkQueue.PharmacyWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ikyathvarmadantuluri
 */
public class PharmacyViewServicesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PharmacyViewServicesJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Network network;
    private UserAccount userAccount;
    private EcoSystem system;
    
    public PharmacyViewServicesJPanel(JPanel userProcessContainer, Enterprise enterprise, Network network, UserAccount userAccount, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.network = network;
        this.userAccount = userAccount;
        this.system = system;

        
        //ecosystem = ConfigureASystem.configure();
        populateRequestTable();
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        enterpriseLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 102));
        setLayout(null);

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/Back.PNG"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(12, 13, 66, 60);

        enterpriseLabel1.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        enterpriseLabel1.setForeground(new java.awt.Color(0, 102, 102));
        enterpriseLabel1.setText("Medicine Requests");
        add(enterpriseLabel1);
        enterpriseLabel1.setBounds(360, 20, 340, 80);

        workRequestJTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        workRequestJTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Drug Name", "Drug Quantity", "Requested Date", "Accepted Date", "Expected Delivery Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(200, 460, 1090, 180);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/pharmacy.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1600, 1200);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);
        
        for (WorkRequest request : system.getWorkQueue().getWorkRequestList()) {
            if(request!=null){
            if (request instanceof PharmacyWorkRequest && request.getEnterprise().getEnterpriseType().getValue()==enterprise.getEnterpriseType().getValue() && network.getName().equalsIgnoreCase(request.getCity())) {
                Object[] row = new Object[6];
                row[0] = ((PharmacyWorkRequest) request);
                row[1] = ((PharmacyWorkRequest) request).getDrugQuantity();
                row[2] = ((PharmacyWorkRequest) request).getRequestDate();
                row[3] = ((PharmacyWorkRequest) request).getResolveDate();
                row[4] = ((PharmacyWorkRequest) request).getExpectedDeliveryDate();
                row[5] = ((PharmacyWorkRequest) request).getStatus();
                /* String result = ((StaffWorkRequest) request).getTestResult();
                 row[3] = result == null ? "Waiting" : result;
                 */
                model.addRow(row);
            }
            }
            
    }}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
