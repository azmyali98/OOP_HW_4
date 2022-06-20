package Q3;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 
 * ColorGenerator is a color generator class 
 * that generate colors and notifies Panels
 * to change the color to the color it has
 * generated. 
 * 
 * ColorGenerator is a singleton class.
 */
public class ColorGenerator {
	private static ColorGenerator colorGenerator = new ColorGenerator();
	private Timer timer;
	private BillBoard billboard;

	// Abstraction Function :
	// the static variable colorGenerator will represent the class singleton.
	
	// Rep. Invariant:
	// colorGenerator != null
	
	
	//////////////////////////////////
	// Private Methods
	//////////////////////////////////

	/**
	 * @modifies this
	 * @effects creates a timer with 2 second period
	 */
	private ColorGenerator() {
		billboard = null;

		// initialize timer and timer task to notify billboard every 2 secs
		timer = new Timer();
		TimerTask timerTask = new TimerTask() {
			@Override
			public void run() {
				Color generatedColor = new Color((int)(Math.random() * 0x1000000));
				if(billboard != null) {
					try {
						billboard.updateColor(generatedColor);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
		timer.scheduleAtFixedRate(timerTask, 0, 2000);
	}
	
	/**
	 * @effects it will make sure Rep. Invariant holds
	 */
	private static void checkRep() {
		assert(colorGenerator != null);
	}
	
	//////////////////////////////////
	//  Public Methods
	//////////////////////////////////
	
	/**
	 * @effects it will return the class singleton instance
	 */
    public static ColorGenerator getInstance()
    {
    	checkRep();
        return colorGenerator;
    }
    
    /**
     * @modifies this
     * @effects will set the billboard that will be notified to change its panels' color
     */
	public void setBillBoardToNotify(BillBoard board) {
		billboard = board;
    	checkRep();
	}
	
	
}
