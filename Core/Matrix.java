import java.io.*;
class Matrix
{
public static void main(String args[])throws IOException
{
int r1,c1,r2,c2,choice,i,j,n,k,mat1[][],mat2[][],sum[][];
mat1=new int[10][10];
mat2=new int[10][10];
sum=new int[10][10];
DataInputStream d=new DataInputStream(System.in);
System.out.println("Matrix operation");
System.out.println("Enter the number of rows and colums in first matrix:");
r1=Integer.parseInt(d.readLine());
c1=Integer.parseInt(d.readLine());
System.out.println("Enter the number of rows and colums in second matrix:");
r2=Integer.parseInt(d.readLine());
c2=Integer.parseInt(d.readLine());
System.out.println("Matrix Addition");
System.out.println("---------------");
System.out.println("Enter the elements of first matrix:");
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
{
mat1[i][j]=Integer.parseInt(d.readLine());
}
}
System.out.println("Enter the elements of second matrix:");
for(i=0;i<r2;i++)
{
for(j=0;j<c2;j++)
{
mat2[i][j]=Integer.parseInt(d.readLine());
}
}
System.out.println("Addition of two matrix:");
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
{
sum[i][j]=mat1[i][j]+mat2[i][j];
System.out.print(" "+sum[i][j]);
}
System.out.println();
}
}
}