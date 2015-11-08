import java.awt.*;
import javax.swing.*;

public class TestDrawSinCos {
  /** Main method */	
	public static void main(String[] args) {
	JFrame frame = new DrawSinCos();
    frame.setSize(400, 300);
    frame.setTitle("Draw Sin Cos Function");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setVisible(true);
	} 
}

