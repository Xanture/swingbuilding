package com.codefellowssweing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by xanture on 6/10/17.
 */
public class ColoredSquare extends JComponent {
    private Color color;

    public ColoredSquare(Color color) {
        this.color = color;
        setPreferredSize(new Dimension(50, 50));
        setMaximumSize(new Dimension(50,50));

    }
    @Override
    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
        g.fillRect(0,0,50,50);

    }
    public void updateColor(Color color) {
        this.color = color;
        repaint();
    }
}
