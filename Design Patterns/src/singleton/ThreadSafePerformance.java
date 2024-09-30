package singleton;

public class ThreadSafePerformance {

    private static volatile ThreadSafePerformance instance;

    private ThreadSafePerformance(){}

    public static ThreadSafePerformance getInstance(){
        if (instance == null){
            synchronized (ThreadSafePerformance.class){
                if (instance == null){
                    instance = new ThreadSafePerformance();
                }
            }
        }
        return instance;
    }
}
