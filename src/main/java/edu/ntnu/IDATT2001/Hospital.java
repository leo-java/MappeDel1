package edu.ntnu.IDATT2001;
import java.util.ArrayList;

/**
 * The type Hospital.
 */
public class Hospital {

    private final String hospitalName;
    /**
     * The Departments.
     */
    ArrayList<Department> departments = new ArrayList<Department>();

    /**
     * Instantiates a new Hospital.
     *
     * @param hospitalName the hospital name
     */
    public Hospital(String hospitalName){
        this.hospitalName = hospitalName;
    }

    /**
     * Gets hospital name.
     *
     * @return the hospital name
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * Get departments array list.
     *
     * @return the array list
     */
    public ArrayList<Department> getDepartments(){
        return departments;
    }

    /**
     * Add department.
     *
     * @param department the department
     */
    public void addDepartment(Department department){
        departments.add(department);
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalName='" + hospitalName + '\'' +
                '}';
    }
}
