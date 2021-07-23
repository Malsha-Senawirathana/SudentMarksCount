import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student {
    private JPanel Main;
    private JTextField txtStname;
    private JTextField Mark1;
    private JTextField Mark2;
    private JTextField Mark3;
    private JTextField txttotal;
    private JTextField txtAvg;
    private JTextField txtGrade;
    private JButton calButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student");
        frame.setContentPane(new Student().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Student() {
        calButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //declare the variable

                int m1,m2,m3,tot;
                double avg;

                //assign the total and average value
                m1 = Integer.parseUnsignedInt(Mark1.getText());
                m2 = Integer.parseUnsignedInt(Mark2.getText());
                m3 = Integer.parseUnsignedInt(Mark3.getText());

                tot = m1+m2+m3;

                txttotal.setText(String.valueOf(tot));

                avg = tot/3;

                txtAvg.setText(String.valueOf(avg));

                // calculate the garde

                if(avg>50)
                {
                    txtGrade.setText("pass");
                }
                else
                {
                    txtGrade.setText("Fail");
                }







            }
        });
    }
}
