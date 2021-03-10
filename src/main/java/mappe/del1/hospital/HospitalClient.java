package mappe.del1.hospital;

public class HospitalClient {
    public static void main(String[] args) throws RemoveException {
        Hospital hospital = new Hospital("hospitalMcHospitalFace");
        HospitalTestData.fillRegisterWithTestData(hospital);
        System.out.println(hospital.getDepartments().get(0).employees);
        hospital.getDepartments().get(0).remove(hospital.getDepartments().get(0).getEmployees().get(0));
        System.out.println(hospital.getDepartments().get(0).employees);
        Patient patient = new Patient("Long","Name","3");
        Patient patient2 = new Patient("Long","Name","3");
        try{
            hospital.getDepartments().get(0).remove(patient2);
        }catch(RemoveException e){
            System.out.println(e);
        }
        System.out.println(hospital.getDepartments().get(0).patients.toString());
        hospital.getDepartments().get(0).addPatient(patient);
        System.out.println(hospital.getDepartments().get(0).patients.toString());
        try{
            hospital.getDepartments().get(0).remove(patient2);
        }catch(RemoveException e){
            System.out.println(e);
        }
        System.out.println(hospital.getDepartments().get(0).patients.toString());
    }
}
