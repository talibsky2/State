public class Test {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        State on = new SwitchOn();
        lamp.setState(on);
//        lamp.switcher();

        for (int i = 0; i < 10; i++){
            lamp.switcher();
            lamp.nextState();
        }
    }
}