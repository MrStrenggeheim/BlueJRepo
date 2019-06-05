import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements GUISchreiber {

    // Anfang Attribute
    private JTextArea jTextArea1 = new JTextArea("");
    private JScrollPane jTextArea1ScrollPane = new JScrollPane(jTextArea1);
    private JTextField nameEingabe = new JTextField();
    private JTextField scoreEingabe = new JTextField();
    private JLabel jLabel1 = new JLabel();
    private JButton jButton1 = new JButton();
    private JLabel jLabel2 = new JLabel();

    private ModelSchreiber modelSchreiber;
    private ControllerSchreiber cSchreiber;

    // Ende Attribute

    public GUI() { 
        // Frame-Initialisierung
        super();

        // modelSchreiber = new Model();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        int frameWidth = 449; 
        int frameHeight = 385;
        setSize(frameWidth, frameHeight);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
        setTitle("Highscore Verwaltung");
        setResizable(false);
        Container cp = getContentPane();
        cp.setLayout(null);
        // Anfang Komponenten

        jTextArea1ScrollPane.setBounds(184, 192, 241, 129);
        cp.add(jTextArea1ScrollPane);

        nameEingabe.setBounds(32, 104, 137, 33);
        nameEingabe.setText("neuer Name");
        cp.add(nameEingabe);

        scoreEingabe.setBounds(216, 104, 121, 33);
        scoreEingabe.setText("0");
        scoreEingabe.add(jLabel1);
        cp.add(scoreEingabe);

        jLabel1.setBounds(8, 184, 124, 65);
        jLabel1.setText("Aktuelle Highscore");
        cp.add(jLabel1);

        jButton1.setBounds(368, 104, 49, 41);
        jButton1.setText("OK");
        jButton1.setMargin(new Insets(2, 2, 2, 2));
        jButton1.addActionListener(new ActionListener() { 
                public void actionPerformed(ActionEvent evt) { 
                    jButton1_ActionPerformed(evt);
                }
            });
        cp.add(jButton1);
        jLabel2.setBounds(16, 32, 355, 49);
        jLabel2.setText("Spielername und Score neu eingeben:");
        cp.add(jLabel2);
        // Ende Komponenten

        setVisible(true);
    } // end of public GUI

    public void modelSchreiberAnmelden(ModelSchreiber modelSchreiber, ControllerSchreiber cSchreiber){
        this.modelSchreiber = modelSchreiber;
        this.cSchreiber = cSchreiber;
    }

    // Anfang Methoden

    public void jButton1_ActionPerformed(ActionEvent evt) {
        try{
            String name=nameEingabe.getText();
            int score=Integer.parseInt(scoreEingabe.getText());
            // neuen Eintrag in den Controller
            modelSchreiber.schreiben(name, score);
        } catch(Exception e){
            scoreEingabe.setText("Ganze Zahl eingeben!");
        }
    } // end of jButton1_ActionPerformed

    public void schreiben(String inhalt){
        jTextArea1.setText(inhalt);
    }
    
    public void invalidName(String name) {
        jTextArea1.setText("<<" + name + ">> is not a valid name");
    }

    public String lesen() {
        return jTextArea1.getText();
    }
    // Ende Methoden
} // end of class GUI






