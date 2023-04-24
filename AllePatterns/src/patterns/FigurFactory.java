package patterns;

public class FigurFactory {

	private static Strategy strat;
	public FigurFactory(Strategy s){
		this.strat = s;
	}
	public static Figur figure(int whichOne) {
		switch (whichOne) {
		case 0: return new Figur1("Fig1", 5, strat);
		case 1: return new Figur2("Fig2", 10,strat);
		default: return null;
		}
	}
}
