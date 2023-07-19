package com.mycompany.javanetworking;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
public class EventHandlingExample {
	   // Create a text-based label.
	   JLabel label = new JLabel("Press a button.");
	   EventHandlingExample() {/*  ww   w  .   d  e  m  o 2 s    . c  o   m*/
	      // Create a new JFrame container.
	      JFrame jfrm = new JFrame("An Event Example");
	      // Specify FlowLayout for the layout manager.
	      jfrm.setLayout(new FlowLayout());
	      // Give the frame an initial size.
	      jfrm.setSize(220, 90);
	      // Terminate the program when the user closes the application.
	      jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      // Make two buttons.
	      JButton buttonA = new JButton("Alpha");
	      JButton buttonB = new JButton("Beta");

	      // Add action listener for Alpha.
	      buttonA.addActionListener(e->label.setText("Alpha was pressed."));

	      // Add action listener for Beta.
	      buttonB.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent ae) {
	            label.setText("Beta was pressed.");
	         }
	      });

	      // Add the buttons to the content pane.
	      jfrm.add(buttonA);
	      jfrm.add(buttonB);
	      // Add the label to the content pane.
	      jfrm.add(label);

	      // Display the frame.
	      jfrm.setVisible(true);
	   }

	   public static void main(String args[]) {
	      // Create the frame on the event dispatching thread.
	      SwingUtilities.invokeLater(new Runnable() {
	         public void run() {
	            new EventHandlingExample();}});}}