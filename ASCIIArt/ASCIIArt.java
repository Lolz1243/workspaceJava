/**
 * The ASCIIArt program prints the name "George", the initials GKP and a some
 * fish to standard output using ascii characters to make a picture.
 * 
 * @author Nikhil Vytla
 * @version 1/5/17
 * @author 7
 * 
 * @author Assignment:  ASCIIArt
 * 
 * @author Sources: None
 */
public class ASCIIArt
{
    public ASCIIArt()
    {
        System.out.println( "Nikhil's ASCII Art" );
        System.out.println();
    }

    public void firstName()
    {
        // print out Nikhil using letters
        System.out.println( "N           N         k      h               l" );
        System.out.println( "N N         N    i    k      h         i     l" );
        System.out.println( "N   N       N   iii   k   k  h        iii    l" );
        System.out.println( "N     N     N    i    k k    h hhhh    i     l" );
        System.out.println( "N       N   N    i    k      h     h   i     l" );
        System.out.println( "N         N N    i    k k    h     h   i     l" );
        System.out.println( "N           N    i    k   k  h     h   i     l" );
        System.out.println( "                                              " );
        System.out.println( "                                              " );
        System.out.println( "                                              " );
    }

    public void initials()
    {
        // System.out.print doesn't attach a trailing newline character. We can
        // do this on our own with \n. The \t's are used for inserting tabs
        System.out.print( "\n\t\tor...\n\n" );

        // print out GKP using "tiles"
        System.out.println( "_/     _/   _/        _/" );
        System.out.println( "_/_/   _/     _/     _/" );
        System.out.println( "_/ _/  _/      _/   _/" );
        System.out.println( "_/  _/ _/       _/ _/" );
        System.out.println( "_/   _/_/        _/" );

        System.out.print( "\n\t\tor...\n" );
        // print out GKP using brackets
        System.out.println( "  _______________________" );
        // Java uses a double back slash (\\) to denote an actual backslash
        // character. The reason for this is because \ is an escape sequence for
        // special ascii characters
        System.out.println( " /                       \\" );
        System.out.println( "| []      []  []      []  |" );
        System.out.println( "| [][]    []   []    []   |" );
        System.out.println( "| []  []  []    []  []    |" );
        System.out.println( "| []    [][]     [][]     |" );
        System.out.println( "| []      []      []      |" );
        System.out.println( " \\_______________________/" );
    }

    public void fish()
    {
        System.out.print( "\n\t\tor...\n" );
        // print out some ascii fish...just because
        System.out.println( "                          ,     " );
        System.out.println( "               ()       _/{     " );
        System.out.println( "        ,_         o  .'   './`>" );
        System.out.println( "        _}\\_ O       / a ((  =< " );
        System.out.println( "   <`\\.'    '. o     '.,__,.'\\_>" );
        System.out.println( "    >    )) e \\           \\)    " );
        System.out.println( "   <_/'.,___,.'                 " );

        System.out.println();
    }

    public static void main( String[] args )
    {
        ASCIIArt asciiArtist = new ASCIIArt();
        asciiArtist.firstName();
        asciiArtist.initials();
        asciiArtist.fish();
    } // main
} // ASCIIArt
