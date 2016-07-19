package command.undo;

/*
* Concrete Command
* Synchronous messages received from client? */
public class LightOnCommand implements Command {
	Light light;
	int level;
	public LightOnCommand(Light light) {
		this.light = light;
	}

	/* executes requests on the Receiver; Light/CeilingFan */
	public void execute() {
        level = light.getLevel();
		light.on();
	}
 
	public void undo() {
		light.dim(level);
	}
}
