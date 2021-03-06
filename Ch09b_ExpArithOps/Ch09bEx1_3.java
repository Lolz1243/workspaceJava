/**
   Chapter 9b - Expressions and Arithmetic Operators
   Programming Exercises 1-3

   @author  Nikhil Vytla
   @version 2/27/17

   @author  Period - 7
   @author  Assignment - Ch09bEx1_3

   @author  Sources - None
 */
public class Ch09bEx1_3
{
    public Ch09bEx1_3()
    {
        // empty default constructor
    }

    /**
      A method that averages the rain fall for three months, April, May,
      and June. Declares and initializes a variable to the rain fall for
      each month, computes the average, and writes out the results
      something like:

        Rainfall for April: 12
        Rainfall for May:   14
        Rainfall for June:  8
        Average rainfall:   11.333333333333334
     */
    public void averageRainFall()
    {
        int april = 12;
        int may = 14;
        int june = 8;
        double avg = (april + may + june) / 3.0;
        
        System.out.println("Rainfall for April:\t" + april);
        System.out.println("Rainfall for May:\t" + may);
        System.out.println("Rainfall for June:\t" + june);
        System.out.println("Average rainfall:\t" + avg);
    }

    /**
        A program that:
    
           1. Computes the sine of 0.5236 radians and saves it in a variable.
           2. Computes the cosine of 0.5236 radians and saves it in another variable.
           3. Computes the square of each those two values (use the variables),
              adds the two squares, and saves the result (in a third variable.)
           4. Writes out the three variables.
    
        The output statement should be something like:
        
            System.out.println("sine: " + sinx + " cosine: " + cosx + " sum: " + sum );
     */
    public void trigonometry()
    {
        double sinx = Math.sin( 0.5236 );
        double cosx = Math.cos( 0.5236 );
        double sum = Math.pow( sinx, 2 ) + Math.pow( cosx, 2 );
        
        System.out.println("sine: " + sinx + " cosine: " + cosx + " sum: " + sum );
        
    }

    /**
        Does the same things as the Trigonometry method (above), but the
        angle used is 30 degrees (which you will convert into radians.)
         
        To convert an angle given in degrees to radians do this:
        
            rad = degrees * Math.PI/180
        
        Math.PI gives you an accurate value of PI.
     */
    public void degreesToRadians()
    {
        double degrees = 30.0;
        double rad = degrees * Math.PI/180;
        
        double sinx = Math.sin( rad );
        double cosx = Math.cos( rad );
        double sum = Math.pow( sinx, 2 ) + Math.pow( cosx, 2 );
        
        System.out.println("sine: " + sinx + " cosine: " + cosx + " sum: " + sum );
    }

    /**
        Testing method: instantiates a Lesson09Exercises object and
        then invokes each method
        
        @param  args  command-line parameters (not used)
     */
    public static void main (String[] args )
    {
        Ch09bEx1_3 exercise = new Ch09bEx1_3();

        exercise.averageRainFall();
        System.out.println();

        exercise.trigonometry();
        System.out.println();

        exercise.degreesToRadians();
        System.out.println();
    }
}
