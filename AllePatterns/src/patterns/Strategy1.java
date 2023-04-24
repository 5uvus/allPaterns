package patterns;

public class Strategy1 implements Strategy {

	
	public void moveLeft() {
		System.out.println("Bewege nach links: " );
	}
	public void moveRight() {
		System.out.println("Bewege nach rechts: " );
	}
	public void moveForward() {
		System.out.println("Bewege nach vorne: "  );
	}
	public void moveBack() {
		System.out.println("Bewege nach hinten: " );
	}

}
