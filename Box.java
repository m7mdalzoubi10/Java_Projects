import javax.swing.*;

public class Box {

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Box Layout");

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(new JLabel("Username :"));
        panel.add(new JTextField(15));

        panel.add(new JLabel("Password :"));
        panel.add(new JTextField(15));

        JButton Login = new JButton("Login");

        panel.add(Login);
        frame.add(panel);
        frame.setSize(400,300);
        frame.setVisible(true);
    }
}