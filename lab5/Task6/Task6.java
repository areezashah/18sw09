import java.util.*;

class Student{
  String name;
  String rollnum;
  String dept;
  Student(String name, String rollnum, String dept)
    {
       this.name=name;
       this.rollnum=rollnum;
       this.dept=dept;
    }
  public void showDetail()
  {
    System.out.println("Name is " + name);
    System.out.println("roll number is " +  rollnum);
    System.out.println("department is " + dept);
  }
}


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
 public int marks()
 {
     result=cpp+oop+java;
     return result;
 }
 public int per()
 {
    per=(result*100)/300;
    return per;
 }

 public char grade()
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
      System.out.println("Obtain:" + marks());
      System.out.println("Percentage:" + per());
      System.out.println("Grade:" + grade());
  }
}

class CreateStudentDetail
{
   Student s;
   Marksheet m;
   CreateStudentDetail(Student s, Marksheet m)
   {
     this.s=s;
     this.m=m;
   }

   void showDetail()
   {
     s.showDetail();
     m.showDetail();
    }
}

class Task6
{
  public static void main(String args[])
  {
     Student s1=new Student("AREEZA" , "18SW09" ,"SOFTWARE");
     Marksheet m1=new Marksheet(80, 70, 90);
     CreateStudentDetail cs=new CreateStudentDetail(s1,m1);
     cs.showDetail();
   }
}