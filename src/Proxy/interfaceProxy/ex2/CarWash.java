package Proxy.interfaceProxy.ex2;

public class CarWash implements Action{

    private Action action;

    public CarWash(Action action) {
        this.action = action;
    }

    @Override
    public String action() {
        System.out.println("세차 개꿀!!");
        return action.action();
    }
}
