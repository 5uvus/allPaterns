package patterns;

public class Message {

	enum ACTION{
		forward, back, right, left
	}
	private Figur f;
	private ACTION action;
	public Figur getF() {
		return f;
	}
	public void setF(Figur f) {
		this.f = f;
	}
	public ACTION getAction() {
		return action;
	}
	public void setAction(ACTION action) {
		this.action = action;
	}
	public Message(ACTION action, Figur f) {
		this.action = action;
		this.f = f;
	}

}
