package edu.ntnu.IDATT2001;

abstract public class Person {
    private String firstName;
    private String lastName;
    private String personNumber;

    public Person(String firstName, String lastName, String personNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.personNumber = personNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPersonNumber() {
        return personNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPersonNumber(String personNumber) {
        this.personNumber = personNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", personNummer='" + personNumber + '\'' +
                '}';
    }
}

