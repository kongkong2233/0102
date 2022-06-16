import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class exam4 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JPanel panel = new JPanel();
        f.add(panel);
        
        JLabel label1 = new JLabel("국가	");
        JLabel label2 = new JLabel("수도	");
          
        JTextField field1 = new JTextField(10);
        JButton button = new JButton("검색하기");
        JTextField field2 = new JTextField(10);
        panel.add(label1);
        panel.add(field1);
        panel.add(button);
        panel.add(label2);
        panel.add(field2);

        if (field1.getText() != null) {
        	button.addActionListener(e -> {
        		field2.setText("Seoul");
        	});
        }
        
        if (field1.getText() == "USA") {
        	button.addActionListener(e -> {
        		field2.setText("Wasington");
        	});
        }
        
        if (field1.getText() == "Japan") {
        	button.addActionListener(e -> {
        		field2.setText("Tokyo");
        	});
        }
        
        if (field1.getText() == "UK") {
        	button.addActionListener(e -> {
        		field2.setText("London");
        	});
        }
        
        if (field1.getText() == "China") {
        	button.addActionListener(e -> {
        		field2.setText("Beijing");
        	});
        }
        
        f.setSize(500, 100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("문제4");
        f.setVisible(true);
    }
}