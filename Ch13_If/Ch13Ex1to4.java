import java.util.*;


/**
 * Chapter 13 - Single-branch if Statements Programming Exercises 1-4
 * 
 * @author Nikhil Vytla
 * @version 3/14/17
 * 
 * @author Period - 7
 * @author Assignment - Ch13Ex1to4
 * 
 * @author Sources - None
 */
public class Ch13Ex1to4
{
    /**
     * Initializes an object of type Scanner called scan.
     */
    Scanner scan;

    /**
     * Constructs a Scanner for input from the console.
     */
    public Ch13Ex1to4()
    {
        scan = new Scanner( System.in );
    }

    /**
     * Constructs a Scanner to evaluate passed input (used for testing).
     * 
     * @param str input for the various methods
     */
    public Ch13Ex1to4( String str )
    {
        scan = new Scanner( str );
    }

    /**
     * method internetDelicatessen() takes deli orders from the
     * internet. It asks for the item, price, and overnight
     * shipping, and then prints the order and the charges.
     */
    public void internetDelicatessen()
    {
        System.out.print( "Enter the item: " );
        String item = scan.nextLine();
        
        System.out.print( "Enter the price: " );
        int price  = scan.nextInt();
        
        System.out.print( "Overnight delivery (0==no, 1==yes): " );
        int deliver = scan.nextInt();
        
        double dollar = ( (double) price / 100.0);
        double shipping = 0;
        
        if ( price < 1000 )
        {
            shipping = 2.00;
        }
        if ( price >= 1000)
        {
            shipping = 3.00;
        }
        
        if ( deliver == 1 )
        {
            shipping = shipping + 5.00;
        }
        
        double total = dollar + shipping;
        
        System.out.println( "Invoice: " );
        System.out.println( item + "\t" + dollar);
        System.out.println( "shipping\t" + shipping );
        System.out.println( "total\t" + total );
    }

    /**
     * This method uses the equation efficiency = 1 - (tair/tsteam)
     * in order to find the maximum efficiency of a steam engine.
     * Tsteam must be over 373 K, otherwise steam is not created,
     * so the efficiency is reset to zero.
     */
    public void steamEngineEfficiency()
    {
        System.out.print( "Provide the air temp: " );
        int tAir = scan.nextInt();
        
        System.out.print( "Provide the steam temp: " );
        int tSteam = scan.nextInt();
        
        double efficiency =  1.0 - ( (double)tAir  / (double)tSteam );
        
        if ( tSteam < 373 )
        {
            efficiency = 0.0;
        }
        
        System.out.println( "The maximum possible efficiency is: "
            + efficiency);
        
        
    }

    /**
     * method microwaveOven uses the formula 2 items to 1.5 times time,
     * and 3 items to 2 times time to calculate the recommended heating
     * time for multiple items. It prints a warning message if the
     * number of items is more than 3.
     */
    public void microwaveOven()
    {
        System.out.print( "Enter the number of items: " );
        int num = scan.nextInt();
        
        System.out.print( "Enter the single-item heating time: " );
        double time = scan.nextInt();
        
        if ( num == 2 )
        {
            time = time * 1.5;
        }
        
        if ( num == 3 )
        {
            time = time * 2.0;
        }
        
        if ( num > 3 )
        {
            System.out.println( "Heating more than 3 items at once"
                + " is not recommended.");
        }
        
        System.out.println( "The recommended heating time is: " + time 
            + " seconds." );
    }

    /**
     * Players can choose a name, and a set number of points
     * for strength, health, and luck. If the total number of
     * points for strength, health, and luck exceeds 15, then
     * the program defaults the values to 5, 5, and 5.
     */
    public void fantasyGame()
    {
        System.out.println( "Welcome to HaveAtIt's Quest" );
        
        System.out.print( "Enter the name of your character: " );
        String name = scan.nextLine();
        
        System.out.print( "Enter strength (1-10): " );
        int strength = scan.nextInt();
        
        System.out.print( "Enter health (1-10): " );
        int health = scan.nextInt();
        
        System.out.print( "Enter luck (1-10): " );
        int luck = scan.nextInt();
        
        if ( ( strength + health + luck ) > 15)
        {
            System.out.println( "You have given your character"
                + " too many points!" );
            System.out.println( "Default values have been assigned:" );
            strength = 5;
            health = 5;
            luck = 5;
        }
        
        System.out.println( name + ", " + "strength: " + strength
            + ", " + "health: " + health + ", " + "luck: " + luck );
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

        Ch13Ex1to4 exercise = new Ch13Ex1to4();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "   (1) Internet Delicatessen" );
            System.out.println( "   (2) Steam Engine Efficiency" );
            System.out.println( "   (3) Microwave Oven" );
            System.out.println( "   (4) Fantasy Game" );
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
                        exercise.internetDelicatessen();
                        break;
                    case '2':
                        exercise.steamEngineEfficiency();
                        break;
                    case '3':
                        exercise.microwaveOven();
                        break;
                    case '4':
                        exercise.fantasyGame();
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
