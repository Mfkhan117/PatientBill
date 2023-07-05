public class Doctor extends Person{
    // Doctor specialty
    private String specialty;

    // Default Constructor
    Doctor(){
        specialty = "";
    }

    // Constructor with super to call Doctors name from Person class
    Doctor(String firstname, String lastname, String specialty){
        super(firstname,lastname);
        this.specialty = specialty;
    }

    // Accessor and getter for Doctors Specialty
    public void setSpecialty(String specialty){
        this.specialty = specialty;
    }
    public String getSpecialty(){
        return specialty;
    }

    // Print Doctors first and last name with specialty
    public String printName(){
        return (super.printName() + " " + specialty);
    }
}
