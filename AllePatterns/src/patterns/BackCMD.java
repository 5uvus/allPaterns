package patterns;

public class BackCMD implements CommandInterface {

	private Figur m;
	public BackCMD(Figur m) {
		this.m = m;
	}
	@Override
	public void doIt() {
		m.moveBack();
		
	}
	@Override
	public void undo() {
		m.moveBack();
		
	}
}
