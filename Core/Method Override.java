package com.practice;
class a1{
    void display(){
        System.out.println("a1.class");
    }
}
class b1 extends a1{
    void display(){
        System.out.println("b1.class");
    }
}
public class Main {

    public static void main(String[] args) {
        System.out.println("Methode Override");
        b1 obj=new b1();
        obj.display();
    }
}
