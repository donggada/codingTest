package Proxy.ClassProxy.ex1;

public class MyAction {

    private Action action;

    public MyAction(Action action) {
        this.action = action;
    }

    public String  execute() {
       return action.get();
    }
}
