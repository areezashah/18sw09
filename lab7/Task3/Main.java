class Main
{
  public static void main(String args[])
    {
	Shape s=new Shape("Red",true);
	System.out.println("shape: \n"+s.toString());

	Circle c=new Circle(3.5,"Pink",true);
	System.out.println("Circle Area: "+c.getArea());
	System.out.println("Circle Perimeter: "+c.getPerimeter());
	System.out.println("Circle:\n"+c.toString());

	Rectangle r=new Rectangle(1.2,2.1);
	System.out.println("Rectangle Area: "+r.getArea());
	System.out.println("Rectangle Perimeter: "+r.getArea());
	System.out.println("Rectangle:\n"+r.toString());

	Square s2=new Square(4.4);
	System.out.println("Square:\n"+s2.toString());
     }
}