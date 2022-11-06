public class SalePerson implements Comparable<SalePerson> {

    private String firstName;
    private String lastName;
    private int totalSales;

    public SalePerson(String firstName, String lastName, int totalSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }

    public String toString() {
        String result;
        result = lastName + " , " + firstName + " : " + Integer.toString(totalSales);
        return result;
    }

    public boolean equals(SalePerson o) {
        if ((o.getFirstName() + o.getLastName()) == (this.firstName + this.lastName)) {
            return true;
        } else
            return false;
    }

    public int compareTo(SalePerson o) {
        if (this.totalSales < o.getTotalSales()) {
            return -1;
        } else if (this.totalSales > o.getTotalSales()) {
            return 1;
        } else if (this.totalSales == o.getTotalSales()) {
            if (this.lastName.compareTo(o.getLastName()) > 0) {
                return -1;
            } else
                return 1;
        } else
            return 0;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getTotalSales() {
        return totalSales;
    }
}
