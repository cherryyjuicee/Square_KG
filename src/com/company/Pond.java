package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;

class Pond extends JComponent {
    void pond(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2d=(Graphics2D)g;

        Color Pond = new Color(10, 0, 104);
        g2d.setColor(Pond);
        g2d.fillOval(70, 280, 150, 60);
    }
}