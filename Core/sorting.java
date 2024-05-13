
import java.io.*;
public class sorting{

    public static void main(String[] args)throws IOException
    {
        int choice,temp;
              int[] arr=new int[5];
	DataInputStream d=new DataInputStream(System.in);
        System.out.println("Sorting operating using array");
        System.out.println("--------------------------------");
        System.out.println("1.Asending order 2.Desending order");
        do{
            System.out.println("to Enter your choice:");
            choice=Integer.parseInt(d.readLine());
            switch (choice) {
                case 1:
                    System.out.println("Asending");
                    System.out.println("Enter the element");
                    for (int i = 0; i < arr.length; i++)
                    {
                        arr[i]=Integer.parseInt(d.readLine());
                    }
                    System.out.println("The elements are:");
                    int i;
                    for(i=0; i<arr.length; i++){
                        System.out.println(arr[i]+"\t");
                    }
                    for (i = 0; i < arr.length; i++)
                    {
                        for (int j= 0; j< arr.length; j++)
                        {
                            if(arr[i]>arr[j])
                            {
                                temp=arr[i];
                                arr[i]=arr[j];
                                arr[j]=temp;
                            }
                        }
                    }
                    System.out.println("Asending ");
                    for (i = 0; i < arr.length; i++)
                    {
                        System.out.println(arr[i]+"\t");
                    }
                    break;

                case 2:
                    System.out.println("Dsending");
                    System.out.println("Enter the element");
                    for ( i = 0; i < arr.length; i++)
                    {
                        arr[i]=Integer.parseInt(d.readLine());
                    }
                    System.out.println("The elements are:");
                    for(i=0; i<arr.length; i++){
                        System.out.println(arr[i]+"\t");
                    }
                    for (i = 0; i < arr.length; i++)
                    {
                        for (int j= 0; j< arr.length; j++)
                        {
                            if(arr[i]<arr[j])
                            {
                                temp=arr[i];
                                arr[i]=arr[j];
                                arr[j]=temp;
                            }
                        }
                    }
                    System.out.println("Dsending ");
                    for (i = 0; i <arr.length; i++)
                    {
                        System.out.println(arr[i]+"\t");
                    }
                    break;
            }
        }while (choice>0);
    }
}
