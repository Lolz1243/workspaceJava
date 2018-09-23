import java.util.*;

/**
 * Chapter 15 - Loops Exercises 1-3.
 * 
 * @author Nikhil Vytla
 * @version 3/16/17
 * @author Period - 7
 * @author Assignment - Ch15Ex1to3
 * @author Sources - None
 */
public class Ch15Ex1to3
{
    /**
     * Initializes an object of type Scanner called scan.
     */
    Scanner scan;

    /**
     * Constructs a Scanner for input from the console.
     */
    public Ch15Ex1to3()
    {
        scan = new Scanner( System.in );
    }

    /**
     * Constructs a Scanner to evaluate passed input (used for testing).
     * 
     * @param str  input for the various methods
     */
    public Ch15Ex1to3( String str )
    {
        scan = new Scanner( str );
    }

    /**
     * Method inclusiveIntegers() inputs a start and an end value, and
     * types all the number between those values including the end
     * values.
     */
    public void inclusiveIntegers()
    {
        System.out.print( "Enter starting value: " );
        int start = scan.nextInt();
        
        System.out.print( "Enter ending value: " );
        int end = scan.nextInt();
        
        while ( start <= end )
        {
            System.out.println( start );
            start++;
        }
    }

    /**
     * Takes a user inputted word and prints it 
     * the same number of times as the word has letters.
     */
    public void repeatWord()
    {
        System.out.print( "Enter a word: " );
        String word = scan.next();
        
        int times = word.length();
        
        int count = 0;
        
        while ( count < times )
        {
            System.out.println( word );
            count++;
        }
        
        
        
        
    }

    /**
     * Takes two user inputted words and prints out as many dots as
     * needed to reach a total character count (per line) of 30.
     */
    public void twoWords()
    {
        System.out.print( "Enter first word: " );
        String first = scan.next();
        
        System.out.print( "Enter second word: ");
        String second = scan.next();
        
        int wordCount = ( first.length() + second.length() );
        int count = 0;
        System.out.print( first );
        while ( count + wordCount < 30 )
        {
            System.out.print( "." );
            count++;
        }
        System.out.print( second );
    }

    /**
     * Testing method: instantiates a Ch15Ex1to3 object and then invokes
     * each method.
     * 
     * @param args  command line parameters (not used)
     */
    public static void main( String[] args )
    {
        Scanner kbd = new Scanner( System.in );
        boolean done = false;

        Ch15Ex1to3 exercise = new Ch15Ex1to3();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "   (1) Inclusive Integers" );
            System.out.println( "   (2) Repeat Word" );
            System.out.println( "   (3) Two Words" );
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
                        exercise.inclusiveIntegers();
                        break;
                    case '2':
                        exercise.repeatWord();
                        break;
                    case '3':
                        exercise.twoWords();
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
