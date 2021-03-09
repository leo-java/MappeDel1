package edu.ntnu.IDATT2001;
import edu.ntnu.IDATT2001.personer.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class RemoveTest {
    @Test
    public void testEmployeeIsRemovedFromEmployeeTable() throws RemoveException {
        Department dep = new Department("dep");
        Employee emp = new Employee("emp","loyee","1");
        dep.addEmployee(emp);
        dep.remove(emp);
        boolean removed = dep.employees.isEmpty();
        assertTrue(removed);
    }
}
