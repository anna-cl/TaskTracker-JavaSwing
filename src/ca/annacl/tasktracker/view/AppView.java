package ca.annacl.tasktracker.view;

import ca.annacl.tasktracker.control.AppController;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AppView {

    private JFrame mainFrame;
    private final JPanel mainPanel = new JPanel();
    private final JPanel midPanel = new JPanel();
    private final JPanel topPanel = new JPanel();
    private final JPanel botthomPanel = new JPanel();
    private final JScrollPane scrollPane = new JScrollPane();

    private JButton allTaskButton;
    private JButton overDueButton; 
    private JButton upcomingButton;

    public AppView(String title){
        //============= Window frame and panels setup(GUI) ============
        mainFrame = new JFrame(title);
        mainFrame.setSize(700,700);
        mainFrame.add(mainPanel);

        topPanel.setBackground(Color.GREEN);
        // midPanel.setSize(new Dimension(500,500));
        midPanel.setBackground(Color.cyan);
        botthomPanel.setBackground(Color.magenta);

        mainPanel.add(topPanel);
        mainPanel.add(midPanel);
        mainPanel.add(botthomPanel);

        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainFrame.setVisible(true); //display GUI

        //============== Main Frame Buttons - UI Components ==============
        allTaskButton = new JButton("All Tasks");
        allTaskButton.setAlignmentX(Component.LEFT_ALIGNMENT);
        overDueButton = new JButton("Overdue Tasks");
        overDueButton.setAlignmentX(Component.LEFT_ALIGNMENT);
        upcomingButton = new JButton("Upcoming Tasks");
        upcomingButton.setAlignmentX(Component.LEFT_ALIGNMENT);

        topPanel.add(allTaskButton);
        topPanel.add(overDueButton);
        topPanel.add(upcomingButton);


    } //constructor ends

}
