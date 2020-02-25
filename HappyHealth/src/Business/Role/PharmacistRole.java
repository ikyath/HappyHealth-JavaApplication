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
import Business.Organization.PharmacistOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.PharmacistRole.PharmacistWorkAreaPanel;

/**
 *
 * @author Mounica Dantuluri
 */
public class PharmacistRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,  Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
        return new PharmacistWorkAreaPanel(userProcessContainer, account, (PharmacistOrganization) organization, enterprise, network, system);
    }
    
}
