import java.util.*;

/**
 *  Chapter 12 - Decision Making Programming Exercises 1-9.
 * 
 *  @author Nikhil Vytla
 *  @version 3/9/17
 * 
 *  @author Period - 7
 *  @author Assignment - Ch12Ex1to9
 * 
 *  @author Sources - None
 */
public class Ch12Ex1to9
{
    /**
     * Initializes a Scanner for input from the console.
     */
    Scanner scan;

    /**
     * Constructs a Scanner for input from the console.
     */
    public Ch12Ex1to9()
    {
        scan = new Scanner( System.in );
    }

    /**
     * Constructs a Scanner to evaluate passed input (used for testing).
     * 
     * @param str input for the various methods
     */
    public Ch12Ex1to9( String str )
    {
        scan = new Scanner( str );
    }

    /**
     * Uses a single if statement to determine if a discount is viable.
     * If so, automatically deducts 10% and prints the discounted price
     * to the customer.
     */
    public void discountPrices()
    {
        System.out.println( "Enter amount of purchases: " );
        
        int amount = scan.nextInt();
        int discountedPrice = amount - (amount / 10);
        
        if (amount > 1000)
        {
            System.out.println("Discounted price: " + discountedPrice);
        }
        else
        {
            System.out.println( "No discount. Price: " + amount);
        }
    }

    /**
     * OrderChecker lets the user input the number of bolts, nuts, and
     * washers in their purchases. It then calculates the total, and 
     * also checks if the order is valid.
     */
    public void orderChecker()
    {
        System.out.print( "Number of bolts: " );
        int bolts = scan.nextInt();
        
        System.out.print( "Number of nuts: " );
        int nuts = scan.nextInt();
        
        System.out.print( "Number of washers: \n" );
        int washers = scan.nextInt();
        
        if ( nuts >= bolts && washers >= (2 * bolts) )
        {
            System.out.println( "Order is OK." );
        }
        if (nuts < bolts)
        {
            System.out.println( "Check the Order: too few nuts \n" );
        }
        if ( washers < (2 * bolts) )
        {
            System.out.println( "Check the Order: too few washers \n" );
        }
        
        int cost;
        cost = (5 * bolts) + (3 * nuts) + (1 * washers);
        System.out.println( "Total cost: " + cost );
    }

    /**
     * (Gauge / 100) * MPG * Capacity is the formula
     * we use to calculate if the driver has enough
     * gas to cross the 200 miles to the next gas
     * station.
     */
    public void lastChanceGas()
    {
        System.out.println( "Tank capacity: " );
        int capacity = scan.nextInt();
        
        System.out.println( "Gauge reading: " );
        int gauge = scan.nextInt();
        
        System.out.println( "Miles per gallon: " );
        int mpg = scan.nextInt();
        
        int gas = ((gauge * capacity * mpg) / 100);
        
        if (gas >= 200)
        {
            System.out.println( "Safe to Proceed" );
        }
        else
        {
            System.out.println( "Get Gas!" );
        }
        
    }

    /**
        groundBeefValueCalc uses the formula 
        price / (percent / 100)to calculate the cost per 
        pound of lean beef for each package and then write 
        out the package with the best value.
     */
    public void groundBeefValueCalc()
    {
        System.out.println( "Price per pound package A: " );
        double priceA = scan.nextDouble();
        
        System.out.println( "Percent lean package A: " );
        double percentA = scan.nextDouble();
        
        System.out.println( "Price per pound package B: " );
        double priceB = scan.nextDouble();
        
        System.out.println( "Percent lean package B: " );
        double percentB = scan.nextDouble();
        
        double costA = priceA / ( percentA / 100 );
        double costB = priceB / ( percentB / 100 );
        
        System.out.println( "\nPackage A cost per pound of lean: " 
                        + costA );
        System.out.println( "\nPackage B cost per pound of lean: " 
                        + costB );
        
        if ( costA > costB )
        {
            System.out.println( "Package B is the best value" );
        }
        else if ( costA < costB )
        {
            System.out.println( "Package A is the best value" );
        }
        
        
    }

    /**
     * y2KProblemDetector allows the user to differentiate
     * between the 20th and the 21st century, and tells what
     * age a user is by using the greater than and less than
     * operands.
     */
    public void y2KProblemDetector()
    {
        int age;
        
        System.out.print( "Year of Birth: ");
        int birth = scan.nextInt();
        
        System.out.print( "Current year: " );
        int current = scan.nextInt();
        
        if ( (birth - current) < 0 )
        {
            age = current - birth;
            System.out.print( "Your age: " + age );
        }
        else if ( (birth - current) > 0 )
        {
            age = (2000 + current) - (1900 + birth);
            System.out.print( "Your age: " + age );
        }
    }

    /**
     * Uses the three formulas given to calculate the
     * wind chill index at different wind speeds and temperatures.
     */
    public void windChillIndex()
    {
        double v;
        double t;
        double wci;
        
        System.out.print( "Enter wind speed v: " );
        v = scan.nextDouble();
        
        System.out.print( "Enter temperature t: " );
        t = scan.nextDouble();
        
        
        
        if ( v >= 0 && v <= 4 )
        {
            wci = t;
        }
        else if ( v >= 45 )
        {
            wci = ((1.6 * t) - 55);
        }
        else
        {
            wci = 91.4 + ( (91.4 - t) * ((0.0203 * v) - 
                            (0.304 * Math.sqrt(v)) - 0.474) );
        }
        
        System.out.println( "The wind chill index (WCI) is: "
                        + wci);
    }

    /**
     * We convert the age of a person from years, months, and
     * days into seconds. We account for each month's specific
     * number of days.
     */
    public void yourAgeInSeconds()
    {
        System.out.print( "Enter the number of years: " );
        int years = scan.nextInt();
        
        System.out.print( "Enter the number of months: " );
        int months = scan.nextInt();
        
        System.out.print( "Enter the number of days: " );
        int days = scan.nextInt();
        
        int monthsToDays = 0;
        
        if (months == 1)
        {
            monthsToDays = 31;
        }
        else if (months == 2)
        {
            monthsToDays = 31 + 28;
        }
        else if (months == 3)
        {
            monthsToDays = 31 + 28 + 31;
        }
        else if (months == 4)
        {
            monthsToDays = 31 + 28 + 31 + 30;
        }
        else if (months == 5)
        {
            monthsToDays = 31 + 28 + 31 + 30 + 31;
        }
        else if (months == 6)
        {
            monthsToDays = 31 + 28 + 31 + 30 + 31 + 30;
        }
        else if (months == 7)
        {
            monthsToDays = 31 + 28 + 31 + 30 + 31 + 
                            30 + 31;
        }
        else if (months == 8)
        {
            monthsToDays = 31 + 28 + 31 + 30 + 31 + 
                            30 + 31 + 31;
        }
        else if (months == 9)
        {
            monthsToDays = 31 + 28 + 31 + 30 + 31 
                            + 30 + 31 + 31 + 30;
        }
        else if (months == 10)
        {
            monthsToDays = 31 + 28 + 31 + 30 + 31 + 30 
                            + 31 + 31 + 30 + 31;
        }
        else if (months == 11)
        {
            monthsToDays = 31 + 28 + 31 + 30 + 31 + 30 + 31 
                            + 31 + 30 + 31 + 30;
        }
        else if (months == 12)
        {
            monthsToDays = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 
                            + 30 + 31 + 30 + 31;
        }
        
        
        int totalDays = days + monthsToDays + (years * 365);
        
        int totalSeconds = totalDays * 24 * 60 * 60;
        
        System.out.println( "Your age in seconds is: " + 
                        totalSeconds + " seconds.");
    }

    /**
     * Uses several if statements to differentiate between child and adult
     * and matinee and normal movie tickets. Checks two conditions each
     * run (age and time) and prints out the total cost.
     */
    public void matineeMovieTickets()
    {
        int age;
        int hours;
        double price = 0.00;
        System.out.print( "Enter your age: " );
        age = scan.nextInt();
        
        System.out.print( "Enter the hours: " );
        hours = scan.nextInt();
        
        if ( age > 13 && hours >= 1700 )
        {
            price = 8.00;
        }
        else if ( age > 13 && hours < 1700 )
        {
            price = 5.00;
        }
        else if ( age < 13 && hours >= 1700 )
        {
            price = 4.00;
        }
        else if ( age <= 13 && hours < 1700 )
        {
            price = 2.00;
        }
        
        System.out.println( "The price of a movie ticket for this person is: $"
            + price );
    }

    /**
     * Method midnightMadness is based on method matineeMovieTickets. It only
     * calculates a price if the age of the person is greater than 13.
     * Otherwise it will display the message "Too Young".
     */
    public void midnightMadness()
    {
        int age;
        int hours;
        double price = 0.00;
        System.out.print( "Enter your age: " );
        age = scan.nextInt();
        
        System.out.print( "Enter the hours: " );
        hours = scan.nextInt();
        
        if ( age > 13 && hours >= 1700 )
        {
            price = 8.00;
        }
        else if ( age > 13 && hours < 1700 )
        {
            price = 5.00;
        }
        else if ( age < 13 && hours >= 1700 )
        {
            price = 4.00;
        }
        else if ( age <= 13 && hours < 1700 )
        {
            price = 2.00;
        }
        if ( hours > 2200 )
        {
            if ( age > 13)
            {
                price = 4.00;
            }
            else
            {
                System.out.println( "Too Young" );
            }
        }
        System.out.println("The price of the ticket is: $" + price);
    }

    /**
     * Testing method: instantiates a Lesson15Exercises object and then invokes
     * each method.
     * 
     * @param args  command line parameters (not used)
     */
    public static void main( String[] args )
    {
        Scanner kbd = new Scanner( System.in );
        boolean done = false;

        Ch12Ex1to9 exercise = new Ch12Ex1to9();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "    (1) Discount Prices" );
            System.out.println( "    (2) Order Checker" );
            System.out.println( "    (3) Last Chance Gas" );
            System.out.println( "    (4) Ground Beef Value Calculator" );
            System.out.println( "    (5) Y2K Problem Detector" );
            System.out.println( "    (6) Wind Chill Index" );
            System.out.println( "    (7) Your Age in Seconds" );
            System.out.println( "    (8) Matinee Movie Tickets" );
            System.out.println( "    (9) Midnight Madness" );
            System.out.println( "    (Q) Quit" );
            System.out.println();
            System.out.print( "Enter a choice:  " );
            String response = kbd.nextLine();

            if ( response.length() > 0 )
            {
                System.out.println();

                switch ( response.charAt( 0 ) )
                {
                    case '1':
                        exercise.discountPrices();
                        break;
                    case '2':
                        exercise.orderChecker();
                        break;
                    case '3':
                        exercise.lastChanceGas();
                        break;
                    case '4':
                        exercise.groundBeefValueCalc();
                        break;
                    case '5':
                        exercise.y2KProblemDetector();
                        break;
                    case '6':
                        exercise.windChillIndex();
                        break;
                    case '7':
                        exercise.yourAgeInSeconds();
                        break;
                    case '8':
                        exercise.matineeMovieTickets();
                        break;
                    case '9':
                        exercise.midnightMadness();
                        break;
                    default:
                        if ( response.toLowerCase().charAt( 0 ) == 'q' )
                        {
                            done = true;
                        }
                        else
                        {
                            System.out.print( "Invalid Choice" );
                        }
                        break;
                }
            }
        } while ( !done );
        System.out.println( "Goodbye!" );
    }
}
