import kareltherobot.*;


/**
 * 
 * SorterBot is where all the methods are stored. Each method is finally
 * compiled into the master method sortThemAll().
 * 
 * The purpose of SorterBot is to go through randomly generated layouts of
 * beepers and arrange the rows in ascending order.
 * 
 * @author Nikhil Vytla
 * @version 2/6/2017
 * 
 * @author Period - 7
 * @author Assignment ch6_25SorterBot
 * 
 * @author Sources - None
 */
public class SorterBot extends SmartBot
{
    /**
     * @param st
     *            initial street
     * @param av
     *            initial avenue
     * @param dir
     *            direction this robot is facing
     * @param numBeepers
     *            number of beepers this robot has in its beeper bag
     */
    public SorterBot( int st, int av, Direction dir, int numBeepers )
    {
        super( st, av, dir, numBeepers );
    }


    /**
     * sortThemAll() is the major method in the class, and the only public
     * method. It lets karel sort through any random orientation of beepers
     * contingent on the fact that there are no random holes (an empty space
     * surrounded by a beeper on the bottom and the top).
     */
    public void sortThemAll()
    {
        moveToRowToClear();
        pickUpRow();

        while ( anyBeepersInBeeperBag() )
        {
            goToOriginAndFaceEast();
            moveToClearedRow();
            putDownRow();
            turnAround();
            moveToRowToClear();
            pickUpRow();
        }
    }


    /**
     * moveToRowToClear() lets karel get to the end of the row it needs to clear
     * by using a while loop to make sure it keeps on going while next to a
     * beeper. It then turns around and goes up a space.
     */
    private void moveToRowToClear()
    {
        move();

        while ( nextToABeeper() )
        {
            move();
        }

        turnLeft();
        move();
        turnLeft();
        move();
    }


    /**
     * pickUpRow() is pretty self-explanatory. As long as there is no wall
     * directly in front of karel, it picks up any beepers that it is next to.
     * The final if statement is used to pick up the beeper (if any) that is
     * right next to the wall.
     */
    private void pickUpRow()
    {
        while ( frontIsClear() )
        {
            if ( nextToABeeper() )
            {
                pickBeeper();
            }
            move();
        }

        if ( nextToABeeper() )
        {
            pickBeeper();
        }
    }


    /**
     * goToOriginAndFaceEast() makes karel turn west and south and follow the
     * robot world boundary walls to finally reach the origin. This essentially
     * resets the position of karel every time it completes rearranging a row
     * full of beepers
     */
    private void goToOriginAndFaceEast()
    {
        faceWest();

        while ( frontIsClear() )
        {
            move();
        }

        faceSouth();

        while ( frontIsClear() )
        {
            move();
        }

        faceEast();
    }


    /**
     * moveToClearedRow() does what it's called. karel moves until it hits a row
     * with no beepers in it (It just cleared it out the step before).
     */
    private void moveToClearedRow()
    {
        while ( nextToABeeper() )
        {
            move();
        }

        turnAround();
        move();
        turnRight();

        while ( nextToABeeper() )
        {
            move();
        }

        turnLeft();
    }


    /**
     * putDownRow() essentially gets karel to move one space and put down
     * beepers as long as the front is clear and there are still beepers in its
     * beeper bag.
     */
    private void putDownRow()
    {
        while ( anyBeepersInBeeperBag() )
        {
            putBeeper();

            if ( frontIsClear() )
            {
                move();
            }
        }
    }
}