import java.lang.*;
class Task4{
public static void main(String args[]){
int[][] Array1={{1,2,3},{4,5,3},{5,6,5}};
int[][] Array2={{3,4,5},{6,4,3},{5,6,9}};
int [][] sum=new int[3][3];

for(int i=0; i< Array1.length ; i++)
    {
	  for(int j=0; j<Array1[i].length; j++)
	  {
         sum[i][j]=Array1[i][j]+Array2[i][j];
      }
    }
  for(int i=0; i<Array1.length; i++)
     {
		 for(int j=0; j<Array1[i].length; j++)
		 {
		 System.out.print(sum[i][j]);
		 System.out.print(" ");
	     }
	     ;
	     System.out.println();
	 }
 }
 }