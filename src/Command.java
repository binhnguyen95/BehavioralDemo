//Chúng ta xây dựng 1 interface tên là Command không trực tiếp tắt bật đèn mà chỉ ra lệnh cho light on or off.

public interface Command {
    void execute();
    void undo();
}
