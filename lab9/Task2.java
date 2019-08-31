import java.util.Scanner;

class InvalidAgeException extends Exception

{

	InvalidAgeException(String e)

	{

	super(e);

	}

}

class VotingMachine

{

String names[]={"imran khan","nawaz sharif"};

int votes[]=new int[2];

		public void addCandidates(String names[])

		{

		names=names;

		}

		public void castVote(int voterAge,String name)throws InvalidAgeException

		{

		try{

		if(voterAge<18)

		{

		throw new InvalidAgeException("YOU'RE NOT ELIGIBLE TO VOTE");

		}

		}

		catch(InvalidAgeException i)

		{

			System.out.println(i.getMessage());

		}

		if(voterAge>=18)

		{

		for(int i=0;i<names.length;i++)

			{

			if(name==names[i])

			votes[i]++;

			}

		}

		}

		

		public void printResults()

		{

			for(int i=0;i<names.length;i++)

			{

			System.out.println(names[i]+ " has received= "+ votes[i]+ " votes"); 

			}

		}

}

class InvalidAgeExceptionDemo

{

public static void main(String args[])

	{

		Scanner sc=new Scanner(System.in);

		InvalidAgeException i=new InvalidAgeException("YOU'RE NOT ELIGIBLE TO VOTE");

		VotingMachine v=new VotingMachine();

			//trying for above 18 age voters

		try{

		v.castVote(18,"nawaz sharif");

		v.castVote(19,"imran khan");

		v.castVote(25,"imran khan");		

		}

		catch(InvalidAgeException a)

		{

		System.out.println(a.getMessage());    //will show the message as passed in the constructor.

		}

		v.printResults();

		

		System.out.println();

		System.out.println();

		//trying for age under 18

		

		try

		{

		v.castVote(17,"nawaz sharif");	

		}

		catch(InvalidAgeException a)

		{

		System.out.println(a.getMessage());    //will show the message as passed in the constructor.

		}

		

	}

}