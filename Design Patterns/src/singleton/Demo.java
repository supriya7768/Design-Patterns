package singleton;

public class Demo {

    //This is Lazy Initialization Singleton class
    //Because when we will call getInstance() method at that time only the object will be created.

    private static Demo instance;

    private Demo(){

    }

    public static Demo getInstance(){

        if (instance == null){
            instance = new Demo();
        }
        return instance;
    }

}
