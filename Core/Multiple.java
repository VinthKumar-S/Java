import java.io.*;
class details
{
    String em1,em2,des1,des2;
    int sal1,sal2,inc1,inc2;
    void get(String e1,String e2,String d1,String d2,int s1,int s2)
    {
        em1=e1;
        em2=e2;
        des1=d1;
        des2=d2;
        sal1=s1;
        sal2=s2;
        inc1=sal1;
        inc2=sal2;
    }
}
interface company{
    final String com="Wippro";
    void place();

}
interface increament{
    int in=5000;
    void increase();
}
class tables extends details implements company,increament {

    public void place() {
        System.out.println("*************"+com+"************");
    }
    public void increase(){
        inc1+=in;
        inc2+=in;
    }
    void tab() {
        System.out.println("Nmae"+"   " +"Designation" +"  "+"Salary" +"  "+ "Increament"+"  "+"Office");
        System.out.println(em1 + "    " + des1 + "   " + sal1+"   "+inc1+"  "+com);
        System.out.println(em2 + "    " + des2 + "   " + sal2+"   "+inc2+"   "+com);
    }

}

public class Multiple
{
	public static void main(String[] args)throws IOException
	{
	    String e1,e2,d1,d2;
        int s1,s2;
        DataInputStream d=new DataInputStream(System.in);
        System.out.println("Enter the name of two Employees");
        e1=new String(d.readLine());
        e2=new String(d.readLine());
        System.out.println("Enter the Designation of two Employees");
        d1=new String(d.readLine());
        d2=new String(d.readLine());
        System.out.println("Enter the Salary of two Employees");
        s1=Integer.parseInt(d.readLine());
        s2=Integer.parseInt(d.readLine());
        tables em=new tables();
        em.get(e1,e2,d1,d2,s1,s2);
        em.place();
        em.increase();
        em.tab();
	}
	}