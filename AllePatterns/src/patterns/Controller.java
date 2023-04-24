package patterns;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controller implements KeyListener {
	   private Figur model;
	   private CommandRecorder cr;

	    public Controller(Figur model) {
	        this.model = model;
	        this.cr= CommandRecorder.inst();
	    }

	    @Override
	    public void keyPressed(KeyEvent e) {
	        switch (e.getKeyCode()) {
	            case KeyEvent.VK_UP:
	               VorCMD vor = new VorCMD(model);
	               cr.doIt(vor);
	                break;
	            case KeyEvent.VK_DOWN:
	                BackCMD back = new BackCMD(model);
	                cr.doIt(back);
	                break;
	            case KeyEvent.VK_LEFT:
	            	 LeftCMD left = new LeftCMD(model);
		                cr.doIt(left);
	                break;
	            case KeyEvent.VK_RIGHT:
	            	 RightCMD right = new RightCMD(model);
	                cr.doIt(right);
	                break;
	             
	            case KeyEvent.VK_1:
	            		cr.undo();
	            case KeyEvent.VK_2:
	            	cr.redo();
	            default:
	                // Handle other keys if needed
	                break;
	        }
	    }

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

	
	
}
