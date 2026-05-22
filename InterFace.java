import java.awt.*;
import javax.swing.*;

public class InterFace {

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("FowLayout example");

        frame.setLayout(new GridLayout(2,1));

        JPanel panel1 = new JPanel(new FlowLayout());
        panel1.add(new JButton("One"));
        panel1.add(new JButton("Two"));
        panel1.add(new JButton("Three"));

        JPanel panel2 = new JPanel(
                new FlowLayout(FlowLayout.LEFT, 25,20));
        panel2.add(new JButton("A"));
        panel2.add(new JButton("B"));
        panel2.add(new JButton("C"));
        panel2.add(new JButton("D"));

        frame.add(panel1);
        frame.add(panel2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 300);
        frame.setVisible(true);
    }
}