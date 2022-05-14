package Proxy.ClassProxy.ex3;

public class MomChange extends Action {

    private Action action;

    public MomChange(Action action) {
        this.action = action;
    }

    @Override
    public String action() {
        System.out.println("프록시 객체 호출2 (엄마찬스)");
        return action.action();
    }
}
