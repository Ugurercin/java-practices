public class CollectionsMain {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Istanbul", 8, 12);
        theatre.getSeats();
        if(theatre.reserveSeat("H11")) {
            System.out.println("Please Pay");
        } else {
            System.out.println("Seat is taken");
        }
        if(theatre.reserveSeat("H11")) {
            System.out.println("Please Pay");
        } else {
            System.out.println("Seat is taken");
        }
    }
}
