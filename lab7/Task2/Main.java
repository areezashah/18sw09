class Main
{
    public static void main(String []args)
    {
	Student s=new Student("Areeza","jamshoro","SW",18,12000.00);
	s.setProgram("SW");
	s.setYear(18);
	s.setFee(12000.00);
	System.out.println("Program:"+s.getProgram());
	System.out.println("Year:"+s.getYear());
	System.out.println("Fee:"+s.getFee());
	System.out.println(s.toString());

	Staff st=new Staff("Dr junaid","SW Dept","MUET",100000);
	st.setSchool("MUET");
	st.setPay(100000);
	System.out.println("School:"+st.getSchool());
	System.out.println("Pay:"+st.getPay());
	System.out.println(st.toString());
     }
}