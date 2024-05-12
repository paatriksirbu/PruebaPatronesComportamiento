package AlanTuring.Reverser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ReverserView extends JPanel{
    private JButton countUpButton;
    private JButton countDownButton;
    private JButton reverserButton;
    private JButton stopButton;
    private JTextArea result;


    public ReverserView(){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        placeComponents();
    }


    private void placeComponents(){
        countUpButton = createButton("Count Up");
        countDownButton = createButton("Count Down");
        reverserButton = createButton("Reverser");
        stopButton = createButton("Stop");

        result = new JTextArea("Results will be displayed here.");
        result.setEditable(false);
        result.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        add(Box.createRigidArea(new Dimension(0, 10)));
        add(countUpButton);
        add(Box.createRigidArea(new Dimension(0, 10)));
        add(countDownButton);
        add(Box.createRigidArea(new Dimension(0, 10)));
        add(reverserButton);
        add(Box.createRigidArea(new Dimension(0, 10)));
        add(stopButton);
        add(Box.createRigidArea(new Dimension(0, 10)));
        add(result);

    }

    private JButton createButton(String text){
        JButton button = new JButton(text);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.setBorder(BorderFactory.createEmptyBorder(10, 60, 10, 60));
        button.setBackground(Color.magenta.darker().darker());
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        return button;
    }
    public void setCountUpButtonListener(ActionListener listener){
        countUpButton.addActionListener(listener);
    }

    public void setCountDownButtonListener(ActionListener listener){
        countDownButton.addActionListener(listener);
    }

    public void setReverserButtonListener(ActionListener listener){
        reverserButton.addActionListener(listener);
    }

    public void setResult(String text){
        result.setText(text);
    }

    public String getResult(){
        return result.getText();
    }


    public void displayErrorMessage(String errorMessage){
        errorMessage = "An error occurred.";
        JOptionPane.showMessageDialog(this, errorMessage);
    }

    public void displaySuccessMessage(String successMessage){
        successMessage = "Operation completed successfully.";
        JOptionPane.showMessageDialog(this, successMessage);
    }

    public void displayInfoMessage(String infoMessage){
        infoMessage = "Information.";
        JOptionPane.showMessageDialog(this, infoMessage);
    }

    public void displayWarningMessage(String warningMessage){
        warningMessage = "Warning there is a problem.";
        JOptionPane.showMessageDialog(this, warningMessage);
    }

    public String getCodeInput(){
        return JOptionPane.showInputDialog(this, "Enter code to analyze:");
    }

    public void setStopButtonListener(ActionListener listener){
        stopButton.addActionListener(listener);
    }


}
