package CommandPattern;

public class MainTest {
    public static void main(String[] args) {
        Light light = new Light();
        TV tv = new TV();
        Stereo stereo = new Stereo();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        TVOnCommand tvOnCommand = new TVOnCommand(tv);
        TvOffCommand tvOffCommand = new TvOffCommand(tv);
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        RemoteControl remote = new RemoteControl(3);
        remote.setCommand(0,lightOnCommand,lightOffCommand);
        remote.setCommand(1,tvOnCommand,tvOffCommand);
        remote.setCommand(2,stereoOnCommand,stereoOffCommand);

        remote.onButtonPushed(0);
        remote.offButtonPushed(0);
        remote.onButtonPushed(1);
        remote.UndoCommand();
        remote.onButtonPushed(2);
        remote.offButtonPushed(2);
        remote.UndoCommand();

    }
}
