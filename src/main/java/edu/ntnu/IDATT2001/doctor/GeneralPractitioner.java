package edu.ntnu.IDATT2001.doctor;

import edu.ntnu.IDATT2001.Patient;

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
