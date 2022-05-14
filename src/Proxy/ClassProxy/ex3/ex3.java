package Proxy.ClassProxy.ex3;

public class ex3 {
    public static void main(String[] args) {
        Action action = new Action();
        MomChange momChange = new MomChange(action);
        BrotherChange brotherChange = new BrotherChange(momChange);
        My my = new My(brotherChange);

        System.out.println(my.execute());
    }
} 
