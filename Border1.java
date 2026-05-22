import java.awt.*;
import javax.swing.*;

public class Border1 {

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Border Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new BorderLayout());

        JPanel n = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        n.add(new JButton("Save"));
        n.add(new JButton("edit"));
        n.add(new JButton("delete"));
        n.add(new JButton("exit"));

        JPanel s = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        s.add(new JButton("Contact us"));
        s.add(new JButton("About us"));

        JButton East   = new JButton("EAST");
        JButton West   = new JButton("WEST");
        JButton Center = new JButton("CENTER");

        frame.add(n,      BorderLayout.NORTH);
        frame.add(s,      BorderLayout.SOUTH);
        frame.add(East,   BorderLayout.EAST);
        frame.add(West,   BorderLayout.WEST);
        frame.add(Center, BorderLayout.CENTER);


        n.setBackground(Color.RED);
        s.setBackground(Color.BLUE);
        East.setBackground(Color.GRAY);
        West.setBackground(Color.CYAN);
        Center.setBackground(Color.YELLOW);

        frame.setSize(600, 400);     
        frame.setVisible(true);        
    }
}