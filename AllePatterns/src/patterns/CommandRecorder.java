package patterns;

import java.util.Stack;

public class CommandRecorder {

	private Stack<CommandInterface> undo = new Stack<CommandInterface>();
	private Stack<CommandInterface> redo = new Stack<CommandInterface>();
	
	private static CommandRecorder instance;
	
	
	public static CommandRecorder inst() {
		if(instance == null) {
			instance = new CommandRecorder();
		}
		return instance;
	}
	public void doIt(CommandInterface ci) {
		ci.doIt();
		undo.push(ci);
	}
	public void undo() {
		CommandInterface ci = undo.pop();
		ci.undo();
		redo.push(ci);
	}
	public void redo() {
		CommandInterface ci = redo.pop();
		ci.doIt();
		undo.push(ci);
	}
}
