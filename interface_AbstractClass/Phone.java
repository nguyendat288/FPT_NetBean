/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_AbstractClass;

/**
 *
 * @author DELL
 */
public abstract class Phone {
    private String name;

    public Phone() {
    }

    public Phone(String name) {
        this.name = name;
    }
    public abstract void defaultRing();
}
class SamSung extends Phone{

    @Override
    public void defaultRing() {
        
        System.out.println("default ring of samsung");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
class IPhone extends Phone{

    @Override
    public void defaultRing() {
        System.out.println("default ring of Apple");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
class TestPhone{
    public static void main(String[] args) {
        Phone phone;
        phone=new SamSung();
        phone.defaultRing();
        phone=new IPhone();
        phone.defaultRing();
    }
}
