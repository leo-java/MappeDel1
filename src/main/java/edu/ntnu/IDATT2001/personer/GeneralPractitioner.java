package edu.ntnu.IDATT2001.personer;

public class GeneralPractitioner extends Doctor{
    public GeneralPractitioner(String firstName, String lastName, String personNumber) {
        super(firstName, lastName, personNumber);
    }

    @Override
    void setDiagnosis(Patient patient, String string) {

    }
}
