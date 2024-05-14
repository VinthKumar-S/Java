package com.practice;
class a{
    a(){
        System.out.println("a");
    }
    a(int i,int j){
        System.out.println("i,a");
    }

}
class b extends a{
    b(){
        System.out.println("b");
    }
    b(int i){
        super();
        System.out.println("i,b");
    }
}
public class Main {

    public static void main(String[] args) {
        System.out.println("Super Keyword");
        b obj=new b(10);
    }
}
