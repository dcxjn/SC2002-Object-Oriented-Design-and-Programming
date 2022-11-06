public class PlaneSeat {

    private int seatId;
    private boolean assigned = false;
    private int customerId = 0;

    public PlaneSeat(int seat_id) {
        this.seatId = seat_id;
    }

    public int getSeatID() {
        return this.seatId;
    }

    public int getCustomerID() {
        return this.customerId;
    }

    public boolean isOccupied() {
        return this.assigned;
    }

    public void assign(int cust_id) {
        this.assigned = true;
        this.customerId = cust_id;
    }

    public void unAssign() {
        this.assigned = false;
        this.customerId = 0;
    }
}