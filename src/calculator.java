import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator extends JFrame {
		
		private JPanel panel;
		private JTextField tField;
		private JButton[] buttons;
		private String[] label = {
				"Backspace", "", "", "CE", "C", "7", "8", "9", "/", "sqrt", "4", "5", "6", "x", "%", "1", "2", "3", "-", "1/x", "0", "+/-", ".", "+", "="
		};	//�ʿ��� ��ҵ� ����
		
		public calculator() {
			tField = new JTextField(35);	//�ؽ�Ʈ �ʵ� ������ ����
			panel = new JPanel();	//�г� ������ ����
			tField.setText("0.");	//�ؽ�Ʈ �ʵ� �� ��Ʈ ����
			tField.setEnabled(false);	//��ü ��Ȱ��
			
			panel.setLayout(new GridLayout(0, 5, 3, 3));	//��� �� ���� �� �� ���̾ƿ� ���� ���� ����
			buttons = new JButton[25];	//��ư ������ ����
			int index = 0;
			for (int rows = 0; rows <5; rows++) {	//��� ���� ���߾� �۾� ���� ��ư ��� �� ����
				for (int cols = 0; cols < 5; cols++) {
					buttons[index] = new JButton(label[index]);
					if (cols >= 3)
						buttons[index].setForeground(Color.red);
					else
						buttons[index].setForeground(Color.blue);
					buttons[index].setBackground(Color.yellow);
					panel.add(buttons[index]);
					index++;
				}
			}
			
			add(tField, BorderLayout.NORTH);	//�ؽ�Ʈ �ʵ� ��ġ ����
			add(panel, BorderLayout.CENTER);	//�г� ��ġ ����
			setVisible(true);
			setTitle("�������� ����");	//���α׷� �̸� ����
			pack();
	}
		
	public static void main(String arg[]) {
		calculator s = new calculator();
	}
}
