
public class RandPlayer extends Player {
	
	//int randChoice = 1;
	
	double randChoice = (Math.random() * 3) + 1; {
		Roshambo rosh;	

	if (randChoice == 1) {
		 rosh =  Roshambo.ROCK;
	} else if (randChoice == 2) {
		rosh = Roshambo.SCISSORS;
	} else {
		rosh = Roshambo.PAPER;
	}
	
	}
	public double getRandChoice() {
		return randChoice;
	}

	public void setRandChoice(double randChoice) {
		this.randChoice = randChoice;
	}

	@Override
	public Roshambo generateRoshambo() {
		return null;
	}

}
