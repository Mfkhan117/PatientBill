public class Person {
    // Person first and last names
    private String firstname;
    private String lastname;

    // Default Constructor
    Person() {
        firstname = "";
        lastname = "";
    }

    // Constructor
    Person(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }

    // Accessors
    public void setFirstName(String firstname){
        this.firstname = firstname;
    }
    public void setLastName(String lastname){
        this.lastname = lastname;
    }

    // Getters
    public String getFirstName(){
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }

    // Print Person name
    public String printName(){
       return (firstname + " " + lastname);
    }
}
