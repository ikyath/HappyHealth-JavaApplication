/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PharmacyInventory;
import Business.Employee.*;

/**
 *
 * @author Harika
 */
public class Pharmacy {
    private String drug;
    private int id;
    private int quantity;
    private static int count = 1;

    public Pharmacy() {
        id = count;
        count++;
    }

    public String getDrug() {
        return drug;
    }

    public void setDrug(String drug) {
        this.drug = drug;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return drug;
    }
    
}
