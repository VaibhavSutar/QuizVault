import java.awt.*;
import javax.swing.*;

public class Result extends JFrame {
    // Initializations
    JPanel container = new JPanel();
    JLabel remark = new JLabel("Excellent");
    String statusRemark = "";
    String statusColor = "";
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int screenWidth = (int) screenSize.getWidth();
    JLabel rightAnswers = new JLabel("Number of correct answers");
    JLabel wrongAnswers = new JLabel("Number of wrong answers");
    JLabel notAnswered = new JLabel("Number of answers not attempted");
    JLabel numRight = new JLabel("9");
    JLabel numWrong = new JLabel("1");  
    JLabel numNotAnswered = new JLabel("0");
    JLabel percent = new JLabel("90%");

    Result(int correct, int wrong, int notAttempted) {
        // window customization
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.decode("#333333"));
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        setLayout(null);

        // Remark Container

        if (correct >= 8) {
            statusRemark = "Excellent";
            statusColor = "#3DDC97";
        } else if (correct < 8 && correct >= 6) {
            statusRemark = "Well Done";
            statusColor = "#256EFF";
        } else {
            statusRemark = "Nice Try";
            statusColor = "#FF495C";
        }
        container.setBounds(0, 0, screenWidth, 300);
        container.setBackground(Color.decode(statusColor));
        container.setLayout(null);
        add(container);
        remark.setBounds((screenWidth / 2 - 300), 90, 760, 150);
        remark.setForeground(Color.WHITE);
        remark.setFont(new Font("Inter", Font.BOLD, 128));
        remark.setText(statusRemark);
        container.add(remark);

        // status
        rightAnswers.setBounds(180, 400, 420, 40);
        rightAnswers.setFont(new Font("Inter", Font.BOLD, 32));
        rightAnswers.setForeground(Color.decode("#3DDC97"));
        add(rightAnswers);

        wrongAnswers.setBounds(180, 500, 420, 40);
        wrongAnswers.setFont(new Font("Inter", Font.BOLD, 32));
        wrongAnswers.setForeground(Color.decode("#FF495C"));
        add(wrongAnswers);

        notAnswered.setBounds(180, 600, 540, 40);
        notAnswered.setFont(new Font("Inter", Font.BOLD, 32));
        notAnswered.setForeground(Color.decode("#FFFFFF"));
        add(notAnswered);

        numRight.setBounds(1110, 400, 420, 40);
        numRight.setFont(new Font("Inter", Font.BOLD, 32));
        numRight.setForeground(Color.decode("#3DDC97"));
        numRight.setText(Integer.toString(correct));
        add(numRight);

        numWrong.setBounds(1110, 500, 420, 40);
        numWrong.setFont(new Font("Inter", Font.BOLD, 32));
        numWrong.setForeground(Color.decode("#FF495C"));
        numWrong.setText(Integer.toString(wrong));
        add(numWrong);

        numNotAnswered.setBounds(1110, 600, 540, 40);
        numNotAnswered.setFont(new Font("Inter", Font.BOLD, 32));
        numNotAnswered.setForeground(Color.decode("#FFFFFF"));
        numNotAnswered.setText(Integer.toString(notAttempted));
        add(numNotAnswered);

        percent.setBounds(screenWidth / 2, 670, 540, 100);
        percent.setFont(new Font("Inter", Font.BOLD, 64));
        percent.setForeground(Color.decode(statusColor));
        int numPercent = correct * 10;
        percent.setText(Integer.toString(numPercent) + "%");
        add(percent);

    }

    public void result() {

    }
}
