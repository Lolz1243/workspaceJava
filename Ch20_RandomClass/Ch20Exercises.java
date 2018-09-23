import java.util.*;

/**
 * Chapter 20 - Random Class Exercises 3, 5, 7 & 8.
 * 
 * @author Nikhil Vytla
 * @version 4/6/17
 * 
 * @author Period - 7
 * @author Assignment - Ch20Exercises
 * 
 * @author Sources - None
 */
public class Ch20Exercises
{
    /**
     * Initializes object of type Scanner called scan.
     * Constructs a Random for random number generation.
     */
    Scanner scan;
    Random rand = new Random();

    /**
     * Constructs a Scanner for input from the console.
     */
    public Ch20Exercises()
    {
        scan = new Scanner( System.in );
    }

    /**
     * Constructs a Scanner to evaluate passed input (used for testing).
     * 
     * @param str  input for the various methods
     * @param seed  seed to use for random number generator
     */
    public Ch20Exercises( String str, long seed )
    {
        scan = new Scanner( str );
        rand.setSeed( seed );
    }

    /**
     * TODO Description
     */
    public void furtherImprovedGuessingGame()
    {
        int randNum = rand.nextInt( 10 ) + 1;
        int roundNum = 1;
        int guess;
        
        for ( int count = 0; count < 10; count++)
        {
            System.out.println( "round" +  roundNum + ":" );
            System.out.println( "I am thinking of a number from 1 to 10." );
            System.out.println( "You must guess what it is in three tries." );
            System.out.println( "Enter a guess: " );
            guess = scan.nextInt();
                 
            for ( int counter = 0; counter < 3; counter++)
            {
                if ( Math.abs( randNum - guess ) == 1 )
                {
                    System.out.println( "hot" );
                }
                else if ( Math.abs( randNum - guess ) == 2 )
                {
                    System.out.println( "warm" );
                }
                else if ( Math.abs( randNum - guess ) >= 3 )
                {
                    System.out.println( "cold" );
                }
                else if ( counter == 2 )
                {
                    if ( guess != randNum )
                    {
                        System.out.println( "wrong" );
                        System.out.println( "The correct number is: " + randNum );
                        System.out.println( "You have won " );
                    }
                    else
                    {
                        System.out.println( "right" );
                    }
                }
                guess = scan.nextInt();
            }
            roundNum++;
        }
    }

    /**
     * TODO Description
     */
    public void passwordCracker()
    {
        // TODO Your code goes here
    }

    /**
     * TODO Description
     */
    public void randomWalk2D()
    {
        // TODO Your code goes here
    }

    /**
     * TODO Description
     */
    public void squareRootGame()
    {
        // TODO Your code goes here
    }

    /**
     * Testing method: instantiates a Lesson15Exercises object and then invokes
     * each method.
     * 
     * @param args  command line parameters (not used)
     */
    public static void main( String[] args )
    {
        Scanner kbd = new Scanner( System.in );
        boolean done = false;

        Ch20Exercises exercise = new Ch20Exercises();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "   (3) Further Improved Guessing Game" );
            System.out.println( "   (5) Password Cracker" );
            System.out.println( "   (7) 2D Random Walk" );
            System.out.println( "   (8) Suqare Root Game" );
            System.out.println( "   (Q) Quit" );
            System.out.println();
            System.out.print( "Enter a choice:  " );
            String response = kbd.nextLine();

            if ( response.length() > 0 )
            {
                System.out.println();

                switch ( response.charAt( 0 ) )
                {
                    case '3':
                        exercise.furtherImprovedGuessingGame();
                        break;
                    case '5':
                        exercise.passwordCracker();
                        break;
                    case '7':
                        exercise.randomWalk2D();
                        break;
                    case '8':
                        exercise.squareRootGame();
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
        }
        while ( !done );

        System.out.println( "Goodbye!" );
    }
}
