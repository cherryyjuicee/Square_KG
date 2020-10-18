package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;

class House extends JComponent {
    void house(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2d=(Graphics2D)g;

        /* 	дом	*/
        Color House = new Color(211, 146, 79);
        Color House1 = new Color(129, 89, 48);
        Color Door = new Color(0x917C00);
        Color Win = new Color(0x00B1D3);

        g2d.setColor(Door);
        g2d.fillOval(225, 110, 100, 100);

        g2d.setColor(House);
        g2d.fillRect(225, 150, 100, 100);
        g2d.fillOval(230, 120, 90, 85);

        g2d.setColor(House1);
        g2d.fillRect(250, 250, 50, 7);
        g2d.fillRect(248, 257, 54, 7);

        g2d.setColor (Door);
        g2d.fillRect(260, 210, 30, 40);

        g2d.setColor(Win);
        g2d.fillRect(265, 170, 20, 30);

    }
}