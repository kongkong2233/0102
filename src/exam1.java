import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class exam1 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JPanel panel = new JPanel();
        f.add(panel);
        
        JLabel label1 = new JLabel("ù��° ����");
        JLabel label2 = new JLabel("�ι�° ����");
        JLabel label3 = new JLabel("������ ���");
          
        JTextField field1 = new JTextField(15);
        field1.getX();
        JTextField field2 = new JTextField(15);
        field2.getY();
        JTextField field3 = new JTextField(15);
        JButton button = new JButton("�����ϱ�");
        panel.add(label1);
        panel.add(field1);
        panel.add(label2);
        panel.add(field2);
        panel.add(label3);
        panel.add(field3);
        panel.add(button);
        
        button.addActionListener(e -> {
			field3.setText("300");
		});
        
        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("����1");
        f.setVisible(true);
    }
}