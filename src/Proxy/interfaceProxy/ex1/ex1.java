package Proxy.interfaceProxy.ex1;

public class ex1 {
    public static void main(String[] args) {
//        Noodles noodles = new Noodles();
//        MyAction myAction = new MyAction(noodles);
//        System.out.println(myAction.execute());
//        System.out.println(myAction.execute());
//        System.out.println(myAction.execute());

    // 프록시 호출
        Noodles noodles = new Noodles();
        MomChange momChange = new MomChange(noodles);
        MyAction myAction = new MyAction(momChange);
        System.out.println(myAction.execute());
        System.out.println(myAction.execute());
        System.out.println(myAction.execute());
    }
}
