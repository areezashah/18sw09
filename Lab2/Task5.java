import java.lang.*;
class Task5{
public static void main(String args[]){
int x=40;
System.out.println("x = 40 = 00101000");
int y=13;
System.out.println("y = 13 = 00001101");
int z;
System.out.println("\nBitwise AND ");
z= x&y;
System.out.println("Z = " + z + " = " + Integer.toBinaryString(z));
System.out.println("\nBitwise OR ");
z= x|y;
System.out.println("Z = " + z + " = " + Integer.toBinaryString(z));
System.out.println("\nBitwise EXCLUSIVE OR ");
z= x^y;
System.out.println("Z = " + z + " = " + Integer.toBinaryString(z));
System.out.println("\nBitwise NOT ");
z=(~x&y);
System.out.println("Z = " + z + " = " + Integer.toBinaryString(z));
System.out.println("\nBitwise shift two bits in left ");
z=(x<<y);
System.out.println("Z = " + z + " = " + Integer.toBinaryString(z));
System.out.println("\nBitwise shift two bits in right ");
z=(x>>y);
System.out.println("Z = " + z + " = " + Integer.toBinaryString(z));
System.out.println("\nBitwise shift three bits in right ");
z=(x>>>y);
System.out.println("Z = " + z + " = " + Integer.toBinaryString(z));
}
}