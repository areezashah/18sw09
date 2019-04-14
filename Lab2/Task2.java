import java.lang.*;
class Task2{
public static void main(String args[]){
int x,y;
x=10;
y=23;
System.out.println("\nRELATIONAL OPERATORS ");
System.out.println(" Result of x < y is = " + ( x < y ));
System.out.println(" Result of x <= y is = " + ( x <= y ));
System.out.println(" Result of x > y is = " + ( x > y ));
System.out.println(" Result of x >= y is = " + ( x >= y ));
System.out.println(" Result of x == y is = " + ( x == y ));
System.out.println(" Result of x != y is = " + ( x != y ));

System.out.println("\nLOGICAL BOOLEAN OPERATORS ");
boolean a = true;
boolean b = false;
boolean c = a | b;
boolean d = a & b;
boolean e = a ^ b;
boolean f = !a;
System.out.println("result of a|b = "+c);
System.out.println("result of a&b = "+d);
System.out.println("result of a^b = "+e);
System.out.println("result of !a = "+f);
}
}