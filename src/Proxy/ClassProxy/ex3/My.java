package Proxy.ClassProxy.ex3;

public class My {

    private Action action;

    public My(Action action) {
        this.action = action;
    }

    public String execute() {
        return action.action();
    }
}
