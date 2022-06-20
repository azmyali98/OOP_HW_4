package Q3;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 * 
 *This class implements the 2 passes way in updating the billboard panels' color 
 *
 */
public class TwoPassesColorUpdatingAlgorithm extends ColorUpdatingAlgorithm {
	/**
	 * @throws InterruptedException 
	 * @effects it will update the panels color with two passes on the board.
	 */
	@Override
	void updateColor(JFrame frame, JPanel[][] board, int width, int height, Color color) throws InterruptedException {
		
		for(int i = 0; i < width; i+=2) {
			for(int j = 0; j < height; j++) {
				board[i][j].setBackground(color);
				Thread.sleep(40);
				
				// refresh frame
				SwingUtilities.updateComponentTreeUI(frame);
			}
		}
		
		// second pass
		for(int i = 1; i < width; i+=2) {
			for(int j = 0; j < height; j++) {
				board[i][j].setBackground(color);
				Thread.sleep(40);
				
				// refresh frame
				SwingUtilities.updateComponentTreeUI(frame);
			}
		}
	}
}
