/**
 * La clase Main es la clase principal de la aplicación Code Analyzer.
 * Crea la interfaz de usuario y maneja las acciones del usuario.
 * @author Patrik Paul Sirbu
 */
package CodeAnalyzer;

import CodeAnalyzer.Analyzer.Analyzer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class Main {
    private JFrame frame;
    private JTextField inputField;
    private JButton analyzeButton;
    private JTextArea resultArea;
    private JTextArea rulesArea;  // Define el JTextArea para las reglas

    /**
     * Constructor de la clase Main.
     * Inicializa la interfaz de usuario.
     */

    public Main() {
        initializeUI();
    }

    private void initializeUI() {
        frame = new JFrame("Code Analyzer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.WHITE);

        // Panel principal
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(255, 255, 255));  // Fondo blanco

        // Panel superior para el título
        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(new Color(128, 0, 128));  // Fondo morado
        JLabel titleLabel = new JLabel("CODE ANALYZER");
        titleLabel.setForeground(Color.WHITE);  // Texto en blanco
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titlePanel.add(titleLabel);

        // Panel para las normas
        JPanel normsPanel = new JPanel();
        normsPanel.setLayout(new BorderLayout());
        normsPanel.setBackground(new Color(255, 255, 255));
        JTextArea normsArea = new JTextArea(getRulesText());
        normsArea.setEditable(false);
        normsPanel.add(normsArea, BorderLayout.CENTER);

        // Panel para la entrada de código
        JPanel codePanel = new JPanel();
        codePanel.setLayout(new BorderLayout());
        inputField = new JTextField("Ingrese su código aquí...");
        codePanel.add(inputField, BorderLayout.CENTER);

        // Panel para el resultado
        resultArea = new JTextArea();
        resultArea.setEditable(false);
        codePanel.add(resultArea, BorderLayout.EAST);


        // Botón para analizar el código
        analyzeButton = new JButton("Analizar");
        analyzeButton.addActionListener(this::analyzeAction);
        codePanel.add(analyzeButton, BorderLayout.SOUTH);

        // SplitPane para dividir el panel principal en dos
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, normsPanel, codePanel);
        splitPane.setDividerLocation(400);  // Ajusta esto a tus necesidades

        // Agregando componentes al panel principal
        mainPanel.add(titlePanel, BorderLayout.NORTH);
        mainPanel.add(splitPane, BorderLayout.CENTER);

        frame.add(mainPanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    /**
     * Devuelve el texto de las normas.
     *
     * @return el texto de las normas.
     */

    private String getRulesText() {
        return "Normas:\n" +
                "Norma 1: Ingresa el código que desees. Puedes usar for y while.\n" +
                "\nNorma 2: Si pulsas enter, el programa leera hasta donde hayas escrito, es decir, no pasara a la siguiente linea.\n" +
                "\nNorma 3: Si pulsas el botón 'Analizar', el programa te dirá si hay errores en tu código.\n";
    }

    /**
     * Maneja la acción de análisis de código.
     * Se llama cuando el usuario hace clic en el botón "Analizar".
     *
     * @param e el evento de acción.
     */
    private void analyzeAction(ActionEvent e) {
        String input = inputField.getText();
        Analyzer analyzer = new Analyzer();
        String result = analyzer.analyzeCode(input);
        resultArea.setText(result);
    }


    public static void main(String[] args) {
        new Main();
    }
}