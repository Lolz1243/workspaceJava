import java.util.*;

/**
 * Chapter 17 - Nesting Loops and ifs Exercises 1-5
 * 
 * @author Nikhil Vytla
 * @version 3/21/17
 * 
 * @author Period - 7
 * @author Period Assignment - Ch17Ex1to5
 * 
 * @author Sources - None
 */
public class Ch17Ex1to5
{
    /**
     * Initializes an object of type Scanner called scan.
     */
    Scanner scan;

    /**
     * Constructs a Scanner for input from the console.
     */
    public Ch17Ex1to5()
    {
        scan = new Scanner( System.in );
    }

    /**
     * Constructs a Scanner to evaluate passed input (used for testing).
     * 
     * @param str  input for the various methods
     */
    public Ch17Ex1to5( String str )
    {
        scan = new Scanner( str );
    }

    /**
     * jetLagCalc calculates the days of jet lag needed
     * after a trip using a special formula
     * @return double daysOfRecovery is calculated by using
     * four factors: hours, zones, depart, arrive.
     */
    public double jetLagCalc()
    {
        double daysOfRecovery = 0.0;
        
        System.out.print( "Enter number of hours: " );
        double hours = scan.nextDouble();
        
        System.out.print( "Enter number of time zones: " );
        double zones = scan.nextDouble();
        
        System.out.print( "Enter departure time: " );
        double depTime = scan.nextDouble();
        
        System.out.print( "Enter arrival time: " );
        double arrivTime = scan.nextDouble();
        
        
        double depart = 0;
        double arrive = 0;
        
        if ( depTime >= 8 && depTime < 12  )
        {
            depart = 0;
            
        }
        else if ( depTime >= 12 && depTime < 18 )
        {
            depart = 1;
        }
        else if ( depTime >= 18 && depTime < 22 )
        {
            depart = 3;
        }
        else if ( depTime >= 22 || depTime < 1 )
        {
            depart = 4;
        }
        else if ( depTime >= 1 && depTime < 8 )
        {
            depart = 5;
        }
        
        
        if ( arrivTime >= 8 && arrivTime < 12  )
        {
            arrive = 4;
            
        }
        else if ( arrivTime >= 12 && arrivTime < 18 )
        {
            arrive = 2;
        }
        else if ( arrivTime >= 18 && arrivTime < 22 )
        {
            arrive = 0;
        }
        else if ( arrivTime >= 22 || arrivTime < 1 )
        {
            arrive = 1;
        }
        else if ( arrivTime >= 1 && arrivTime < 8 )
        {
            arrive = 3;
        }
        
        daysOfRecovery = ( (hours / 2.0) + (zones - 3) 
                        + depart + arrive) / 10.0;
        
        return daysOfRecovery;
    }

    /**
     * This method adds up the squares and cubes of numbers
     * up to an upper limit N which the user chooses.
     * @return long sumSquares and long sumCubes which contain
     * the sum of all the squares and cubes (respectively) which
     * the user wants added up.
     */
    public long[] addUpSquaresAndCubes()
    {
        long sumSquares = 0;
        long sumCubes = 0;

        System.out.print( "Enter Upper Limit: " );
        int upperLimit = scan.nextInt();
        
        int count = 0;
        
        while ( count <= upperLimit )
        {
            sumSquares = sumSquares + (count * count);
            sumCubes = sumCubes + (count * count * count);
            count++;
        }
        
        return new long[]{sumSquares, sumCubes};
    }

    /**
     * This method gets the power of a number by using
     * a while loop to multiply the number by itself as many
     * times as the user wants. The program also adjusts
     * itself for negative powers and negative numbers.
     * @return double pow stores the final number raised to
     * the power that the user desires.
     */
    public double powerOfANumber()
    {
        double pow = 1.0;
        
        System.out.print( "Enter x: " );
        double x = scan.nextDouble();
        
        System.out.print( "Enter y: " );
        int y = scan.nextInt();
        
        int count = 0;
        
        if ( y < 0 )
        {
            y = y * -1;
            x = 1.0 / x;
        }
        
        while ( count < y )
        {
            pow = pow * x;
            count++;
        }
        
        return pow;
    }

    /**
     * Makes a wedge of stars, where each row
     * has one less star until there is only
     * one star in the row.
     */
    public void wedgeOfStars()
    {
        System.out.print( "Initial number of stars: " );
        int stars = scan.nextInt();
        
        int count = 0;
        
        while ( count < stars)
        {
            System.out.print( "*" );
            count++;
            
            int count2 = 0;
            
            while ( count2 < stars - count)
            {
                System.out.print( "*" );
                count2++;
            }
            System.out.println(  );

        }
    }

    /**
     * TODO Description
     */
    public void pineTree()
    {
        System.out.print( "Enter the height of the tree: ");
        int height = scan.nextInt();
        
        int count = 0;
        
        while ( count < height )
        {
            
            
            
            count++;
        }

    }

    /**
     * Testing method: instantiates a Ch17Ex1to4 object and
     * then invokes each method.
     * 
     * @param args  command line parameters (not used)
     */
    public static void main( String[] args )
    {
        Scanner kbd = new Scanner( System.in );
        boolean done = false;

        Ch17Ex1to5 ex = new Ch17Ex1to5();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "   (1) Jet Lag Calculator" );
            System.out.println( "   (2) Adding up Squares and Cubes" );
            System.out.println( "   (3) Power of a number" );
            System.out.println( "   (4) Wedge of Stars" );
            System.out.println( "   (5) Pine Tree" );
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
                        double daysOfRecovery = ex.jetLagCalc();
                        System.out.println( "Days of recovery: " + daysOfRecovery);
                        break;
                    case '2':
                        long[] sums = ex.addUpSquaresAndCubes();
                        System.out.println( "Sum of squares: " + sums[0] );
                        System.out.println( "Sum of cubes : " + sums[1]  );
                        break;
                    case '3':
                        double pow = ex.powerOfANumber();
                        System.out.println("powerOfANumber() = " + pow );
                        break;
                    case '4':
                        ex.wedgeOfStars();
                        break;
                    case '5':
                        ex.pineTree();
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
