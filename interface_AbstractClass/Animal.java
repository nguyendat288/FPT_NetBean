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
public interface Animal {

    int Min = 1;
    public static int Max = 1000;

    public void sound();

    public void eat(String food);
}
// use: subclass implemetns interface
//      subclass must be overrided all methods of interface   
interface Bird{
    public void fly();
}
interface AnimalBird extends Animal,Bird{
    public void run();
}
class Duck implements AnimalBird{
    @Override
    public void run() {
        System.out.println("duck can run");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void sound() {
        System.out.println("duck sound quoac quoac");
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void eat(String food) {
        System.out.println("duck eat "+food);
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void fly() {
        System.out.println("duck can't fly");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

class Chick implements Animal,Bird{
    @Override
    public void sound() {
        System.out.println("o o o");
    }
    @Override
    public void eat(String food) {
        System.out.println("Chick eat "+food);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void fly() {
        System.out.println("Chick can fly");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("meo meo");
    }

    @Override
    public void eat(String food) {
        System.out.println("myCat eat " + food);
    }
}

class Dog implements Animal {

    private String name;

    public void eat(String food) {
        System.out.println("my dog eat " + food);
    }

    public void sound() {
        System.out.println("go go go");
    }

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class Test {

    public static void main(String[] args) {
        // Animal obj=new Animal();
        Animal obj = new Dog();
        obj.eat("meat");
        obj.sound();
        // obj.setName("abs");
        obj = new Cat();
        obj.eat("fish");
        obj.sound();
        //
        obj=new Chick();
        obj.eat("abc");
        obj.sound();
        
       // obj.fly();
       Bird objB=new Chick();
       objB.fly();
       Chick chick=new Chick();
       chick.eat("xyz");
       chick.sound();
       chick.fly();
       AnimalBird objAB=new Duck();
      // objAB=new Dog();
      objAB.eat("abcxuz");
      objAB.fly();
      objAB.sound();
      objAB.run();
    }
}
