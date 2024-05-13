package EB;
public class check
{
	
	int pre,cur,units;
	double pay;
	public void cal(int p,int c)
	{
	pre=p;	
	cur=c;
	units=cur-pre;
	System.out.println("The Units:"+units);
	if(units<=100)
	{
	pay=units*0.5;
	System.out.println("No payments:");	
	}	
	else if(units>=100 && units<200)
	{
	pay=units*1.25;	
	System.out.println("You payment ruppee:"+pay);
	}
	else if(units>=200 && units<400)
	{
	pay=units*1.50;	
	System.out.println("You payment ruppee:"+pay);
	}
	else if(units>400 )
	{
	pay=units*4;	
	System.out.println("You payment ruppee:"+pay);
	}
}
 }
	
	