package AlanTuring.Reverser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ReverserView extends JFrame{
    private JButton countUpButton;
    private JButton countDownButton;
    private JButton reverserButton;
    private JTextArea result;


    public ReverserView(){
        setTitle("Reverser");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        placeComponents();
    }

    private void placeComponents(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        countUpButton = new JButton("Count Up");
        panel.add(countUpButton);

        countDownButton = new JButton("Count Down");
        panel.add(countDownButton);

        reverserButton = new JButton("Reverser");
        panel.add(reverserButton);

        result = new JTextArea("Results will be displayed here.");
        result.setEditable(false);
        panel.add(result);

        add(panel, BorderLayout.CENTER);
    }
}
