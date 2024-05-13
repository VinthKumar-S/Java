
import java.io.*;
class mark{
    int a,b,c,d,e,no;
    String n;
    void mark(int m1,int m2,int m3,int m4,int m5,int rollno,String name){
        a=m1;
        b=m2;
        c=m3;
        d=m4;
        e=m5;
        System.out.println("Student name:"+name);
        System.out.println("Student Roll Number:"+rollno);
        System.out.println("tamil:"+a+" "+",English:"+b+" "+",Maths:"+c+" "+",chemistry:"+d+" "+",Physics:"+e);
    }
}

class Average extends mark {

    void Display()
    {
        int total;
        total=a+b+c+d+e;
        System.out.println("total mark:"+total);
        float ave= total/5;
        System.out.println("the Average marks:"+ave);
    }
}
public class  {

    public static void main(String[] args)throws IOException {
    int m1,m2,m3,m4,m5,rollno;
    String name;
        System.out.println("Single Inheritance");
        System.out.println("*******************");

    DataInputStream d=new DataInputStream(System.in);
        System.out.println("Enter the Name:");
        name=new String(d.readLine());
        System.out.println("Enter the roll number:");
        rollno=Integer.parseInt(d.readLine());

        System.out.println("Enter the marks for 5 subjects:");
        m1=Integer.parseInt(d.readLine());
        m2=Integer.parseInt(d.readLine());
        m3=Integer.parseInt(d.readLine());
        m4=Integer.parseInt(d.readLine());
        m5=Integer.parseInt(d.readLine());

         Average ave=new Average();
         ave.mark(m1,m2,m3,m4,m5,rollno,name);
         ave.Display();
    }
}
