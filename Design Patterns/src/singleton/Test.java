package singleton;

public class Test{

    public static void main(String[] args) {

        Demo demo = Demo.getInstance();
        System.out.println(demo);

        Demo demo1 = Demo.getInstance();
        System.out.println(demo1);

        //=========================================

        EagerInitialization eagerInitialization = EagerInitialization.getInstance();
        System.out.println(eagerInitialization);

        EagerInitialization eagerInitialization1 = EagerInitialization.getInstance();
        System.out.println(eagerInitialization1);

        //=========================================

        ThreadSafe threadSafe = ThreadSafe.getInstance();
        System.out.println(threadSafe);

        ThreadSafe threadSafe1 = ThreadSafe.getInstance();
        System.out.println(threadSafe1);


    }
}