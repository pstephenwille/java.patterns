package command.undo;

/*
* Concrete Command?
* Receives message from Client?
* Sends synchronous message to Receiver; Light/CeilingFan */
public class LightOffCommand implements Command {
	Light light;
	int level;

	/* Encapsulates a Receiver */
	public LightOffCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
        level = light.getLevel();
		light.off();
	}
 
	public void undo() {
		light.dim(level);
	}
}
