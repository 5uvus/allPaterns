package patterns;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

public class View extends JFrame implements Observer{
	
    private Controller controller;

    public View(Figur1 f) {
    	
    	f.addObserver(this);
        controller = new Controller(f);

        addKeyListener(controller);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }

	@Override
	public void update(Observable o, Object arg) {
		Message m = (Message) arg;
		
		switch(m.getAction()) {
		case forward: System.out.println("Observer: " + m.getF().getName() + " is moving forward!"); break;
		case back: System.out.println("Observer: " + m.getF().getName() + " is moving back!");break;
		case left: System.out.println("Observer: " + m.getF().getName() + " is moving left!");break;
		case right: System.out.println("Observer: " + m.getF().getName() + " is moving right!");break;
		}
	}
    
    
    
    
}
