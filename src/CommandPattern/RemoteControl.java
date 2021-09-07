package CommandPattern;

public class RemoteControl {
    private Command [] onCommands;
    private Command [] offCommands;
    private Command undoCommand;
    public RemoteControl(int slots){
        onCommands = new Command[slots];
        offCommands = new Command[slots];
        Command noCommand = new NoCmmand();
        undoCommand = noCommand;
        for (int i = 0; i < slots; i++) {
           onCommands[i] =  noCommand;
           offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }
   public void onButtonPushed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
   }
    public void offButtonPushed(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }
    public void UndoCommand(){
        undoCommand.undo();
    }

}
