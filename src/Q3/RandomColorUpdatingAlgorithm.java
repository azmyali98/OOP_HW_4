package Q3;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 * 
 *This class implements the 2 passes way in updating the billboard panels' color 
 *
 */
public class RandomColorUpdatingAlgorithm extends ColorUpdatingAlgorithm {

	/**
	 * @effects this function will update the color of the panel,
	 * in columns first
	 */
	@Override
	void updateColor(JFrame frame, JPanel[][] board, int width, int height, Color color) throws InterruptedException {
		List<Integer> indices = new ArrayList<>();
		for (int i = 0; i < width * height; i++) {
			indices.add(i);
		}
		
		while(!indices.isEmpty()) {
			Random rand = new Random();
			int upperBound = indices.size();
			int currIndex = rand.nextInt(upperBound);
			int IndexToUpdate = indices.get(currIndex);
			int i = IndexToUpdate / height;
			int j = IndexToUpdate % height;
			board[i][j].setBackground(color);
			indices.remove(currIndex);
			
			Thread.sleep(40);
			// refresh frame
			SwingUtilities.updateComponentTreeUI(frame);
		}
	}
}
