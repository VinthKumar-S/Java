package com.practice;
class Student {
    int rollno;
    String name;
    static String collage = "Vhnsnc";

    static void changed() {   //static method  we don't call in main methode
        collage = "BBDIT";
    }

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + collage); //normal we call in main
    }
}

        public class Main{
        public static void main(String[] args) {
            Student.changed();
            Student s1 = new Student(111, "Karthi");
            Student s2 = new Student(222, "madhavan");
            s1.display();
            s2.display();
        }
        }

