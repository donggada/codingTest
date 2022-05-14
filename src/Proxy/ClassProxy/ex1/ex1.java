package Proxy.ClassProxy.ex1;

public class ex1 {
    public static void main(String[] args) {
        Action action = new Action();
        MomChange momChange = new MomChange(action);
        MyAction myAction = new MyAction(momChange);
        System.out.println(myAction.execute());
        System.out.println(myAction.execute());
        System.out.println(myAction.execute());
    }
}
