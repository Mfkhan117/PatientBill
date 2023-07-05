public class Bill {

    // Variables
    private int id;
    private double pharmacycharges;
    private double doctorsfee;
    private double roomcharges;

    // Default Constructor
    Bill(){
        id = 0;
        pharmacycharges = 0.0;
        doctorsfee = 0.0;
        roomcharges = 0.0;
    }

    // Constructor
    Bill(int id, double pharmacycharges, double doctorsfee, double roomcharges){
        this.id = id;
        this.pharmacycharges = pharmacycharges;
        this.doctorsfee = doctorsfee;
        this.roomcharges = roomcharges;
    }

    // Accessors
    public void setId(int id){
        this.id = id;
    }
    public void setPharmacycharges(double pharmacycharges){
        this.pharmacycharges = pharmacycharges;
    }
    public void setDoctorsfee(double doctorsfee){
        this.doctorsfee = doctorsfee;
    }
    public void setRoomcharges(double roomcharges){
        this.roomcharges = roomcharges;
    }
    public int getId(){
        return id;
    }

    // Getters
    public double getPharmacycharges() {
        return pharmacycharges;
    }

    public double getDoctorsfee() {
        return doctorsfee;
    }

    public double getRoomcharges() {
        return roomcharges;
    }

    // Print all charges
    public String printBills(){
        return "Pharmacy Charges: " + getPharmacycharges() + "\n" + "Doctors Fee: " + getDoctorsfee() + "\n"
                + "Room Charges: " + getRoomcharges();
    }
}
