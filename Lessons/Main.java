package Lessons;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        // JFrame frame = new JFrame("Phone Number");
        // JButton button = new JButton("OK");
        // frame.add(button);
        // JPanel panel = new JPanel();
        // JLabel label = new JLabel("");
        // panel.add(label);
        // JTextField textField = new JTextField(20);
        // panel.add(textField);
        // frame.add(panel);
        // frame.pack();
        // frame.setVisible(true);

        // // Boarder Layout
        JFrame frame = new JFrame();
        Container cp = frame.getContentPane();
        cp.setLayout(new BorderLayout());
        JButton button = new JButton("OK");
        frame.add(button, BorderLayout.SOUTH);
        JPanel panel = new JPanel();
        JLabel label = new JLabel(new ImageIcon("\uF028"));
        panel.add(label);
        JTextField textField = new JTextField(20);
        panel.add(textField);
        frame.add(panel, BorderLayout.WEST);
        frame.pack();
        frame.setVisible(true);

        // // Box Layout
        // JFrame frame = new JFrame();
        // Container cp = frame.getContentPane();
        // cp.setLayout( new BoxLayout( cp, BoxLayout.X_AXIS ));
        // JButton button = new JButton( "OK");
        // frame.add( button );
        // JPanel panel = new JPanel();
        // panel.setLayout( new BoxLayout( panel, BoxLayout.Y_AXIS ));
        // JLabel label = new JLabel ( new ImageIcon( "\uF028" ) );
        // panel.add( label );
        // JTextField textField = new JTextField( 20 );
        // panel.add( textField );
        // frame.add( panel );
        // frame.pack();
        // frame.setVisible( true );

    }
}
// // יצירת החלונית
// JFrame window = new JFrame();
// // X גורמת לחלונית להיסגר בלחיצה על
// window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// // // הגדרת גודל החלונית
// window.setSize(1080, 900);
// // // רכיב שלא נראה על המסך ובתוכו נשים את כל הרכיבים
// JPanel panel = new JPanel();
// JPanel panel2 = new JPanel();
// // // הוספת הפאנל לחלונית

// window.add(panel);

// // // יצירת כפתורים
// JButton button1 = new JButton("1");
// JButton button2 = new JButton("2");
// // // הוספת הכפתורים על הפאנל
// panel.add(button1);
// panel.add(button2);
// // // האם להציג את החלונית בהפעלת התוכנית
// window.setVisible(true);
// }}