/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.InHomePatient.InHomePatient;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.StaffOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.StaffRole.StaffWorkAreaPanel;

/**
 *
 * @author ikyathvarmadantuluri
 */
public class StaffRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
        return new StaffWorkAreaPanel(userProcessContainer, account, (StaffOrganization) organization, enterprise, system,network);
    }
}
