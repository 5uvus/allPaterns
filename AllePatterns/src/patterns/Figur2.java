package patterns;

import java.util.Observable;

public class Figur2 extends Observable implements Figur {

	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	private int size;
	private Strategy strat;
	public Figur2(String name, int size, Strategy strat) {
		this.name = name;
		this.size = size;
		this.strat = strat;
	}
	
	public void moveLeft() {
		strat.moveLeft();
		System.out.print("Figur2");
		notify(Message.ACTION.left);
	}
	public void moveRight() {
		strat.moveRight();
		System.out.print("Figur2");
		notify(Message.ACTION.right);
	}
	public void moveForward() {
		strat.moveForward();
		System.out.print("Figur2");
		notify(Message.ACTION.forward);
	}
	public void moveBack() {
		strat.moveBack();
		System.out.print("Figur2");
		notify(Message.ACTION.back);
	}
	public void notify(Message.ACTION action) {
		setChanged();
		notifyObservers(new Message(action, this));
	}


}
