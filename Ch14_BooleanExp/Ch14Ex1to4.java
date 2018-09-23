import java.util.*;

/**
 * Chapter 14 - Boolean Expressions Programming Exercises 1-4.
 * 
 * @author Nikhil Vytla
 * @version 3/16/17
 * 
 * @author Period - 7
 * @author Assignment - Ch14Ex1to4
 * 
 * @author Sources - None
 */
public class Ch14Ex1to4
{
    /**
     * Initializes an object of type Scanner called scan.
     */
    Scanner scan;

    /**
     * Constructs a Scanner for input from the console.
     */
    public Ch14Ex1to4()
    {
        scan = new Scanner( System.in );
    }

    /**
     * Constructs a Scanner to evaluate passed input (used for testing).
     * 
     * @param str  input for the various methods
     */
    public Ch14Ex1to4( String str )
    {
        scan = new Scanner( str );
    }

    /**
     * This method checks if the balances of a user's
     * checking and savings account are above certain baselines.
     * If they are not, it charges and displays a service fee to
     * the client.
     */
    public void checkCharge()
    {
        
        System.out.print( "Enter balance of checking account: " );
        double check = scan.nextDouble();
        
        System.out.print( "Enter balance of savings account: " );
        double savings = scan.nextDouble();
        
        if ( check > 1000.00 || savings > 1500.00 )
        {
            System.out.println( "Service charge is $0.00" );
        }
        else
        {
            System.out.println( "Service charge is $0.15" );
        }
            

    }

    /**
     * This method checks if the front wheels are equal
     * and if the back wheels are equal. All four do not have
     * to equal eachother, as long as each pair is equal on
     * their own.
     */
    public void tirePressure()
    {
        System.out.println( "Input right front pressure" );
        int rightFront = scan.nextInt();
        
        System.out.println( "Input left front pressure" );
        int leftFront = scan.nextInt();
        
        System.out.println( "Input right rear pressure" );
        int rightRear = scan.nextInt();
        
        System.out.println( "Input right rear pressure" );
        int leftRear = scan.nextInt();
        
        if ( rightFront != leftFront || rightRear != leftRear )
        {
            System.out.println( "Inflation is BAD" );
        }
        else
        {
            System.out.println( "Inflation is OK" );
        }
    }

    /**
     * This method adds on to method tirePressure(), but it
     * also checks whether the pressure is between 35 and 45.
     * If there are any errors, the inflation is bad.
     */
    public void moreTirePressure()
    {
        boolean goodPressure = true;
        
        
        System.out.println( "Input right front pressure" );
        int rightFront = scan.nextInt();
        
        if (rightFront < 35 || rightFront > 45)
        {
            System.out.println( "Warning: pressure is out of range" );
            goodPressure = false;
        }
        
        System.out.println( "Input left front pressure" );
        int leftFront = scan.nextInt();
        
        if (leftFront < 35 || leftFront > 45)
        {
            System.out.println( "Warning: pressure is out of range" );
            goodPressure = false;
        }
        
        System.out.println( "Input right rear pressure" );
        int rightRear = scan.nextInt();
        
        if (rightRear < 35 || rightRear > 45)
        {
            System.out.println( "Warning: pressure is out of range" );
            goodPressure = false;
        }
        
        System.out.println( "Input left rear pressure" );
        int leftRear = scan.nextInt();
        
        if (leftRear < 35 || leftRear > 45)
        {
            System.out.println( "Warning: pressure is out of range" );
            goodPressure = false;
        }
        
        if ( rightFront != leftFront || rightRear != leftRear 
                        || !goodPressure )
        {
            System.out.println( "Inflation is BAD" );
        }
        else
        {
            System.out.println( "Inflation is OK" );
        }
    }

    /**
     * TODO Description
     */
    public void pressureIsBuilding()
    {
        boolean goodPressure = true;
        
        
        System.out.println( "Input right front pressure" );
        int rightFront = scan.nextInt();
        
        if (rightFront < 35 || rightFront > 45)
        {
            System.out.println( "Warning: pressure is out of range" );
            goodPressure = false;
        }
        
        System.out.println( "Input left front pressure" );
        int leftFront = scan.nextInt();
        
        if (leftFront < 35 || leftFront > 45)
        {
            System.out.println( "Warning: pressure is out of range" );
            goodPressure = false;
        }
        
        System.out.println( "Input right rear pressure" );
        int rightRear = scan.nextInt();
        
        if (rightRear < 35 || rightRear > 45)
        {
            System.out.println( "Warning: pressure is out of range" );
            goodPressure = false;
        }
        
        System.out.println( "Input left rear pressure" );
        int leftRear = scan.nextInt();
        
        if (leftRear < 35 || leftRear > 45)
        {
            System.out.println( "Warning: pressure is out of range" );
            goodPressure = false;
        }
        
        if ( Math.abs( rightFront - leftFront ) > 3 || 
                        Math.abs( rightRear - leftRear ) > 3 
                        || !goodPressure )
        {
            System.out.println( "Inflation is BAD" );
        }
        else
        {
            System.out.println( "Inflation is OK" );
        }
    }

    /**
     * Testing method: instantiates a Ch14Ex1to4 object and then
     * invokes each method.
     * 
     * @param args  command line parameters (not used)
     */
    public static void main( String[] args )
    {
        Scanner kbd = new Scanner( System.in );
        boolean done = false;

        Ch14Ex1to4 exercise = new Ch14Ex1to4();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "   (1) Check Charge" );
            System.out.println( "   (2) Tire Pressure" );
            System.out.println( "   (3) More Tire Pressure" );
            System.out.println( "   (4) The Pressure is Building" );
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
                        exercise.checkCharge();
                        break;
                    case '2':
                        exercise.tirePressure();
                        break;
                    case '3':
                        exercise.moreTirePressure();
                        break;
                    case '4':
                        exercise.pressureIsBuilding();
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
