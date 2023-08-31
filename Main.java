import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn111,btn12 ;


    int Xpoint = 0 ;
    int Ypoint = 0;
    int count = 0;
    String letter = "";
    boolean winner=false;
    JLabel jl1,jl2,jl3,jl4,jl5,jl6 ;
    private void Winner () {

        //Check Horizontally
        if (btn1.getText() == btn2.getText() && btn2.getText() == btn3.getText() && btn1.getText() != "" && btn2.getText() != "" && btn3.getText() != "") {
            winner = true;
        }

        //Check Horizontally
        else if (btn4.getText() == btn5.getText() && btn5.getText() == btn6.getText() && btn4.getText() != "" && btn5.getText() != "" && btn6.getText() != "") {
            winner = true;
        }

        //Check Horizontally
        else if (btn7.getText() == btn8.getText() && btn8.getText() == btn9.getText() && btn7.getText() != "" && btn8.getText() != "" && btn9.getText() != "") {
            winner = true;
        }

        //Check Vertically
        else if (btn1.getText() == btn4.getText() && btn4.getText() == btn7.getText() && btn1.getText() != "" && btn4.getText() != "" && btn7.getText() != "") {
            winner = true;
        }

        //Check Vertically
        else if (btn2.getText() == btn5.getText() && btn5.getText() == btn8.getText() && btn2.getText() != "" && btn5.getText() != "" && btn8.getText() != "") {
            winner = true;
        } else if (btn3.getText() == btn6.getText() && btn6.getText() == btn9.getText() && btn3.getText() != "" && btn6.getText() != "" && btn9.getText() != "") {
            winner = true;
        }

        //Check Diagonally
        else if (btn1.getText() == btn5.getText() && btn5.getText() == btn9.getText() && btn1.getText() != "" && btn5.getText() != "" && btn9.getText() != "") {
            winner = true;
        }

        //Check Diagonally
        else if (btn3.getText() == btn5.getText() && btn5.getText() == btn7.getText() && btn3.getText() != "" && btn5.getText() != "" && btn7.getText() != "") {
            winner = true;
        } else {
            winner = false;
        }

        if (winner) {

            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            jl3.setText( letter+ " wins");


            if (letter == "X")
            {
                Xpoint ++ ;
                String str1 = Integer.toString(Xpoint);
                jl5.setText(str1);
                jl3.setForeground(Color.GREEN);
            }
            else
            {
                Ypoint ++ ;
                String str2 = Integer.toString(Ypoint);
                jl4.setText(str2);
                jl3.setForeground(Color.blue);
            }
        } else if (!winner && count == 9) {

            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            JOptionPane jp2 = new JOptionPane("");
            jp2.showMessageDialog(null," Match Tied !!");
        }
    }

    Main() {
        setBounds(600, 100, 400, 500);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);

        JPanel jp = new JPanel();

        jp.setBounds(45, 150, 300, 250);
        jp.setLayout(new GridLayout(3, 3, 10, 10));

        jl1 = new JLabel("Player 1 = ");
        jl1.setBounds(45,50,100,30);
        jl5 = new JLabel("");
        jl5.setBounds(105,50,20,30);

        jl2 = new JLabel("Player 2 = ");
        jl2.setBounds(253,50,100,30);
        jl4 = new JLabel("");
        jl4.setBounds(320,50,20,30);

        jl3 = new JLabel("");
        jl3.setBounds(168,50,100,30);
        jl3.setForeground(Color.GREEN);
        jl3.setFont(jl3.getFont().deriveFont(15.0f));


        jl6 = new JLabel("Tic-Tac-Toe");
        jl6.setBounds(140,5,150,30);
        jl6.setFont(jl6.getFont().deriveFont(15.0f));

        btn12 = new JButton("RESET SCORE");
        btn12.setBounds(150, 105, 93, 25);
        btn12.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));

        btn1 = new JButton("");
        btn1.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        btn1.setFont(new Font("Arial", Font.BOLD, 30));
        btn2 = new JButton("");
        btn2.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        btn2.setFont(new Font("Arial", Font.BOLD, 30));
        btn3 = new JButton("");
        btn3.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        btn3.setFont(new Font("Arial", Font.BOLD, 30));
        btn4 = new JButton("");
        btn4.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        btn4.setFont(new Font("Arial", Font.BOLD, 30));
        btn5 = new JButton("");
        btn5.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        btn5.setFont(new Font("Arial", Font.BOLD, 30));
        btn6 = new JButton("");
        btn6.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        btn6.setFont(new Font("Arial", Font.BOLD, 30));
        btn7 = new JButton("");
        btn7.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        btn7.setFont(new Font("Arial", Font.BOLD, 30));
        btn8 = new JButton("");
        btn8.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        btn8.setFont(new Font("Arial", Font.BOLD, 30));
        btn9 = new JButton("");
        btn9.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        btn9.setFont(new Font("Arial", Font.BOLD, 30));
        btn10 = new JButton("RESET");
        btn10.setBounds(45, 420, 93, 30);
        btn10.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));

        btn111 = new JButton("EXIT");
        btn111.setBounds(250, 420, 91, 30);
        btn111.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,2));


        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn10.addActionListener(this);
        btn111.addActionListener(this);
        btn12.addActionListener(this);



        add(jp);
        add(jl1);
        add(jl2);
        add(jl3);add(jl4);add(jl5);add(jl6);
        jp.add(btn1);
        jp.add(btn2);
        jp.add(btn3);
        jp.add(btn4);
        jp.add(btn5);
        jp.add(btn6);
        jp.add(btn7);
        jp.add(btn8);
        jp.add(btn9);
        add(btn10);
        add(btn111);
        add(btn12);

    }
    @Override
    public void actionPerformed(ActionEvent a) {
        count++;
        if (count == 1 || count == 3 || count == 5 || count == 7 || count == 9)
        {
            letter = "X";
        } else if (count == 2 || count == 4 || count == 6 || count == 8)
        {
            letter = "O";
        }

        if (a.getSource() == btn1) {
            btn1.setText(letter);
            btn1.setEnabled(false);
        } else if (a.getSource()==btn111) {
            setVisible(false);

        } else if (a.getSource()==btn12) {
            jl5.setText(Integer.toString(Ypoint=0));
            jl4.setText(Integer.toString(Xpoint=0));
            jl3.setText("");
        }else if (a.getSource() == btn2) {
            btn2.setText(letter);
            btn2.setEnabled(false);
        } else if (a.getSource() == btn3) {
            btn3.setText(letter);
            btn3.setEnabled(false);
        } else if (a.getSource() == btn4) {
            btn4.setEnabled(false);
            btn4.setText(letter);
        } else if (a.getSource() == btn5) {
            btn5.setText(letter);
            btn5.setEnabled(false);
        } else if (a.getSource() == btn6) {
            btn6.setText(letter);
            btn6.setEnabled(false);
        } else if (a.getSource() == btn7) {
            btn7.setEnabled(false);
            btn7.setText(letter);
        } else if (a.getSource() == btn8) {
            btn8.setEnabled(false);
            btn8.setText(letter);
        } else if (a.getSource() == btn9) {
            btn9.setText(letter);
            btn9.setEnabled(false);
        } else if (a.getSource() == btn10) {

            letter = "";
            count = 0;

            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);

            btn1.setText("");
            btn2.setText("");
            btn3.setText("");
            btn4.setText("");
            btn5.setText("");
            btn6.setText("");
            btn7.setText("");
            btn8.setText("");
            btn9.setText("");
            btn9.setText("");

        }
        Winner();
    }
    public static void main(String[]args)
    {
        Main ttt = new Main();
    }

}



