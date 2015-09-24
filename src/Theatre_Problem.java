// Curtis Clements
// Theatre_Problem.java
// Eclipse Luna

import java.util.Scanner;

public class Theatre_Problem 
{

	public static void main(String[] args) 
	
	{
		//assigning variables
		final double TICKETPRICE = 8.0, THEATRECUT = 0.25;
		int ticket_Amount;
		String movieName;
		
		
		Scanner input = new Scanner(System.in);
		
		//input of movie name
		System.out.print("\n---Enter Movie Title: ");
		movieName = input.next();
		System.out.print("\n---Enter amount of tickets: ");
		ticket_Amount = input.nextInt();
		
		
		//This is where the movie title is printed
		System.out.print("\n---The movie you typed was: " + movieName);
		System.out.print("\n\n---The number of tickets purchased: " + ticket_Amount);
		

	}

}
