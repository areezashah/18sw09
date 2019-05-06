import java.util.*;
class Task2part{
     int[] array=new int[5];
     Scanner sc=new Scanner(System.in);
     public void populateArray()
     {
        for(int x=0; x<array.length ; x++)
        {
           System.out.print("Enter the value for Array " +"[" + x + "]" + " = ");
           array[x]=sc.nextInt();
           System.out.println();
         }
      }

      public void print()
      {
         System.out.println("Even number is : ");
         for(int y=0; y<array.length; y++)
         {
            if(array[y]%2==0)
            {
               System.out.println(array[y]);
            }
          }

          System.out.println("Odd Number is : ");
          for(int z=0; z<array.length; z++)
          {
             if(array[z]%2 !=0)
             {
                System.out.println(array[z]);
             }
           }
       }
}

 class Task2
 {
    public static void main(String args[])
    {
       Task2part tp=new Task2part();
       tp.populateArray();
       tp.print();
     }
  }
