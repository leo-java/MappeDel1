package edu.ntnu.IDATT2001.personer;

public class Patient extends Person{

    private String diagnosis;

    protected Patient(String firstName, String lastName, String personNumber) {
        super(firstName, lastName, personNumber);
    }

    protected String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "diagnosis='" + diagnosis + '\'' +
                '}';
    }
}
