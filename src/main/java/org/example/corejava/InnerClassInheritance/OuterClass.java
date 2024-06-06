package org.example.corejava.InnerClassInheritance;

public class OuterClass {
    int instanceVariable = 10;
    static int classVariable = 20;

    class InnerClass1 {
        int innerClassVariable1 = 20;
    }

    class InnerClass2 extends InnerClass1 {
        int innerClassVariable2 = 20;
        void display() {
            System.out.println(instanceVariable + classVariable + innerClassVariable1 + innerClassVariable2);
        }
    }
}
