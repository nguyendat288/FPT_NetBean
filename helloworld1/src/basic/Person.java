/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;


public class Person {
int age;
String name;

public Person() {
this("Peter");
System.out.print("first ");
}

public Person(String name) {
this(42, "Peter");
System.out.printf("second ");
}

public Person(int age, String name) {
this.age = age;
this.name = name;
System.out.printf("third ");
}

public static void main(String args[]){
Person b = new Person();
System.out.printf(b.name +" " + b.age);
}
}
