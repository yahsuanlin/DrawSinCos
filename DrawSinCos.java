import java.awt.*;
import javax.swing.*;

public class DrawSinCos extends JFrame {
	public DrawSinCos() {
		setLayout(new BorderLayout());
		add(new PlotFunctions(), BorderLayout.CENTER);
	} 
}
 class PlotFunctions extends JPanel {

	  @Override 
	  protected void paintComponent(Graphics g) {
		 super.paintComponent(g);
		 
		//Draw x-axis
		g.drawLine(10,100,380,100);
		g.drawString("X",360,80);
		//Draw x-axis arrows
		g.drawLine(370,90,380,100);
		g.drawLine(370,110,380,100);
		
		//Draw y-axis
		g.drawLine(200,20,200,260);
		g.drawString("Y",220,30); 
		//Draw y-axis arrows
		g.drawLine(190,30,200,20);
		g.drawLine(210,30,200,20);
		
		//Draw pi
		g.drawString("-2\u03c0",105,115);
		g.drawString("-\u03c0",160,115);
		g.drawString("0",190,115);
		g.drawString("\u03c0",220,115);
		g.drawString("2\u03c0",310,115);
		
		//Draw sine function
		Polygon p1 = new Polygon();
		g.setColor(Color.RED);
		for (int x = -170; x <= 170; x++) {
			p1.addPoint(x + 200, 100 - (int)(50 * Math.sin((x / 100.0) * 2 * Math.PI)));
		}
		g.drawPolyline(p1.xpoints, p1.ypoints, p1.npoints);

		//Draw cosine function
		Polygon p2 = new Polygon();
		g.setColor(Color.BLUE);
		for (int x = -170; x <= 170; x++) {
			p2.addPoint(x + 200, 100 - (int)(50 * Math.cos((x / 100.0) * 2 * Math.PI)));
		}
		g.drawPolyline(p2.xpoints, p2.ypoints, p2.npoints);		
		
    }	 
}