import java.util.Scanner;

public class PlaneApp {

    public static void main(String[] args) {

        Plane newplane = new Plane();

        int choice;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("(1) Show number of empty seats");
            System.out.println("(2) Show the list of empty seats");
            System.out.println("(3) Show the list of seat assignments by seat ID");
            System.out.println("(4) Show the list of seat assignments by customer ID");
            System.out.println("(5) Assign a customer to a seat");
            System.out.println("(6) Remove a seat assignment");
            System.out.println("(7) Exit");
            System.out.printf("\n");

            System.out.printf("Enter the number of your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    newplane.showNumEmptySeats();
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("The following seats are empty:");
                    newplane.showEmptySeats();
                    System.out.printf("\n");
                    break;
                case 3:
                    System.out.println("The seat assignments are as follows:");
                    newplane.showAssignedSeats(true);
                    System.out.printf("\n");
                    break;
                case 4:
                    System.out.println("The seat assignments are as follows:");
                    newplane.showAssignedSeats(false);
                    System.out.printf("\n");
                    break;
                case 5:
                    System.out.println("Assigning Seat ..");
                    int seat, cust;
                    System.out.printf("Please enter SeatID: ");
                    Scanner seat_obj = new Scanner(System.in);
                    seat = seat_obj.nextInt();
                    System.out.printf("Please enter CustomerID: ");
                    Scanner cust_obj = new Scanner(System.in);
                    cust = cust_obj.nextInt();
                    if (newplane.seat[seat - 1].isOccupied() == true) {
                        System.out.println("Seat is already assigned to a customer.\n");
                    } else {
                        newplane.assignSeat(seat, cust);
                        System.out.println("Seat Assigned!\n");
                    }
                    break;
                case 6:
                    int seat2;
                    System.out.printf("Enter SeatID to unassign customer from: ");
                    Scanner seat2_obj = new Scanner(System.in);
                    seat2 = seat2_obj.nextInt();
                    newplane.unAssignSeat(seat2);
                    System.out.println("Seat Unassigned!\n");
                case 7:
                    break;
            }
        } while (choice < 7);
    }
}
