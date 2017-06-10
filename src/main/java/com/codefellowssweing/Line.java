package com.codefellowssweing;

import java.awt.*;

/**
 * Created by xanture on 6/10/17.
 */
public class Line extends Shape {
    private int width;
    private int height;

    public Line(int x, int y, int width, int height){
        super(x, y);

        this.width = width;
        this.height = height;

    }
//    public Line(int x1, int y1, int x2, int y2) {
//        super(x1, y1);
//
//        this.width = x2-x1+1;
//        this.height = y2-y1+1;
//    }

    @Override
    public void draw(Graphics canvas){
        canvas.setColor(color);
        canvas.drawLine(x,y, x+width-1, y+height-1);
    }
}
