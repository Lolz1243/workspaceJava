import java.util.*;
import java.io.*;

/**
   Chapter 49C - Two-Dimensional Arrays Exercises 1-8

   @author Nikhil Vytla
   @version 5/4/17

   @author Period - 7
   @author Assignment - Ch49C_2DArrays

   @author Sources - None
 */
public class Ch49C_2DArrays
{
    Scanner scan;

    public Ch49C_2DArrays()
    {
        scan = new Scanner( System.in );
    }

    /**
      Find a sum of all elements in the 2D Array
     */
    public int sumOfAllArrayElements( int[][] data )
    {
        // declare the sum
        int sum = 0;
        // compute the sum
        for ( int row = 0; row < data.length; row++ )
        {
            for ( int col = 0; col < data[row].length; col++ )
            {
                sum += data[row][col];
            }
        }

        // write out the sum
        System.out.println( sum );
        
        return sum;
    }

    /**
       Find the sum of each row in the 2D Array
     */
    public int[] sumOfEachRow( int[][] data )
    {
        // declare the row sum array
        int [] rowSums = new int[data.length];

        // compute the sums for each row
        for ( int row = 0; row < data.length; row++ )
        {
            // initialize the sum
            int sum = 0;
            // compute the sum for this row
            for ( int col = 0; col < data[row].length; col++ )
            {
                sum += data[row][col];
            }
            rowSums[row] = sum;
            // write the sum for this row
            System.out.println(rowSums[row]);
        }
        
        return rowSums;
    }

    /**
     * Find sum of each column in the 2D array
     */
    public int[] sumOfEachColumn( int[][] data )
    {
        //find the longest row
        int longestRow = 0;
        // TODO Your Code Here
        for (int row = 0; row < data.length; row++)
        {
           if (data[row].length > longestRow)
           {
               longestRow = data[row].length;
           }
        }
        // declare the row sum array
        int [] colSums = new int[longestRow];
        
        // TODO Your Code Here
        for (int row = 0; row < data.length; row++)
        {
           for (int col = 0; col < data[row].length; col++)
           {
               for (int i = 0; i < longestRow; i++)
               {
                   if ( col == i)
                   {
                       colSums[i] += data[row][col];
                   }
               }
           }
        }
        return colSums;
    }

    /**
       TODO Description
     */
    public int[] maxAndMinElements( int[][] data )
    {
        // declare the max and the min
        int max = data[0][0];
        int min = data[0][0];
        
        // compute the sum
        for ( int row = 0; row < data.length; row++ )
        {
            for ( int col = 0; col < ???; col++ )
            {

            }
        }

        // write out the results
        System.out.println();
        
        int[] result = { max, min };
        return result;
    }

    /**
       TODO Description
     */
    public int[] largestElements( int[][] data )
    {
        // declare the largest in row array
        int[] largestInRow = new int[data.length];
        
        // TODO Your Code Here
        
        return largestInRow;
    }

    /**
      TODO Description
     */
    public void reversalOfElementsInEachRow( int[][] data )
    {
        // TODO Your Code Here
    }

    /**
       TODO Description
     */
    public int[][] imageSmootherEasy(int[][] image)
    {
        // assume a rectangular image
        int[][] smooth = new int[image.length][image[0].length];

        // Compute the smoothed value for
        // non-edge locations in the image.

        int sum = 0;
        for ( int row = 1; row < image.length - 1; row++ )
        {
            int col;
            for ( col = 1; col < image[row].length - 1; col++ )
            {

            }
            smooth[row][col] = sum / 9;
        }

        // write out the input

        // write out the result
        
        return smooth;
    }

    /**
       TODO Description
     */
    public int[][] imageSmootherHard( int[][] image )
    {
        // assume a rectangular image
        int[][] smooth = new int[image.length][image[0].length];
        
        // TODO Your Code Here
        
        return smooth;
    }

    /**
      Testing method: instantiates a Lesson49C Exercises object and
      then invokes each method

      @param args command line parameters (not used)
     */
    public static void main( String[] args )
    {
        Scanner kbd = new Scanner( System.in );
        boolean done = false;

        Ch49C_2DArrays exercise = new Ch49C_2DArrays();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "   (1) Sum of All Array Elements");
            System.out.println( "   (2) Sum of Each Row");
            System.out.println( "   (3) Sum of Each Column");
            System.out.println( "   (4) Maximum and Minimum Elements");
            System.out.println( "   (5) Largest Elements");
            System.out.println( "   (6) Reversal of Elements in Each Row");
            System.out.println( "   (7) Image Smoother (Easy)");
            System.out.println( "   (8) Image Smoother (Hard)");
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
                        int[][] dataEx1 = { { 3, 2, 5 },
                            { 1, 4, 4, 8, 13 },
                            { 9, 1, 0, 2 },
                            { 0, 2, 6, 3, -1, -8 } };
                        int sum = exercise.sumOfAllArrayElements(dataEx1);
                        break;
                    case '2':
                        int[][] dataEx2 = { { 3, 2, 5 },
                            { 1, 4, 4, 8, 13 },
                            { 9, 1, 0, 2 },
                            { 0, 2, 6, 3, -1, -8 } };
                        int[] rowSums = exercise.sumOfEachRow(dataEx2);
                        break;
                    case '3':
                        int[][] dataEx3 = { { 3, 2, 5 },
                            { 1, 4, 4, 8, 13 },
                            { 9, 1, 0, 2 },
                            { 0, 2, 6, 3, -1, -8 } };
                        int[] colSums = exercise.sumOfEachColumn( dataEx3 );
                        break;
                    case '4':
                        int[][] dataEx4 = { { 3, 2, 5 },
                            { 1, 4, 4, 8, 13 },
                            { 9, 1, 0, 2 },
                            { 0, 2, 6, 3, -1, -8 } };
                        int[] maxMin = exercise.maxAndMinElements( dataEx4 );
                        break;
                    case '5':
                        int[][] dataEx5 = { { 3, 2, 5 },
                            { 1, 4, 4, 8, 13 },
                            { 9, 1, 0, 2 },
                            { 0, 2, 6, 3, -1, -8 } };
                        int[] largestInRow = exercise.largestElements( dataEx5 );
                        break;
                    case '6':
                        int[][] dataEx6 = { { 3, 2, 5 },
                            { 1, 4, 4, 8, 13 },
                            { 9, 1, 0, 2 },
                            { 0, 2, 6, 3, -1, -8 } };
                        exercise.reversalOfElementsInEachRow( dataEx6 );
                        break;
                    case '7':
                        int[][] imageEx7 = {
                            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 4, 4, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 4, 4, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
                        int[][] easySmooth =
                            exercise.imageSmootherEasy( imageEx7 );
                        break;
                    case '8':
                        int[][] imageEx8 = {
                            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 4, 4, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 4, 4, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0 },
                            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
                        int[][] hardSmooth =
                            exercise.imageSmootherHard( imageEx8 );
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
