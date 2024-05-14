

import java.util.Scanner;

public class If_class {

	public static void main(String[] args) {
		
	int pen=10;
	int specialpen=30;
	int cost;
	
	Scanner input=new Scanner(System.in);
	cost=input.nextInt();
	
if(cost>=specialpen)
System. out.println("you can buy the specialpen");

if(cost>=pen)
{
	System.out.println("you can buy the pen");
}
else
	System.out.println("you have less money to buy the pen");
	
	}

}
