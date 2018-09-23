import java.util.Scanner;

/**
 * Chapter 46 Programming Exercises 1-5
 * 
 * @author Nikhil Vytla
 * @version 4/7/17
 * 
 * @author Period - 7
 * @author Assignment - Ch46_Arrays
 * 
 * @author Sources - None
 */
public class Ch46ArraysEx1_5
{
    private Scanner scan;

    public Ch46ArraysEx1_5()
    {
        scan = new Scanner( System.in );
    }

    /**
     * Complete the assignment statement so that it computes the sum of
     * all the numbers in the array.
     */
    public void ex1_ArraySum()
    {
        int[] val = { 0, 1, 2, 3 };

        int sum = 0;
        
        for ( int count = 0; count < val.length; count++ )
        {
            sum = sum + val[count];
        }

        System.out.println( "Sum of all numbers = " + sum );
    }

    /**
     * Complete the method so that a new array twice is constructed.
     * Now copy values from val to twice, but make the values in twice
     * double what they are in val.
     */
    public void ex2_TwoArrays()
    {
        int[] val = { 13, -4, 82, 17 };
        int[] twice = null;

        System.out.println( "Original Array: " +
            val[0] + " " + val[1] + " " + val[2] + " " + val[3] );

        twice = new int [val.length];
        
        for ( int count = 0; count < twice.length; count++ )
        {
            twice[count] = val[count] * 2;
        }

        System.out.println( "New Array: " +
            twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3] );
    }

    /**
     * Complete the method with four assignment statements so that each
     * cell of sum contains the sum of the corresponding cells in valA
     * and valB. Ie., add cell zero of valA to cell zero of valB and put
     * the result in cell zero of sum, and so on.
     */
    public void ex3_ThreeArrays()
    {
        int[] valA = {  13, -22,  82,  17 };
        int[] valB = { -12,  24, -79, -13 };
        int[] sum =  {   0,   0,   0,   0 };

        for ( int count = 0; count < sum.length; count++ )
        {
            sum[count] = valA[count] + valB[count];
        }

        System.out.println( "sum: " +
            sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3] );
    }

    /**
     * Complete the method with four assignment statements that put
     * values into valB so that the sum of corresponding cells in valA
     * and valB is 25.
     */
    public void ex4_SameSum()
    {
        int[] valA = { 13, -22, 82, 17 };
        int[] valB = {  0,  0,   0,  0 };
        
        for ( int count = 0; count < valB.length; count++ )
        {
            valB[count] = 25 - valA[count];
        }

        System.out.println( "valA: " +
            valA[0] + " " + valA[1] + " " + valA[2] + " " + valA[3] );
     
        System.out.println( "valB: " +
            valB[0] + " " + valB[1] + " " + valB[2] + " " + valB[3] );

        System.out.println( "sum:  " +
            (valA[0]+valB[0]) + " " + (valA[1]+valB[1]) + " " +
            (valA[2]+valB[2]) + " " + (valA[3]+valB[3]) );
    }

    /**
     * Complete the method so that the numbers in the array appear in
     * reversed order. You will need to use the variable
     * <code>temp</code> to do this.
     */
    public void ex5_ReverseOrder()
    {
        int[] val = { 0, 1, 3, 5 };
        int temp;
     
        System.out.println( "Original Array: " +
            val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
     
        for ( int jeff = 3; jeff > 0; jeff-- )
        {
            for ( int count = 0; count < jeff; count++ )
            {
                temp = val[count];
                val[count] = val[count + 1];
                val[count + 1] = temp;
            }   
        }
  
       
        System.out.println( "Reversed Array: " +
            val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
    }

    /**
     * Testing method: instantiates a Ch46ArraysEx1_5 object and then
     * invokes each method
     * 
     * @param args command line parameters (not used)
     */
    public static void main( String[] args )
    {
        Scanner kbd = new Scanner( System.in );
        boolean done = false;
        String separator = "";

        Ch46ArraysEx1_5 exercise = new Ch46ArraysEx1_5();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "   (1) Array Sum" );
            System.out.println( "   (2) Two Arrays" );
            System.out.println( "   (3) Three Arrays" );
            System.out.println( "   (4) Same Sum" );
            System.out.println( "   (5) Reverse Order" );
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
                        exercise.ex1_ArraySum();
                        break;
                    case '2':
                        exercise.ex2_TwoArrays();
                        break;
                    case '3':
                        exercise.ex3_ThreeArrays();
                        break;
                    case '4':
                        exercise.ex4_SameSum();
                        break;
                    case '5':
                        exercise.ex5_ReverseOrder();
                        break;
                    default:
                        if ( response.toLowerCase().charAt( 0 ) == 'q' )
                            done = true;
                        else
                            System.out.print( "Invalid Choice" );
                        break;
                }
            }
        } while ( !done );
        System.out.println( "Goodbye!" );
    }
}
