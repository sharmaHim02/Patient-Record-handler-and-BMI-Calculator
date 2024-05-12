package myHealthCareSystem;

/**
 * Represents an Electronic Medical Record (EMRecord) for a patient.
 * Extends the EMHRecord class and includes additional attributes such as height, weight, name, and address.
 */
public class EMRecord extends EMHRecord {

    /* Attributes ************************************/
    private int height;
    private int weight;
    private Name name;
    private Address address;

    /* Constructors ************************************/
    /**
     * Constructor for EMRecord.
     * Initializes essential attributes inherited from EMHRecord.
     *
     * @param reportingFacilityProvince Reporting facility province
     * @param institutionNumber         Institution number
     * @param chartNumber               Chart number
     * @param healthCareNumber          Health care number
     */
    public EMRecord(String reportingFacilityProvince, String institutionNumber, String chartNumber, String healthCareNumber) {
        super(reportingFacilityProvince, institutionNumber, chartNumber, healthCareNumber);
    }

    /* Accessors ************************************/
    /**
     * Getter for height.
     *
     * @return Height of the patient
     */
    public int getHeight() {
        return height;
    }

    /**
     * Getter for weight.
     *
     * @return Weight of the patient
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Getter for name.
     *
     * @return Name of the patient
     */
    public Name getName() {
        return name;
    }

    /**
     * Getter for address.
     *
     * @return Address of the patient
     */
    public Address getAddress() {
        return address;
    }

    /* Modifiers ************************************/
    /**
     * Setter for height.
     *
     * @param height Height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Setter for weight.
     *
     * @param weight Weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Setter for name.
     *
     * @param name Name to set
     */
    public void setName(Name name) {
        this.name = name;
    }

    /**
     * Setter for address.
     *
     * @param address Address to set
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /* Normal Behavior ************************************/
    /**
     * Formats the name into a string.
     *
     * @return Formatted name string
     */
    public String formattedName() {
        return name.toString();
    }

    /**
     * Formats the address into a string.
     *
     * @return Formatted address string
     */
    public String formattedAddress() {
        return address.toString();
    }

    /**
     * Calculates and returns the Body Mass Index (BMI) of the patient.
     *
     * @return Body Mass Index (BMI)
     */
    public int bmi() {
        return (int) MedicalCalculator.calculateBMI(weight, height);
    }

    /* Helper Methods ************************************/
    /**
     * Overrides toString method to provide a string representation of the EMRecord.
     *
     * @return String representation of EMRecord
     */
    @Override
    public String toString() {
        String EMHRecordAttributesString = super.toString().substring(super.toString().indexOf('['));
        EMHRecordAttributesString = EMHRecordAttributesString.substring(0, EMHRecordAttributesString.length() - 1);
        return "EMRecord " + EMHRecordAttributesString + ", height=" + height + ", weight=" + weight + ", name=" + name + ", address=" + address + "]";
    }
}
