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
public class MyAbstractClass {
//   - khai bao: abstract
//   - thanh phan: 
//       +properties, constructor, methods
//       + co the co/khong co abstract method
//               note: abstract method chi duoc khai bao 
//                       trong abstractClass/interface     
//abstractClass co contructor --> khong instant truc tiep tu abstractClass
//        ma phai qua subclass
//subclass extends abstractClass --> subclass must be overrided 
//        all abstract methods                
}
//class NormalClass{
//    public abstract String getValue();
//}
class testAbs{
    public static void main(String[] args) {
        AbstractClass obj;//=new AbstractClass(); 
        obj=new SubClass();
    }
}
class SubClass extends AbstractClass{

    @Override
    public void abc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getValue(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

abstract class  AbstractClass{
    private String name;
    public abstract void abc();
    public abstract String getValue(String value);
    public AbstractClass() {
    }

    public AbstractClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AbstractClass{" + "name=" + name + '}';
    }
    
}
