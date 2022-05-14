package Proxy.ClassProxy.ex2;

public class ex2 {
    public static void main(String[] args) {
        Action action = new Action();
        CarWash carWash = new CarWash(action);
        My my = new My(carWash);

        System.out.println(my.execute());

    }
}
