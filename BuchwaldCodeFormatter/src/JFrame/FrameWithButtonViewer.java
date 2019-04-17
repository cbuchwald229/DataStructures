package GUIs;

import javax.swing.JFrame;

public class FrameWithButtonViewer {

	public static void main(String[] args) {
		
		FrameWithButton frame = new FrameWithButton(); 
		
		
		frame.setTitle("Button frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);
	}

}
