package winBuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.CardLayout;
import net.miginfocom.swing.MigLayout;

public class winBuilder extends JFrame {
    
    int total = 0;
    
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    winBuilder frame = new winBuilder();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public winBuilder() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new MigLayout("", "[426px]", "[253px][][][][]"));
        
        JLabel lblSum = new JLabel("Sum");
        contentPane.add(lblSum, "flowx,cell 0 0,alignx center,growy");
        
        JButton btn1 = new JButton("1");
        contentPane.add(btn1, "flowx,cell 0 1,alignx center,aligny top");
        
        JButton btn2 = new JButton("2");
        contentPane.add(btn2, "cell 0 1,alignx right,aligny bottom");
        
        JButton btn3 = new JButton("3");
        contentPane.add(btn3, "flowx,cell 0 2,alignx center,aligny top");
        
        JButton btn4 = new JButton("4");
        contentPane.add(btn4, "cell 0 2,alignx right,aligny top");
        
        JButton btnOk = new JButton("Ok");
        contentPane.add(btnOk, "cell 0 3,alignx center,aligny top");
    }

}
