import stanford.karel.*;

public class VotingBoxKarel extends SuperKarel {
/*This is the process where while Karel is moving forward to remove the chad that is in the left and right path if there is no beeper in front of it*/
	public void run() {
		while (frontIsClear()) {
			move();
			if (noBeepersPresent()) {
			removeChad();
			}
		move();
		}
		
}

	private void removeChad() {
		/* Karel instructed to check right and left when no beeper is there to remove the chad
		 * at the current position*/
		
		turnRight();
		checkPunchCorner(); /*After checking right corner, Karel is facing north back at the orginal position*/
		checkPunchCorner(); /*Karel is facing south*/
		turnLeft(); /*moving Karel back toward facing east */
		
	}

	private void checkPunchCorner() {
		/*Remove the chad. The precondition is Karel is facing south that represent
		 *the punch hole. The postcondition is that Karel is on the same square facing north
		 *coming out of the hold*/
		move();
		while (beepersPresent()) {  /*if beeper is present*/
			pickBeeper();
		}
		turnAround();
		move();
	}
}

