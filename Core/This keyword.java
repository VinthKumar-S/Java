package com.practice;
class student{
    int rollno;
    String name;
    student(int rollno,String name){
      this.rollno=rollno;
      this.name=name;
    }
    void display(){
        System.out.println(rollno+" "+name);
    }
}
public class Main {

    public static void main(String[] args) {
    student s1=new student(111,"arun");
    s1.display();
    }
}
