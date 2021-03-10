package edu.ntnu.IDATT2001;

import edu.ntnu.IDATT2001.Employee;

/**
 * The type Nurse.
 */
public class Nurse extends Employee {
    /**
     * Instantiates a new Nurse.
     *
     * @param firstName    the first name
     * @param lastName     the last name
     * @param personNumber the person number
     *                     derives from the Doctor class
     */
    public Nurse(String firstName, String lastName, String personNumber) {
        super(firstName, lastName, personNumber);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
