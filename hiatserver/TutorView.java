/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiatserver;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author giannis
 */
public class TutorView extends JFrame {

    JPanel myPanel;
    JLabel interestLabel;
    JTextField interestTextfield;
    JLabel understandLabel;
    JTextField understandTextfield;
    JLabel idLabel;
    JTextField idTextfield;
//    JTextArea messageArea;
//    JLabel messageLabel;
//    JButton next;
//    JButton previous;
    

    public TutorView() {

        myPanel = new JPanel();
        interestLabel = new JLabel("Interest");
        interestTextfield = new JTextField(5);
        understandLabel = new JLabel("Understand");
        understandTextfield = new JTextField(5);
        idLabel = new JLabel("Total Students");
        idTextfield = new JTextField(5);
//        messageArea = new JTextArea();
//        messageLabel = new JLabel("Messages");
//        next = new JButton("Next");
//        previous = new JButton("Previous");
        

        setTitle("HIAT Tutor");
        setSize(350, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        
        
        
        myPanel.setLayout(new GridLayout(3,2));
        
       
        myPanel.add(idLabel);
        myPanel.add(idTextfield);
        myPanel.add(interestLabel);
        myPanel.add(interestTextfield);
        myPanel.add(understandLabel);
        myPanel.add(understandTextfield);
//        myPanel.add(messageLabel);
//        myPanel.add(messageArea);
//        myPanel.add(previous);
//        myPanel.add(next);
        add(myPanel);

    }
    

    public void setInterest(double rate) {
        interestTextfield.setText(Double.toString(rate));
    }
    public void setUnderstand(double rate) {
        understandTextfield.setText(Double.toString(rate));
    }
    public void setID(int rate) {
        idTextfield.setText(Integer.toString(rate));
    }
}
