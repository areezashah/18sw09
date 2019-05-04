import java.util.*;
class Task5
{
    public static void main(String args[])
    {
       System.out.print("ENTER THE NUMBER OF ELEMENTS : ");
       Scanner sc=new Scanner(System.in);
       int n= sc.nextInt();

       System.out.print("ENTER THE ELEMENT OF ARRAY : ");
       int arr[]=new int[n];
       for(int i=0; i<n; i++)
         {
			 arr[i]=sc.nextInt();
	     }
	     int large=arr[0];
	     for(int j=0; j<n; j++)
	     {
			 if(arr[j]>large)
			 large=arr[j];
	     }
	     System.out.print("largest element is " + large);
	}
}
