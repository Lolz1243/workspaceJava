import kareltherobot.*;

/**
 * 
 *  TODO Write a one-sentence summary of your class here.
 *  TODO Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author  nvytla071
 *  @version Jan 31, 2017
 *  @author  Period: 7
 *  @author  Assignment: ch6_25SorterBot
 *
 *  @author  Sources: None
 */
public class SorterBotTester implements Directions
{
    public static void main( String args[] )
    {
        SorterBot jeff = new SorterBot( 1, 1, East, 0 );
        
        jeff.sortThemAll();
        //jeff.turnOff();
    }

    static
    {
        World.reset();
        World.readWorld( "ch6_25.wld" );
        World.setDelay( 5 );
        World.setVisible( true );
    }
}
