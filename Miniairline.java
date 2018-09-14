import java.util.Scanner;
public class Miniairline {

public static void bookSeat(String pname[], int bookedseat, String name)
{
	pname[bookedseat] = name;
	System.out.println("Your seat has been booked");
}

public static int getNumber()
{
	Scanner kboard = new Scanner(System.in);
	int seat =0;
	System.out.println("Please provide the seat number");
	seat = kboard.nextInt();
	return (seat);
}

public static String getName()
{
	Scanner kboard = new Scanner(System.in);
	String name = "";
	System.out.println("Please provide passenger name");
	name = kboard.nextLine();
	return (name);
}


public static void displaySeat(int noseats, String pname[])
{
	for  (int x = 1;x<noseats;x++)
		System.out.println("Seat number: "+x+" Passenger name: "+pname[x]);
}


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        final int nosseats=15;
        Scanner kboard = new Scanner(System.in);
		String pname[] = new String[nosseats];
		int ptype[] = new int[nosseats];
		int choice = 0;

		
		
System.out.println("Booking Menu");
System.out.println("Select from the options below");
System.out.println("1. Book Seat");
System.out.println("2. Display Booked Seats");
System.out.println("3. Cancel Booking");
System.out.println("4. Takings");
System.out.println("5. Exit");
System.out.println("Please enter choice (press 8 to continue)");
choice=kboard.nextInt();
do
{
	switch(choice)
	{
	case 1: displaySeat(nosseats, pname);
	bookSeat(pname, getNumber(), getName());
	break;
	case 2: displaySeat(nosseats, pname);
	break;
	}
	System.out.println("Booking Menu");
	System.out.println("Select from the options below");
	System.out.println("1. Book Seat");
	System.out.println("2. Display Booked Seats");
	System.out.println("3. Cancel Booking");
	System.out.println("4. Takings");
	System.out.println("5. Exit");
	System.out.println("Please enter choice (press 8 to continue)");
	choice=kboard.nextInt();
	}
while (choice !=8);
}
}