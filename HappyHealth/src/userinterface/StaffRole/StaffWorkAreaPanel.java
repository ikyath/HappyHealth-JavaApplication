/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StaffRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.PharmacyEnterprise;
import Business.InHomePatient.InHomePatient;
import Business.Network.Network;
import Business.Organization.StaffOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DoctorByHospitalWorkRequest;
import Business.WorkQueue.PharmacyWorkRequest;
import Business.WorkQueue.StaffWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ikyathvarmadantuluri
 */
public class StaffWorkAreaPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount account;
    private StaffOrganization staffOrganization;
    private Enterprise enterprise;
    private EcoSystem system;
    private Network network;
    
    /**
     * Creates new form StaffWorkAreaPanel
     */


    public StaffWorkAreaPanel(JPanel userProcessContainer, UserAccount account, StaffOrganization staffOrganization, Enterprise enterprise, EcoSystem system, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.staffOrganization = staffOrganization;
        this.enterprise = enterprise;
        this.system = system;
        this.network=network;
        populateRequestTable();
    }
    
    public void populateRequestTable() {
        //System.out.println("Testing123");
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);
        
        for (WorkRequest request : system.getWorkQueue().getWorkRequestList()) {
            if (request instanceof PharmacyWorkRequest && request.getActiveLead().equalsIgnoreCase("Staff") && network.getName().equalsIgnoreCase(request.getCity())) {
                Object[] row = new Object[8];
                row[0] = ((PharmacyWorkRequest) request).getDrugName();
                row[1] = ((PharmacyWorkRequest) request).getDrugQuantity();
                row[2] = ((PharmacyWorkRequest) request).getSender().getUsername();
                row[3] = ((PharmacyWorkRequest) request).getReceiver();
                row[4] = ((PharmacyWorkRequest) request).getRequestDate();
                row[5] = ((PharmacyWorkRequest) request).getResolveDate();
                row[6] = ((PharmacyWorkRequest) request).getStatus();
                /* String result = ((StaffWorkRequest) request).getTestResult();
                 row[3] = result == null ? "Waiting" : result;
                 */
                
                model.addRow(row);
            }
        
    }}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDrugQuantity = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDrugName = new javax.swing.JTextField();
        SubmitButton = new javax.swing.JButton();
        enterpriseLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 102));
        setLayout(null);

        txtDrugQuantity.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtDrugQuantity.setForeground(new java.awt.Color(0, 102, 102));
        add(txtDrugQuantity);
        txtDrugQuantity.setBounds(440, 530, 111, 31);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Item Quantity*:");
        add(jLabel2);
        jLabel2.setBounds(232, 534, 160, 21);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Item Name :");
        add(jLabel3);
        jLabel3.setBounds(232, 488, 150, 21);

        txtDrugName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtDrugName.setForeground(new java.awt.Color(0, 102, 102));
        txtDrugName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDrugNameActionPerformed(evt);
            }
        });
        add(txtDrugName);
        txtDrugName.setBounds(440, 480, 111, 31);

        SubmitButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SubmitButton.setForeground(new java.awt.Color(0, 102, 102));
        SubmitButton.setText("Submit Request");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });
        add(SubmitButton);
        SubmitButton.setBounds(360, 600, 167, 29);

        enterpriseLabel1.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        enterpriseLabel1.setForeground(new java.awt.Color(0, 102, 102));
        enterpriseLabel1.setText("Request Medicines for Hospital");
        add(enterpriseLabel1);
        enterpriseLabel1.setBounds(599, 220, 580, 80);

        workRequestJTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        workRequestJTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Drug Name", "Drug Quantity", "Sender", "Receiver", "Requested Date", "Accepted Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(232, 330, 1163, 125);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/Health Services.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1600, 1200);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDrugNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDrugNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDrugNameActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        //Date reqDate = RequestingDateTextField.getDate();
        int drugQuantity;
        String mess = txtDrugName.getText();
        try{
            drugQuantity = Integer.parseInt(txtDrugQuantity.getText());
            
        }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null, "Quantity can only be numeric");

            return;
        }
        if (mess.equalsIgnoreCase("") || txtDrugQuantity.getText().equalsIgnoreCase("")) {

            JOptionPane.showMessageDialog(null, "Please enter both the mandatory fields");
        } else if (drugQuantity <= 0) {

            JOptionPane.showMessageDialog(null, "Quantity should be greater than 0! ");
        } else
        
         {
            PharmacyWorkRequest request = new PharmacyWorkRequest();
            request.setDrugQuantity(drugQuantity);
            request.setDrugName(mess);
            request.setReceiver(null);
            request.setRequestDate(new Date());
            request.setResolveDate(null);
            request.setStatus("Requested");
            request.setInhomepatient(null);
            request.setCity(network.getName());
            request.setActiveLead("Staff");
            request.setSender(account);
            
            Enterprise ent = null;
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise instanceof PharmacyEnterprise) {
                    ent = enterprise;
                    break;
                }
            }
            if (ent != null) {
                ent.getWorkQueue().getWorkRequestList().add(request);
                
            }
            request.setEnterprise(ent);
            request.setActiveLead("Staff");
            System.out.println(request);

            
                        system.getWorkQueue().getWorkRequestList().add(request);

                        //System.out.println();

                        //System.out.println("Testing");
                        populateRequestTable();
                        //System.out.println(userAccount.getWorkQueue().getWorkRequestList().get(0).toString());
                        //System.out.println(userAccount.getWorkQueue().getWorkRequestList().get(1).toString());

                    }

                    //RequestingDateTextField.setDate(null);
                    txtDrugName.setText("");
                    txtDrugQuantity.setText("");
    }//GEN-LAST:event_SubmitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SubmitButton;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDrugName;
    private javax.swing.JTextField txtDrugQuantity;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
