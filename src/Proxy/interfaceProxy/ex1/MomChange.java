package Proxy.interfaceProxy.ex1;

public class MomChange implements Action {

    private Action action;
    private String cacheValue;

    public MomChange(Action action) {
        this.action = action;
    }

    @Override
    public String get() {
        System.out.println("프록시 객체 호출(엄마찬스)");
        if (cacheValue == null) {
            cacheValue = action.get();
        }
        return cacheValue;
    }
}
