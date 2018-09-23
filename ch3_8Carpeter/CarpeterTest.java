import kareltherobot.*;

// TODO: complete comments

public class CarpeterTest implements Directions
{
    public static void main( String args[] )
    {
    	CarpetLayer jeff = new CarpetLayer( 9, 2, South, 28);

        jeff.layCarpet();

    }

    static
    {
        World.reset();
        World.readWorld( "carpeter.wld" );
        World.setDelay( 1 );
        World.setVisible( true );
    }
}
