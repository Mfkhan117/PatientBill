import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class PatientBill {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);

    // Declare Variables
    int patientid;
    String patientfirst;
    String patientlast;
    String doctorfirst;
    String doctorlast;
    String doctorspecialty;

        // Get user input on Patient ID, first, and last name
        System.out.print("Enter Patients ID: ");
        patientid = input.nextInt();
        System.out.println();
        input.nextLine();
        System.out.print("Enter Patients Firstname: ");
        patientfirst = input.nextLine();
        System.out.print("Enter Patients Lastname: ");
        patientlast = input.nextLine();
        System.out.println();

        // Get user input on Doctors first, last name, and specialty
        System.out.print("Enter Doctors Firstname: ");
        doctorfirst = input.nextLine();
        System.out.print("Enter Doctors Lastname: ");
        doctorlast = input.nextLine();
        System.out.print("Enter Doctors Specialty: ");
        doctorspecialty = input.nextLine();
        System.out.println();

        // Initiallize Patient name from user input
        Person person = new Person(patientfirst,patientlast);

        // Initiallize Doctor name and specialty from user input
        Doctor doctor = new Doctor(doctorfirst,doctorlast,doctorspecialty);

        // Initiallize date of birth, admit, and discharge dates
        Date dateofbirth = new Date (11,9,1993);
        Date admit = new Date(4,15,2009);
        Date discharge = new Date(4,21,2009);

        // Use the Patient object to call objects from Patient name, Doctor name, and dates
        Patient patient = new Patient(patientfirst,patientlast,patientid,dateofbirth,doctor,admit,discharge);

        // Initiallize room charges
        Bill bills = new Bill(patientid,245.50,2500.00,3500.38);

        // Add up all the charges to get total
        double total = bills.getPharmacycharges() + bills.getDoctorsfee() + bills.getRoomcharges();

        // Print Patient first and lastname, Doctor first, last name, specialty, dates of admit and discharge
        System.out.println(patient.printName());
        System.out.println();

        // Print Patients bills
        System.out.println(bills.printBills());
        System.out.println("________________________________________");

        // Print Bill Total
        System.out.println("Total: " + total);

        System.out.println();


        // Print all Patient info onto a textbox
        FileWriter fileWriter = new FileWriter(person.printName() + " .txt");
        fileWriter.write(patient.printName() + "\n");
        fileWriter.write("\n");
        fileWriter.write(bills.printBills() + "\n");
        fileWriter.write("___________________________" + "\n");
        fileWriter.write("Total " + total + "\n");
        fileWriter.close();
    }
}
