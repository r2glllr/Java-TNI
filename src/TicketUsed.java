import javax.swing.JOptionPane;

public class TicketUsed {
    public static String show_movie_list(Ticket[] tickets) {
        String result = "";
        for (int i = 0; i < tickets.length; i++) {
            result += tickets[i].getTicket_id() + ": "
                    + tickets[i].getMovie() + "\n";
        }
        return result;
    }
    public static void main(String[] args) {

        Ticket[] tickets = new Ticket[]{
                new Ticket("T001", new Movie("Titanic", 120, "PG-13"),
                        "12:00", "B7", 280),
                new Ticket("T002", new Movie("Pokemon", 102, "PG"),
                        "11:00", "G11", 240),
                new Ticket("T003", new Movie("Silent Hill", 125, "R-13"),
                        "14:30", "H2", 240)
        };
        int confirm = JOptionPane.showConfirmDialog(
                null,
                "Do you want to book or use a ticket?",
                "Ticket",
                JOptionPane.YES_NO_OPTION
        );
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }
        String ticketId = JOptionPane.showInputDialog(
                show_movie_list(tickets) +
                        "\nEnter a ticket id for booking:"
        );
        if (ticketId == null) return;
        Ticket selected = null;
        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i].getTicket_id().equalsIgnoreCase(ticketId)) {
                selected = tickets[i];
                break;
            }
        }
        if (selected == null) return;
        String menu = selected.getTicket_id() + ": " + selected.getMovie() + "\n\n"
                + "Press 1 to book a ticket\n"
                + "Press 2 to use a ticket\n"
                + "Press 3 to see a ticket status\n\n"
                + "Enter a menu:";
        String choice = JOptionPane.showInputDialog(menu);
        if (choice == null) return;
        String message = "";
        if (choice.equals("1")) {
            message = selected.bookTicket();
        } else if (choice.equals("2")) {
            message = selected.useTicket();
        } else if (choice.equals("3")) {
            message = "Ticket status:";
        } else {
            return;
        }
        JOptionPane.showMessageDialog(
                null,
                message + "\n\n" + selected.toString()
        );
        int again = JOptionPane.showConfirmDialog(
                null,
                "Do you want to book or use other tickets?",
                "Ticket",
                JOptionPane.YES_NO_OPTION
        );

        if (again != JOptionPane.YES_OPTION) {
            return;
        }
        main(null);
    }
}
