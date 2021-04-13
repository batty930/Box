package com.jia.box;

public class Box3 extends Box {
    public Box3(){
        length = 10;
        width = 10;
        hight = 10;
    }
    @Override
    public void getName() {
        System.out.print("Box3");
    }

    @Override
    public void getPrice() {
        System.out.print("60");
    }
}
