//Concrete State
public class SwitchOff implements State{
    @Override
    public void switcher() {
        System.out.println("Lamp off");
    }
}
