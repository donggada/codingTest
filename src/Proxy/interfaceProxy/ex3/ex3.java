package Proxy.interfaceProxy.ex3;

public class ex3 {
    public static void main(String[] args) {
        DeliveryChange deliveryChange = new DeliveryChange();
        MomChange momChange = new MomChange(deliveryChange);
        BrotherChange brotherChange = new BrotherChange(momChange);
        My my = new My(brotherChange);

        System.out.println(my.execute());
    }
}
