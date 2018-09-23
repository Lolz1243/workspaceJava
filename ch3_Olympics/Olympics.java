import kareltherobot.*;

/**
   TODO Write a one-sentence summary of your class here.
   TODO Follow it with additional details about its purpose, what abstraction
   it represents, and how to use it.

   @author  TODO Your Name
   @version TODO Date

   @author  Period - TODO Your Period
   @author  Assignment - ch3_Olympics

   @author  Sources - TODO list collaborators
 */
public class Olympics implements Directions
{
    public static void main( String args[] )
    {
        Triathlete ironman = new Triathlete( 4, 3, East, 0 );

        ironman.runRace();

        ironman.turnOff();
    }

    static
    {
        World.reset();
        World.readWorld( "triathlon.wld" );
        World.setDelay( 10 );
        World.setVisible( true );
    }
}
