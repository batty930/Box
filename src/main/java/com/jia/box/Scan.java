package com.jia.box;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Box3 box3 = new Box3();
        Box5 box5 = new Box5();
        int width; int length; int hight;
        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();
        width = scanner.nextInt();
        hight = scanner.nextInt();
        System.out.println("Please enter length:");
        System.out.println("Please enter width:");
        System.out.println("Please enter hight:");
        if (box3.choise(length,width,hight)){
            box3.getName();
            box3.getPrice();
        }else if (box5.choise(length,width,hight)){
            box5.getName();
            box5.getPrice();
        }
    }
}
