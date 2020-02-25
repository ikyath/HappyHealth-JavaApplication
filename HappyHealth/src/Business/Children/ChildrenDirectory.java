/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Children;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ikyathvarmadantuluri
 */
public class ChildrenDirectory {
    private ArrayList<Children> childList;

    public ChildrenDirectory() {
        childList = new ArrayList();
    }

    public ArrayList<Children> getChildList() {
        return childList;
    }
    
    public Children addChild(String name, Date dob, Date joinDate){
        Children child = new Children();
        child.setChildName(name);
        child.setDob(dob);        
        child.setJoinedDate(joinDate);
        childList.add(child);
        return child;
    }
    
}
