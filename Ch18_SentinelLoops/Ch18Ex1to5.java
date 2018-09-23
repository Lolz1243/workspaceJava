import java.util.*;


/**
 * Chapter 18 - Sentinel Controlled Loops Exercises 1-5.
 * 
 * @author Nikhil Vytla
 * @version 3/28/17
 * 
 * @author Period - 7
 * @author Assignment - Ch18Ex1to5
 * 
 * @author Sources - None
 */
public class Ch18Ex1to5
{
    /**
     * Initializes an object of type Scanner called scanner.
     */
    Scanner scan;

    /**
     * Constructs a Scanner for input from the console.
     */
    public Ch18Ex1to5()
    {
        scan = new Scanner( System.in );
    }

    /**
     * Constructs a Scanner to evaluate passed input (used for testing).
     * 
     * @param str  input for the various methods
     */
    public Ch18Ex1to5( String str )
    {
        scan = new Scanner( str );
    }

    /**
     * Calculates miles per gallon through initial and final
     * miles, and gallons. Ends the program when the number
     * of initial miles is entered as a negative number.
     */
    public void milesPerGallon()
    {
        System.out.println( "Miles Per Gallon Program" );
        
        int initialMile = 0;
        int finalMile;
        int gallons;
        double mpg;
        
        while ( initialMile >= 0 )
        {
            System.out.println( "Initial miles: " );
            initialMile = scan.nextInt();
            
            if ( initialMile < 0 )
            {
                System.out.print( "bye" );
                break;
            }

            System.out.print( "Final miles: " );
            finalMile = scan.nextInt();
            
            System.out.print( "Gallons: " );
            gallons = scan.nextInt();
            
            mpg = ( (double)finalMile - (double)initialMile ) 
                            / (double)gallons;
            
            System.out.println( "Miles per Gallon: " + mpg );
        }

    }

    /**
     * Inputs a range of numbers from the user. If the user
     * inputs data outside or inside the range, the program
     * filters the numbers and places them into separate sums.
     * It finally prints out these sums.
     */
    public void inRangeAdder()
    {
        System.out.print( "Low end of range: " );
        int low = scan.nextInt();
        
        System.out.print( "High end of range: " );
        int high = scan.nextInt();
        
        int sumRange = 0;
        int sumOut = 0;
        int data = 1;
        
        while ( data != 0 )
        {
            System.out.print( "Enter data: " );
            data = scan.nextInt();
            
            if ( data >= low && data <= high )
            {
                sumRange += data;
            }
            else
            {
                sumOut += data;
            }
        }
        
        System.out.println( "Sum of in range values: " + sumRange );
        System.out.println( "Sum of out of range values: " + sumOut);
    }

    /**
     * Calculates the cost of shipping using the weight of
     * the order. Ends the program when the user enters a
     * weight of zero.
     */
    public void shippingCostCalc()
    {
        int weight = 1;
        double shipping = 0.0;
        
        while ( weight != 0 )
        {
            System.out.println( "Weight of Order: " );
            weight = scan.nextInt();
            
            if ( weight > 10 )
            {
                shipping = (weight - 10) * 0.25;
            }
            else
            {
                shipping = 0.0;
            }
            
            double shipCost = 3.00 + shipping;
            
            if ( weight == 0 )
            {
                System.out.println( "bye" );
            }
            else
            {
                System.out.println( "Shipping Cost: $" + shipCost );
            }

        }
    }

    /**
     * Finds the area of a rectangle with user input for
     * the (x1, y1) and (x2, y2) coordinates. Stops and
     * exits the while loop when area is 0, which can be 
     * triggered by either width or height or both being 0.
     */
    public void areaOfRectangle()
    {
        int x1 = 1;
        int y1 = 2;
        int x2 = 3;
        int y2 = 4;
        
        int area = 1;
        
        while ( area != 0 )
        {
            System.out.print( "First corner X coordinate: " );
            x1 = scan.nextInt();
            
            System.out.print( "First corner Y coordinate: " );
            y1 = scan.nextInt();
            
            System.out.print( "Second corner X coordinate: " );
            x2 = scan.nextInt();
            
            System.out.print( "Second corner Y coordinate: " );
            y2 = scan.nextInt();
            
            int width = Math.abs( x1 - x2 );
            int height = Math.abs( y1 - y2 );
            area = width * height;
            
            System.out.println( "Width: " + width + "  Height: " + 
                            height + "  Area: " + area);
            
            if ( area == 0 )
            {
                System.out.println( "finished" );
            }
        }
        
        
    }

    /**
     * User inputs username and password. If they do not match up
     * with the four types of logins, an error message appears. If they
     * do, a corresponding priority appears. If the user enters "quit"
     * and "exit", then the program ends.
     */
    public void loginSimulator()
    {
        String userName = " ";
        String password = " ";
        
        while ( !userName.equals( "quit" ) && 
                        !password.equals( "exit" ))
        {
            System.out.print( "User Name: " );
            userName = scan.next();
            
            System.out.print( "Password: " );
            password = scan.next();

            if ( userName.equals( "joy" ) && 
                            password.equals( "sun") )
            {
                System.out.println( "You have logged on with"
                    + " priority 4");
            }
            else if ( userName.equals( "gates" ) && 
                            password.equals( "monopoly") )
            {
                System.out.println( "You have logged on with"
                    + " priority 1");
            }
            else if ( userName.equals( "jobs" ) && 
                            password.equals( "apple") )
            {
                System.out.println( "You have logged on with"
                    + " priority 3");
            }
            else if ( userName.equals( "root" ) && 
                            password.equals( "secret") )
            {
                System.out.println( "You have logged on with"
                    + " priority 5");
            }
            else if ( userName.equals( "quit" ) && 
                            password.equals( "exit") )
            {
                System.out.println( "System shutting down." );
            }
            else
            {
                System.out.println( "Logon failed" );
            }
        }
        System.out.println( "Bye." );
    }
    
    /**
     * Testing method: instantiates a Ch18Ex1to5 object and then invokes
     * each method.
     * 
     * @param args command line parameters (not used)
     */
    public static void main( String[] args )
    {
        Scanner kbd = new Scanner( System.in );
        boolean done = false;

        Ch18Ex1to5 exercise = new Ch18Ex1to5();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "   (1) Miles per Gallon" );
            System.out.println( "   (2) In-range Adder" );
            System.out.println( "   (3) Shipping Cost Calculator" );
            System.out.println( "   (4) Area of Rectangles" );
            System.out.println( "   (5) Login simulator" );
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
                        exercise.milesPerGallon();
                        break;
                    case '2':
                        exercise.inRangeAdder();
                        break;
                    case '3':
                        exercise.shippingCostCalc();
                        break;
                    case '4':
                        exercise.areaOfRectangle();
                        break;
                    case '5':
                        exercise.loginSimulator();
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
