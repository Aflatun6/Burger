package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Theatre {
    private String name;
    private List<Seat> seats = new ArrayList<>();

    public Theatre(String name, int rows, int seatPerRow) {
        this.name = name;
        int lastRow = 'A' + (rows - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getName() {
        return name;
    }

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if (foundSeat >= 0) {
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("there is no seat " + seatNumber);
            return false;
        }
//        for (Seat seat : seats) {
//            System.out.print(".");
//            if (seat.getSeatNumber().equals(seatNumber)) {
//                requestedSeat = seat;
//                break;
//            }
//        }
//        if (requestedSeat == null) {
//            System.out.println("No such seat /" + seatNumber);
//            return false;
//        }
//        return requestedSeat.reserve();
    }

    // for testing
    public void getSeats() {
        for (Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
    }

    private class Seat implements Comparable<Seat> {
        private final String seatNumber;
        public boolean reserved = false;

        public Seat(String seatNubmer) {
            this.seatNumber = seatNubmer;
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public boolean reserve() {
            if (!reserved) {
                reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            }
            return false;
        }

        public boolean cancel() {
            if (reserved) {
                reserved = false;
                System.out.println("Reservation of seat " + seatNumber + " canceled");
                return true;
            }
            return false;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }
    }
}
