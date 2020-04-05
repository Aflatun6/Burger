package collections;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("La b'e Opera", 24, 10);
//        theatre.getSeats();
        if (theatre.reserveSeat("D10")) {
            System.out.println("pay");
        } else {
            System.out.println("seat was occupied");
        }
        if (theatre.reserveSeat("D10")) {
            System.out.println("pay");
        } else {
            System.out.println("seat was occupied");
        }
       
    }
}
