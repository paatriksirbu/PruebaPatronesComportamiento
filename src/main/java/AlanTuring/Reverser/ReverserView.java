package AlanTuring.Reverser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ReverserView extends JPanel{
    private JButton countUpButton;
    private JButton countDownButton;
    private JButton reverserButton;
    private JTextArea result;


    public ReverserView(){
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

}
