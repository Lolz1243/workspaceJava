import kareltherobot.*;

/**
 * 
 *  PinSetterDriver provides us with the ability to actually run the robot program.
 *
 *  @author  nvytla071
 *  @version Jan 12, 2017
 *  @author  Period: 7
 *  @author  Assignment: ch3_2PinSetter
 *
 *  @author  Sources: None
 */

public class PinSetterDriver implements Directions
{
    public static void main( String args[] )
    {
        PinSetter bot = new PinSetter( 1, 5, North, 10 );
        bot.setPins();
        bot.turnOff();
    }

    static
    {
        World.reset();
        World.readWorld( "10x10.wld" );
        World.setDelay( 15 );
        World.setVisible( true );
    }
}
