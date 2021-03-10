package edu.ntnu.IDATT2001;

/**
 * The type Patient.
 */
public class Patient extends Person {

    private String diagnosis = "";

    /**
     * Instantiates a new Patient.
     *
     * @param firstName    the first name
     * @param lastName     the last name
     * @param personNumber the person number
     *                     derives from the Person class
     */
    protected Patient(String firstName, String lastName, String personNumber) {
        super(firstName, lastName, personNumber);
    }

    /**
     * Gets diagnosis.
     *
     * @return the diagnosis
     */
    protected String getDiagnosis() {
        return diagnosis;
    }

    /**
     * Sets diagnosis.
     *
     * @param diagnosis the diagnosis
     */
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return  "Person{ Patient: " +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", personNummer='" + getPersonNumber() + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }
}
