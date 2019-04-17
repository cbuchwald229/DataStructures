package ChartViewer;
import java.awt.Graphics;

import javax.swing.JComponent;

public class ChartComponent extends JComponent {
	public void paintComponent(Graphics g){
		g.fillRect(10, 10, 200, 10);
		g.fillRect(10, 30, 300, 10);
		g.fillRect(10, 80, 100, 10);
	}
}
