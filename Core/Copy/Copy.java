import java.io.*;
class Copy extends Exception
{
	public static void main(String args[])
	{
	File infile =new File("input.txt");
	File outfile=new File("out.txt");
	FileReader ins=null;
	FileWriter outs=null;
	try
	{
	ins=new FileReader(infile);
	outs=new FileWriter(outfile);
	int ch;
	while((ch=ins.read()) !=-1)
	{
	outs.write(ch);
	}
	throw new IOException();
	}
	catch(IOException e)
	{
	System.out.println("correct choice");
	}
	finally
	{
	try	
	{
	ins.close();
	outs.close();
	}
	catch(IOException e){}
	}
	}
	}