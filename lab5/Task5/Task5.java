import java.util.*;
class Marksheet{
int java;
int cpp;
int oop;
int result;
int per;
char grade;

Marksheet(int cpp,int java,int oop)
 {
    this.cpp=cpp;
    this.oop=oop;
    this.java=java;
 }
 public int Marks()
 {
     result=cpp+oop+java;
     return result;
 }
 public int Per()
 {
    per=(result*100)/300;
    return per;
 }

 public char Grade()
 {
    if(per>70)
      {
        grade = 'A';
      }
    else if(per<70 | per>60)
      {
        grade = 'B';
      }
    else if(per<60 | per>50)
     {
        grade = 'C';
     }
    else
      {
        grade = 'F';
      }
    return grade;
  }
  public void showDetail()
  {
      System.out.println("Total marks: 300");
      System.out.println("Obtain:" + result);
      System.out.println("Percentage:" + per);
      System.out.println("Grade:" + grade);
  }
}

class Task5
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the CPP , JAVA and OOP marks : ");
     int cpp=sc.nextInt();
     int java=sc.nextInt();
     int oop=sc.nextInt();

     Marksheet m1=new Marksheet(cpp , java , oop );
     m1.Marks();
     m1.Per();
     m1.Grade();
     m1.showDetail();
   }
}


