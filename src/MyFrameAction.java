import javax.swing.*;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.*;
import java.awt.Toolkit;

public class MyFrameAction extends JFrame {

	public MyFrameAction() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		setSize(300, 200);
		setLocation(screenSize.width/2, screenSize.height/2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		Image img = kit.getImage("C:\\java_exe\\src\\icon.gif");
		setIconImage(img);
		setLayout(new FlowLayout());
		JButton button = new JButton("¹öÆ°");
		this.add(button);
		setVisible(true);
	}

}
