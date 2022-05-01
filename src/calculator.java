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
		};	//필요한 요소들 선언
		
		public calculator() {
			tField = new JTextField(35);	//텍스트 필드 생성자 생성
			panel = new JPanel();	//패널 생성자 생성
			tField.setText("0.");	//텍스트 필드 내 힌트 생성
			tField.setEnabled(false);	//객체 비활성
			
			panel.setLayout(new GridLayout(0, 5, 3, 3));	//행과 열 설정 후 각 레이아웃 간의 간격 설정
			buttons = new JButton[25];	//버튼 생성자 생성
			int index = 0;
			for (int rows = 0; rows <5; rows++) {	//행과 열에 맞추어 글씨 색과 버튼 배경 색 설정
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
			
			add(tField, BorderLayout.NORTH);	//텍스트 필드 위치 설정
			add(panel, BorderLayout.CENTER);	//패널 위치 설정
			setVisible(true);
			setTitle("지유빈의 계산기");	//프로그램 이름 설정
			pack();
	}
		
	public static void main(String arg[]) {
		calculator s = new calculator();
	}
}
