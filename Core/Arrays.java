import java.util.*;

public class Arrays {

	public static void main(String[] args) {
		
	char[] name={'a','b','c'};
	char name1[]=name.clone();//clone this methode copy one value of variable to others
	
	int[] a=new int[]{1,2,3,4,5};
	int len=a.length;//length-methode for calculate the length of variable
	
	int[] number=new int[5];//new-key word for reference data type
	number[0]=25;
	number[1]=35;
	
System.out.println((len));	
System.out.println((number[0]));
System.out.println((name));
System.out.print((name1));
}

}
