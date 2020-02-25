/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PharmacyInventory;

import java.util.ArrayList;

/**
 *
 * @author Harika
 */
public class PharmacyDirectory {
    private ArrayList<Pharmacy> drugsList;
    
    public PharmacyDirectory(){
        drugsList = new ArrayList<>();
    }
    
    public ArrayList<Pharmacy> getDrugsList() {
        return drugsList;
    }
    
    public Pharmacy addDrug(String name, Integer qty){
        Pharmacy drug = new Pharmacy();
        drug.setDrug(name);
        drug.setQuantity(qty);
        drugsList.add(drug);
        return drug;
    }
    
    public void removeDrug(Pharmacy drug){
        drugsList.remove(drug);
    }
}
