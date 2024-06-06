package org.example.corejava.AnonymousClass;

public class Test {
    public static void main(String[] args) {

        Car audiCarObj = new Car() {
            @Override
            public void pressBreak() {
                //audi specific implementation here
                System.out.println("Press break");
            }
        };

        audiCarObj.pressBreak();
    }
}
