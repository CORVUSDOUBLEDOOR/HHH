package Hade_Healing_Hospital_HHH;

public class DataPatient implements Patient{
    public String birthday;
    public String firstname;
    public String lastname;
    public String bloodType;
    public String town;
    public String gender;
    public String history_drug_REAL;
    public String idcard_REAL;
    public String phonenumber_REAL;

    public DataPatient() {
    }

    public DataPatient(
                       String birthday,
                       String firstname,
                       String lastname,
                       String bloodType,
                       String gender,
                       String town,
                       String history_drug_REAL,
                       String idcard_REAL,
                       String phonenumber_REAL
                       ){
        this.birthday = birthday;
        this.firstname = firstname;
        this.lastname = lastname;
        this.bloodType = bloodType;
        this.town = town;
        this.gender = gender;
        this.history_drug_REAL = history_drug_REAL;
        this.idcard_REAL = idcard_REAL;
        this.phonenumber_REAL = phonenumber_REAL;
    }
    public String toString() {
        return "=====================================================================================\n" +
                "                                Medicine Department  \n" +
                "name : " + getFirstname() + "    "+getLastname()+"\n" +
                "Birth day : " + getBirthday() + "\n" +
                "Blood type : " + getBloodType() + "\n" +
                "Gender : " + getGender() + "\n" +
                "History drug : " + getHistory_drug_REAL() + "\n" +
                "ID Card : " + getIdcard_REAL() + "\n" +
                "Phone number : " + getPhonenumber_REAL() + "\n" +
                "=====================================================================================\n";
    }


    public String getBirthday() {
        return birthday;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getBloodType() {
        return bloodType;
    }

    public String getTown() {
        return town;
    }

    public String getGender() {
        return gender;
    }
    public String getHistory_drug_REAL() {
        return history_drug_REAL;
    }

    public String getIdcard_REAL() {
        return idcard_REAL;
    }

    public String getPhonenumber_REAL() {
        return phonenumber_REAL;
    }
}
