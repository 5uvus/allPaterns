package patterns;

public class RightCMD implements CommandInterface {

	private Figur m;
	public RightCMD(Figur m) {
		this.m = m;
	}
	@Override
	public void doIt() {
		m.moveRight();
		
	}
	@Override
	public void undo() {
		m.moveLeft();
		
	}
}
