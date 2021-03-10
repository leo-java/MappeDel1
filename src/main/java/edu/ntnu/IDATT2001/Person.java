package edu.ntnu.IDATT2001;

import java.util.Objects;

/**
 * The type Person.
 */
abstract public class Person {
    private String firstName;
    private String lastName;
    private String personNumber;

    /**
     * Instantiates a new Person.
     *
     * @param firstName    the first name
     * @param lastName     the last name
     * @param personNumber the person number
     */
    public Person(String firstName, String lastName, String personNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.personNumber = personNumber;
    }

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Gets person number.
     *
     * @return the person number
     */
    public String getPersonNumber() {
        return personNumber;
    }

    /**
     * Get full name string.
     *
     * @return the string
     */
    public String getFullName(){
        return getFirstName() + " " + getLastName();
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Sets person number.
     *
     * @param personNumber the person number
     */
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

    /**
     * Although not required by the task I choose to include an equals method in the person class
     * This new equals method guarantees that any persons in the lists with identical information to any other person is treated as identical
     * This is reasonable as two seperate people cannot have identical names and person numbers, therefore all instances of person with identical information must be a copy
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getFirstName().equals(person.getFirstName()) && getLastName().equals(person.getLastName()) && getPersonNumber().equals(person.getPersonNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getPersonNumber());
    }
}

