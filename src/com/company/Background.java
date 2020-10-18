package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;

class Background extends JComponent {
    void background(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2d=(Graphics2D)g;

        /* 	небо	*/
        Color Sky = new Color(0, 143, 235);
        g2d.setColor(Sky);
        g2d.fillRect(0, 0, 400, 200);

        /* 	трава	*/
        Color Grass = new Color(36, 151, 118);
        g2d.setColor(Grass);
        g2d.fillRect(0, 200, 400, 200);

    }
}

