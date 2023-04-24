package patterns;

import java.util.Observable;
import java.util.Observer;

public interface Figur{

	public void moveLeft();
	public void moveRight();
	public void moveForward();
	public void moveBack();
	public String getName();
	public int getSize();
}
