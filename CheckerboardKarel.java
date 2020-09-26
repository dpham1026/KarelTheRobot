/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {
	
	public void run() {
		collectAllBeepers();
		dropAllBeepers();
		returnHome();		
	
	}

	private void collectAllBeepers() {
		/* Collects the beepers from every tower bty move along
		*first street*/
		while  (frontIsClear() ) {
			collectOneTower();
			move();
		}
		collectOneTower();
	}

	private void collectOneTower() {
		// TODO Auto-generated method stub
		
	}

}

