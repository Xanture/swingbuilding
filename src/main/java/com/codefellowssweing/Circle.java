package com.codefellowssweing;

import java.awt.*;
import java.security.PublicKey;

/**
 * Created by xanture on 6/10/17.
 */
public class Circle extends Shape {
    private int radius;
    public Circle (int x, int y, int radius) {
        super (x, y);
        this.radius = radius;
    }
    @Override
    public void draw(Graphics canvas) {
        canvas.setColor(color);
        if(isFilled) {
            canvas.fillOval(x,y, radius*2, radius*2);
        } else {
            canvas.drawOval(x,y, radius*2, radius*2);
        }
    }
}
