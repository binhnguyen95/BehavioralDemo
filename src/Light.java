// Chúng ta có một đối tượng Light có 2 phương thức là switchOn và switchOff: Đây đóng vai trò là 1 class request.

public class Light {
        private boolean on;

        public void switchOn() {
            on = true;
            System.out.println("This light is on");
        }

        public void switchOff() {
            on = false;
            System.out.println("This light is off");
    }
}
