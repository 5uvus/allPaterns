package patterns;

public class VorCMD implements CommandInterface {

	private Figur m;
	public VorCMD(Figur m) {
		this.m = m;
	}
	@Override
	public void doIt() {
		m.moveForward();
		
	}
	@Override
	public void undo() {
		m.moveBack();
		
	}
}
