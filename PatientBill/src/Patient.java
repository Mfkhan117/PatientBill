public class Patient extends Person{
    // Variables, some are stored in other classes
    private int patientid;
    Date dateofbirth;
    Date admitdate;
    Date dischargedate;
    Doctor attendingphysician;

    // Default Constructor
    Patient(){
        patientid = 0;
    }

    // Constructor
    Patient(String firstname, String lastname, int patientid, Date dateofbirth, Doctor attendingphysician, Date admitdate, Date dischargedate){
        super(firstname,lastname);
        this.patientid = patientid;
        this.dateofbirth = dateofbirth;
        this.attendingphysician = attendingphysician;
        this.admitdate = admitdate;
        this.dischargedate = dischargedate;
    }

    // Accessor
    public void setPatientid(int patientid){
        this.patientid = patientid;
    }

    // Getter
    public int getPatientid(){
        return patientid;
    }

    // Print Patients date of birth
    public String printDateofbirth(){
        return (dateofbirth.printDate());
    }

    // Print Patients name, Doctors name and specialty, Admit and discharge dates.
    public String printName(){
        return "Patient: " + super.printName() + "\n" + "Attending Physician: " + attendingphysician.printName() +
                "\n" + "Admit date: " + admitdate.printDate() + "\n" + "Discharge date: " + dischargedate.printDate();
    }

}
