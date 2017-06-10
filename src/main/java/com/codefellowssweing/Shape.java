package com.codefellowssweing;

import java.awt.*;

/**
 * Created by xanture on 6/10/17.
 */
public abstract class Shape {
    protected int x, y;

    protected boolean isFilled;
    protected Color color;

    public Shape(int x, int y) {
        this.y = y;
        this.x = x;
    }
    public void setIsFilled (boolean isFilled) {
        this.isFilled = isFilled;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw (Graphics canvas);
}
