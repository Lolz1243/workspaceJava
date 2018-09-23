import java.util.*;

/**
 * Chapter 19 - Result-controlled Loops Exercises 1-4.
 * 
 * @author Nikhil Vytla
 * @version 3/30/17
 * 
 * @author Period - 7
 * @author Assignment - Ch19Ex1to4
 * 
 * @author Sources - None
 */
public class Ch19Ex1to4
{
    /**
     * Initializes an object of type Scanner called scan.
     */
    Scanner scan;

    /**
     * Constructs a Scanner for input from the console.
     */
    public Ch19Ex1to4()
    {
        scan = new Scanner( System.in );
    }

    /**
     * Constructs a Scanner to evaluate passed input (used for testing).
     * 
     * @param str  input for the various methods
     */
    public Ch19Ex1to4( String str )
    {
        scan = new Scanner( str );
    }

    /**
     * TODO Description
     */
    public void creditCardBill()
    {
        System.out.println( "Enter the beginning balance: " );
        double beginning = scan.nextDouble();
        
        System.out.println( "Enter the monthly payment: " );
        double payment = scan.nextDouble();
        
        System.out.println( "Enter the monthly interest: " );
        double interest = scan.nextDouble();
        
        double balance = beginning;
        double dinero = payment;
        
        int month = 1;
        
        while ( balance > 0.0 )
        {
            System.out.println( "Month: " + month + "       balance: " + 
                            balance + "       total payments: " + payment);

            
            month++;
            balance = ( balance * ( 1 + interest ) ) - dinero;
            payment += dinero;
        }
        
        System.out.println( "The final payment is: " + (100 + balance) );
    }

    /**
     * TODO Description
     */
    public void drugPotency()
    {
        double effectiveness = 100.0;
        int month = 0;
        
        while ( effectiveness > 50.00 )
        {
            System.out.println( "month: " + month + 
                "     effectiveness: " + effectiveness );
            
            effectiveness = effectiveness * .96;
            month++;
        }
        System.out.println( "month: 17     effectiveness: " 
                        + effectiveness + " DISCARDED" );
    }

    /**
     * TODO Description
     */
    public void eToX()
    {
        System.out.println( "Enter X: " );
        int X = scan.nextInt();
        
        
        int N = 1;
        
        double sum = 1;
        
        double term = 1  ;
        
        while ( term > Math.pow( 10, -12 ) )
        {
            
            term *= X / N;
            sum = sum + term;
            
            System.out.println( "n: " + N + "\tterm: " + term + "\tsum: " + sum );
            
            N++;
        }
    }

    /**
     * TODO Description
     */
    public void newtons1overX()
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

        Ch19Ex1to4 exercise = new Ch19Ex1to4();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "   (1) Credit Card Bill" );
            System.out.println( "   (2) Drug Potency" );
            System.out.println( "   (3) e^x" );
            System.out.println( "   (4) 1/X by Newton's Method" );
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
                        exercise.creditCardBill();
                        break;
                    case '2':
                        exercise.drugPotency();
                        break;
                    case '3':
                        exercise.eToX();
                        break;
                    case '4':
                        exercise.newtons1overX();
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
