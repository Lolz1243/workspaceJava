import java.util.*;

/**
 * Chapter 16 - More About Counting Loops Exercises 1-3.
 * 
 * @author Nikhil Vytla
 * @version 3/17/17
 * 
 * @author Period - 7
 * @author Assignment - Ch16Ex1_3
 * 
 * @author Sources - None
 */
public class Ch16Ex1to3
{
    /**
     * Initializes an object of type Scanner called scan.
     */
    Scanner scan;

    /**
     * Constructs a Scanner for input from the console.
     */
    public Ch16Ex1to3()
    {
        scan = new Scanner( System.in );
    }

    /**
     * Constructs a Scanner to evaluate passed input (used for testing).
     * 
     * @param str
     *            input for the various methods
     */
    public Ch16Ex1to3( String str )
    {
        scan = new Scanner( str );
    }

    /**
     * Adds up N number of integers that the user wants. Allows
     * the user to input the number of integers that they ask for
     * and then finishes with the sum.
     * 
     * @return integer sum is the sum of all the integers the user has
     * inputted.
     */
    public int addingUpInts()
    {
        int sum = 0;

        System.out.print( "How many integers will be added: " );
        int numInt = scan.nextInt();
        
        int count = 0;
        
        while ( count < numInt )
        {
            System.out.println( "Enter an integer: " );
            int added = scan.nextInt();
            sum = sum + added;
            count++;
        }

        return sum;
    }

    /**
     * Takes a user's input for an integer limit
     * in order to compute the inverse sum from
     * 1/1 to 1/N.
     * 
     * @return double invSum is the inverse sum of all the numbers
     * from 1/1 to 1/N, where N is determined b the user.
     */
    public double inverseSum()
    {
        double invSum = 0.0;
        
        System.out.print( "Enter N: " );
        int num = scan.nextInt();
        
        int count = 1;
        
        while ( count <= num )
        {
            invSum = invSum + ( 1.0 / count );
            count++;
        }
        
        return invSum;
    }

    /**
     * Takes a user input of the number of integers that the users
     * want. Asks the user what integers they want to find the standard
     * deviation of, and then computes the standard deviation.
     * 
     * @return double stdDev is the standard deviation of a set of 
     * numbers that the user enters in the program.
     */
    public double stdDeviation()
    {
        double stdDev = 0.0;
        double sum = 0.0;
        double avgSquare = 0.0;
        
        System.out.print( "Enter N: " );
        int num = scan.nextInt();
        
        int count = 0;
        
        while ( count < num )
        {
            System.out.println( "Enter an integer: " );
            double added = scan.nextDouble();
            sum = sum + added;
            avgSquare = avgSquare + (added * added);
            
            count++;
        }
        
        stdDev = Math.sqrt( (avgSquare / num) - ( (sum / num) * (sum / num)) );
        
        return stdDev;
    }

    /**
     * Testing method: instantiates a Ch16Ex1to3 object and then invokes each
     * method.
     * 
     * @param args  command line parameters (not used)
     */
    public static void main( String[] args )
    {
        Scanner kbd = new Scanner( System.in );
        boolean done = false;

        Ch16Ex1to3 exercise = new Ch16Ex1to3();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "   (1) Adding up Integers" );
            System.out.println( "   (2) Inverse Sum" );
            System.out.println( "   (3) Standard Deviation" );
            System.out.println( "   (Q) Quit" );
            System.out.println();
            System.out.print( "Enter a choice:  " );
            String response = kbd.nextLine();

            if ( response.length() > 0 )
            {
                System.out.println();

                switch ( response.charAt( 0 ) )
                {
                    case '1':
                        int sumOfInts = exercise.addingUpInts();
                        System.out.println( "addingUpInts() = " + sumOfInts );
                        break;
                    case '2':
                        double invSum = exercise.inverseSum();
                        System.out.println( "inverseSum() = " + invSum );
                        break;
                    case '3':
                        double stdDev = exercise.stdDeviation();
                        System.out.println( "stdDeviation() = " + stdDev );
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
