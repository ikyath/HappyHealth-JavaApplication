/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Children;

import java.util.Date;

/**
 *
 * @author ikyathvarmadantuluri
 */
public class Children {
    
    private int id;
    private String childName;
    private Date dob;
    private Date joinedDate;

    private static int count = 1;

    public Children() {
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(Date joinedDate) {
        this.joinedDate = joinedDate;
    }

    @Override
    public String toString() {
        return childName;
    }
    
}
