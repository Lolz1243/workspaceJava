/**
    People can use this program to search, add, print, and delete
    entries in a phonebook. They input specific elements such as
    letters, people's first and last names, and numbers in order
    to run each program.

   @author  Nikhil Vytla
   @version 4/21/2017

   @author  Period - 7
   @author  Assignment - Ch49B_PhoneBook

   @author  Sources - None
 */
public class PhoneBook
{ 
    private PhoneEntry[] phoneBook;
    private int nextEntry;

    /**
     * Constructs a phonebook with a capacity of 25 entries and initializes
     * the first 10 entries.
     */
    public PhoneBook() // constructor
    {
        phoneBook = new PhoneEntry[25];

        phoneBook[0] = new PhoneEntry( "Jenny", "Java", "(555)555-5555" );
        phoneBook[1] = new PhoneEntry( "Bob", "Binary", "(101)010-1010" );
        phoneBook[2] = new PhoneEntry( "Olive", "Oyl", "(555)123-4567" );
        phoneBook[3] = new PhoneEntry( "Mycroft", "Holmes", "(555)123-4321" );
        phoneBook[4] = new PhoneEntry( "Lynne", "Brook", "(408)366-7700" );
        phoneBook[5] = new PhoneEntry( "Monty", "Vista", "(408)366-7600" );
        phoneBook[6] = new PhoneEntry( "Cooper", "Tino", "(408)366-7300" );
        phoneBook[7] = new PhoneEntry( "Bertha", "Binary", "(111)111-1111" );
        phoneBook[8] = new PhoneEntry( "Betty", "Binary", "(011)100-0000" );
        phoneBook[9] = new PhoneEntry( "Sara", "Toga", "(408)867-3411 " );

        nextEntry = 10;
    }

    /**
     * Print prints all the entries in the phoneBook.
     */
    public void print()
    {
        if ( nextEntry <= 0 )
        {
            System.out.println( "Phonebook empty!!" );
        }
        else
        {
            for ( int i = 0; i < nextEntry; i++ )
            {
                System.out.println(phoneBook[i].firstName + " " +
                    phoneBook[i].lastName + " " +
                    phoneBook[i].phoneNum);
            }
        }
    }

    /**
     * add adds entries to the phoneBook by storing a firstName
     * a lastName, and a phoneNum in an array.
     * 
     * @param pEntry is essentially a new PhoneEntry consisting
     * of a firstName, a lastName, and a phoneNum
     * @return phoneBook[i] - the entry that has been added is
     * returned to the doAdd method in PhoneBookTester
     */
    public PhoneEntry add( PhoneEntry pEntry )
    {
        int i = 0;
        for ( int j = 0; j < phoneBook.length; j++ )
        {
            if ( phoneBook[j] == null )
            {
                phoneBook[j] = pEntry;
            }
            i = j;
        }
        nextEntry++;
        return phoneBook[i];
    }

    /**
     * delete deletes entries, which the user finds by matching the
     * first and last names of the pEntry to those of the phoneBook.
     * 
     * @param pEntry is essentially a new PhoneEntry consisting
     * of a firstName, a lastName, and a phoneNum
     * @return phoneBook[i] - the entry that has been deleted is 
     * returned to the doDelete method in PhoneBookTester
     */
    public PhoneEntry delete( PhoneEntry pEntry )
    {
        int i = 0;
        for ( int j = 0; j < phoneBook.length; j++ )
        {
            if ( phoneBook[j] != null)
            {
                if ( phoneBook[j].lastName == pEntry.lastName 
                                && phoneBook[j].firstName == pEntry.firstName )
                {
                    phoneBook[j] = null;
                    for ( int h = j + 1; h < phoneBook.length; h++ )
                    {
                        if (phoneBook[h] == null)
                        {
                            i = h - 1;
                            for ( int g = 0; g < phoneBook.length; g++ )
                            {
                                if (phoneBook[g] == null)
                                {
                                    phoneBook[g] = phoneBook[i];
                                    phoneBook[i] = null;
                                    nextEntry--;
                                    return pEntry;
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /**
     * search searches the phoneBook for a specific entry that the user
     * inputs.
     * 
     * @param pEntry is essentially a new PhoneEntry consisting
     * of a firstName, a lastName, and a phoneNum
     * @return dank memes
     */
    public PhoneEntry[] search( PhoneEntry pEntry )
    {
        if ( pEntry.firstName.length() == 0 )
        {
            int jeff = 0;
            for ( int j = 0; j < phoneBook.length; j++ )
            {
                if (phoneBook[j] != null)
                {
                    if (phoneBook[j].lastName.equals( pEntry.lastName ))
                    {
                        jeff++;
                    }
                }
            }
            
            PhoneEntry[] eric = new PhoneEntry[jeff];
            int ian = 0;
            for ( int j = 0; j < phoneBook.length; j++ )
            {
                if ( phoneBook[j] != null )
                {
                    if (phoneBook[j].lastName.equals( pEntry.lastName ))
                    {
                        eric[ian] = phoneBook[j];
                        ian++;
                    }
                }
            }
            if ( jeff > 0)
            {
                return eric;
            }

        }
        
        else
        {
            PhoneEntry[] eric = new PhoneEntry[1];
            for ( int j = 0; j < phoneBook.length; j++ )
            {
                if (phoneBook[j] != null)
                {
                    if (phoneBook[j].lastName.equals( pEntry.lastName ) && 
                                    phoneBook[j].firstName.
                                    equals( pEntry.firstName))
                    {
                        eric[0] = phoneBook[j];
                        return eric;
                    }
                }
            }
        }
        
        
        return null;
    }
    
    //////////////////////////////////////////
    // Methods used for testing purposes only
    
    /**
     * For testing only
     * 
     * @return the PhoneEntry[] that represents this phoneBook
     */
    public PhoneEntry[] getPhoneBook()
    {
        return phoneBook;
    }
    
    /**
     * For testing only
     * @return the next entry field
     */
    public int getNextEntry()
    {
        return nextEntry;
    }
}