import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class VowelCounter extends JFrame{
    private Container c;
    private JLabel bannerLabel, promptLabel, vowelLabel, aLabel, eLabel, iLabel, oLabel, uLabel;
    private JTextArea inputTextArea;
    private Font f;
    private JScrollPane scroll;

    int totalVowel = 0;
    int letter_a = 0;
    int letter_e = 0;
    int letter_i = 0;
    int letter_o = 0;
    int letter_u = 0;

    VowelCounter(){
        initComponents();
    }
    public void initComponents(){
        Color hsb = new Color(204, 204, 255);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(hsb);

        f = new Font("Tahoma", Font.BOLD, 20);

        bannerLabel = new JLabel("Vowel Counter");
        bannerLabel.setBounds(230, 30, 150, 30);
        bannerLabel.setFont(f);
        c.add(bannerLabel);

        promptLabel = new JLabel("Enter Text: ");
        promptLabel.setBounds(30, 80, 120, 30);
        promptLabel.setFont(f);
        c.add(promptLabel);

        inputTextArea = new JTextArea();
        inputTextArea.setLineWrap(true);
        inputTextArea.setWrapStyleWord(true);
        inputTextArea.setFont(f);

        scroll = new JScrollPane(inputTextArea);
        scroll.setBounds(160, 80, 390, 100);
        c.add(scroll);

        vowelLabel = new JLabel();
        vowelLabel.setBounds(30, 200, 300, 30);
        vowelLabel.setFont(f);
        c.add(vowelLabel);

        aLabel = new JLabel();
        aLabel.setBounds(30, 250, 220, 30);
        aLabel.setFont(f);
        c.add(aLabel);
        eLabel = new JLabel();
        eLabel.setBounds(30, 290, 220, 30);
        eLabel.setFont(f);
        c.add(eLabel);
        iLabel = new JLabel();
        iLabel.setBounds(30, 330, 220, 30);
        iLabel.setFont(f);
        c.add(iLabel);
        oLabel = new JLabel();
        oLabel.setBounds(30, 370, 220, 30);
        oLabel.setFont(f);
        c.add(oLabel);
        uLabel = new JLabel();
        uLabel.setBounds(30, 410, 220, 30);
        uLabel.setFont(f);
        c.add(uLabel);

        inputTextArea.addKeyListener(new KeyListener(){

            @Override
            public void keyTyped(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getSource() == inputTextArea){
                    if(e.VK_A == e.getKeyCode()){
                        letter_a++;
                        totalVowel++;
                    }
                    if(e.VK_E == e.getKeyCode()){
                        letter_e++;
                        totalVowel++;
                    }
                    if(e.VK_I == e.getKeyCode()){
                        letter_i++;
                        totalVowel++;
                    }
                    if(e.VK_O == e.getKeyCode()){
                        letter_o++;
                        totalVowel++;
                    }
                    if(e.VK_U == e.getKeyCode()){
                        letter_u++;
                        totalVowel++;
                    }
                }
                vowelLabel.setText("Total Number of Vowels: "+totalVowel);
                aLabel.setText("Total Number of A: "+letter_a);
                eLabel.setText("Total Number of E: "+letter_e);
                iLabel.setText("Total Number of I: "+letter_i);
                oLabel.setText("Total Number of O: "+letter_o);
                uLabel.setText("Total Number of U: "+letter_u);
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }

        });

    }

    public static void main(String[] args){
        VowelCounter frame = new VowelCounter();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Vowel Counter");
    }
}