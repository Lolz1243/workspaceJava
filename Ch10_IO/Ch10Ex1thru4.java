import java.util.Scanner;

/**
    TODO Write a one-sentence summary of your class here.
    TODO Follow it with additional details about its purpose, what abstraction
    it represents, and how to use it.
    
    @author  Nikhil Vytla
    @version 3/6/17
    
    @author   Period - 7
    @author   Assignment - Ch10_IO
    
    @author   Sources - None
 */
public class Ch10Ex1thru4
{
    Scanner scan;

    /**
     *  Constructs a Scanner for input from the console.
     */
    public Ch10Ex1thru4()
    {
        scan = new Scanner( System.in );
    }

    /**
     * Constructs a Scanner to evaluate passed input (used for testing).
     * @param str input for the various methods
     */
    public Ch10Ex1thru4( String str )
    {
        scan = new Scanner( str );
    }

    /**
      Finds the area of a circle using the user's input for the radius
      and the Math.PI function for the area.
     */
    public void areaOfACircle()
    {
        System.out.print( "Input the radius: " );
        double radius = scan.nextDouble();
        double area = (Math.PI * radius * radius);
        System.out.println( "The radius is: " + radius + " The area is: " + area );
    }

    /**
      Converts a number of cents to dollars and cents by using
      division and modulo.
     */
    public void centsToDollars()
    {
        System.out.print( "Input the cents: " );
        int cents = scan.nextInt();
        int dollars = (cents / 100);
        int dollarsandcents = (cents % 100);
        System.out.println( "That is " + dollars + " dollars and " + dollarsandcents + " cents." );
    }

    /**
      TODO Description
     */
    public void correctChange()
    {
        System.out.print( "Input the cents: " );
        int cents = scan.nextInt();
        
        int dollars = cents / 100;
        int quarters = (cents % 100) / 25;
        int dimes = (cents - (dollars * 100 + quarters * 25)) / 10;
        //int nickels = (dimes - ((dimes*10) / 10);
        //int pennies = nickels - ((nickels * 5) / 10);
    }

    /**
      TODO Description
     */
    public void ohmsLaw()
    {
        // TODO Your code goes here
    }

    /**
      Testing method: instantiates a Lesson10Exercises object and then invokes
      each method.

      @param args  command-line parameters (not used)
     */
    public static void main( String[] args )
    {
        Scanner kbd = new Scanner( System.in );
        boolean done = false;

        Ch10Ex1thru4 exercise = new Ch10Ex1thru4();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "    (1) Area of a Circle" );
            System.out.println( "    (2) Cents to Dollars" );
            System.out.println( "    (3) Correct Change" );
            System.out.println( "    (4) Ohm's Law" );
            System.out.println( "    (Q) Quit" );
            System.out.println();
            System.out.print( "Enter a choice:  " );
            String response = kbd.nextLine();

            if ( response.length() > 0 )
            {
                System.out.println();

                switch ( response.charAt( 0 ) )
                {
                    case '1':
                        exercise.areaOfACircle();
                        break;
                    case '2':
                        exercise.centsToDollars();
                        break;
                    case '3':
                        exercise.correctChange();
                        break;
                    case '4':
                        exercise.ohmsLaw();
                        break;
                    default:
                        if ( response.toLowerCase().charAt( 0 ) == 'q' )
                        {
                            done = true;
                        }
                        else
                        {
                            System.out.print( "Invalid Choice" );
                        }
                        break;
                }
            }
        } while ( !done );
        System.out.println( "Goodbye!" );
    }
}
