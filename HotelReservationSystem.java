import java.util.*;

class Room {
    int id;
    String type;
    double price;
    boolean isAvailable;

    Room(int id, String type, double price) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.isAvailable = true;
    }
}

public class HotelReservationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room(101, "Standard", 1200.0));
        rooms.add(new Room(201, "Deluxe", 2500.0));
        rooms.add(new Room(301, "Suite", 5000.0));

        System.out.println("--- CodeAlpha Hotel Reservation ---");
        System.out.println("Available Rooms:");
        for (Room r : rooms) {
            System.out.println("Room " + r.id + " (" + r.type + ") - Rs." + r.price);
        }

        System.out.print("\nEnter Room ID to book: ");
        int choice = sc.nextInt();

        for (Room r : rooms) {
            if (r.id == choice && r.isAvailable) {
                r.isAvailable = false;
                System.out.println("Booking Confirmed for Room " + r.id);
                System.out.println("Payment of Rs." + r.price + " received. Thank you!");
                break;
            }
        }
        sc.close();
    }
}