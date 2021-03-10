package edu.ntnu.IDATT2001;

/**
 * The type Employee.
 */
public class Employee extends Person {

    /**
     * Instantiates a new Employee.
     *
     * @param firstName    the first name
     * @param lastName     the last name
     * @param personNumber the person number
     *                     derives from the Person class
     */
    public Employee(String firstName, String lastName, String personNumber) {
        super(firstName, lastName, personNumber);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
