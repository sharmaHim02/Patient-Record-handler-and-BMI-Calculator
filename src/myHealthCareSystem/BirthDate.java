package myHealthCareSystem;

/**
 * This class represents the birth date for a patient. A birth date, once created,
 * cannot be changed.
 */
public class BirthDate {

    /* Attributes ************************************/
    /** Birth day */
    private final int day;
    /** Birth month */
    private final int month;
    /** Birth year */
    private final int year;

    /* Constructors **********************************/
    /**
     * Create the birth date for this patient.
     *
     * @param year  Year of birth (4 numeric characters)
     * @param month Month of birth (01 thru 12) (2 digit month)
     * @param day   Day of birth. (2 digit day, 01 thru 30... depending upon the month and year)
     */
    public BirthDate(int year, int month, int day) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /* Accessors *************************************/
    /**
     * Getter for day.
     *
     * @return Day of birth
     */
    public int getDay() {
        return day;
    }

    /**
     * Getter for month.
     *
     * @return Month of birth
     */
    public int getMonth() {
        return month;
    }

    /**
     * Getter for year.
     *
     * @return Year of birth
     */
    public int getYear() {
        return year;
    }

    /* Modifiers ************************************/


    /* Normal Behavior ********************************/
    /**
     * Formats the birth date into a string.
     *
     * @return Formatted birth date string (YYYY/MM/DD)
     */
    public String formattedBirthDate() {
        return String.format("%04d/%02d/%02d", year, month, day);
    }

    /**
     * Converts this object into a meaningful string.
     *
     * @return This object as a string.
     */
    @Override
    public String toString() {
        return getClass().getName() + "[year=" + year + ", month=" + month + ", day=" + day + "]";
    }

    /* Helper Methods ********************************/

}
