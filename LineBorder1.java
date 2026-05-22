import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class LineBorder1 {

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("FowLayout vs GridLayout");

        frame.setLayout(new GridLayout(2,2,10,10));

        // Panel 1 - FlowLayout
        JPanel flowPanel = new JPanel(
                new FlowLayout(FlowLayout.CENTER, 15,10));

        flowPanel.setBackground(Color.RED);

        flowPanel.setBorder(
                BorderFactory.createTitledBorder(
                        new LineBorder(Color.BLACK, 2),"FlowLayout"));

        JButton save   = new JButton("Save");
        JButton edit   = new JButton("edit");
        JButton delete = new JButton("delete");
        JButton exit   = new JButton("exit");

        save.setBackground(Color.GREEN);
        edit.setBackground(Color.YELLOW);
        delete.setBackground(Color.ORANGE);
        exit.setBackground(Color.PINK);

        flowPanel.add(save);
        flowPanel.add(edit);
        flowPanel.add(delete);
        flowPanel.add(exit);

        // Panel 2 - GridLayout
        JPanel gridPanel = new JPanel(new GridLayout(2,2,10,10));

        gridPanel.setBackground(Color.BLUE);

        gridPanel.setBorder(BorderFactory.createTitledBorder(
                new LineBorder(Color.BLACK, 2),"GridLayout Panel"));

        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");

        b1.setBackground(Color.CYAN);
        b2.setBackground(Color.MAGENTA);
        b3.setBackground(Color.GRAY);
        b4.setBackground(Color.RED);

        gridPanel.add(b1);
        gridPanel.add(b2);
        gridPanel.add(b3);
        gridPanel.add(b4);

        frame.add(flowPanel);
        frame.add(gridPanel);
        frame.setSize(600, 400);
        frame.setVisible(true);
    }
}