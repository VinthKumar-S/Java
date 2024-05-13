
import java.io.*;
public class Twodimention {

    public static void main(String[] args)throws IOException {
	int n,m,i,j=0,k;
	DataInputStream d=new DataInputStream(System.in);
        System.out.println("Enter rows and colums:");
	m=Integer.parseInt(d.readLine());
	n=Integer.parseInt(d.readLine());
	int[][]mat1=new int[m][n];
	int[][]mat2=new int[m][n];
	int[][]mat3=new int[m][n];
        System.out.println("Input the 1st matrix elements:");
    for(i=0;i<m;i++) {
        for (j = 0; j < n; j++) {
            mat1[i][j] = Integer.parseInt(d.readLine());

        }
    }
        System.out.println("Input the matrix 2 elements:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                mat2[i][j]=Integer.parseInt(d.readLine());
            }
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                mat3[i][j]=mat1[i][j]+mat2[i][j];

            }
    }
        System.out.println("Addition");
        for(i=0;i<m;i++) {
            for (j = 0; j < n; j++) {

                System.out.println(" "+mat3[i][j]);

            }
 	System.out.println();
        }
        for(i=0;i<m;i++) {
            for (j = 0; j < n; j++) {
                mat3[i][j] = mat1[i][j] - mat2[i][j];
	  System.out.println(mat3[i][j]+"\t ") ;

            }
	 System.out.println(" ");
        }
       
          
                System.out.println("Multiplication");
        for(i=0;i<m;i++)
          {
            for (j = 0; j < n; j++) 
             {
              mat3[i][j]=0;
             for(k=0;k<m;k++)
                      {
                   mat3[i][j]+=mat1[i][k]*mat2[k][j];
 
                   }
     
      
         
           }
        }
        
        
        
        
         for(i=0;i<m;i++) {
     for (j = 0; j < n; j++) {
     
    
  {
    
  System.out.println(mat3[i][j]+"\t");
  }
     
   
  System.out.println(" ");   
         
            }
        }

    }
}
