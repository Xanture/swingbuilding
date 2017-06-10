package com.codefellowssweing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

/**
 * Created by xanture on 6/10/17.
 */
public class PaintPanel extends JPanel {
    private InputPanel inputPanel;
    private List<Shape> shapes;

    public PaintPanel (InputPanel inputPanel) {
        this.inputPanel = inputPanel;
        setPreferredSize(new Dimension(750, 0));
        setBackground(Color.WHITE);

        MouseInput mouseInput = new MouseInput();

        addMouseListener(mouseInput);
        addMouseMotionListener(mouseInput);

    }

    @Override
    public void paintComponent (Graphics g) {
        super.paintComponent(g);

        for (Shape s : shapes) {
            if (s != null) {
                s.draw(g);
            }
        }
    }

    private void addShape(Point initialPoint, Point finalPoint) {
        Shape shape = null;

        int dx = Math.abs(initialPoint.x-finalPoint.x);
        int dy = Math.abs(initialPoint.y-finalPoint.y);

        if (inputPanel.getShapeType() == ShapeType.CIRCLE) {


            int radius = (int)Math.round(Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2)));

            shape = new Circle(initialPoint.x, initialPoint.y, radius);
        } else if (inputPanel.getShapeType() == ShapeType.RECTANGLE) {
            shape = new Rectangle(initialPoint.x, initialPoint.y, dx+1, dy+1);
        } else if (inputPanel.getShapeType() == ShapeType.LINE) {
            shape = new Line(initialPoint.x, initialPoint.y, dx+1, dy+1);
        }

        shapes.add(shape);
    }

    private class MouseInput extends MouseAdapter {
        Point initialPoint;

        @Override
        public void mousePressed(MouseEvent e) {
            initialPoint = e.getPoint();

        }

        @Override
        public void mouseDragged(MouseEvent e){
            addShape(initialPoint, e.getPoint());
            repaint();
        }
    }
}
