// Tiếp theo tiến hành đóng gói các command này vào trong 1 bộ điều khiển gọi là Remote Control: class này đóng vai trò là invoker

public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }

    public void pressButtonAgain() {
        command.undo();
    }


}
