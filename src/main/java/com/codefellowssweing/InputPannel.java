package com.codefellowssweing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by xanture on 6/10/17.
 */
public class InputPannel extends JPanel{
    private JButton rectangleButton, circleButton, lineButton, colorButton, quitButton;
    private JCheckBox filledBox;
    private JLabel colorLabel;

    // can be refactored
    private ShapeType shapeType;
    private Color currentColor;
    private ColoredSquare coloredSquare;

    public InputPannel() {
        rectangleButton = new JButton("Rectangle");
        circleButton = new JButton("Circle");
        lineButton = new JButton("Line");
        colorButton = new JButton("Color Wheel");
        quitButton = new JButton("Quit");

        filledBox = new JCheckBox("Filled", false);
        colorLabel = new JLabel("Current Coolor:");

        shapeType = ShapeType.LINE;
        currentColor = Color.BLACK;


        coloredSquare = new ColoredSquare(currentColor);



        rectangleButton.addActionListener(e->{
            shapeType = ShapeType.RECTANGLE;
        });
        circleButton.addActionListener(e->{
            shapeType = ShapeType.CIRCLE;
        });
        lineButton.addActionListener(e->{
            shapeType = ShapeType.LINE;
        });
        colorButton.addActionListener(e->{
            currentColor = JColorChooser.showDialog(this, "Choose a poison", currentColor);
            coloredSquare.updateColor(currentColor);
        });
        quitButton.addActionListener(e-> {
            System.exit(0);
        });

        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        setBorder(BorderFactory.createEmptyBorder(15, 15, 250, 15));

        rectangleButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        circleButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        lineButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        filledBox.setAlignmentX(Component.CENTER_ALIGNMENT);
        colorButton.setAlignmentX(CENTER_ALIGNMENT);
        colorLabel.setAlignmentX(CENTER_ALIGNMENT);
        coloredSquare.setAlignmentX(Component.CENTER_ALIGNMENT);
        quitButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        Dimension dim = new Dimension(5, 5);

        add (rectangleButton);
        add (new Box.Filler(dim, dim, dim));
        add (circleButton);
        add (new Box.Filler(dim, dim, dim));
        add (lineButton);
        add (new Box.Filler(dim, dim, dim));
        add (filledBox);
        add (new Box.Filler(dim, dim, dim));
        add (colorButton);
        add (new Box.Filler(dim, dim, dim));
        add (colorLabel);
        add (new Box.Filler(dim, dim, dim));
        add (coloredSquare);
        add (new Box.Filler(dim, dim, dim));
        add (quitButton);
        add (new Box.Filler(dim, dim, dim));
    }

    public boolean isFilledBoxChecked() {
        return filledBox.isSelected();
    }

    public Color getCurrentColor() {
        return currentColor;
    }

    public ShapeType getShapeType() {
        return shapeType;
    }
}
