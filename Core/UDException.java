
import java.io.*;
public class UDException {

    public static void main(String[] args)throws IOException {
        int amount;
        DataInputStream d=new DataInputStream(System.in);
        System.out.println("Enter the amount:");
        amount=Integer.parseInt(d.readLine());
            try
            {
               if(amount<500) {
                   System.out.println("cash with draw from your account Rs:"+amount);
               }
              else  if(amount>1000&& amount<1500) {
                    System.out.println("Half of the amount withdraw from your account Rs:"+amount);
                }
               else if(amount>1500)
                   throw new Exception();

            }
            catch (Exception ex)
            {
                System.out.println("you must have minimum 500 Rs on your account..");
            }

    }
}