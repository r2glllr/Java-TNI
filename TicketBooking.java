import javax.swing.JOptionPane;

public class TicketBooking {
    public static void main(String[] args) {

        Movie movie = new Movie("Titanic", 120, "PG-13");

        // เลือกเวลา
        String showTime = TicketInfo.select_showtime(movie);
        if (showTime.equalsIgnoreCase("Error time")) {
            return;
        }

        // เลือกที่นั่ง
        String seat = TicketInfo.select_seat_number();
        if (seat.equalsIgnoreCase("invalid")) {
            return;
        }

        // สร้างตั๋ว
        Ticket ticket = new Ticket("T001", movie, showTime, seat, 240);

        // ยืนยันการจอง
        int confirm = JOptionPane.showConfirmDialog(
                null,
                "Do you want to book a Titanic ticket?",
                "Confirm",
                JOptionPane.YES_NO_OPTION
        );

        if (confirm == JOptionPane.YES_OPTION) {
            String msg = ticket.bookTicket();
            JOptionPane.showMessageDialog(null, msg);
            JOptionPane.showMessageDialog(null, ticket.toString());
        }
        // กด No → โปรแกรมจบ (ไม่ต้องแสดงอะไร)
    }
}


