package edu.ntnu.IDATT2001;
import java.util.ArrayList;
public class Hospital {

    private final String hospitalName;
    ArrayList<Department> departments;

    public Hospital(String hospitalName){
        this.hospitalName = hospitalName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public ArrayList<Department> getDepartments(){
        return departments;
    }

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
