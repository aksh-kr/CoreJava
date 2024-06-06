package org.example.corejava.InnerClass;

public class ObjectTest {
    public static void main(String[] args) {
        OuterClass outerClassObj = new OuterClass();

        OuterClass.InnerClass innerClassObj = outerClassObj.new InnerClass();
        innerClassObj.print();
    }
}
