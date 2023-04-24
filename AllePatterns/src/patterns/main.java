package patterns;

public class main {
	public static void main(String[] args) {
		FigurFactory f = new FigurFactory(new Strategy1());
		Figur fig1= f.figure(0);
		View view = new View((Figur1)fig1);
        view.setVisible(true);
	}
}
