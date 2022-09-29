/**
 * @author Patricia N. Antlitz
 * @version 1.0
 */
public class Date_PatriciaAntlitz extends Date
{
    Date_PatriciaAntlitz[] dayArray;

    public Date_PatriciaAntlitz(int newMonth, int newDay, int newYear)
    {
        super(newMonth, newDay, newYear);
    }

    public void addToArray()
    {

        dayArray = new Date_PatriciaAntlitz[10];

        for(int i = 0; i < dayArray.length; i++)
        {
            dayArray[i] = new Date_PatriciaAntlitz(getMonth(), getDay() + i, getYear());
        }

        for(int j = 0; j < dayArray.length; j++)
        {
            System.out.println(dayArray[j]);
        }
    }
    public static void main(String[] args) {

        Date_PatriciaAntlitz myDate = new Date_PatriciaAntlitz(12, 1, 2005);
        myDate.addToArray();
    }
}
