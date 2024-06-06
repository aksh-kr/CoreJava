package org.example.corejava.InnerClass;

public class OuterClass {
    int instanceVariable = 10;
    int classVariable = 20;

    class InnerClass{
        public void print() {
            System.out.println(instanceVariable+classVariable);
        }
    }
}
