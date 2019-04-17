package GUIs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameWithButton extends JFrame {
	private JButton button;
	private JLabel label;
	
	private final int FRAME_WIDTH = 600;
	private final int FRAME_HEIGHT = 400;
	
	public FrameWithButton(){
		createComponents(); 
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	class ClickListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			label.setText("Good-bye!");
		}
		
	}
	private void createComponents() {
		button = new JButton("Click me!");
		label = new JLabel("Hello, CIS 171!");
		ActionListener listener = new ClickListener(); 
		button.addActionListener(listener);
		JPanel panel = new JPanel();
		panel.add(button);
		panel.add(label);
		
		this.add(panel);
	}
}
