package edu.ntnu.IDATT2001.personer;

abstract public class Doctor extends Employee{
    protected Doctor(String firstName, String lastName, String personNumber) {
        super(firstName, lastName, personNumber);
    }
    abstract void setDiagnosis(Patient patient,String string);
}
