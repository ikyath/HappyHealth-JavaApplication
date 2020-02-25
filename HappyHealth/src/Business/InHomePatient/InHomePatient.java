/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.InHomePatient;

import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;
import java.util.Date;

/**
 *
 * @author ikyathvarmadantuluri
 */
public class InHomePatient extends UserAccount{
    private String userLoginName;
    private String patientName;

    private String password;
    private int age;
    private String sex;
    private String address;
    private WorkQueue workQueue;
    private Role role;
    private int medId;

    private Date date;
    private static int count = 1;

    
    

    public InHomePatient() {

        medId = count;
        count++;
        workQueue = new WorkQueue();
    }

//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//    
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    
    public String getUserLoginName() {
        return userLoginName;
    }

    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


//    public WorkQueue getWorkQueue() {
//        return workQueue;
//    }
    
    @Override
    public String toString() {
        return patientName;
    }
    
}
