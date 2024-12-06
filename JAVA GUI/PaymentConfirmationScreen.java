import javax.swing.*;
import java.awt.*;

public class PaymentConfirmationScreen extends JFrame {

    public PaymentConfirmationScreen(String movie, String buyerName, int ticketQuantity, double ticketPrice, String selectedSeats) {
        
        super("Payment Confirmation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 1));
        setSize(400, 300); 
        setLocationRelativeTo(null); 

        
        add(new JLabel("Buyer: " + buyerName));
        add(new JLabel("Movie: " + movie));
        add(new JLabel("Tickets: " + ticketQuantity));
        add(new JLabel("Total Amount: $" + String.format("%.2f", (ticketQuantity * ticketPrice))));
        add(new JLabel("Seats: " + selectedSeats));
        add(new JLabel("Payment Mode: Cash"));

        
        JButton finishButton = new JButton("Finish");
        finishButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Transaction completed!");
            System.exit(0); 
        });
        add(finishButton);

        
        setVisible(true);
    }

    
    public static void main(String[] args) {
        new PaymentConfirmationScreen("The Matrix", "John Doe", 2, 12.50, "A1, A2");
    }
}
