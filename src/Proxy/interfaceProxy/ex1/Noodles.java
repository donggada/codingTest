package Proxy.interfaceProxy.ex1;

public class Noodles implements Action {

    @Override
    public String get() {
        System.out.println("살제 객체 호출(라면)");
        return "라면";
    }
}
