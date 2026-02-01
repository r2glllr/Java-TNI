import javax.swing.JOptionPane;

public class TicketInfo {
    public static String select_showtime(Movie movie) {
        String menu = movie + "\n"
                + "Press 1 to select show time = 13:00\n" + "Press 2 to select show time = 14:30\n" + "Press 3 to select show time = 15:00\n"
                + "Enter a number : ";

        String input = JOptionPane.showInputDialog(menu);
        if (input == null) return "Error time";

        switch (input) {
            case "1": return "13:00";
            case "2": return "14:30";
            case "3": return "15:00";
            default: return "Error time";
        }
    }

    public static String select_seat_number() {
        String row = JOptionPane.showInputDialog("Select seat row (A-G):");
        String number = JOptionPane.showInputDialog("Select seat number (1-12):");

        if (row == null || number == null) return "invalid";

        return row.toUpperCase() + number;
    }

    public static void main(String[] args) {

        Movie movie = new Movie("Titanic", 120, "PG-13");

        String showTime = select_showtime(movie);
        if (showTime.equals("Error time")) return;

        String seat = select_seat_number();
        if (seat.equals("invalid")) return;
        Ticket ticket = new Ticket("T001", movie, showTime, seat, 240);

        JOptionPane.showMessageDialog(null, ticket.bookTicket());
        JOptionPane.showMessageDialog(null, ticket.bookTicket());
    }
}


