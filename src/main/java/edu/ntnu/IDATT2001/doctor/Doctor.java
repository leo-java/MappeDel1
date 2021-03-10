package edu.ntnu.IDATT2001.doctor;

import edu.ntnu.IDATT2001.Employee;
import edu.ntnu.IDATT2001.Patient;

/**
 * The type Doctor.
 */
abstract public class Doctor extends Employee {
    /**
     * Instantiates a new Doctor.
     *
     * @param firstName    the first name
     * @param lastName     the last name
     * @param personNumber the person number
     *                     derives from the Employee class
     */
    protected Doctor(String firstName, String lastName, String personNumber) {
        super(firstName, lastName, personNumber);
    }

    /**
     * Sets diagnosis.
     *
     * @param patient the patient
     * @param string  the string
     */
    abstract void setDiagnosis(Patient patient, String string);
}
