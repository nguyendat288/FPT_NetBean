/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package play;

/**
 *
 * @author Admin
 */
public class PlayerIncome extends Player implements  Tax{
private double income;

    public PlayerIncome(double income) {
        this.income = income;    
    }

    public PlayerIncome() {
    }

    @Override
    String displayDetails() {
        return this.name;
    }
//- Khoản tiền <= $10000 áp mức thuế 15%
//- Khoản tiền > $10000 và <= $20000 áp mức thuế 20%
//- Khoản tiền $20000 áp mức thuế 30%
//Ngoài ra cần viết đè (override) phương thức displayDetails().

    @Override
    public double calculateTax() {
        if(this.income<=10000){
            return this.income-this.income*0.15;
        }else if(this.income<=20000){
           return this.income-this.income*0.2;
        }else{
            return this.income-this.income*0.3;
        }
    }
    
}
