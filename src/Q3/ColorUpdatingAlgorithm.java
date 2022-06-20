package Q3;

import java.awt.Color;

import javax.swing.*;

/**
 * ColorUpdatingAlgorithm is a class 
 * that represents an algorithm in which we 
 * will update the billboard panels' color 
 */
public abstract class ColorUpdatingAlgorithm {
	
	/**
	 * @effects this function will update the color of the panel,
	 * each sub type class will implement the way it will update the 
	 * billboard panels' color. e.g.: in a serial way, columns first, rows first and etc..
	 */
	abstract void updateColor(JFrame frame, JPanel[][] board, int width, int height, Color color) throws InterruptedException;
}

