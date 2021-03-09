package edu.ntnu.IDATT2001;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class RemoveTest {
    Department department = new Department("department");
    Employee employee = new Employee("1","2","3");
    Patient patient = new Patient("1","2","3");
    @Test
    public void testEmployeeIsRemovedFromEmployeeTable() throws RemoveException {

        department.addEmployee(employee);
        department.remove(employee);
        assertTrue(department.employees.isEmpty());
    }

    @Test
    public void testPatientIsRemovedFromPatientTable() throws RemoveException {
        department.addPatient(patient);
        department.remove(patient);
        assertTrue(department.patients.isEmpty());
    }

    @Test
    public void testEmployeeIsNotInTheEmployeeTable() throws RemoveException {
        Assertions.assertThrows(RemoveException.class,() -> {
            department.remove(employee);
        });
    }
    @Test
    public void testPatientIsNotInThePatientTable() throws RemoveException {
        Assertions.assertThrows(RemoveException.class,() -> {
            department.remove(patient);
        });
    }
}
