/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Children.ChildrenDirectory;
import Business.Employee.EmployeeDirectory;
import Business.InHomePatient.InHomePatientDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Harika
 */
public abstract class Organization {
    
    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private InHomePatientDirectory inHomePatientDirectory;
    private ChildrenDirectory childDirectory;
    private int organizationID;
    
    private static int counter=1;
    
    public enum Type{
        EnterpriseAdmin("EnterpriseAdmin Organization"), Doctor("Doctor Organization"), Staff("Staff Organization"),
        Delivery("Delivery Organization"), Medicine("Medicines Organization"),
        CareTaker("CareTaker"), MedicalRecord("Medical Record Organisation"), Patient("Patient Organization"), Pharmacist("Pharmacist Organization");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public int getOrganizationID() {
        return organizationID;
    }

    
    
    
    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        inHomePatientDirectory = new InHomePatientDirectory();
        userAccountDirectory = new UserAccountDirectory();
        childDirectory = new ChildrenDirectory();
        organizationID = counter;
        ++counter;
    }

    public InHomePatientDirectory getInHomePatientDirectory() {
        return inHomePatientDirectory;
    }

    public void setInHomePatientDirectory(InHomePatientDirectory inHomePatientDirectory) {
        this.inHomePatientDirectory = inHomePatientDirectory;
    }
    

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    

    public ChildrenDirectory getChildDirectory() {
        return childDirectory;
    }

    public void setChildDirectory(ChildrenDirectory childDirectory) {
        this.childDirectory = childDirectory;
    }
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
