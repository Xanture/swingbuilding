package com.codefellowssweing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by xanture on 6/10/17.
 */
public class Paint {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Pain!");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        InputPannel inputPannel = new InputPannel();

        frame.add(inputPannel);

        frame.pack();
        frame.setVisible(true);
    }
}
