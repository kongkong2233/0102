import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyLab {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JPanel panel = new JPanel();
        f.add(panel);
        
        JLabel label1 = new JLabel("첫번째 정수");
        JLabel label2 = new JLabel("두번째 정수");
        JLabel label3 = new JLabel("연산의 결과");
          
        JTextField field1 = new JTextField(15);
        JTextField field2 = new JTextField(15);
        JTextField field3 = new JTextField(15);
        JButton button = new JButton("연산하기");
        panel.add(label1);
        panel.add(field1);
        panel.add(label2);
        panel.add(field2);
        panel.add(label3);
        panel.add(field3);
        panel.add(button);
        
        button.addActionListener(e -> {
			field3.setText("");
		});
        
        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("문제1");
        f.setVisible(true);
    }
}