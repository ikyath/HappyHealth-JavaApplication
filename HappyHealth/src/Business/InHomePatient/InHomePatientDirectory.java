/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.InHomePatient;

import java.util.ArrayList;


/**
 *
 * @author ikyathvarmadantuluri
 */
public class InHomePatientDirectory {
    
    private ArrayList<InHomePatient> patientList;

    public InHomePatientDirectory() {
        this.patientList = new ArrayList<InHomePatient>();
    }

    public ArrayList<InHomePatient> getPatientList() {
        return patientList;
    }
    
    public InHomePatient createPatient(String username,String name,String password, int age, String sex, String address){
        InHomePatient patient = new InHomePatient();
        patient.setUserLoginName(username);
        patient.setPassword(password);
        patient.setPatientName(name);
        patient.setAge(age);
        patient.setSex(sex);
        patient.setAddress(address);
        patientList.add(patient);
        return patient;
        
    }
    
    public InHomePatient authenticateUser(String username, String password){
        for (InHomePatient hp : patientList)
            if (hp.getUserLoginName().equals(username) && hp.getPassword().equals(password)){
                return hp;
            }
        return null;
    }
    
}
