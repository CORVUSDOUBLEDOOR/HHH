package Hade_Healing_Hospital_HHH;

public class Radiology_Department extends DataPatient{
    public int patient = 0;
    public level Leveling;
    public Radiology_Department(String birthday, String firstname, String lastname, String bloodType,String gender,String town,String history_drug_REAL, String idcard_REAL, String phonenumber_REAL) {
        super(birthday, firstname, lastname, bloodType, gender, town, history_drug_REAL, idcard_REAL, phonenumber_REAL);
        countPatient();
        Leveling = new level(); // สร้างอ็อบเจ็กต์ Leveling
        Leveling.setLevel(town);
    }
    public int countPatient() {
        patient++;
        return patient;
    }

    public int getPatient() {
        return patient;
    }
    public String toString() {
        return "=====================================================================================\n" +
                "                   " + Leveling.getLevel() + "       Radiology Department " + getPatient() + "\n" +
                "name : " + getFirstname() + "    " + getLastname() + "\n" +
                "Birth day : " + getBirthday() + "\n" +
                "Blood type : " + getBloodType() + "\n" +
                "Gender : " + getGender() + "\n" +
                "History drug : " + getHistory_drug_REAL() + "\n" +
                "ID Card : " + getIdcard_REAL() + "\n" +
                "Phone number : " + getPhonenumber_REAL() + "\n" +
                "=====================================================================================\n";
    }
}
