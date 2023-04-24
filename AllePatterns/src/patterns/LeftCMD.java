package patterns;

public class LeftCMD implements CommandInterface {

	private Figur m;
	public LeftCMD(Figur m) {
		this.m = m;
	}
	@Override
	public void doIt() {
		m.moveLeft();
		
	}
	@Override
	public void undo() {
		m.moveLeft();
		
	}
}
