/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtainers.mainui;

import java.awt.Dimension;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Daniel Liao
 */
public class NetworkObjPanel extends javax.swing.JPanel {

    /**
     * Creates new form NetworkObjPanel
     */
    private final MainWindow mainWindow;
    private final LabData.NetworkData data;
    
    // Constructor for loading a network object panel based on a network data object
    NetworkObjPanel(MainWindow mainWindow, LabData.NetworkData data) {
        initComponents();
        this.mainWindow = mainWindow;
        this.data = data;
        
        this.NetworkLabelName.setText(this.data.name);
        this.NetworkMaskLabel.setText(this.data.mask);
        this.RenameNetworkTextfield.setVisible(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NetworkConfigWindow = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NetworkConfigMaskTextfield = new javax.swing.JTextField();
        NetworkConfigGatewayTextField = new javax.swing.JTextField();
        NetworkConfigIPRangeTextfield = new javax.swing.JTextField();
        NetworkConfigCancelButton = new javax.swing.JButton();
        NetworkConfigUpdateButton = new javax.swing.JButton();
        NetworkConfigMacVLanExtSpinner = new javax.swing.JSpinner();
        NetworkConfigMacVLanSpinner = new javax.swing.JSpinner();
        TapRadioButton = new javax.swing.JRadioButton();
        NetworkRightClick = new javax.swing.JPopupMenu();
        renameNetworkOption = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        deleteNetworkOption = new javax.swing.JMenuItem();
        RenameNetworkTextfield = new javax.swing.JTextField();
        NetworkLabelName = new javax.swing.JLabel();
        NetworkMaskLabel = new javax.swing.JLabel();

        NetworkConfigWindow.setMinimumSize(new java.awt.Dimension(377, 335));
        NetworkConfigWindow.setResizable(false);
        NetworkConfigWindow.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                NetworkConfigWindowWindowClosing(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Subnet:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Gateway:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("MACVLAN_EXT:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("MACVLAN:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("IP_RANGE:");

        NetworkConfigCancelButton.setText("Cancel");
        NetworkConfigCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NetworkConfigCancelButtonActionPerformed(evt);
            }
        });

        NetworkConfigUpdateButton.setText("Confirm");
        NetworkConfigUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NetworkConfigUpdateButtonActionPerformed(evt);
            }
        });

        NetworkConfigMacVLanExtSpinner.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        NetworkConfigMacVLanSpinner.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        TapRadioButton.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        TapRadioButton.setText("TAP");

        javax.swing.GroupLayout NetworkConfigWindowLayout = new javax.swing.GroupLayout(NetworkConfigWindow.getContentPane());
        NetworkConfigWindow.getContentPane().setLayout(NetworkConfigWindowLayout);
        NetworkConfigWindowLayout.setHorizontalGroup(
            NetworkConfigWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NetworkConfigWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NetworkConfigWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(NetworkConfigWindowLayout.createSequentialGroup()
                        .addComponent(NetworkConfigUpdateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NetworkConfigCancelButton))
                    .addGroup(NetworkConfigWindowLayout.createSequentialGroup()
                        .addGroup(NetworkConfigWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TapRadioButton, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(NetworkConfigWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NetworkConfigIPRangeTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NetworkConfigMaskTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NetworkConfigGatewayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NetworkConfigMacVLanSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NetworkConfigMacVLanExtSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        NetworkConfigWindowLayout.setVerticalGroup(
            NetworkConfigWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NetworkConfigWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NetworkConfigWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NetworkConfigMaskTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(NetworkConfigWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NetworkConfigGatewayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(16, 16, 16)
                .addGroup(NetworkConfigWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(NetworkConfigMacVLanExtSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(NetworkConfigWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NetworkConfigWindowLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel5))
                    .addGroup(NetworkConfigWindowLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(NetworkConfigMacVLanSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NetworkConfigWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NetworkConfigIPRangeTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TapRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(NetworkConfigWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NetworkConfigUpdateButton)
                    .addComponent(NetworkConfigCancelButton))
                .addContainerGap())
        );

        renameNetworkOption.setText("Rename");
        renameNetworkOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renameNetworkOptionActionPerformed(evt);
            }
        });
        NetworkRightClick.add(renameNetworkOption);
        NetworkRightClick.add(jSeparator1);

        deleteNetworkOption.setText("Delete");
        deleteNetworkOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteNetworkOptionActionPerformed(evt);
            }
        });
        NetworkRightClick.add(deleteNetworkOption);

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setMaximumSize(new java.awt.Dimension(340, 51));
        setMinimumSize(new java.awt.Dimension(340, 51));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(340, 51));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        RenameNetworkTextfield.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        RenameNetworkTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RenameNetworkTextfield.setMinimumSize(new java.awt.Dimension(300, 35));
        RenameNetworkTextfield.setPreferredSize(new java.awt.Dimension(300, 35));
        RenameNetworkTextfield.setRequestFocusEnabled(false);
        RenameNetworkTextfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                RenameNetworkTextfieldFocusLost(evt);
            }
        });
        RenameNetworkTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RenameNetworkTextfieldActionPerformed(evt);
            }
        });
        add(RenameNetworkTextfield);

        NetworkLabelName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        NetworkLabelName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NetworkLabelName.setText("network_name");
        add(NetworkLabelName);

        NetworkMaskLabel.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        NetworkMaskLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NetworkMaskLabel.setText("000.00.0.000/00");
        add(NetworkMaskLabel);
    }// </editor-fold>//GEN-END:initComponents

    private boolean clicked = false;
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
       clickPanelHandler(evt);
    }//GEN-LAST:event_formMouseClicked

    private void renameNetworkOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renameNetworkOptionActionPerformed
        renameNetworkOptionActionPerformed();
    }//GEN-LAST:event_renameNetworkOptionActionPerformed

    private void deleteNetworkOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteNetworkOptionActionPerformed
        deleteNetworkAction();
    }//GEN-LAST:event_deleteNetworkOptionActionPerformed

    private void RenameNetworkTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RenameNetworkTextfieldActionPerformed
        renameNetworkTextfieldActionPerformed();
    }//GEN-LAST:event_RenameNetworkTextfieldActionPerformed

    private void RenameNetworkTextfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RenameNetworkTextfieldFocusLost
        renameNetworkTextfieldFocusLost();
    }//GEN-LAST:event_RenameNetworkTextfieldFocusLost

    private void NetworkConfigWindowWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_NetworkConfigWindowWindowClosing
        clicked = false;
    }//GEN-LAST:event_NetworkConfigWindowWindowClosing

    private void NetworkConfigUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NetworkConfigUpdateButtonActionPerformed
        networkConfigUpdateButton();
    }//GEN-LAST:event_NetworkConfigUpdateButtonActionPerformed

    private void NetworkConfigCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NetworkConfigCancelButtonActionPerformed
        clicked = false;
        NetworkConfigWindow.setVisible(false);
    }//GEN-LAST:event_NetworkConfigCancelButtonActionPerformed

    // BUTTONS and HANDLERS //
    
    // Handles whether or not to open Network Configuration Window or prompt rename/delete options
    private void clickPanelHandler(java.awt.event.MouseEvent evt){
        if(!clicked){
            if(SwingUtilities.isLeftMouseButton(evt)){
                clicked = true;
                loadDataIntoNetworkPanel();
                NetworkConfigWindow.setVisible(true);  
            }
            else if(SwingUtilities.isRightMouseButton(evt))
                NetworkRightClick.show(this, evt.getX(), evt.getY());
        }
    }
    
    // Deletes the network and removes all references to it at the UI and data layer
    private void deleteNetworkAction(){
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete the network '"+data.name+"'?\n"
                                                                     + "Deleting this network will delete all references \n"
                                                                     + "to this network in the Container Configurations as well.", 
                                                    "Delete Network",  JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION){
            mainWindow.getCurrentData().deleteReferenceToNetwork(data.name); //Delete the network in data object
            mainWindow.updateNetworkReferenceInContainerConfigDialogs("Delete",data.name, null); //Delete the network on the immediate UI interface
            JPanel networkPanel = (JPanel)this.getParent();

            // delete the network from the list
            networkPanel.remove(this);
            
            // Shorten the panel height holding all the containers and resize it.
            mainWindow.networkPanePanelLength-=51;
            networkPanel.setPreferredSize(new Dimension(0,mainWindow.networkPanePanelLength));

            // Redraw the panel containing the list of networks
            networkPanel.revalidate();
            networkPanel.repaint();  
        }
    }
    
    // Prompts renaming fields
    private void renameNetworkOptionActionPerformed(){
        // Make the rename textfield visible, active, and all text inside preselected
        RenameNetworkTextfield.setText(data.name);
        RenameNetworkTextfield.setVisible(true);
        RenameNetworkTextfield.requestFocusInWindow();
        RenameNetworkTextfield.selectAll();

        // Hide the original network label
        NetworkLabelName.setVisible(false);
        NetworkMaskLabel.setVisible(false);
    }
    
    // Renames the network and refactors the name at the UI and data layer
    private void renameNetworkTextfieldActionPerformed(){
    // Prompt user to confirm their changes
        String newNetworkName = RenameNetworkTextfield.getText().toUpperCase();
        String oldName = data.name;
        
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to rename the network '"+oldName+"' to '"+newNetworkName+"'?", 
                                                    "Rename Network",  JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION){
            // Rename the network on the data level
            mainWindow.getCurrentData().refactorNetworkName(oldName,newNetworkName);
            
            //Rename the network on the immediate Container Dialog UI
            mainWindow.updateNetworkReferenceInContainerConfigDialogs("Rename",oldName, newNetworkName); 
            
            // Rename the network
            NetworkLabelName.setText(newNetworkName);   
            data.name = newNetworkName;
            //System.out.println("Renamed network to: "+data.name);
        }

        // Hide the textfield and show the network label
        RenameNetworkTextfield.setVisible(false);
        NetworkLabelName.setVisible(true);
        NetworkMaskLabel.setVisible(true);
    
    }
    
    // When User clicks off of the rename textfield
    private void renameNetworkTextfieldFocusLost(){
        // Hide the textfield and show the network label
        RenameNetworkTextfield.setVisible(false);
        NetworkLabelName.setVisible(true);
        NetworkMaskLabel.setVisible(true);
    }
    
    // Updates the data object based on whats in the fields, closes the network configuration window, 
    // (and sets the mask label on the network panel)
    private void networkConfigUpdateButton(){
        // Set the textfield and spinner values into the data Objects
        this.data.mask = this.NetworkConfigMaskTextfield.getText();
        this.data.gateway = this.NetworkConfigGatewayTextField.getText();
        this.data.ip_range = this.NetworkConfigIPRangeTextfield.getText();
        this.data.macvlan_ext = (int) this.NetworkConfigMacVLanExtSpinner.getValue();
        this.data.macvlan = (int) this.NetworkConfigMacVLanSpinner.getValue();
        this.data.tap = this.TapRadioButton.isSelected();
        
        clicked = false;
        NetworkConfigWindow.setVisible(false);
        NetworkMaskLabel.setText(this.data.mask);
    }
    

    // CORE //
    
    // Set the fields of the Network Dialog Window with the data
    private void loadDataIntoNetworkPanel(){
        this.NetworkConfigWindow.setTitle("NetworkConfig: "+this.data.name);
        this.NetworkConfigMaskTextfield.setText(this.data.mask);
        this.NetworkConfigGatewayTextField.setText(this.data.gateway);
        this.NetworkConfigIPRangeTextfield.setText(this.data.ip_range);
        this.NetworkConfigMacVLanExtSpinner.setValue(this.data.macvlan_ext);
        this.NetworkConfigMacVLanSpinner.setValue(this.data.macvlan);
        this.TapRadioButton.setSelected(this.data.tap);
    }
    
    
    // GETTERS //
    
    public LabData.NetworkData getConfigData(){
        return this.data;
    }
    
    public JDialog getNetworkConfigDialog(){
        return NetworkConfigWindow;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NetworkConfigCancelButton;
    private javax.swing.JTextField NetworkConfigGatewayTextField;
    private javax.swing.JTextField NetworkConfigIPRangeTextfield;
    private javax.swing.JSpinner NetworkConfigMacVLanExtSpinner;
    private javax.swing.JSpinner NetworkConfigMacVLanSpinner;
    private javax.swing.JTextField NetworkConfigMaskTextfield;
    private javax.swing.JButton NetworkConfigUpdateButton;
    private javax.swing.JDialog NetworkConfigWindow;
    private javax.swing.JLabel NetworkLabelName;
    private javax.swing.JLabel NetworkMaskLabel;
    private javax.swing.JPopupMenu NetworkRightClick;
    private javax.swing.JTextField RenameNetworkTextfield;
    private javax.swing.JRadioButton TapRadioButton;
    private javax.swing.JMenuItem deleteNetworkOption;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem renameNetworkOption;
    // End of variables declaration//GEN-END:variables
}
