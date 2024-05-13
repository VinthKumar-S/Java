
import java.io.*;


public class Methodes_of_String{

    public static void main(String[] args)throws IOException {
        int ch;
        String result;
        System.out.println("String methods:");
        System.out.println("**************");
        System.out.println("1.Lower case,2.Upper case,3.Length,4.Concatination,5.Equal,6.Indexing value:");
        DataInputStream d = new DataInputStream(System.in);
        do {
            System.out.println("Enter your choice:");
            ch = Integer.parseInt(d.readLine());
            switch (ch)
            {
                case 1:
                    String s1;
                    System.out.println("Lowercase");
                    System.out.println("Enter the String:");
                    s1 = new String(d.readLine());
                    result = s1.toLowerCase();
                    System.out.println("Lower case:" + result);
                    break;
                case 2:
                    String s2;
                    System.out.println("Uppercase");
                    System.out.println("Enter the String:");
                    s2 = new String(d.readLine());
                    result = s2.toUpperCase();
                    System.out.println("Upper case:" + result);
                    break;
                case 3:
                    String s3;
                    int value;
                    System.out.println("Length of the String");
                    System.out.println("Enter the string:");
                    s3 = new String(d.readLine());
                    value = s3.length();
                    System.out.println("Length:" + value);
                    break;
                case 4:
                    String s4, s5;
                    System.out.println("Enter the two  String for concatination");
                    s4 = new String(d.readLine());
                    System.out.println("Enter the second String:");
                    s5 = new String(d.readLine());
                    result = s4.concat(s5);
                    System.out.println("Cancatination:" + result);
                    break;

                case 5:
                    String s6, s7;
                    System.out.println("Enter the two  Strings to chack equal or not");
                    s6 = new String(d.readLine());
                    System.out.println("Enter the Second:");
                    s7 = new String(d.readLine());
                    if (s6.equals(s7)) {
                        System.out.println("Its Equal");
                    }
             else {

                        System.out.println("It's not Equal");
                    }

                break;
                case 6:
                    String s8;
                    char ch1;
                    int n;
                    System.out.println("Indexing");
                    System.out.println("Enter the String:");
                    s8= new String(d.readLine());
                    System.out.println("Enter the Number");
                    n=Integer.parseInt(d.readLine());
                    ch1=s8.charAt(n);
                    System.out.println("The index value:"+ch1);
                    break;
                default:
                    System.out.println("Please enter the correct value in 1 to 6:");

            }
        }while (ch < 8) ;
    }
}
