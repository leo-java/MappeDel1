package mappe.del1.hospital.doctor;

import mappe.del1.hospital.Patient;

/**
 * The type General practitioner.
 */
public class GeneralPractitioner extends Doctor {
    /**
     * Instantiates a new General practitioner.
     *
     * @param firstName    the first name
     * @param lastName     the last name
     * @param personNumber the person number
     *                     derives from the Doctor class
     */
    public GeneralPractitioner(String firstName, String lastName, String personNumber) {
        super(firstName, lastName, personNumber);
    }

    @Override
    void setDiagnosis(Patient patient, String string) {

    }
}
