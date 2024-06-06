package org.example.corejava.InnerClassInheritance;

public class ObjectTest {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass2 innerClass2 = outerClass.new InnerClass2();
        innerClass2.display();
    }
}
