package edu.ntnu.IDATT2001;
import edu.ntnu.IDATT2001.personer.Employee;
import edu.ntnu.IDATT2001.personer.Patient;
import edu.ntnu.IDATT2001.personer.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Department {

    private String departmentName;
    ArrayList<Employee> employees;
    ArrayList<Patient> patients;

    //HashMap<String,ArrayList<Person>> subclasses = new HashMap<String,ArrayList<Person>>();
    //For some reason hashmaps won't work, I would have used hashmaps to make my code more dynamic
    //I could put every direct subclass in a hashmap which would allow me to recycle code the remove code for every subclass

    public Department(String departmentName){
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void addPatients(Patient patient){
        patients.add(patient);
    }

    //This part of the code could be recycled if hashmaps worked with ArrayList<Person> which it doesn't for whatever reason
    public void remove(Person person) throws RemoveException{
        if(employees.contains(person)){
            employees.remove(person);
        }else{
            throw new RemoveException(person.getFirstName() + " " + person.getLastName());
        }
        if(patients.contains(person)){
            patients.remove(person);
        }else{
            throw new RemoveException(person.getFirstName() + " " + person.getLastName());
        }
    }

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
