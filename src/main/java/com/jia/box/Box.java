package com.jia.box;

public abstract class Box {
    int width; int length; int hight;

    public boolean choise (int a, int b, int c){
        return (a<=width && b<=length && c<=hight);
    }
    public abstract void getName();
    public abstract void getPrice();

}
