import java.io.*;
	public class even
{

    public static void main(String[] args)throws IOException
    {
        int num2;
        DataInputStream d =new DataInputStream(System.in);
        System.out.println("Enter the number:");
        num2=Integer.parseInt(d.readLine());
	 for (int j = 1; j<= num2; j++)
        {
            if (j % 2 == 0)
            {
                System.out.println(j + " ");
            }
        }
       


    }
}