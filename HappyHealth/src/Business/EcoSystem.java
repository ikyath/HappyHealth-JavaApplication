/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import Business.InHomePatient.InHomePatient;
import Business.InHomePatient.InHomePatientDirectory;
import Business.Organization.Organization;
import Business.Network.Network;
import Business.Role.MainAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Harika
 */
public class EcoSystem extends Organization{
    private static EcoSystem business;
    private ArrayList<Network> networkList;
     
//    private ArrayList<InHomePatientDirectory> patientList;
//
//    public ArrayList<InHomePatientDirectory> getPatientList() {
//        return patientList;
//    }
//
//    public void setPatientList(ArrayList<InHomePatientDirectory> patientList) {
//        this.patientList = patientList;
//    }
    
    
    

    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new MainAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        networkList=new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }
    
}