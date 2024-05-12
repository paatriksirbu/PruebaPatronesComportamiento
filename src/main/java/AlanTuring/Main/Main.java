package AlanTuring.Main;

import AlanTuring.Programs.Menu;
import AlanTuring.Reverser.ReverserController;
import AlanTuring.Reverser.ReverserView;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ReverserView reverserView = new ReverserView();
            new ReverserController(reverserView);

            JFrame mainFrame = new JFrame("Alan Turing Halting Problem Menu");
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.setLayout(new BoxLayout(mainFrame.getContentPane(), BoxLayout.Y_AXIS));

            mainFrame.add(reverserView);
            mainFrame.setSize(400, 300);
            mainFrame.setVisible(true);

        });

    }
}
