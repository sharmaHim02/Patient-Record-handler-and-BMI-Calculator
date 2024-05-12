package myHealthCareSystem;

/**
 * This class represents Electronic Medical Records for patients.
 * It stores information related to patient encounters in a healthcare system.
 * The class includes attributes such as reporting facility province, institution number,
 * functional centre account, encounter sequence, health care number, chart number, issuing province,
 * residence code, gender, submission year, admit via ambulance, registration date,
 * registration time, and birth date.
 */
public class EMHRecord {

    // Attributes
    private String reportingFacilityProvince;
    private String institutionNumber;
    private String funcitonalCentreAccount;
    private int encounterSequence;
    private String healthCareNumber;
    private String chartNumber;
    private String issuingProvince;
    private String residenceCode;
    private String gender;
    private int submissionYear;
    private String admitViaAmbulance;
    private int registrationDate;
    private int registrationTime;
    private BirthDate birthdate;

    /**
     * Constructor for EMHRecord.
     * Initializes essential attributes: reporting facility province, institution number,
     * chart number, and health care number.
     *
     * @param reportingFacilityProvince Reporting facility province
     * @param institutionNumber         Institution number
     * @param chartNumber               Chart number
     * @param healthCareNumber          Health care number
     */
    public EMHRecord(String reportingFacilityProvince, String institutionNumber,
                     String chartNumber, String healthCareNumber) {
        this.reportingFacilityProvince = reportingFacilityProvince;
        this.institutionNumber = institutionNumber;
        this.chartNumber = chartNumber;
        this.healthCareNumber = healthCareNumber;
    }

    // Getter and Setter methods

    /**
     * Getter for functional centre account.
     *
     * @return Functional centre account
     */
    public String getFuncitonalCentreAccount() {
        return funcitonalCentreAccount;
    }

    /**
     * Getter for encounter sequence.
     *
     * @return Encounter sequence
     */
    public int getEncounterSequence() {
        return encounterSequence;
    }

    /**
     * Getter for issuing province.
     *
     * @return Issuing province
     */
    public String getIssuingProvince() {
        return issuingProvince;
    }

    /**
     * Getter for residence code.
     *
     * @return Residence code
     */
    public String getResidenceCode() {
        return residenceCode;
    }

    /**
     * Getter for gender.
     *
     * @return Gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Getter for submission year.
     *
     * @return Submission year
     */
    public int getSubmissionYear() {
        return submissionYear;
    }

    /**
     * Getter for admit via ambulance.
     *
     * @return Admit via ambulance
     */
    public String getAdmitViaAmbulance() {
        return admitViaAmbulance;
    }

    /**
     * Getter for registration date.
     *
     * @return Registration date
     */
    public int getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Getter for registration time.
     *
     * @return Registration time
     */
    public int getRegistrationTime() {
        return registrationTime;
    }

    /**
     * Getter for birth date.
     *
     * @return Birth date
     */
    public BirthDate getBirthdate() {
        return birthdate;
    }

    /**
     * Setter for functional centre account.
     *
     * @param funcitonalCentreAccount Functional centre account to set
     */
    public void setFuncitonalCentreAccount(String funcitonalCentreAccount) {
        this.funcitonalCentreAccount = funcitonalCentreAccount;
    }

    /**
     * Setter for encounter sequence.
     *
     * @param encounterSequence Encounter sequence to set
     */
    public void setEncounterSequence(int encounterSequence) {
        this.encounterSequence = encounterSequence;
    }

    /**
     * Setter for issuing province.
     *
     * @param issuingProvince Issuing province to set
     */
    public void setIssuingProvince(String issuingProvince) {
        this.issuingProvince = issuingProvince;
    }

    /**
     * Setter for residence code.
     *
     * @param residenceCode Residence code to set
     */
    public void setResidenceCode(String residenceCode) {
        this.residenceCode = residenceCode;
    }

    /**
     * Setter for gender.
     * Validates that the provided gender is one of the allowed values (M, F, U, or O).
     * If not valid, prints an error message.
     *
     * @param gender Gender to set
     */
    public void setGender(String gender) {
        String[] gndrs = {"M", "F", "U", "O"};
        boolean valid = false;
        for (String g : gndrs) {
            if (g.equals(gender)) {
                valid = true;
            }
        }
        if (valid) {
            this.gender = gender;
        } else {
            System.out.println("The gender is not valid. The gender can only be M, F, U, or O");
        }
    }

    /**
     * Setter for submission year.
     *
     * @param submissionYear Submission year to set
     */
    public void setSubmissionYear(int submissionYear) {
        this.submissionYear = submissionYear;
    }

    /**
     * Setter for admit via ambulance.
     *
     * @param admitViaAmbulance Admit via ambulance to set
     */
    public void setAdmitViaAmbulance(String admitViaAmbulance) {
        this.admitViaAmbulance = admitViaAmbulance;
    }

    /**
     * Setter for registration date.
     *
     * @param registrationDate Registration date to set
     */
    public void setRegistrationDate(int registrationDate) {
        this.registrationDate = registrationDate;
    }

    /**
     * Setter for registration time.
     *
     * @param registrationTime Registration time to set
     */
    public void setRegistrationTime(int registrationTime) {
        this.registrationTime = registrationTime;
    }

    /**
     * Setter for birth date.
     *
     * @param birthdate Birth date to set
     */
    public void setBirthdate(BirthDate birthdate) {
        this.birthdate = birthdate;
    }

    // toString method

    /**
     * Overrides toString method to provide a string representation of the EMHRecord.
     *
     * @return String representation of EMHRecord
     */
    @Override
    public String toString() {
        return "EMHRecord [reportingFacilityProvince=" + reportingFacilityProvince +
                ", institutionNumber=" + institutionNumber +
                ", functionalCentreAccount=" + funcitonalCentreAccount +
                ", encounterSequence=" + encounterSequence +
                ", healthCareNumber=" + healthCareNumber +
                ", chartNumber=" + chartNumber +
                ", issuingProvince=" + issuingProvince +
                ", residenceCode=" + residenceCode +
                ", gender=" + gender +
                ", submissionYear=" + submissionYear +
                ", admitViaAmbulance=" + admitViaAmbulance +
                ", registrationDate=" + registrationDate +
                ", registrationTime=" + registrationTime +
                ", birthDate=" + birthdate + "]";
    }
}
