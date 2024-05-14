package com.practice;
class add {
    int c;

    void run(int a, int b) {
        c = a + b;
        System.out.println("Addition:" +" "+ c);
    }
}
    class sub extends add{
     void run2(){
         System.out.println("this is inheritance class");
     }
    }


public class Main {

    public static void main(String[] args) {
        System.out.println("inheritance");
        sub s=new sub();
        s.run(10,20);
        s.run2();
    }
}
