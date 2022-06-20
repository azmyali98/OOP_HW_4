package Q3;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 * 
 *This class implements the serial way in updating the billboard panels' color 
 */
public class SerialColorUpdatingAlgorithm extends ColorUpdatingAlgorithm {
	
	/**
	 * @throws InterruptedException 
	 * @effects it will update the panels color in a serial way: from left to right and down a line.
	 */
	@Override
	void updateColor(JFrame frame, JPanel[][] board, int width, int height, Color color) throws InterruptedException {
		
		for(int i = 0; i < width; i++) {
			for(int j = 0; j < height; j++) {
				board[j][i].setBackground(color);
				Thread.sleep(40);
				
				// refresh frame
				SwingUtilities.updateComponentTreeUI(frame);
			}
		}
	}
	
}