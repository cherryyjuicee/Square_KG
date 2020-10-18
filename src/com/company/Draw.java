package com.company;
import java.awt.*;
import javax.swing.*;

class Draw extends JComponent{

    public void paintComponent(Graphics g){
        super.paintComponents(g);
        Graphics2D g2d=(Graphics2D)g;

        Background background = new Background();
        background.background(g2d);

        House house = new House();
        house.house(g2d);

        Forest forest = new Forest();
        forest.forest(g2d);

        Pond pond = new Pond();
        pond.pond(g2d);

        String str = "Воронцова";
        g2d.drawString(str,0,350);

        /* 	Вызывает обновление себя после завершения рисования	*/
        super.repaint();
    }
}