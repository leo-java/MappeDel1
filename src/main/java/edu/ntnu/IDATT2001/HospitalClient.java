package edu.ntnu.IDATT2001;

public class HospitalClient {
    public static void main(String[] args) throws RemoveException {
        Hospital hospital = new Hospital("hospitalMcHospitalFace");
        HospitalTestData.fillRegisterWithTestData(hospital);
        System.out.println(hospital.getDepartments().get(0).employees);
        hospital.getDepartments().get(0).remove(hospital.getDepartments().get(0).getEmployees().get(0));
        System.out.println(hospital.getDepartments().get(0).employees);
        try{
            hospital.getDepartments().get(0).remove(hospital.getDepartments().get(0).getPatients().get(50));
        }catch(RemoveException e){
            System.out.println(e);
        }
    }
}
