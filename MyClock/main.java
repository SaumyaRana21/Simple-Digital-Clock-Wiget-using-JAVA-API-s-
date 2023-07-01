package MyClock;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Myclock clock = new Myclock();
            clock.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        });
    }
}