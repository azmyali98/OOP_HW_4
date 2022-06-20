package Q3;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 * 
 *This class implements the columns way in updating the billboard panels' color 
 *
 */
public class ColumnColorUpdatingAlgorithm extends ColorUpdatingAlgorithm {
	
	/**
	 * @effects this function will update the color of the panel,
	 * in columns first
	 */
	@Override
	void updateColor(JFrame frame, JPanel[][] board, int width, int height, Color color) throws InterruptedException {
		for(int i = 0; i < width; i++) {
			for(int j = 0; j < height; j++) {
				board[i][j].setBackground(color);
				Thread.sleep(40);
				
				// refresh frame
				SwingUtilities.updateComponentTreeUI(frame);
			}
		}
	}
}
