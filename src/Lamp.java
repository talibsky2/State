//Context
public class Lamp {
    State state;

    public void setState(State state) {
        this.state = state;
    }
    void switcher (){
        state.switcher();
    }
    void nextState (){
        if (state instanceof SwitchOn) {
            setState(new SwitchOff());
        }
        else if (state instanceof SwitchOff){
            setState(new SwitchOn());
        }
    }
}
