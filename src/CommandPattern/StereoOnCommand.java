package CommandPattern;

public class StereoOnCommand implements Command{
    Stereo stereo;

    public StereoOnCommand(Stereo stereo){
        this.stereo = stereo;
    }
    @Override
    public void execute() {
        stereo.putCD();
        stereo.on();
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
