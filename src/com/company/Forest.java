package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;

class Forest extends JComponent {
    void forest(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2d=(Graphics2D)g;

        /* 	лес	*/
        Color Forest = new Color(64, 27, 0);
        g2d.setColor(Forest);
        g2d.fillRect(30, 150, 5, 50);
        g2d.fillRect(60, 150, 5, 50);
        g2d.fillRect(90, 150, 5, 50);
        g2d.fillRect(120, 150, 5, 50);
        g2d.fillRect(150, 150, 5, 50);

        Color GreenForest = new Color(11, 64, 0);
        g2d.setColor(GreenForest);
        g2d.fillOval(7, 130, 50, 50);
        g2d.fillOval(50, 100, 25, 80);
        g2d.fillOval(60, 110, 60, 70);
        g2d.fillOval(110, 100, 25, 80);
        g2d.fillOval(127, 130, 50, 50);

    }
}