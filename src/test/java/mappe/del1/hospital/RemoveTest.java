package mappe.del1.hospital;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * The type Remove test.
 */
public class RemoveTest {
    /**
     * The Department.
     */
    Department department = new Department("department");
    /**
     * The Employee.
     */
    Employee employee = new Employee("1","2","3");
    /**
     * The Patient.
     */
    Patient patient = new Patient("1","2","3");

    /**
     * Test employee is removed from employee table.
     *
     * @throws RemoveException the remove exception
     */
    @Test
    public void testEmployeeIsRemovedFromEmployeeTable() throws RemoveException {

        department.addEmployee(employee);
        department.remove(employee);
        assertTrue(department.employees.isEmpty());
    }

    /**
     * Test patient is removed from patient table.
     *
     * @throws RemoveException the remove exception
     */
    @Test
    public void testPatientIsRemovedFromPatientTable() throws RemoveException {
        department.addPatient(patient);
        department.remove(patient);
        assertTrue(department.patients.isEmpty());
    }

    /**
     * Test employee is not in the employee table.
     *
     * @throws RemoveException the remove exception
     */
    @Test
    public void testEmployeeIsNotInTheEmployeeTable() throws RemoveException {
        Assertions.assertThrows(RemoveException.class,() -> {
            department.remove(employee);
        });
    }

    /**
     * Test patient is not in the patient table.
     *
     * @throws RemoveException the remove exception
     */
    @Test
    public void testPatientIsNotInThePatientTable() throws RemoveException {
        Assertions.assertThrows(RemoveException.class,() -> {
            department.remove(patient);
        });
    }
}
