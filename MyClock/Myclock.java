package MyClock;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.*;
import java.awt.*;

public class Myclock extends JFrame {
    private JLabel heading;
    private JLabel clockLabel;
    private Font font;

    Myclock() {
        setTitle("My Clock");
        setSize(400, 400);
        setLocation(300, 50);
        font = new Font(null, Font.BOLD, 35);

        JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN);
        heading = new JLabel("MY CLOCK");
        heading.setFont(font);
        panel.add(heading);
        getContentPane().setLayout(new GridLayout(3, 2));
        getContentPane().add(panel);
        createGUI();
        Digitalclock();
        setVisible(true);
    }

    public void createGUI() {
        clockLabel = new JLabel();
        getContentPane().add(clockLabel);


    }
    public void Digitalclock()
    {


        int delay = 100;
        Timer timer = new Timer(delay, new ActionListener()

        {

            @Override
            public void actionPerformed(ActionEvent e) {
                LocalDateTime now = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
                String formattedDateTime = now.format(formatter);
                clockLabel.setHorizontalAlignment(SwingConstants.CENTER); // Align the clock label to the center
                getContentPane().add(clockLabel, BorderLayout.CENTER);
                clockLabel.setText(formattedDateTime);
    }
});
        timer.start();
    }}