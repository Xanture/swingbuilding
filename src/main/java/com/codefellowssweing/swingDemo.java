package com.codefellowssweing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 * Created by xanture on 6/10/17.
 */
public class swingDemo {
    private JFrame mainFrame;
    private JPanel controlPanel;
    private JLabel statusLabel;
    public swingDemo () {
        mainFrame = new JFrame("Code Fellows Swing Demo");
        mainFrame.setSize(500,400);
        mainFrame.setLayout(new GridLayout(3, 1));

//        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        controlPanel.setBackground(Color.green);

        JButton okButton = new JButton("ok");
        JButton submitButton = new JButton("submit");
        JButton cancelButton = new JButton("cancel");

        JLabel headerLabel = new JLabel("", JLabel.CENTER);
        JLabel statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350, 100);

        headerLabel.setText("Control in action: Button");
        okButton.setActionCommand("OK");
        submitButton.setActionCommand("Submit");
        cancelButton.setActionCommand("Cancel");

        okButton.addActionListener(new ButtonClickListener());
        submitButton.addActionListener (new ButtonClickListener());



        controlPanel.add(okButton);
        controlPanel.add(submitButton);
        controlPanel.add(cancelButton);

        mainFrame.add(headerLabel);
        mainFrame.add(statusLabel);
        mainFrame.add(controlPanel);
        mainFrame.setVisible(true);

    }
    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("OK"))
        {
            statusLabel.setText("Okay Button Clicked. Booya");
        } else if (command.equals("Submit")) {
            statusLabel.setText("Submit Button Clicked. Booya");
        } else if (command.equals("Cancel")) {
            statusLabel.setText("Cancel Button clicked. Stop it Booya");
        }
        }
    }
}
