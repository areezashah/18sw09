class Task7
{
   public static void main(String args[])
   {
     String s1="AREEZA ,18 ,BE Software";
     String s2="Laila ,19 ,BE Software";
     String[] arrOfStr1=s1.split("," ,3);
     String[] arrOfStr2=s2.split("," ,3);

     System.out.println("STUDENT 1");
     System.out.println("Name : " + arrOfStr1[0]);
     System.out.println("Age : " + arrOfStr1[1]);
     System.out.println("Program : " + arrOfStr1[2]);
     System.out.println();

     System.out.println("STUDENT 2");
     System.out.println("Name : " + arrOfStr2[0]);
     System.out.println("Age : " + arrOfStr2[1]);
     System.out.println("Program : " + arrOfStr2[2]);
    }
}