package edu.ntnu.IDATT2001.doctor;

import edu.ntnu.IDATT2001.Employee;
import edu.ntnu.IDATT2001.Patient;

abstract public class Doctor extends Employee {
    protected Doctor(String firstName, String lastName, String personNumber) {
        super(firstName, lastName, personNumber);
    }
    abstract void setDiagnosis(Patient patient, String string);
}
