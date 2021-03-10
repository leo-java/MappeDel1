package mappe.del1.hospital.healthpersonell.doctor;

import mappe.del1.hospital.Employee;
import mappe.del1.hospital.Patient;

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
