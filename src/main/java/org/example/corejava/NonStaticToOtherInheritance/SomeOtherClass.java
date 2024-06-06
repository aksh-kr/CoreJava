package org.example.corejava.NonStaticToOtherInheritance;

public class SomeOtherClass extends OuterClass.InnerClass{
    SomeOtherClass(){
        new OuterClass().super();
        //when child class constructor is invoked, it first invokes the constructor of parent
        //but here the parent is Inner class, so it can only be accessed by the object of OuterClass only
    }

    public void display1() {
        display();
    }
}
