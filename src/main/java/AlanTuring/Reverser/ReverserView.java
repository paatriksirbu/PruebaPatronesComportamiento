package AlanTuring.Reverser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Esta clase extiende de JPanel y representa la vista de la aplicación.
 * Contiene varios botones y un área de texto para mostrar los resultados.
 * @autor Patrik Paul Sirbu
 */

public class ReverserView extends JPanel{
    private JButton countUpButton;
    private JButton countDownButton;
    private JButton reverserButton;
    private JButton stopButton;
    private JTextArea result;

    /**
     * Constructor de la clase. Establece el layout y coloca los componentes en el panel.
     */

    public ReverserView(){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        placeComponents();
    }

    /**
     * Colocamos los componentes en el panel.
     */

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

    /**
     * Crea un botón con el texto proporcionado.
     *
     * @param text El texto del botón.
     * @return El botón creado.
     */

    private JButton createButton(String text){
        JButton button = new JButton(text);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.setBorder(BorderFactory.createEmptyBorder(10, 60, 10, 60));
        button.setBackground(Color.magenta.darker().darker());
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        return button;
    }

    /**
     * Establece el listener de los botones.
     *
     * @param listener El listener a establecer.
     */

    public void setCountUpButtonListener(ActionListener listener){
        countUpButton.addActionListener(listener);
    }

    public void setCountDownButtonListener(ActionListener listener){
        countDownButton.addActionListener(listener);
    }

    public void setReverserButtonListener(ActionListener listener){
        reverserButton.addActionListener(listener);
    }

    /**
     * Establece el texto del área de resultados.
     *
     * @param text El texto a establecer.
     */

    public void setResult(String text){
        result.setText(text);
    }

    /**
     * Obtiene el texto del área de resultados.
     *
     * @return El texto del área de resultados.
     */

    public String getResult(){
        return result.getText();
    }

    /**
     * Muestra un mensaje de error.
     *
     * @param errorMessage El mensaje de error a mostrar.
     */


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

    /**
     * Obtiene el código ingresado por el usuario.
     *
     * @return El código ingresado por el usuario.
     */

    public String getCodeInput(){
        return JOptionPane.showInputDialog(this, "Enter code to analyze:");
    }

    public void setStopButtonListener(ActionListener listener){
        stopButton.addActionListener(listener);
    }


}
