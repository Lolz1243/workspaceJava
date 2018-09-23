import java.io.*;

/**
 * TODO Write a one-sentence summary of your class here. TODO Follow it with
 * additional details about its purpose, what abstraction it represents, and how
 * to use it.
 * 
 * @author Nikhil Vytla
 * @version 4/20/17
 * 
 * @author Period - 7
 * @author Assignment - Chapter 48 Arrays as Parameters Exercises 1-3
 * 
 * @author Sources - None
 */
public class Weight
{
    private int[] data;

    /**
     * Constructs a Weight object that contains an array of the weight
     * of an individual taken on successive days for one month.
     * 
     * @param init  array of weights for one month
     */
    public Weight(int[] init)
    {
        // Construct the array the same length
        // as that referenced by init.
        data = new int [init.length];

        // Copy values from the
        // input data to data.
        for ( int j = 0; j < data.length; j++ )
        {
            data[j] = init[j];
        }
    }

    /**
     * Calculates the average of all the values in
     * the array data.
     * @return average - returns the average of all
     * the values in the array
     */
    public int average()
    {
        int sum = 0;
        
        for ( int j = 0; j < data.length; j++ )
        {
            sum += data[j];
        }
        
        int average = sum / data.length;
        
        return average;
    }

    /**
     * Calculates average in a certain range of days.
     * @return average - returns average of the range of days.
     * @param start - the start of the range of days.
     * @param end - the end of the range of days.
     */
    public int subAverage( int start, int end )
    {
        int sum = 0;
        
        for ( int j = start; j <= end; j++ )
        {
            sum += data[j];
        } 
        
        int average = sum / (end - start + 1);
        
        return average;
    }

    /**
     * Prints out values in the array data.
     */
    public void print()
    {
        for ( int j = 0; j < data.length; j++ )
        {
            System.out.print(data[j] + ", ");
        }
    }

    /**
     * Testing method: instantiates a Weight object and then invokes
     * each method.
     * 
     * @param args  command line parameters (not used)
     */
    public static void main( String[] args )
    {
        int[] values = { 98, 99, 98, 99, 100, 101, 102, 100, 104, 105, 105, 106,
            105, 103, 104, 103, 105, 106, 107, 106, 105, 105, 104, 104, 103,
            102, 102, 101, 100, 102 };

        Weight june = new Weight( values );
        june.print();
        
        int avg = june.average();
        System.out.println( "average = " + avg );
        
        int avg1stHalf = june.subAverage(0, ( values.length - 1) / 2 );
        System.out.println( "average of first half of month = " + avg1stHalf );
        
        int avg2ndHalf = june.subAverage(values.length / 2 , values.length - 1);
        System.out.println( "average of second half of month = " + avg2ndHalf );
    }
}
