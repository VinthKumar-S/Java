package practice;

public class Operators {

	public static void main(String[] args) {
		
   
	byte number1=15;
    byte number2=20;
    int number3=0;
     
System.out.println(number1*number2);// *,+,-,% this are arithmetic 


System.out.println(number1<=number2);// <=,>=,--Relative operators

number3=number1+number2;//if we find an ifinide value in program we only use int are else error occur
number3%=10;// num=num+10,-if we use variable for a purpose we use this methode 

System.out.println(number3);

//Logical operators
  byte age=17;
  boolean citizen=false;

System.out.println(age==18 && citizen ==false );//it cheack two contions
System.out.println(age==18 || citizen ==false );//it cheack one contions
System.out.println(!citizen==true );// it check reverse

//Tream Operators

String name=age>= 18 ?"eligible":"not eligible";
System.out.println(name);
	}

}
