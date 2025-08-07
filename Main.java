class Parcel {
    String trackingNumber;
    String destination;
    double weight;

    void displayParcelInfo() {
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("Destination: " + destination);
        System.out.println("Weight (kg): " + weight);
    }
}

public class Main {
    public static void main(String[] args) {
        Parcel parcel1 = new Parcel();
        parcel1.trackingNumber = "TN123456";
        parcel1.destination = "Chennai";
        parcel1.weight = 2.5;

        Parcel parcel2 = new Parcel();
        parcel2.trackingNumber = "TN789101";
        parcel2.destination = "Bangalore";
        parcel2.weight = 1.2;

        System.out.println("Parcel 1 Info:");
        parcel1.displayParcelInfo();

        System.out.println("\nParcel 2 Info:");
        parcel2.displayParcelInfo();
    }
}