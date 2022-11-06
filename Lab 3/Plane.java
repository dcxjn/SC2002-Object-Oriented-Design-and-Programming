public class Plane {

    PlaneSeat[] seat = new PlaneSeat[12];

    private int numEmptySeat = 0;

    public Plane() {
        for (int i = 0; i < 12; i++) {
            seat[i] = new PlaneSeat(i + 1);
            numEmptySeat++;
        }
    }

    private PlaneSeat[] sortSeats() {
        PlaneSeat[] seatCopy = new PlaneSeat[12];
        for (int i = 0; i < 12; i++) {
            seatCopy[i] = seat[i];
        }
        for (int i = 1; i < 12; i++) {
            for (int j = i; j > 0; j--) {
                if (seatCopy[j].getCustomerID() < seatCopy[j - 1].getCustomerID()) {
                    PlaneSeat temp = seatCopy[j];
                    seatCopy[j] = seatCopy[j - 1];
                    seatCopy[j - 1] = temp;
                } else
                    break;
            }
        }
        return seatCopy;
    }

    public void showNumEmptySeats() {
        System.out.printf("There are %d empty seats.", this.numEmptySeat);
    }

    public void showEmptySeats() {
        for (int i = 0; i < 12; i++) {
            if (seat[i].isOccupied() == false) {
                System.out.printf("Seat ID %d\n", seat[i].getSeatID());
            }
        }
    }

    public void showAssignedSeats(boolean bySeatId) {
        if (bySeatId == true) {
            for (int i = 0; i < 12; i++) {
                if (this.seat[i].isOccupied() == true)
                    System.out.printf("SeatID %d is assigned to CustomerID %d.\n", seat[i].getSeatID(),
                            seat[i].getCustomerID());
            }
        } else if (bySeatId == false) {
            PlaneSeat[] seatSorted = sortSeats();
            for (int i = 0; i < 12; i++) {
                if (seatSorted[i].isOccupied() == true)
                    System.out.printf("SeatID %d is assigned to CustomerID %d.\n", seatSorted[i].getSeatID(),
                            seatSorted[i].getCustomerID());
            }
        }
    }

    public void assignSeat(int seatId, int cust_id) {
        seat[seatId - 1].assign(cust_id);
        this.numEmptySeat--;

    }

    public void unAssignSeat(int seatId) {
        seat[seatId - 1].unAssign();
        this.numEmptySeat++;
    }
}
