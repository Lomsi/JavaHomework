package Lessons;

import javax.swing.*;

public class L3 {
    public static void main(String[] args) {
        // יצירת החלונית
        JFrame window = new JFrame();
        // X גורמת לחלונית להיסגר בלחיצה על
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // הגדרת גודל החלונית
        window.setSize(400, 300);
        // רכיב שלא נראה על המסך ובתוכו נשים את כל הרכיבים
        JPanel panel = new JPanel();
        // הוספת הפאנל לחלונית
        window.add(panel);
        // יצירת כפתורים
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        // הוספת הכפתורים על הפאנל
        panel.add(button1);
        panel.add(button2);
    }
}
