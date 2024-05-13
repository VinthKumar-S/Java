
import java.io.*;
class square
{
    int a,s;
    square(int s)
    {
        this.s=s;
        a=s*s;
    }

     square() {

    }

    void display()
    {
        System.out.println("Area of Square:"+a);
    }
}
class rectangle extends square
{
    int w,h;
    rectangle(int w,int h)
    {
        super();
        this.w=w;
        this.h=h;
        a=w*h;
    }
  
    void display() {
        System.out.println("Area of Rectangle;"+a);
    }
}
public class override {

    public static void main(String[] args)throws IOException {
	int w,h,s;
	DataInputStream d=new DataInputStream(System.in);
        System.out.println("Enter the wealth and Hight:");
	w=Integer.parseInt(d.readLine());
	h=Integer.parseInt(d.readLine());
        System.out.println("Enter the Sq units:");
	s=Integer.parseInt(d.readLine());
	 square arr=new square(s);
	 rectangle are=new rectangle(w,h);
	 are.display();

    }
}
