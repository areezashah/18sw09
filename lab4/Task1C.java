import java.lang.*;
class Task1C{
public static void main(String args[]){
for(int i=1 ; i<=5 ; i++)
{
   for(int j=i ; j<=4 ; j++)
   {
      System.out.print(" ");
   }
   for(int k=1 ; k<=(2*i-1) ; k++)
   {
      System.out.print("*");
   }
   System.out.println();
}
}
}