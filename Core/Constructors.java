package com.practice;
import java.io.*;
class car {
    int speed;
    String color;

    car(){
            speed = 100;
            color = "white";
            System.out.println("Audi");
            System.out.println("the given speed:" + speed);
            System.out.println("the color of car:" + color);
        
    }

    car(int s, String c) {
       speed=s;
       color=c;
       System.out.println(" We have this type of car");
    }
}
public class Main {

    public static void main(String[] args)throws   IOException {
	int s;
	String c;
        System.out.println("Constructors");

    DataInputStream d=new DataInputStream(System.in);
        System.out.println("how much speed you want?:");
    s=Integer.parseInt(d.readLine());
        System.out.println("what colour you want?:");
    c=new String(d.readLine());
        car buyed=new car();
        car choice=new car(s,c);

    }
}
