import java.util.Scanner;
class Task3
{
   public static void main(String args[])
   {
      int a;
      int result=0;

      Scanner in = new Scanner(System.in);
      System.out.print("Enter an integer : ");
      a = in.nextInt();

      for(int i=0; i<=a ; i++)
      {
		  if(i<a)
		        {  System.out.print(i + " + "); }
		 else if(i<=a)
		 { System.out.print(i + " = ");}
      }
       for(int j=0 ; j<=a; j++)
       {
		   result+=j;
	   }
	System.out.print(result);
  }
}