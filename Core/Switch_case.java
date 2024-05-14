package practice;

import java.util.Scanner;

public class Switch_case {
 
public static void main(System[] args) {
	
  String name;
  
 @SuppressWarnings("resource")
Scanner input=new Scanner(System.in);
 name=input.nextLine();
 
 switch(name)
 {
 case"Karthi":
	 System.out.println("Welcome"+name);
	 break;
 case"Vinith":
	 System.out.println("Welcome"+name);
	 break;
 case"Victor":
	 System.out.println("Welcome"+name);
	 break;
default:
     System.out.println("Your name is not here");
 }
}
}