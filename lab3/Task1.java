 import java.util.Scanner;

 class Task1
 {
   public static void main(String args[])
    {
      int a,b,c;

      Scanner in = new Scanner(System.in);
      System.out.println("Enter The C++ Marks");
      a = in.nextInt();

      System.out.println("\nEnter The Data Structure Marks");
	  b = in.nextInt();

	  System.out.println("\nEnter The Operating System Marks");
	  c = in.nextInt();

	  System.out.println("Obtained Marks In C++ = " + a);
	  System.out.println("Obtained Marks In Data Structure = " + b);
      System.out.println("Obtained Marks In Operating System = " + c);

      int totalmarks,obtainemarks;
      totalmarks=300;
      obtainemarks=a+b+c;

      System.out.println("Total Marks = 300 ");
      System.out.println("Obtaine Marks = " + obtainemarks);
      float per;
      per=obtainemarks*100/totalmarks;
      System.out.println("PERCENTAGE = " + per + " % ");
      if(per>90)
        {
		  System.out.println("Grade = A");
        }
      else
        if(per<90 | per>80 )
        {
		  System.out.println("Grade = B");
        }
      else
          if(per<80 | per>70)
        {
		  System.out.println("Grade = C");
        }
      else
          if(per<70 | per>60)
        {
		  System.out.println("Grade = D");
        }
      else
          if(per<60)
        {
		  System.out.println("Grade = FAIL");
        }
     }
  }