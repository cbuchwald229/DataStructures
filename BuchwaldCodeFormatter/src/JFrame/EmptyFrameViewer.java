package FrameViewer;

import javax.swing.JFrame;

public class EmptyFrameViewer {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		final int FRAME_WIDTH = 400;
		final int FRAME_HEIGHT = 400;
		
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTitle("Michelle's empty frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	    frame.setVisible(true);

	}

}
