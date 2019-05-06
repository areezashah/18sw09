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
  public void setDisplay()
  {
    System.out.println("Name is " + name);
    System.out.println("roll number is " +  rollnum);
    System.out.println("department is " + dept);
  }
}

class Task4
{
  public static void main(String args[])
  {
     Student s1=new Student("Areeza","18Sw09","Software");
     s1.setDisplay();
   }
}
