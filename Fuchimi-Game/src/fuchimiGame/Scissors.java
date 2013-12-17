package fuchimiGame;

public class Scissors extends Hand {

	@Override
	public String toString() {
		return "Scissors";
	}

	@Override
	public Boolean beats(Hand hand) {
		return hand.loseAgainst(this);
	}

	@Override
	protected Boolean loseAgainst(Rock rock) {
		return Boolean.TRUE;
	}

	@Override
	protected Boolean loseAgainst(Paper paper) {
		return Boolean.FALSE;
	}

	@Override
	protected Boolean loseAgainst(Scissors scissors) {
		return null;
	}

}
