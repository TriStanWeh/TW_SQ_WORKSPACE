package fuchimiGame;

 public abstract class Hand {
	
	 public abstract String toString();
	
	 abstract Boolean beats(Hand hand);
	
	 abstract Boolean loseAgainst(Rock rock);
	
	 abstract Boolean loseAgainst(Paper paper);
	
	 abstract Boolean loseAgainst(Scissors scissors);

}
