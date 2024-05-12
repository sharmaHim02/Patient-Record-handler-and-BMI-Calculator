package myHealthCareSystem;

/**
 * Represents an address in the healthcare system.
 * The class includes attributes such as street, number, city, country, and postal code.
 */
public class Address {

    /* Attributes ************************************/
    private String street;
    private String number;
    private String city;
    private String country;
    private String postalCode;

    /* Constructors **********************************/
    /**
     * Constructs an Address object with the specified details.
     *
     * @param street     Street of the address
     * @param number     Number of the address
     * @param city       City of the address
     * @param country    Country of the address
     * @param postalCode Postal code of the address
     */
    public Address(String street, String number, String city, String country, String postalCode) {
        this.street = street;
        this.number = number;
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;
    }

    /* Accessors *************************************/
    /**
     * Getter for street.
     *
     * @return Street
     */
    public String getStreet() {
        return street;
    }

    /**
     * Getter for number.
     *
     * @return Number
     */
    public String getNumber() {
        return number;
    }

    /**
     * Getter for city.
     *
     * @return City
     */
    public String getCity() {
        return city;
    }

    /**
     * Getter for country.
     *
     * @return Country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Getter for postal code.
     *
     * @return Postal code
     */
    public String getPostalCode() {
        return postalCode;
    }

    /* Modifiers *************************************/
    /**
     * Setter for street.
     *
     * @param street Street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Setter for number.
     *
     * @param number Number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Setter for city.
     *
     * @param city City to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Setter for country.
     *
     * @param country Country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Setter for postal code.
     *
     * @param postalCode Postal code to set
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /* Normal Behavior ********************************/
    /**
     * Formats the address into a single string.
     *
     * @return Formatted address string
     */
    public String formattedAddress() {
        return number + " " + street + " " + city + " " + country + " " + postalCode;
    }

    /* Helper Methods ********************************/
    /**
     * Overrides toString method to provide a string representation of the Address.
     *
     * @return String representation of Address
     */
    @Override
    public String toString() {
        return getClass().getName() + " [street=" + street + ", number=" + number + ", city=" + city + ", country=" + country
                + ", postalCode=" + postalCode + "]";
    }
}
