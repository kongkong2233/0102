import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class calculator extends JFrame implements WindowListener, ActionListener{
		
		private Label dispL, inputL;
		private JTextField tField;
		private JButton[] buttons;
		StringBuffer sb= new StringBuffer();
		DecimalFormat df = new DecimalFormat("#,##0");
		private String disp;
		private int op;
		public double result;
		public double number;
		boolean opClick = false;
		
		public calculator() {
			setTitle("�������� ����");	//���α׷� �̸� ����
			
			Panel whole = new Panel();  //��ü
		    Panel p1 = new Panel();  
		    Panel p2 = new Panel();  
			Panel p3 = new Panel(); 
			Panel p4 = new Panel();
			Panel p5 = new Panel(); 
			Panel p6 = new Panel();
			Panel p7 = new Panel();
			
			String[] buttonName = {
					"Backspace", "", "", "CE", "C", "7", "8", "9", "/", "sqrt", "4", "5", "6", "x", "%", "1", "2", "3", "-", "1/x", "0", "+/-", ".", "+", "="
			};	//�ʿ��� ��ҵ� ����
			buttons = new JButton[25];	//��ư ������ ����
			for (int i=0;i<25;i++) {
				buttons[i] = new JButton(buttonName[i]);
			}
			
			dispL = new Label("0", Label.RIGHT);
			inputL = new Label("0", Label.RIGHT);
			tField = new JTextField(35);	//�ؽ�Ʈ �ʵ� ������ ����
			tField.setText("0.");	//�ؽ�Ʈ �ʵ� �� ��Ʈ ����
			tField.setEnabled(false);	//��ü ��Ȱ��
			
			whole.setLayout(new GridLayout(7,1,5,5));
			p1.setLayout(new GridLayout(1,1,5,5));
			p1.add(dispL);
			p2.setLayout(new GridLayout(1,1,5,5));
			p2.add(inputL);
			
			whole.add(p1);
			whole.add(p2);
			whole.add(p3);
			whole.add(p4);
			whole.add(p5);
			whole.add(p6);
			whole.add(p7);
			add("Center", whole);
			
			Panel panel = new Panel();
			panel.setLayout(new GridLayout(0, 5, 3, 3));	//��� �� ���� �� �� ���̾ƿ� ���� ���� ����
			
			int index = 0;
			for (int rows = 0; rows <5; rows++) {	//��� ���� ���߾� �۾� ���� ��ư ��� �� ����
				for (int cols = 0; cols < 5; cols++) {
					buttons[index] = new JButton(buttonName[index]);
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
			pack();
			
			for(int i=0;i<25;i++) {buttons[i].addActionListener(this); }
			this.addWindowListener(this);
		}
		
		public void actionPerformed(ActionEvent e) {
			if (op == 61) {
				sb.delete(0, sb.length());
				sb.append(result);
				disp = "";
				op = 0;
				dispL.setText(disp);
			}
			
			if(e.getActionCommand()=="1") {sb.append(1); }
			else if(e.getActionCommand()=="2") {sb.append(2); }
			else if(e.getActionCommand()=="3") {sb.append(3); }
			else if(e.getActionCommand()=="4") {sb.append(4); }
			else if(e.getActionCommand()=="5") {sb.append(5); }
			else if(e.getActionCommand()=="6") {sb.append(6); }
			else if(e.getActionCommand()=="7") {sb.append(7); }
			else if(e.getActionCommand()=="8") {sb.append(8); }
			else if(e.getActionCommand()=="9") {sb.append(9); }
			else if(e.getActionCommand()=="0") {sb.append(0); }
			else if(e.getActionCommand()=="2") {
				sb.delete(0, sb.length());
				dispL.setText("0");
				disp="";
				result = 0;
				op = 0; }
			else if(e.getActionCommand() == "Back") {
				if(sb.length() > 0) sb = sb.delete(sb.length()-1, sb.length());
				else sb.delete(0, sb.length());
			}
			else if(e.getActionCommand() == ".") {
				if(sb.indexOf(".") == -1) {
					if(dispL.getText().equals("0")) {
						sb.append("0.");
					} else {
						sb.append(".");
					}
				}
			} else {
				opClick = true;
				if(disp != null) disp += sb.toString();
				else disp = sb.toString();
				if(op == 0) {
					result = Double.parseDouble(sb.toString());
					op = e.getActionCommand().hashCode();
					disp += e.getActionCommand();
					tField.setText(disp);
				} else {
					disp += e.getActionCommand();
					if (op == 43) { //"+"
						result += Double.parseDouble(sb.toString());
						dispL.setText(disp);
					}
					else if (op == 45) { //"-"
						result += Double.parseDouble(sb.toString());
						dispL.setText(disp);
					}
					else if (op == 42) { //"*"
						result += Double.parseDouble(sb.toString());
						dispL.setText(disp);
					}
					else if (op == 47) { //"/"
						result += Double.parseDouble(sb.toString());
						dispL.setText(disp);
					}
					op = e.getActionCommand().hashCode();
				}
				sb.delete(0, sb.length());
			}
			
			String temp;
			String temp2;
			if(sb.length() > 0) {
				if(sb.indexOf(".") != 1) {
					if(sb.indexOf(".") == sb.length()-1) {
						temp = sb.substring(0, sb.indexOf("."));
						temp = df.format(Integer.parseInt(temp));
						temp += ".";
						dispL.setText(temp);
					} else {
						temp = sb.substring(0, sb.indexOf("."));
						temp2 = sb.substring(sb.indexOf(".")+1, sb.length());
						temp = df.format(Integer.parseInt(temp));
						temp += ".";
					}
				}
			}
		}
		
	public static void main(String arg[]) {
		calculator f = new calculator();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}
