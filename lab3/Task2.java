import java.util.Scanner;
class Task2{
public static void main(String args[]){

 Scanner in = new Scanner(System.in);

 System.out.println("Enter an units");
 float a;
 float result;
 a= in.nextInt();

  if(a<=50){
       result=a*10;
       System.out.println(result);
   }
  else if(a>50 && a<=100){
       result=(a-50)*15+(50*10);
       System.out.println(result);
   }
   else if(a>100 && a<=200)
   {
       result=(50*10) +(50*15)+(a-100)*20;
       System.out.println(result);
   }
   else if(a>201 && a<=300)
   {
      result= (50*10) +(50*15) +(100*20) +(a-200)*25;
      System.out.println(result);
   }
   else if(a>300)
   {
      result = (50*10) +(50*15) +(100*20) + (200*25) +(a-300)*30;
      System.out.println(result);
   }

    }
    }