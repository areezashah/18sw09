import java.util.*;
class Author{
 private String name;
 private String email;
 private char gender;

 public Author(String name, String email, char gender)
 {
    this.name=name;
    this.email=email;
    this.gender=gender;
 }
 public String getName()
 {
    return name;
 }
 public String getEmail()
 {
     return email;
 }
 public void setEmail()
 {
    this.email=email;
 }
 public char getGender()
 {
    return gender;
 }

 public String toString()
 {
   return "Author[Name: "+name+" Email: "+email+" Gender: "+gender+" ]";
 }
}

class Task1
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);

     System.out.println("enter the Author Name : ");
     String name=sc.nextLine();

     System.out.println("enter the Author Email");
     String email=sc.nextLine();

     System.out.println("enter the Author Gender");
     char gender=sc.next().charAt(0);

     Author a1=new Author(name,email,gender);
     System.out.println(a1.getName());
     System.out.println(a1.getEmail());
     System.out.println(a1.getGender());
     System.out.println(a1.toString());
    }
}