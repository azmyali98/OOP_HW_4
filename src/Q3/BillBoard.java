package Q3;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.*;


/**
 * 
 * BillBoard as the name suggests is a bill board,
 * contains 6x6 0524205309 panels, that all change color corresponding
 * to ColorGenerator color change event.
 *
 */
public class BillBoard {
	private final int BILLBOARD_WIDTH = 300;
	private final int BILLBOARD_HEIGHT = 300;
	
	private JFrame frame;
	private JPanel[][] panels;
	
	private ColorUpdatingAlgorithm algo;
	
	/////////////////////////////////////
	// Public Methods
	/////////////////////////////////////
	
	/**
	 * @modifies this
	 * @effects Constructor of the class, 
	 * it will create the BillBoard using the Swing 
	 * and set the color of the panels to black
	 */
	public BillBoard() {
		algo = null;
	
		// Initialize Panel Matrix
		panels = new JPanel[6][6];

		// initialize billboard
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(BILLBOARD_WIDTH, BILLBOARD_HEIGHT);
		frame.setVisible(true);
		
		// add the panels
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				JPanel p = new JPanel();
				p.setBackground(Color.BLACK);
				p.setBounds(i*50, j*50, 50, 50);
				frame.add(p);
				panels[i][j] = p;
			}
		}

		// refresh frame
		SwingUtilities.updateComponentTreeUI(frame);
	}
	
	/**
	 * @modifies this
	 * @effects it will set the color updating algorithm
	 */
	public void setColorUpdatingAlgorithm(ColorUpdatingAlgorithm colorUpdatingAlgorithm) {
		algo = colorUpdatingAlgorithm;
	}
	
	/**
	 * @throws InterruptedException 
	 * @modifies this
	 * @effects it will update the color of the panels using 
	 * color updating algorithm
	 */
	public void updateColor(Color generatedColor) throws InterruptedException {
		if (algo != null) {
			algo.updateColor(frame, panels, 6, 6, generatedColor);			
		}
	}
	
}
