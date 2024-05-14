package com.practice;
import java.io.*;
class Maths{
    int c,d,add,sub,mul,div;
    void get(int a,int b){
        c=a;
        d=b;
    }
    void cal(){
        add=c+d;
        sub=c-d;
        mul=c*d;
        div=c/d;
    }
    void display(){
        System.out.println("Addition value:      "+add);
        System.out.println("Subtraction value:   "+sub);
        System.out.println("Multiplication value:"+mul);
        System.out.println("Division value:      "+div);
    }
}
public class Main {

    public static void main(String[] args) throws IOException {
    int a,b;
        System.out.println("Arithmetic Operations");
        System.out.println("*********************");
     DataInputStream d=new DataInputStream(System.in);
        System.out.println("Enter the numbers:");
     a=Integer.parseInt(d.readLine());
     b=Integer.parseInt(d.readLine());
     Maths math=new Maths();
     math.get(a,b);
     math.cal();
     math.display();

    }
}