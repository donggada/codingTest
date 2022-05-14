package Proxy.interfaceProxy.ex2;

public class Oil implements Action {

    @Override
    public String action() {
        System.out.println("살제 객체 호출(주유하기)");
        return "주유하기";
    }
}
