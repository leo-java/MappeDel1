package mappe.del1.hospital.healthpersonell.doctor;

import mappe.del1.hospital.Patient;

/**
 * The type Surgeon.
 */
public class Surgeon extends Doctor {

    /**
     * Instantiates a new Surgeon.
     *
     * @param firstName    the first name
     * @param lastName     the last name
     * @param personNumber the person number
     *                     derives from the Doctor class
     */
    public Surgeon(String firstName, String lastName, String personNumber) {
        super(firstName, lastName, personNumber);
    }

    @Override
    void setDiagnosis(Patient patient, String string) {

    }
}
