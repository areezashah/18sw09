import java.util.*;

class Dog
{
   String name;
   String breed;
   String age;

   public void setDetail(String name, String breed, String age)
   {
      this.name=name;
      this.breed=breed;
      this.age=age;
    }
   public void showDetail()
   {
        if(name.isEmpty() && breed.isEmpty() && age.isEmpty())
        {
             System.out.print("details are unavailable");
        }
        else
        {
           System.out.println("Name:"+name);
           System.out.println("Breed:"+breed);
           System.out.println("Age:"+age);
         }
     }
}

class Task3
{
   public static void main(String args[])
     {
        String name,breed,age;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Name: ");
        name=sc.nextLine();
	    System.out.print("Enter Breed: ");
	    breed=sc.nextLine();
        System.out.print("Enter  Age: ");
        age=sc.nextLine();

	    Dog d=new Dog();
	    d.setDetail(name,breed,age);
        d.showDetail();

	}

}