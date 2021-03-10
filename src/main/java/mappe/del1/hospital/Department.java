package mappe.del1.hospital;

import mappe.del1.hospital.exception.RemoveException;

import java.util.ArrayList;
import java.util.Objects;

/**
 * The type Department.
 */
public class Department {

    private String departmentName;
    /**
     * The Employees.
     */
    ArrayList<Employee> employees = new ArrayList<Employee>();
    /**
     * The Patients.
     */
    ArrayList<Patient> patients = new ArrayList<Patient>();

    //HashMap<String,ArrayList<Person>> subclasses = new HashMap<String,ArrayList<Person>>();
    //For some reason hashmaps won't work, I would have used hashmaps to make my code more dynamic
    //I could put every direct subclass in a hashmap which would allow me to recycle code the remove code for every subclass

    /**
     * Instantiates a new Department.
     *
     * @param departmentName the department name
     */
    public Department(String departmentName){
        this.departmentName = departmentName;
    }

    /**
     * Gets department name.
     *
     * @return the department name
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * Gets employees.
     *
     * @return the employees
     */
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    /**
     * Gets patients.
     *
     * @return the patients
     */
    public ArrayList<Patient> getPatients() {
        return patients;
    }

    /**
     * Sets department name.
     *
     * @param departmentName the department name
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    /**
     * Add employee.
     *
     * @param employee the employee
     */
    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    /**
     * Add patient.
     *
     * @param patient the patient
     */
    public void addPatient(Patient patient){
        patients.add(patient);
    }

    /**
     * Remove.
     *
     * @param person the person
     * @throws RemoveException the remove exception
     */
//This part of the code could be recycled if hashmaps worked with ArrayList<Person> which it doesn't for whatever reason
    public void remove(Person person) throws RemoveException{
        if(employees.contains(person)){
            employees.remove(person);
        }else if(patients.contains(person)){
            patients.remove(person);
        }else{
            throw new RemoveException(person.getFullName());
        }
    }

    /**
     * This equals method guarantees that any two instances of departments with identical information is treated as copies
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return departmentName.equals(that.departmentName) && employees.equals(that.employees) && patients.equals(that.patients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentName, employees, patients);
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", employees=" + employees +
                ", patients=" + patients +
                '}';
    }
}
