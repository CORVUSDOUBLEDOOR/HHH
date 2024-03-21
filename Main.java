package Hade_Healing_Hospital_HHH;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Year;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int personAmount = 0;
    public static String age_REAL = "";
    public static String departmentDoctor_REAL;
    public static String birthday_REAL = "";
    public static String firstname_REAL;
    public static String lastname_REAL;
    public static String blood_TYPE_REAL;
    public static String country_REAL;
    public static String town_REAL;
    public static String gender_REAL;
    public static String nationality_REAL;
    public static String job_REAL;
    public static String nameprefix_REAL;
    public static String religion_REAL;
    public static String status_REAL;
    public static String history_drug_REAL;
    public static String idcard_REAL;
    public static String phonenumber_REAL;
    public static String education_REAL;
    public static boolean success;
    public static void main(String[] args) throws IOException {
        ArrayList<DataPatient> patients = new ArrayList<>();
        Scanner kb = new Scanner(System.in);
        while(true){
            System.out.println("+=================================================================+");
            System.out.println("| press 1 for register                                            |");
            System.out.println("| press 2 for print patient                                       |");
            System.out.println("| press 3 for exit program                                        |");
            System.out.println("+=================================================================+");
            System.out.print("press : ");
            int type = kb.nextInt();
            if(type == 1) {
                JFrame JF = new JFrame();
                JF.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                JF.setBounds(30, 30, 900, 830);
                JF.setTitle("Hade Healing Hospital(HHH) Service ");
                JF.getContentPane().setLayout(null);

                JLabel Title = new JLabel("Register Patient Data");
                Title.setBounds(267, 15, 700, 60);
                Title.setFont(new Font("Register Patient Data", Font.PLAIN, 40)); //ปรับขนาดตัวอักษร
                JF.getContentPane().add(Title);

                String[] prefix = {"", "Mr.", "Mrs.", "Miss", "Ms."};
                JLabel Frontname = new JLabel("Name Prefix :");
                Frontname.setBounds(50, 80, 80, 30);
                JF.getContentPane().add(Frontname);
                JComboBox Prefix = new JComboBox(prefix);
                Prefix.setBounds(140, 80, 70, 25);
                JF.getContentPane().add(Prefix);
                Color white = Color.white;
                Prefix.setBackground(white);

                JLabel firstname = new JLabel("Firstname :");
                firstname.setBounds(230, 80, 100, 30);
                JF.getContentPane().add(firstname);
                JTextField FirstName = new JTextField();
                FirstName.setBounds(310, 80, 200, 25);
                JF.getContentPane().add(FirstName);

                JLabel lastname = new JLabel("Lastname :");
                lastname.setBounds(550, 80, 100, 30);
                JF.getContentPane().add(lastname);
                JTextField Lastname = new JTextField();
                Lastname.setBounds(620, 80, 200, 25);
                JF.getContentPane().add(Lastname);

                ArrayList<Integer> Ages = new ArrayList<Integer>();
                for (int i = 0; i <= 150; i++) {
                    Ages.add(i);
                }
                //Create ComboBoxModel for Create ComboBox
                ComboBoxModel<Integer> ageModel = new DefaultComboBoxModel<Integer>(Ages.toArray(new Integer[0]));
                JLabel age = new JLabel("Age :");
                age.setBounds(50, 140, 70, 30);
                JF.getContentPane().add(age);
                JComboBox Age = new JComboBox(ageModel);
                Age.setBounds(90, 140, 50, 25);
                JF.getContentPane().add(Age);
                Age.setBackground(white);

                JLabel BirthDay = new JLabel("Birth Day :");
                BirthDay.setBounds(170, 140, 70, 30);
                JF.getContentPane().add(BirthDay);
                JLabel DDMMYYYY = new JLabel("DD/MM/YYYY");
                DDMMYYYY.setBounds(270, 120, 100, 10);
                DDMMYYYY.setFont(new Font("DD/MM/YYYY", Font.PLAIN, 10)); //ปรับขนาดตัวอักษร
                DDMMYYYY.setForeground(new Color(255, 0, 0));
                JF.getContentPane().add(DDMMYYYY);
                ArrayList<Integer> Dd = new ArrayList<Integer>();
                for (int i = 1; i <= 31; i++) {
                    Dd.add(i);
                }
                //Create ComboBoxModel for Create ComboBox
                ComboBoxModel<Integer> DdModel = new DefaultComboBoxModel<Integer>(Dd.toArray(new Integer[0]));
                JComboBox DD = new JComboBox(DdModel);
                DD.setBounds(235, 140, 40, 25);
                JF.getContentPane().add(DD);
                DD.setBackground(white);
                ArrayList<Integer> Mm = new ArrayList<Integer>();
                for (int i = 1; i <= 12; i++) {
                    Mm.add(i);
                }
                //Create ComboBoxModel for Create ComboBox
                ComboBoxModel<Integer> MmModel = new DefaultComboBoxModel<Integer>(Mm.toArray(new Integer[0]));
                JComboBox MM = new JComboBox(MmModel);
                MM.setBounds(280, 140, 40, 25);
                JF.getContentPane().add(MM);
                MM.setBackground(white);
                ArrayList<Integer> Yy = new ArrayList<Integer>();
                Year year = Year.now();
                int years = year.getValue();
                for (int i = years; i >= 1874; i--) {
                    Yy.add(i);
                }
                //Create ComboBoxModel for Create ComboBox
                ComboBoxModel<Integer> YyModel = new DefaultComboBoxModel<Integer>(Yy.toArray(new Integer[0]));
                JComboBox YY = new JComboBox(YyModel);
                YY.setBounds(325, 140, 60, 25);
                JF.getContentPane().add(YY);
                YY.setBackground(white);

                JLabel sex = new JLabel("Gender :");
                sex.setBounds(430, 140, 60, 25);
                JF.getContentPane().add(sex);
                JRadioButton male = new JRadioButton("Male");
                male.setBounds(480, 130, 60, 25);
                JF.getContentPane().add(male);
                JRadioButton female = new JRadioButton("Female");
                female.setBounds(480, 160, 80, 25);
                JF.getContentPane().add(female);
                ButtonGroup sexX = new ButtonGroup();
                sexX.add(male);
                sexX.add(female);

                String[] nationality = {"", "Afghan", "Albanian", "Algerian", "American", "Andorran", "Angolan", "Anguillan",
                        "Argentine", "Armenian", "Australian", "Austrian", "Azerbaijani", "Bahamian", "Bahraini", "Bangladeshi", "Barbadian",
                        "Belarusian", "Belgian", "Belizean", "Beninese", "Bermudian", "Bhutanese", "Bolivian",
                        "Botswanan", "Brazilian", "British", "British Virgin Islander", "Bruneian", "Bulgarian", "Burkinan", "Burmese",
                        "Burundian", "Cambodian", "Cameroonian", "Canadian", "Cape Verdean", "Cayman Islander", "Central African", "Chadian", "Chilean",
                        "Chinese", "Colombian", "Comoran", "Congolese (Congo)", "Congolese (DRC)", "Cook Islander", "Costa Rican", "Croatian", "Cuban", "Cymraes", "Cymro", "Cypriot",
                        "Czech", "Danish", "Djiboutian", "Dominican", "Dutch", "East Timorese", "Ecuadorean", "Egyptian", "Emirati", "English", "Equatorial Guinean", "Eritrean", "Estonian",
                        "Ethiopian", "Faroese", "Fijian", "Filipino", "Finnish", "French", "Gabonese", "Gambian", "Georgian", "German", "Ghanaian", "Gibraltarian", "Greek", "Greenlandic",
                        "Grenadian", "Guamanian", "Guatemalan", "Guinean", "Guyanese", "Haitian", "Honduran", "Hong Konger", "Hungarian",
                        "Icelandic", "Indian", "Indonesian", "Iranian", "Iraqi", "Irish", "Israeli,Italian", "Ivorian", "Jamaican", "Japanese", "Jordanian",
                        "Kazakh", "Kenyan", "Kittitian", "Citizen of Kiribati",
                        "Kosovan", "Kuwaiti", "Kyrgyz", "Lao", "Latvian", "Lebanese", "Liberian",
                        "Libyan", "Liechtenstein citizen", "Lithuanian", "Luxembourger", "Macanese", "Macedonian", "Malagasy", "Malawian",
                        "Malaysian", "Maldivian", "Malian", "Maltese", "Marshallese", "Martiniquais", "Mauritanian", "Mauritian", "Mexican", "Micronesian", "Moldovan", "Monegasque",
                        "Mongolian", "Montenegrin", "Montserratian", "Moroccan",
                        "Mosotho", "Mozambican", "Namibian", "Nauruan", "Nepalese", "New Zealander", "Nicaraguan", "Nigerian", "Nigerien", "Niuean", "North Korean", "Northern Irish", "Norwegian",
                        "Omani", "Pakistani", "Palauan", "Palestinian", "Panamanian", "Papua New Guinean", "Paraguayan", "Peruvian", "Pitcairn Islander",
                        "Polish", "Portuguese", "Prydeinig", "Puerto Rican", "Qatari", "Romanian", "Russian", "Rwandan", "Salvadorean", "Sammarinese", "Samoan", "Sao Tomean",
                        "Saudi Arabian", "Scottish", "Senegalese", "Serbian", "Citizen of Seychelles", "Sierra Leonean", "Singaporean", "Slovak",
                        "Slovenian", "Solomon Islander", "Somali", "South African", "South Korean", "South Sudanese", "Spanish", "Sri Lankan",
                        "St Helenian", "St Lucian", "Stateless", "Sudanese",
                        "Surinamese", "Swazi", "Swedish", "Swiss", "Syrian", "Taiwanese", "Tajik", "Tanzanian", "Thai",
                        "Togolese", "Tongan", "Trinidadian", "Tristanian", "Tunisian", "Turkish','Turkmen", "Turks and Caicos Islander",
                        "Tuvaluan", "Ugandan,Ukrainian", "Uruguayan", "Uzbek", "Vatican citizen", "Citizen of Vanuatu", "Venezuelan", "Vietnamese",
                        "Vincentian", "Wallisian", "Welsh", "Yemeni", "Zambian", "Zimbabwean"};
                JLabel nese = new JLabel("Nationality :");
                nese.setBounds(565, 140, 70, 25);
                JF.getContentPane().add(nese);
                JComboBox Nationality = new JComboBox(nationality);
                Nationality.setBounds(650, 140, 170, 25);
                JF.getContentPane().add(Nationality);
                Nationality.setBackground(white);

                String[] countrys = {"", "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda", "Argentina", "Armenia", "Australia", "Austria",
                        "Azerbaijan", "The Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana",
                        "Brazil", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cabo Verde", "Cambodia", "Cameroon", "Canada", "Central African Republic",
                        "Chad", "Chile", "China", "Colombia", "Comoros", "Congo, Democratic Republic of the", "Congo, Republic of the", "Costa Rica", "Côte d’Ivoire",
                        "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor (Timor-Leste)",
                        "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Eswatini", "Ethiopia", "Fiji", "Finland", "France",
                        "Gabon", "The Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana",
                        "Haiti", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan",
                        "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea, North", "Korea, South", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos",
                        "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Madagascar", "Malawi",
                        "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Micronesia, Federated States of",
                        "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Myanmar (Burma)", "Namibia", "Nauru", "Nepal",
                        "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "North Macedonia", "Norway", "Oman", "Pakistan", "Palau",
                        "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Romania", "Russia",
                        "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Sao Tome and Principe",
                        "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa",
                        "Spain", "Sri Lanka", "Sudan", "Sudan, South", "Suriname", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania",
                        "Thailand", "Togo", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates",
                        "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe"};
                JLabel country = new JLabel("Country :");
                country.setBounds(50, 200, 70, 25);
                JF.getContentPane().add(country);
                JComboBox Country = new JComboBox(countrys);
                Country.setBounds(120, 200, 250, 25);
                JF.getContentPane().add(Country);
                Country.setBackground(white);

                String[] Towns = {"", "City", "CountrySide"};
                JLabel town = new JLabel("Town :");
                town.setBounds(400, 200, 50, 25);
                JF.getContentPane().add(town);
                JComboBox Town = new JComboBox(Towns);
                Town.setBounds(450, 200, 100, 25);
                JF.getContentPane().add(Town);
                Town.setBackground(white);

                JLabel jobs = new JLabel("JOB :");
                jobs.setBounds(575, 200, 40, 25);
                JF.getContentPane().add(jobs);
                JTextField JOB = new JTextField();
                JOB.setBounds(620, 200, 200, 25);
                JF.getContentPane().add(JOB);

                String[] religions = {"", "Christ", "Islam", "Buddhism", "Other"};
                JLabel religion = new JLabel("Religion :");
                religion.setBounds(50, 260, 60, 25);
                JF.getContentPane().add(religion);
                JComboBox Religion = new JComboBox(religions);
                Religion.setBounds(120, 260, 90, 25);
                JF.getContentPane().add(Religion);
                Religion.setBackground(white);

                String[] educations = {"", "Vocational certificate", "High school", "bachelor's degree", "Master's Degree", "Ph.D."};
                JLabel education = new JLabel("Education :");
                education.setBounds(240, 260, 70, 25);
                JF.getContentPane().add(education);
                JComboBox Education = new JComboBox(educations);
                Education.setBounds(320, 260, 150, 25);
                JF.getContentPane().add(Education);
                Education.setBackground(white);

                String[] maritalStatus = {"", "Single", "Married", "Divorced", "Separated", "Widowed", "engaged", "civil union"};
                JLabel marital_status = new JLabel("Marital Status :");
                marital_status.setBounds(490, 260, 120, 25);
                JF.getContentPane().add(marital_status);
                JComboBox MaritalStatus = new JComboBox(maritalStatus);
                MaritalStatus.setBounds(590, 260, 85, 25);
                JF.getContentPane().add(MaritalStatus);
                MaritalStatus.setBackground(white);

                String[] bloodGroups = {"", "A", "B", "AB", "O"};
                JLabel bloodGroup = new JLabel("Blood Type :");
                bloodGroup.setBounds(690, 260, 140, 25);
                JF.getContentPane().add(bloodGroup);
                JComboBox BloodType = new JComboBox(bloodGroups);
                BloodType.setBounds(770, 260, 50, 25);
                JF.getContentPane().add(BloodType);
                BloodType.setBackground(white);

                JLabel History_of_drug_allergy = new JLabel("History of drug allergy :");
                History_of_drug_allergy.setBounds(50, 320, 150, 25);
                JF.getContentPane().add(History_of_drug_allergy);
                JTextArea HistoryOfDrugAllergy = new JTextArea();
                JScrollPane drug = new JScrollPane(HistoryOfDrugAllergy);
                drug.setBounds(200, 320, 230, 200);
                JF.getContentPane().add(drug);

                JLabel Accident_history = new JLabel("Department Of Doctor :");
                Accident_history.setBounds(465, 320, 200, 25);
                JF.getContentPane().add(Accident_history);
                JRadioButton Inpatient_Department = new JRadioButton("Inpatient Department");
                Inpatient_Department.setBounds(600, 320, 200, 25);
                JF.getContentPane().add(Inpatient_Department);
                JRadioButton Outpatient_Department = new JRadioButton("Outpatient Department");
                Outpatient_Department.setBounds(600, 340, 200, 25);
                JF.getContentPane().add(Outpatient_Department);
                JRadioButton Emergency_Room = new JRadioButton("Emergency Room");
                Emergency_Room.setBounds(600, 360, 200, 25);
                JF.getContentPane().add(Emergency_Room);
                JRadioButton Psychology_Department = new JRadioButton("Psychology Department");
                Psychology_Department.setBounds(600, 380, 200, 25);
                JF.getContentPane().add(Psychology_Department);
                JRadioButton Intensive_Care_Unit = new JRadioButton("Intensive Care Unit");
                Intensive_Care_Unit.setBounds(600, 400, 200, 25);
                JF.getContentPane().add(Intensive_Care_Unit);
                JRadioButton Radiology_Department = new JRadioButton("Radiology Department");
                Radiology_Department.setBounds(600, 420, 200, 25);
                JF.getContentPane().add(Radiology_Department);
                JRadioButton Surgical_Department = new JRadioButton("Surgical Department");
                Surgical_Department.setBounds(600, 440, 200, 25);
                JF.getContentPane().add(Surgical_Department);
                JRadioButton Medicine_Department = new JRadioButton("Medicine Department");
                Medicine_Department.setBounds(600, 460, 200, 25);
                JF.getContentPane().add(Medicine_Department);
                ButtonGroup DepartmentDoctor = new ButtonGroup();
                DepartmentDoctor.add(Inpatient_Department);
                DepartmentDoctor.add(Intensive_Care_Unit);
                DepartmentDoctor.add(Outpatient_Department);
                DepartmentDoctor.add(Emergency_Room);
                DepartmentDoctor.add(Medicine_Department);
                DepartmentDoctor.add(Psychology_Department);
                DepartmentDoctor.add(Radiology_Department);
                DepartmentDoctor.add(Surgical_Department);

                JLabel peopleID = new JLabel("ID card number :");
                peopleID.setBounds(50, 550, 140, 25);
                JF.getContentPane().add(peopleID);
                JTextField IDCard = new JTextField();
                IDCard.setBounds(170, 550, 260, 25);
                JF.getContentPane().add(IDCard);

                JLabel phonenumber = new JLabel("Phone number :");
                phonenumber.setBounds(50, 600, 140, 25);
                JF.getContentPane().add(phonenumber);
                JTextField PhoneNUmber = new JTextField();
                PhoneNUmber.setBounds(170, 600, 260, 25);
                JF.getContentPane().add(PhoneNUmber);

                JButton summit = new JButton("SUMMIT");
                summit.setBounds(400, 700, 100, 25);
                JF.getContentPane().add(summit);

                summit.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Object age_STR = Age.getSelectedItem();
                        int ageInteger = Integer.parseInt(age_STR.toString());

                        Object YY_STR = YY.getSelectedItem();
                        int yearInteger = Integer.parseInt(YY_STR.toString());

                        Object MM_STR = MM.getSelectedItem();
                        int monthInteger = Integer.parseInt(MM_STR.toString());

                        Object DD_STR = DD.getSelectedItem();
                        int dayInteger = Integer.parseInt(DD_STR.toString());
                        if (Prefix.getSelectedItem().equals("")) {
                            JOptionPane.showMessageDialog(JF, "Patient prefix is null, should input prefix please.");
                        } else if (FirstName.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(JF, "Firstname is null, please input Patient Firstname.");
                        } else if (Lastname.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(JF, "Lastname is null, please input Patient Lastname.");
                        } else if (sexX.getSelection() == null) {
                            JOptionPane.showMessageDialog(JF, "Please selected Patient Gender.");
                        } else if (Nationality.getSelectedItem().equals("")) {
                            JOptionPane.showMessageDialog(JF, "Nationality is null, please select Patient Nationality.");
                        } else if (Country.getSelectedItem().equals("")) {
                            JOptionPane.showMessageDialog(JF, "Patient Country is null, please selected Patient Country.");
                        } else if (Town.getSelectedItem().equals("")) {
                            JOptionPane.showMessageDialog(JF, "Patient Town is null, please selected Patient Town.");
                        } else if (JOB.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(JF, "Patient JOB is null, please selected Patient JOB.");
                        } else if (Religion.getSelectedItem().equals("")) {
                            JOptionPane.showMessageDialog(JF, "Patient religion is null, please selected Patient Religion.");
                        } else if (Education.getSelectedItem().equals("")) {
                            JOptionPane.showMessageDialog(JF, "Patient Education is null, please selected Patient Education.");
                        } else if (MaritalStatus.getSelectedItem().equals("")) {
                            JOptionPane.showMessageDialog(JF, "Patient Marital Status is null, please selected Patient Status.");
                        } else if (BloodType.getSelectedItem().equals("")) {
                            JOptionPane.showMessageDialog(JF, "Please selected Patient Blood Type.");
                        } else if (DepartmentDoctor.getSelection() == null) {
                            JOptionPane.showMessageDialog(JF, "Please selected Patient Department Doctor do your want.");
                        } else if (IDCard.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(JF, "Please input Patient ID Card Number.");
                        } else if (PhoneNUmber.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(JF, "Please input Patient Phone number.");
                        } else {
                            if (ageInteger != years - yearInteger) {
                                JOptionPane.showMessageDialog(JF, "Patient  Age or Year of birth is wrong, please try agains.");
                            } else if (monthInteger == 2 && dayInteger == 30 || dayInteger == 31) {
                                JOptionPane.showMessageDialog(JF, "Patient  month or date is wrong, please try again.");
                            } else if (monthInteger == 3 || monthInteger == 4 || monthInteger == 6 || monthInteger == 9 || monthInteger == 11 && dayInteger == 31) {
                                JOptionPane.showMessageDialog(JF, "Patient month or date is wrong, please try again.");
                            } else {
                                JOptionPane.showMessageDialog(JF, "Register was Successfully");
                                success = true;
                                firstname_REAL = FirstName.getText().toString();
                                lastname_REAL = Lastname.getText().toString();
                                gender_REAL = male.isSelected() ? "Male " : "Female";
                                age_REAL = age_REAL + ageInteger;
                                birthday_REAL = birthday_REAL + dayInteger + "/" + monthInteger + "/" + yearInteger;
                                blood_TYPE_REAL = BloodType.getSelectedItem().toString();
                                if (Inpatient_Department.isSelected()) {
                                    departmentDoctor_REAL = "Inpatient Department";
                                } else if (Outpatient_Department.isSelected()) {
                                    departmentDoctor_REAL = "Outpatient Department";
                                } else if (Emergency_Room.isSelected()) {
                                    departmentDoctor_REAL = "Emergency Room";
                                } else if (Psychology_Department.isSelected()) {
                                    departmentDoctor_REAL = "Psychology Department";
                                } else if (Intensive_Care_Unit.isSelected()) {
                                    departmentDoctor_REAL = "Intensive Care Unit";
                                } else if (Radiology_Department.isSelected()) {
                                    departmentDoctor_REAL = "Radiology Department";
                                } else if (Surgical_Department.isSelected()) {
                                    departmentDoctor_REAL = "Surgical Department";
                                } else if (Medicine_Department.isSelected()) {
                                    departmentDoctor_REAL = "Medicine Department";
                                }
                                town_REAL = Town.getSelectedItem().toString();
                                country_REAL = Country.getSelectedItem().toString();
                                religion_REAL = Religion.getSelectedItem().toString();
                                status_REAL = MaritalStatus.getSelectedItem().toString();
                                education_REAL = Education.getSelectedItem().toString();
                                idcard_REAL = IDCard.getText().toString();
                                phonenumber_REAL = PhoneNUmber.getText().toString();
                                history_drug_REAL = HistoryOfDrugAllergy.getText().toString();
                                nameprefix_REAL = Prefix.getSelectedItem().toString();
                                nationality_REAL = Nationality.getSelectedItem().toString();
                                job_REAL = JOB.getText().toString();
                                if (departmentDoctor_REAL.equals("Inpatient Department")) {
                                    patients.add(new Inpatient_Department(birthday_REAL, firstname_REAL, lastname_REAL, blood_TYPE_REAL, gender_REAL, town_REAL, history_drug_REAL, idcard_REAL, phonenumber_REAL));
                                }
                                if (departmentDoctor_REAL.equals("Outpatient Department")) {
                                    patients.add(new Outpatient_Department(birthday_REAL, firstname_REAL, lastname_REAL, blood_TYPE_REAL, gender_REAL, town_REAL, history_drug_REAL, idcard_REAL, phonenumber_REAL));
                                }
                                if (departmentDoctor_REAL.equals("Emergency Room")) {
                                    patients.add(new Emergency_Room(birthday_REAL, firstname_REAL, lastname_REAL, blood_TYPE_REAL, gender_REAL, town_REAL, history_drug_REAL, idcard_REAL, phonenumber_REAL));
                                }
                                if (departmentDoctor_REAL.equals("Psychology Department")) {
                                    patients.add(new Psychology_Department(birthday_REAL, firstname_REAL, lastname_REAL, blood_TYPE_REAL, gender_REAL, town_REAL, history_drug_REAL, idcard_REAL, phonenumber_REAL));
                                }
                                if (departmentDoctor_REAL.equals("Intensive Care Unit")) {
                                    patients.add(new Intensive_Care_Unit(birthday_REAL, firstname_REAL, lastname_REAL, blood_TYPE_REAL, gender_REAL, town_REAL, history_drug_REAL, idcard_REAL, phonenumber_REAL));
                                }
                                if (departmentDoctor_REAL.equals("Radiology Department")) {
                                    patients.add(new Radiology_Department(birthday_REAL, firstname_REAL, lastname_REAL, blood_TYPE_REAL, gender_REAL, town_REAL, history_drug_REAL, idcard_REAL, phonenumber_REAL));
                                }
                                if (departmentDoctor_REAL.equals("Surgical Department")) {
                                    patients.add(new Surgical_Department(birthday_REAL, firstname_REAL, lastname_REAL, blood_TYPE_REAL, gender_REAL, town_REAL, history_drug_REAL, idcard_REAL, phonenumber_REAL));
                                }
                                if (departmentDoctor_REAL.equals("Medicine Department")) {
                                    patients.add(new Medicine_Department(birthday_REAL, firstname_REAL, lastname_REAL, blood_TYPE_REAL, gender_REAL, town_REAL, history_drug_REAL, idcard_REAL, phonenumber_REAL));
                                }
                                try {
                                    // สร้างไฟล์ .txt
                                    File file = new File("patient_data.txt");

                                    // ถ้าไฟล์ไม่มีให้สร้างใหม่
                                    if (!file.exists()) {
                                        file.createNewFile();
                                    }

                                    // เตรียมเขียนลงในไฟล์ .txt
                                    FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
                                    BufferedWriter bw = new BufferedWriter(fw);
                                    // เขียนข้อมูลลงในไฟล์ .txt
                                    bw.write("Prefix: " + nameprefix_REAL + "\n");
                                    bw.write("First Name: " + firstname_REAL + "\n");
                                    bw.write("Last Name: " + lastname_REAL + "\n");
                                    bw.write("Gender: " + gender_REAL + "\n");
                                    bw.write("Age: " + age_REAL + "\n");
                                    bw.write("Birthday: " + birthday_REAL + "\n");
                                    bw.write("Blood Type: " + blood_TYPE_REAL + "\n");
                                    bw.write("Nationality: " + nationality_REAL + "\n");
                                    bw.write("Country: " + country_REAL + "\n");
                                    bw.write("Town: " + town_REAL + "\n");
                                    bw.write("Job: " + job_REAL + "\n");
                                    bw.write("Religion: " + religion_REAL + "\n");
                                    bw.write("Marital Status: " + status_REAL + "\n");
                                    bw.write("Education: " + education_REAL + "\n");
                                    bw.write("ID Card Number: " + idcard_REAL + "\n");
                                    bw.write("Phone Number: " + phonenumber_REAL + "\n");
                                    bw.write("History of Drug Allergy: " + history_drug_REAL + "\n");
                                    bw.write("Department of Doctor: " + departmentDoctor_REAL + "\n\n");
                                    // ปิดการเขียนไฟล์ .txt
                                    bw.close();
                                } catch (IOException e1) {
                                    e1.printStackTrace();
                                }
                                JF.setVisible(false);
                            }
                        }
                    }
                });
                JF.setVisible(true);
            }
            if(type == 2){
                if(patients == null || patients.size() == 0){
                    System.out.println("Data is null, please try again.");
                }
                for(DataPatient P : patients){
                    System.out.println(P);
                }
            }
            if(type == 3){
                System.exit(0);
            }
            if(type != 1 && type != 2 && type != 3){
                System.out.println("Please try again.");
            }
        }
    }
}
