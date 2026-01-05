public class Locations {
    public int id;
    public String address;

    public int smallTotal, mediumTotal, largeTotal;
    public int smallAvailable, mediumAvailable, largeAvailable;

    public Locations(int id, String address, int small, int medium, int large) {
        this.id = id;
        this.address = address;

        this.smallTotal = small;
        this.mediumTotal = medium;
        this.largeTotal = large;

        this.smallAvailable = small;
        this.mediumAvailable = medium;
        this.largeAvailable = large;
    }
}
