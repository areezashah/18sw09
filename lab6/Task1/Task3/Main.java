class Main
{
  public static void main(String [] args)
   {
     int n=9;
     char c='A';
     Print a=new Print(n,c);
     System.out.println("Using \"int , char\" method");
     a.method(n,c);
     System.out.println("Using \"char , int\" method");
     a.method(c,n);
   }
}