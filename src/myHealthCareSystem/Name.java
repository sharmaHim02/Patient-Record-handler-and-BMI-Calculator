package myHealthCareSystem;

/**
 * Represents a patient's name.
 */
public class Name {

    /* Attributes ************************************/
    private String first;
    private String last;
    private String middle;
    private String salutation;

    /* Constructors **********************************/
    /**
     * Default constructor for Name.
     */
    public Name() {
    }

    /**
     * Constructor for Name, taking a full name in the format "First Last".
     *
     * @param name Full name in the format "First Last"
     */
    public Name(String name) {
        // Assuming name is a full name in the format "First Last"
        String[] parts = name.split(" ");
        if (parts.length >= 2) {
            this.first = parts[0];
            this.last = parts[1];
        }
    }

    /**
     * Constructor for Name with first and last names.
     *
     * @param first First name
     * @param last  Last name
     */
    public Name(String first, String last) {
        this.first = first;
        this.last = last;
    }

    /**
     * Constructor for Name with first, last, and middle names.
     *
     * @param first  First name
     * @param last   Last name
     * @param middle Middle name
     */
    public Name(String first, String last, String middle) {
        this.first = first;
        this.last = last;
        this.middle = middle;
    }

    /* Accessors *************************************/
    /**
     * Getter for first name.
     *
     * @return First name
     */
    public String getFirst() {
        return first;
    }

    /**
     * Getter for last name.
     *
     * @return Last name
     */
    public String getLast() {
        return last;
    }

    /**
     * Getter for middle name.
     *
     * @return Middle name
     */
    public String getMiddle() {
        return middle;
    }

    /* Modifiers *************************************/
    /**
     * Setter for first name.
     *
     * @param first First name to set
     */
    public void setFirst(String first) {
        this.first = first;
    }

    /**
     * Setter for last name.
     *
     * @param last Last name to set
     */
    public void setLast(String last) {
        this.last = last;
    }

    /**
     * Setter for middle name.
     *
     * @param middle Middle name to set
     */
    public void setMiddle(String middle) {
        this.middle = middle;
    }

    /**
     * Setter for salutation.
     *
     * @param salutation Salutation to set
     */
    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    /* Normal Behavior ********************************/
    /**
     * Formats the name into a string.
     *
     * @return Formatted name string
     */
    public String formattedName() {
        StringBuilder formattedName = new StringBuilder();

        String[] nameComponents = {salutation, first, middle, last};

        for (String component : nameComponents) {
            if (component != null) {
                formattedName.append(component).append(" ");
            }
        }

        return formattedName.toString().trim();
    }

    /**
     * Getter for the first name.
     *
     * @return First name
     */
    public String first() {
        return first;
    }

    /**
     * Getter for the last name.
     *
     * @return Last name
     */
    public String last() {
        return last;
    }

    /* Helper Methods ********************************/
    /**
     * Overrides toString method to provide a string representation of the Name.
     *
     * @return String representation of Name
     */
    @Override
    public String toString() {
        return getClass().getName() + " [first=" + first + ", last=" + last + ", middle=" + middle + ", salutation=" + salutation + "]";
    }
}
