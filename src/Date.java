/**
 * @author Patricia N. Antlitz
 * @version 1.0
 */
public class Date
{
    protected int year;
    protected int month;
    protected int day;
    public static final int MINYEAR = 1583;

    public Date(int newMonth, int newDay, int newYear)
    {
        this.month = newMonth;
        this.day = newDay;
        this.year = newYear;
    }

    public int getYear()
    {
        return this.year;
    }

    public int getMonth()
    {
        return this.month;
    }

    public int getDay()
    {
        return this.day;
    }

    public void lilian()
    {
        // Returns the Lilian Day Number of this date.
        // Algorithm goes here. Code is included with the program files.
        // See Lilian Day Numbers feature section for details.
    }

    public String toString()
    {
        return "Date: " + this.month + "/" + this.day + "/" + this.year;
    }
}
