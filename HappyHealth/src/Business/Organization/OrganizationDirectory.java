/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;
import Business.Organization.Organization.Type;

/**
 *
 * @author Harika
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
       }
        else if (type.getValue().equals(Type.Staff.getValue())){
            organization = new StaffOrganization();
            organizationList.add(organization);
        }
        
//        else if (type.getValue().equals(Type.MedicalRecord.getValue())){
//            organization = new MedRecOrganization();
//            organizationList.add(organization);
//        }
        
        else if (type.getValue().equals(Type.CareTaker.getValue())){
            organization = new CareTakerOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.Delivery.getValue())){
            organization = new DeliveryOrganization();
            organizationList.add(organization);
     }
        
        else if (type.getValue().equals(Type.Pharmacist.getValue())){
            organization = new PharmacistOrganization();
            organizationList.add(organization);
     }
        
        return organization;
   }
}
