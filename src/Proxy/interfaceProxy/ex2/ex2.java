package Proxy.interfaceProxy.ex2;

public class ex2 {
    public static void main(String[] args) {
        Oil oil = new Oil();
        CarWash carWash = new CarWash(oil);
        My my = new My(carWash);

        System.out.println(my.execute());

    }
}
