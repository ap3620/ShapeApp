package org.example;

import java.awt.*;

public class Shape extends Canvas {
    Point p = new Point(200, 200);
    Color c = new Color(0x992266);
    Circle C1 = new Circle(p, c, 50);

    public void paint(Graphics g) {
        C1.draw(g);
        g.setColor(Color.red);
        g.fillRect(200, 200, 20, 70);
        ;
    }
}
