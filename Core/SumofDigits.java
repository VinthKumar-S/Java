
import java.io.*;

interface  formula
{
    void execute();
}

class sum implements formula
{
  int n,result=0,store;;

  void get(int in)
  {
      n=in;
  }
  public void  execute()
  {
      while (n>0)
      {
          store=n%10;
          result=result+store ;
            n=n/10;
      }
      System.out.println("Sum of digites:"+result);
    }


}

public class SumofDigits {

    public static void main(String[] args)throws  IOException {
        int in;
        DataInputStream d=new DataInputStream(System.in);
        System.out.println("The sum of digits:");
        System.out.println("Enter the number:");
        in=Integer.parseInt(d.readLine());
        sum s=new sum();
        s.get(in);
        s.execute();

    }
    }



