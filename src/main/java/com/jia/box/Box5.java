package com.jia.box;

public class Box5 extends Box {
    public Box5(){
        length = 10;
        width = 5;
        hight = 5;
    }
    @Override
    public void getName() {
        System.out.print("Box5");
    }

    @Override
    public void getPrice() {
        System.out.print("40");
    }
}

