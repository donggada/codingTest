package Proxy.interfaceProxy.ex3;

public class DeliveryChange implements Action{

    @Override
    public String action() {
        System.out.println("실제 객체 호출 (배달시키기)");
        return "라면";
    }
}
