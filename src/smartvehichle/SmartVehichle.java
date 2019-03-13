/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartvehichle;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author rahulk
 */
public class SmartVehichle {

    public static void main(String[] args) {
        
          JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("BoxLayout Example X_AXIS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        JPanel panel = new JPanel();

        
        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);

        
        panel.setLayout(boxlayout);

        
        panel.setBorder(new EmptyBorder(new Insets(150, 200, 150, 200)));
        
        JButton jb1 = new JButton("Request");
        JButton jb2 = new JButton("View Requests");
        JLabel notices = new JLabel("Smart Vehicle Communication");
        panel.add(notices);
        panel.add(jb1);
        panel.add(jb2);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

    }
}

      

