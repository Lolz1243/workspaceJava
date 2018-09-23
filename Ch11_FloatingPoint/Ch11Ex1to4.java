import java.util.Scanner;


/**
   Class Ch11Ex1to4 explores variables and the different uses of 
   operands and implementation of formulas. In exercise 1, we 
   find the cost of running an appliance. In exercise 2, we find
   the distance and time of a falling brick. In exercise 3 and 4,
   we explore logarithms and arithmetic and harmonic means.
 * 
 * @author Nikhil Vytla
 * @version 3/7/17
 * 
 * @author Period - 7
 * @author Assignment - Ch11_FloatingPoint
 * 
 * @author Sources - None
 */
public class Ch11Ex1to4
{
    /**
     * Initializes a Scanner scan for input from the console.
     */
    Scanner scan;


    /**
     * Constructs a Scanner for input from the console.
     */
    public Ch11Ex1to4()
    {
        scan = new Scanner( System.in );
    }


    /**
     * Constructs a Scanner to evaluate passed input (used for testing).
     * 
     * @param str
     *            input for the various methods
     */
    public Ch11Ex1to4( String str )
    {
        scan = new Scanner( str );
    }


    /**
     * Cost in cents multiplied by kilowatt-hours divided by 100 provides the
     * annual cost of running an appliance in dollars.
     */
    public void annualCost()
    {
        System.out.println( "Enter cost per kilowatt-hour in cents " );
        double cost = scan.nextDouble();

        System.out.println( "Enter kilowatt-hours used per year " );
        double hours = scan.nextDouble();

        double annual = ( cost * hours ) / 100;

        System.out.println( "Annual cost: " + annual );
    }


    /**
     * Uses the formula d = (1/2) * g * t^2 to calculate a falling
     * brick's distance in feet and time in seconds.
     */
    public void fallingBrick()
    {
        System.out.print( "Enter the number of seconds: " );
        double seconds = scan.nextDouble();

        double distance1 = ( 1.0 / 2.0 ) * 32.174 * seconds * seconds;

        System.out.println( "The brick fell " + distance1 + " feet in " + 
                        seconds + " seconds." );

        System.out.print( "Enter the distance: " );
        double distance2 = scan.nextDouble();

        double time = Math.sqrt( ( 2.0 * distance2 ) / 32.174 );

        System.out.println( "The brick fell " + distance2 + " feet in " + 
                        time + " " + "seconds." );
    }


    /**
     * Uses the formula log base 2 of x = log base e of x / log base e of 2
     * to compute the base 2 log of a user-inputted double.
     */
    public void base2Log()
    {
        System.out.print( "Enter a double: " );
        double num = scan.nextDouble();
        
        double base2Log = Math.log( num ) / Math.log( 2.0 );
        
        System.out.println( "Base 2 log of " + num + " is " + base2Log );
    }


    /**
     Takes the user's input for two numbers X and Y, and calculates and 
     prints the arithmetic and harmonic means.
     */
    public void harmonicMean()
    {
        System.out.println( "Enter X: " );
        double num1 = scan.nextDouble();
        
        System.out.println( "Enter Y: " );
        double num2 = scan.nextDouble();
        
        double arithmean = ( num1 + num2 ) / 2.0;
        double harmmean = 2.0 / ( (1.0 / num1) + (1.0 / num2) );
        
        System.out.println( "Arithmetic mean: " + arithmean );
        System.out.println( "Harmonic mean: " + harmmean);
    }


    /**
     * Testing method: instantiates a Ch11Ex1_4 object and then invokes each
     * method
     * 
     * @param args
     *            command-line parameters (not used)
     */
    public static void main( String[] args )
    {
        Scanner kbd = new Scanner( System.in );
        boolean done = false;

        Ch11Ex1to4 exercise = new Ch11Ex1to4();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "    (1) Annual Cost of Running an Appliance" );
            System.out.println( "    (2) Falling Brick" );
            System.out.println( "    (3) Base 2 Logarithm of a Number" );
            System.out.println( "    (4) Harmonic Mean" );
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
                        exercise.annualCost();
                        break;
                    case '2':
                        exercise.fallingBrick();
                        break;
                    case '3':
                        exercise.base2Log();
                        break;
                    case '4':
                        exercise.harmonicMean();
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
