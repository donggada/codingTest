package Proxy.ClassProxy.ex3;

public class BrotherChange extends Action {
    private Action action;

    public BrotherChange(Action action) {
        this.action = action;
    }

    @Override
    public String action() {
        System.out.println("프록시 객체 호출1 (동생찬스)");
        return action.action();
    }
}
