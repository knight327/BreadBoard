
import javax.swing.JPanel;

import java.awt.*;

public class CustomPanel extends JPanel {

	
	protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.blue);
        g2d.setStroke(new BasicStroke(8,
            BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL));
        g.drawLine(20, 20, 100, 100);
    }



}
