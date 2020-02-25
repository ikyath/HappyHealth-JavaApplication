/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;
import Business.Enterprise.Enterprise;
import java.util.Date;

/**
 *
 * @author Harika
 */
public class DoctorByHospitalWorkRequest extends WorkRequest {
    private Date requestingDate;
    private String doctorName;
    private String Active;

    public String getActive() {
        return Active;
    }

    public void setActive(String Active) {
        this.Active = Active;
    }

    public Date getRequestingDate() {
        return requestingDate;
    }

    public void setRequestingDate(Date requestingDate) {
        this.requestingDate = requestingDate;
    }
    
    public String getdoctorName() {
        return doctorName;
    }

    public void setdoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    
     @Override
   public String toString(){
       return doctorName==null ? "Waiting" : doctorName;

    
}
}
